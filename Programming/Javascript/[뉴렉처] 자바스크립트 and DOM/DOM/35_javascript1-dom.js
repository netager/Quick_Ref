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
