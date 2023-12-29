function add(num1, num2) {
    console.log(num1 + num2);
}

add();  // undefined + undefined = NaN, 함수의 입력 매개변수가 없어도 오류 발생하지 않고 NaN 출력

add(1); // 1 + undefinded = NaN 출력

add(1, 2);

add(3, 4, 5); // 3 + 4

add('hello', 'world'); // 'hello' + 'world' = 'helloworld'



// 
function showItems(arr) {
    arr.forEach((item) => {
        console.log(item);
    });
}

showItems([1,2,3]);
showItems(1,2,3);