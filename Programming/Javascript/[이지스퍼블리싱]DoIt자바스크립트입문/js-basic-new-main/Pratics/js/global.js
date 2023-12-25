var myVar = 100;
document.write(`myVar is + ${myVar}<br>`);

test();
document.write(`myVar is + ${myVar}`);

function test() {
    myVar = 50;     // 전역변수
}