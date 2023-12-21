// 순서대로 실행하기  (결과 비교: 02\results\sync.js)
function displayA() {
    console.log('A');
}

function displayB(callback) {   // 2초후에 출력
    setTimeout(() => {
        console.log('B');
    }, 2000)

}

function displayC() {
    console.log('C');
}

// 동기 처리
// displayA();
// displayB();
// displayC();

// 비동기 처리 - CallBack 함수
displayA();
displayB(displayC());