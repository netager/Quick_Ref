// setTimeout
console.log('Start ...');
function fn() {
    console.log('Start1-1 ...')
    console.log(3);
}
let result = setTimeout(fn, 3000);
// console.log(result);

console.log('Middle ...');

setTimeout(function() {
    console.log('Start2-1 ...')
    console.log('three seconds');

}, 3000);   // (실행할 fn, milliseconds)

console.log('End ...');


// function에 인수가 필요한 경우
function showName(name) {
    console.log(name);
}

setTimeout(showName, 3000, 'Mike');


// setTimeout() 스케쥴 취소 방법
function showName(name) {
    console.log(name);
}

const tId = setTimeout(showName, 3000, 'Jane');
clearTimeout(tId);

// 주의사항 delay=0 ?
setTimeout(function() {
    console.log('second');
}, 0);
console.log("first");     // 1, 2


// setInterval - 일정 시간 간격으로 함수를 반복
function showName(name) {
    console.log(name);
}

const tId2 = setInterval(showName, 3000, 'Lee');
clearInterval(tId2);

// 몇번 수행 후 중단하는 방법
let num = 1;

function showTime() {
    console.log(`Hi! After Connection Passed Time : ${num++}`);
    if (num > 5) {
        clearInterval(tId3);
    }
}

const tId3 = setInterval(showTime, 1000);

