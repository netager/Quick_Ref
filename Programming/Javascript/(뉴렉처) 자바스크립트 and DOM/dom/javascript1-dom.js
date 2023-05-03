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


// Ex9-다중 노드선택 방법과 일괄삭제, 노드의 자리바꾸기
window.addEventListener("load", function() {

    var section = document.querySelector("#section9");

    var noticeList = section.querySelector(".notice-list");
    var tbody = noticeList.querySelector("tbody");
    var allCheckbox = section.querySelector(".overall-checkbox");
    var delButton = section.querySelector(".del-button");
    var swapButton = section.querySelector(".swap-button");

    allCheckbox.onchange = function() {
        var inputs = tbody.querySelectorAll("input[type='checkbox']");
        for(var i=0; i<inputs.length; i++)
            inputs[i].checked = allCheckbox.checked;

    };

    delButton.onclick = function() {
        var inputs = tbody.querySelectorAll("input[type='checkbox']:checked");  // checked 된것만 가져옴. 수도 코드
        console.log(inputs.length);

        for(var i=0; i<inputs.length; i++)
            inputs[i].parentElement.parentElement.remove();            

    };

    swapButton.onclick = function() {
        var inputs = tbody.querySelectorAll("input[type='checkbox']:checked");  // checked 된것만 가져옴. 수도 코드

        if(inputs.length != 2) {
            alert("엘리먼트는 2개를 선택해야만 합니다.");
            return;
        }

        var trs = [];
        for(var i=0; i<inputs.length; i++)
            trs.push(inputs[i].parentElement.parentElement);
        
        var cloneNode = trs[0].cloneNode(true);
        trs[1].replaceWith(cloneNode);
        trs[0].replaceWith(trs[1]);

    };    
});    

// Ex8-노드 삽입과 바꾸기
window.addEventListener("load", function() {

    var section = document.querySelector("#section8");

    var noticeList = section.querySelector(".notice-list");
    var tbodyNode = noticeList.querySelector("tbody");
    var upButton = section.querySelector(".up-button");
    var downButton = section.querySelector(".down-button");

    // var currentNode = tbodyNode.children[0];
    var currentNode = tbodyNode.firstElementChild;

    downButton.onclick = function() {
        var nextNode = currentNode.nextElementSibling;
        
        if(nextNode == null) {
            alert("더 이상 이동할 수 없습니다.");
            return;
        }

        // insertBefore() 활용
        // tbodyNode.removeChild(nextNode);
        // tbodyNode.insertBefore(nextNode, currentNode);
        currentNode.insertAdjacentElement("beforebegin", nextNode); // 신규
    };


    upButton.onclick = function() {
        var previousNode = currentNode.previousElementSibling;

        if(previousNode == null) {
            alert("더 이상 이동할 수 없습니다.");
            return;
        }

        // insertBefore() 활용
        // tbodyNode.removeChild(currentNode);
        // tbodyNode.insertBefore(currentNode, previousNode);
        currentNode.insertAdjacentElement("afterend", previousNode) // 신규

    };    
});    

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


// Ex6-노드조작 : 메뉴추가(createTextNode, Element)
window.addEventListener("load", function() {
    var section = document.querySelector("#section6");

    var titleInput = section.querySelector(".title-input");
    var menuListUl = section.querySelector(".menu-list");
    var addButton = section.querySelector(".add-button");
    var delButton = section.querySelector(".del-button");

    addButton.onclick = function() {
        var title = titleInput.value;

        // menuListUl.innerHTML += '<li><a href="">'+title+'</a></li>';
        var html = '<li><a href="">'+title+'</a></li>';
        var li = document.createElement("li");
        li.innerHTML = html;

        // menuListUl.appendChild(li); 
        menuListUl.append(li);


        /*
        var title = titleInput.value;
        var txtNode = document.createTextNode(title);
    
        var aNode = document.createElement("a");
        aNode.href="";
        aNode.appendChild(txtNode);

        var liNode = document.createElement("li");
        liNode.appendChild(aNode);

        menuListUl.appendChild(liNode);

        // var title = titleInput.value;
        // var txtNode = document.createTextNode(title);
        // menuListDiv.appendChild(txtNode);
        */
    };

    delButton.onclick = function() {
        var liNode = menuListUl.children[0];
        //menuListUl.removeChild(liNode);
        liNode.remove();
    };
});    


// Ex5 : 엘리먼트 노드의 속성 & CSS 속성 변경
window.addEventListener("load", function() {
    var section = document.querySelector("#section5");
    var srcInput = section.querySelector(".src-input");
    var imgSelect = section.querySelector(".img-select");
    var changeButton = section.querySelector(".change-button");
    var img = section.querySelector(".img");
    var colorInput = section.querySelector(".color-input");

    changeButton.onclick = function() {
        img.src = "images/"+srcInput.value;      // datalist 사용
        // img.src = "../images/"+imgSelect.value;  // selection 사용
        
        // img.style.border-color = ?;
        // img.style["border-color"] = colorInput.value;
        img.style.borderColor = colorInput.value;
        console.log(colorInput.value);
        console.log(img.className);
    };
});    

// Ex4 : childNodes를 이용한 노드 선택
window.addEventListener("load", function() {
    var section4 = document.querySelector("#section4");

    var box = section4.querySelector(".box");

    // .children : html tag 형태만 자식으로 인정
    var input1 = box.children[0];
    var input2 = box.children[1];

    // .childNode : 주석이나 텍스트도 자식으로 인정
    // var input1 = box.childNodes[0];
    // var input2 = box.childNodes[1];

    input1.value = "hello";
    input2.value = "okay";

});    


// Ex3 : Selectors API level 1
window.addEventListener("load", function() {
    var section3 = document.getElementById("section3");
 
    // TAG input에서 name 속성을 이용하여 찾기
    var txtX   = section3.querySelector("input[name='x']");

    // class명으로 찾기 : . 으로 시작하면 class
    // id명으로 찾기    : # 시작
    var txtY   = section3.querySelector(".txt-y");
    var btnAdd = section3.querySelector(".btn-add");
    var txtSum = section3.querySelector(".txt-sum");
    
    // var txtX = section3.getElementsByClassName("txt-x")[0];
    // var txtY = section3.getElementsByClassName("txt-y")[0];
    // var btnAdd = section3.getElementsByClassName("btn-add")[0];
    // var txtSum = section3.getElementsByClassName("txt-sum")[0];
    
    btnAdd.onclick = function() {
        var x = parseInt(txtX.value);
        var y = parseInt(txtY.value);

        txtSum.value = x + y;
    };
});    

// Ex2 : 엘리먼트 선택방법 개선하기
window.addEventListener("load", function() {
    var section2 = document.getElementById("section2");
 
    var txtX = section2.getElementsByClassName("txt-x")[0];
    var txtY = section2.getElementsByClassName("txt-y")[0];
    var btnAdd = section2.getElementsByClassName("btn-add")[0];
    var txtSum = section2.getElementsByClassName("txt-sum")[0];
 
    /*
    var inputs = section2.getElementsByTagName("input");

    var txtX = inputs[0];
    var txtY = inputs[1];
    var btnAdd = inputs[2];
    var txtSum = inputs[3];
    */
    btnAdd.onclick = function() {
        var x = parseInt(txtX.value);
        var y = parseInt(txtY.value);

        txtSum.value = x + y;
    };
});    

        