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
