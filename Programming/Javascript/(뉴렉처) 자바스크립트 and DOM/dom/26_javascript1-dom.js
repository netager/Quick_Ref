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
