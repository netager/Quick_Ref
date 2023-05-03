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
