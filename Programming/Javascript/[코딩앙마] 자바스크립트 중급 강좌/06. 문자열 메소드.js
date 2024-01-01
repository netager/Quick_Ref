// 리스트의 제목만 뽑아내기

let list = [
    '01. 들어가며',
    '02. JS의 역사',
    '03. 자료형',
    '04. 함수',
    '05. 배열',
]

let newList = [];

for(let i=0; i<list.length; i++) {
    newList.push(
        list[i].slice(4)
    );
}

console.log(newList);



// 금칙어 : 콜라

function hasCola(str) {
    // if(str.indexOf('콜라')) {        // 오류 발생 코드
    if (str.indexOf('콜라') > -1) {      // 정상 코드    
        console.log('금칙어가 있습니다.');
    } else {
        console.log('통과');
    }
}

// console.log(' 와 사이다'.indexOf('콜라') > -1);

hasCola("와 사이다가 있습니다.");       // -1   : true
hasCola('무슨소리, 콜라가 최고야');     // 7    : true
hasCola('콜라가 최고라고!!!');          // 0    : false
console.log('-----------------------------------------------')

// includes 를 이용한 금칙어 찾기
// 금칙어 : 콜라

function hasCola1(str) {
    if(str.includes('콜라')) {      // 정상 코드    
        console.log('금칙어가 있습니다.');
    } else {
        console.log('통과');
    }
}

hasCola1('와 사이다가 있습니다.');       // -1   : true
hasCola1('무슨소리, 콜라가 최고야');     // 7    : true
hasCola1('콜라가 최고라고!!!');          // 0    : false
