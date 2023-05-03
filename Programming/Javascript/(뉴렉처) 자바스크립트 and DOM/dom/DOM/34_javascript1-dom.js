// Ex7-노드 복제와 템플릿 태그
window.addEventListener("load", function() {

    var notices = [
        {id:5, title:"공부하자5", regDate:"2019-01-25", writerId:"newrec5", hit:0},
        {id:6, title:"공부하자6", regDate:"2019-01-26", writerId:"newrec6", hit:17}
    ];

    var section = document.querySelector("#section7");

    var noticeList = section.querySelector(".notice-list");
    var tbodyNode = noticeList.querySelector("tbody");
    var cloneButton = section.querySelector(".clone-button");
    var templateButton = section.querySelector(".template-button");

    // notices에 있는 id:5을 추가하는 방법
    // ----------------------------------
    cloneButton.onclick = function() {
        var trNode = noticeList.querySelector("tbody tr"); // 첫번째 tr 찾기
        var cloneNode = trNode.cloneNode(true); // false : 껍데기만 복제, true : 자손 및 내용도 복제
        var tds = cloneNode.querySelectorAll("td"); //td를 다 선택
        tds[0].textContent = notices[0].id;
        tds[1].innerHTML = '<a href="'+notices[0].id+'">'+notices[0].title;
        tds[2].textContent = notices[0].regDate;
        tds[3].textContent = notices[0].writerId;
        tds[4].textContent = notices[0].hit;

        tbodyNode.appendChild(cloneNode);  // 기존 사용 방법
    };

    // tr을 복제하여 맨끝에 추가하는 예제 - cloneNode()
    // -----------------------------------------------
    /*   
    cloneButton.onclick = function() {
        var trNode = noticeList.querySelector("tbody tr"); // 첫번째 tr 찾기
        var cloneNode = trNode.cloneNode(true); // false : 껍데기만 복제, true : 자손 및 내용도 복제
        // tbodyNode.append(cloneNode);  // 최근 추가되어 가능
        // tbodyNode.append(cloneNode);  // 최근 추가되어 가능
        tbodyNode.appendChild(cloneNode);  // 기존 사용 방법
    };
    */

    // 다건 처리
    templateButton.onclick = function() {
        var template = section.querySelector("template");
        var cloneNode = document.importNode(template.content, true);
        var tds = cloneNode.querySelectorAll("td"); //td를 다 선택
        
        for(i in notices) {
            console.log('notice.id:' + notices[i].id);
            tds[0].textContent = notices[i].id;
            tds[1].innerHTML = '<a href="'+notices[i].id+'">'+notices[i].title; //방법1
            
            // var aNode = tds[1].children[i]          // 방법2
            // aNode.href = notices[i].id;
            // aNode.textContent = notices[i].title;


            tds[2].textContent = notices[i].regDate;
            tds[3].textContent = notices[i].writerId;
            tds[4].textContent = notices[i].hit;

            // tbodyNode.appendChild(cloneNode);  // 기존 사용 방법
            tbodyNode.append(cloneNode);  
            console.log('notice.id:' + notices[i].id);
        };
    };    

    /* 단건 처리
    templateButton.onclick = function() {
        var template = section.querySelector("template");
        var cloneNode = document.importNode(template.content, true);
        var tds = cloneNode.querySelectorAll("td"); //td를 다 선택
        tds[0].textContent = notices[0].id;
        // tds[1].innerHTML = '<a href="'+notices[0].id+'">'+notices[0].title; //방법1
        
        var aNode = tds[1].children[0]          // 방법2
        aNode.href = notices[0].id;
        aNode.textContent = notices[0].title;


        tds[2].textContent = notices[0].regDate;
        tds[3].textContent = notices[0].writerId;
        tds[4].textContent = notices[0].hit;

        tbodyNode.appendChild(cloneNode);  // 기존 사용 방법

    };
    */
});    
