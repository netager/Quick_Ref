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
