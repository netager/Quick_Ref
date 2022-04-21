package com.newlecture.web.controller.admin.notice;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.newlecture.web.entity.Notice;
import com.newlecture.web.service.NoticeService;


//location="/tmp" : 파일 용량이 클 경우 메모리에 저장하면 서버즉에 부담이 됨. fileSizeThreshold 의 용량이상인 경우 location의 디렉터리에
//임시 저장 하도록 함. 절대 경로를 사용해야 해서 디폴트로 사용("")되도록 생략 함.
//fileSizeThreshold=1024*1024,
//maxFileSize=1024*1024*5, : 여러개의 파일중 1개의 file size의 최대 크기
//maxRequestSize=1024*1024*5*5 : 여러개의 파일을 전송하는 경우 네트워크에 영향. 여러개의 파일의 총합의 최대 크기.
//

@MultipartConfig(
//location="/tmp",
fileSizeThreshold=1024*1024,
maxFileSize=1024*1024*50,
maxRequestSize=1024*1024*50*5 
)

@WebServlet("/admin/board/notice/reg")
public class RegController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		request.getRequestDispatcher("/WEB-INF/view/admin/board/notice/reg.jsp").forward(request,  response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 
		String title = request.getParameter("title");
		
		System.out.print("title : ");
		System.out.println(title);
		String content = request.getParameter("content");
		String isOpen = request.getParameter("open");
		
		Collection<Part> parts= request.getParts();
		
		StringBuilder builder = new StringBuilder();
		
		for(Part p : parts) {
			
			if(!p.getName().contentEquals("file")) continue; // 파일이 아니면 pass
			if(p.getSize() == 0) continue;
		
//			Part filePart = request.getPart("file");
			Part filePart = p;
			
			String fileName = filePart.getSubmittedFileName(); // file name
			builder.append(fileName);
			builder.append(",");
			
			InputStream fis = filePart.getInputStream();
			
			// 절대 경로를 사용해야 하기 때문에 이를 처리 하는 방법
			String realPath = request.getServletContext().getRealPath("/upload");
			System.out.printf("[RegController] realPath : %s\n", realPath);
			
			File path = new File(realPath);
			if(!path.exists())
				path.mkdirs();
			
			
			// String filePath = realpath + fileName; // /upload 다음에 \(윈도우) 또는 /(리눅스) 처리 필요 
			String filePath = realPath + File.separator + fileName;
			FileOutputStream fos = new FileOutputStream(filePath);
	
	//		int a = fis.read(); // 1byte Read
	//		int b;
			
			byte[] buf = new byte[1024];
			int size = 0;
			while((size = fis.read(buf)) != -1)
				fos.write(buf, 0, size);             // 1byte씩 읽고 쓰기를 하므로 시간이 많이 걸림.
			fos.close();
			fis.close();
				
		}	

		builder.delete(builder.length()-1, builder.length());
		
		boolean pub = false;
		if(isOpen != null)
			pub = true;
		
		Notice notice = new Notice();
		notice.setTitle(title);
		notice.setContent(content);
		notice.setPub(pub);
		notice.setWriterId("newlec");
		notice.setFiles(builder.toString());
		
		NoticeService service = new NoticeService();
		int result = service.insertNotice(notice);
		
		System.out.printf("title : %s\n", title);
		
//		response.setCharacterEncoding("UTF-8");
//		response.setContentType("text/html; charset=UTF-8"); 
//
//		PrintWriter out = response.getWriter(); 
//		out.printf("title : %s<br >", title);
//		out.printf("content : %s<br >", content);
//		out.printf("open : %s<br >", isOpen);
		
		response.sendRedirect("list");
	}

}
