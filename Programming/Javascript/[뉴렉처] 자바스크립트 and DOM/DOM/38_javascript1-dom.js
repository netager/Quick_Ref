// Ex10-클릭한 컬럼을 기준으로 레코드 정렬하기
window.addEventListener("load", function() {
    var notices = [
        {id:1, title:"공부하자2", regDate:"2019-01-25", writerId:"newrec1", hit:0},
        {id:2, title:"공부하자1", regDate:"2019-01-26", writerId:"newrec2", hit:10},
        {id:3, title:"공부하자4", regDate:"2019-01-24", writerId:"newrec3", hit:5},
        {id:4, title:"공부하자3", regDate:"2019-01-27", writerId:"newrec4", hit:20}
    ];

    var section = document.querySelector("#section10");

    var noticeList = section.querySelector(".notice-list");
    var titldTd = section.querySelector(".title");
    var tbodyNode = section.querySelector("tbody");
    
    var bindData = function() {
        var template = section.querySelector("template");
        // var cloneNode = document.importNode(template.content, true);
        // var tds = cloneNode.querySelectorAll("td");

        for(i in notices) {
            var cloneNode = document.importNode(template.content, true);
            var tds = cloneNode.querySelectorAll("td");
    
            tds[0].textContent = notices[i].id;
            tds[1].innerHTML = '<a href="'+notices[i].id+'">'+notices[i].title;
            tds[2].textContent = notices[i].regDate;
            tds[3].textContent = notices[i].writerId;
            tds[4].textContent = notices[i].hit;

            tbodyNode.append(cloneNode);  
        }
    };

    bindData();

    var titleSorted = false;

    titldTd.onclick = function() {
        tbodyNode.innerHTML = "";   // element 삭제

        if(!titleSorted)
            notices.sort(function (a, b) {
                titleSorted = true;
                if(a.title < b.title)
                return -1;
                else if(a.title > b.title)
                return 1;
                else
                    return 0;
            });
        else
            notices.reverse();   // Array.reverse()
    
        bindData();
    };
});    
