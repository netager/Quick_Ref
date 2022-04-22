package com.newlecture.web.controller.admin.notice;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.newlecture.web.entity.NoticeView;
import com.newlecture.web.service.NoticeService;


@WebServlet("/admin/board/notice/list")
public class ListController extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String[] openIds = request.getParameterValues("open-id");
		String[] delIds = request.getParameterValues("del-id");
		String cmd = request.getParameter("cmd");
		String ids_ = request.getParameter("ids");
		String[] ids = ids_.trim().split(" ");

		NoticeService service = new NoticeService();
		
		System.out.printf("[ ListController ] ids_ : %s\n",ids_);

		switch(cmd) {
		case "일괄공개":
			for(String openId : openIds)
				System.out.printf("[ ListController ] opend id : %s\n", openId);
			
			List<String> oids = Arrays.asList(openIds);
			List<String> cids = new ArrayList(Arrays.asList(ids));
			cids.removeAll(oids);
			
			System.out.printf("[ ListController ] ids : %s\n", Arrays.asList(ids));
			System.out.printf("[ ListController ] oids : %s\n", oids);
			System.out.printf("[ ListController ] cids : %s\n", cids);
			
//			for(int=0; i<ids.length; i++) {
//				//1. 현재 id가 open 된 상태냐
//				if(oids.contains(ids[i]))
//					pub->1;
//				else
//						pub -> 0
//				if(ids[i])
//			}
//			
			// Transaction 처리
			service.pubNoticeAll(oids, cids);
			// service.closeNoticeList(clsIds);
			break;
			
		case "일괄삭제":
			for(String delId : delIds)
				System.out.printf("del id : %s\n", delId);
			
			int[] ids1 = new int[delIds.length];
			for(int i=0; i<delIds.length; i++)
				ids1[i] = Integer.parseInt(delIds[i]);
			
			int result = service.deleteNoticeAll(ids);
			break;
		}
		
		response.sendRedirect("list"); // get 요청 수행
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String field_ = request.getParameter("f");
		String query_ = request.getParameter("q");
		String page_ = request.getParameter("p");

		String field = "title";
		if(field_ != null && !field_.equals(""))
			field = field_;
		
		String query = "";
		if(query_ != null && !query_.equals(""))
			query = query_;
		
		int page = 1;
		if(page_ != null && !page_.equals("")) {
			System.out.printf("[NoticeListController] page_ : %s\n", page_);
			page = Integer.parseInt(page_);
		}
		else {
			
			System.out.printf("[NoticeListController] Else page_ : %s\n", page_);
		}
		
		NoticeService service = new NoticeService();
		List<NoticeView> list = service.getNoticeList(field, query, page);
		
		int count = service.getNoticeCount(field, query);
		
//		System.out.println(list);
		System.out.printf("count : %d, field : %s, query : %s\n", count, field, query);
			
		request.setAttribute("list", list);
		request.setAttribute("count", count);
		
		request.getRequestDispatcher("/WEB-INF/view/admin/board/notice/list.jsp").forward(request, response);
	
	}
}

