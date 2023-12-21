// HTML 페이지 서빙하기  (결과 비교 파일 : 04\results\server-4.js)

const http = require("http");

const server = http.createServer((req, res) => {

    // req.url : 요청 경로
    // req.method : 요청 방식

    // 구조 분해 할당(destructing) 방식
    //   - const url = req.url;
    //   - const method = req.method;
    const {url, method}= req;

    res.setHeader("Content-type", "text/plain");
    
    console.log("요청을 받았습니다.");
    console.log("----------------------------------");

    if(method == "GET" && url =="/home") {
        res.write("HOME");
        res.end();
    } else if(method == "GET" && url =="/about") {
        res.end("ABOUT"); // 간략 표현방식 적용
    } else {
        res.end("Not Found");
    }


});

server.listen(3000, () => {
    console.log("서버가 실행 중");
});

