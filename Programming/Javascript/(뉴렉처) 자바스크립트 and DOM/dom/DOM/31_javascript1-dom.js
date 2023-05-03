// Ex5 : 엘리먼트 노드의 속성 & CSS 속성 변경
window.addEventListener("load", function() {
    var section = document.querySelector("#section5");
    var srcInput = section.querySelector(".src-input");
    var imgSelect = section.querySelector(".img-select");
    var changeButton = section.querySelector(".change-button");
    var img = section.querySelector(".img");
    var colorInput = section.querySelector(".color-input");

    changeButton.onclick = function() {
        img.src = "../images/"+srcInput.value;      // datalist 사용
        // img.src = "../images/"+imgSelect.value;  // selection 사용
        
        // img.style.border-color = ?;
        // img.style["border-color"] = colorInput.value;
        img.style.borderColor = colorInput.value;
        console.log(colorInput.value);
        console.log(img.className);
    };
});    
