// const pr = new Promise((resolve, reject) => {
//     setTimeout(() => {
//         // resolve('OK');
//         reject(new Error('err...'));
//     }, 1000)
// });

// console.log('시작');
// pr.then((result) => {
//     console.log(result);
// }).catch((err) => {
//     console.log(err);
// }).finally(() => {
//     console.log('끝');
// });


// const f1 = (callback) => {
//     setTimeout(() => {
//         console.log('1번 주문 완료');
//         callback();
//     }, 1000);
// };

// const f2 = (callback) => {
//     setTimeout(() => {
//         console.log('2번 주문 완료');
//         callback();
//     }, 3000);
// };

// const f3 = (callback) => {
//     setTimeout(() => {
//         console.log('3번 주문 완료');
//         callback();
//     }, 2000);
// };

// // Promise 없이 사용 - callback hell(콜백 지옥) 
// console.log('시작');
// f1(function(){
//     f2(function() {
//         f3(function () {
//             console.log('끝');
//         });
//     });
// });

// Promise 사용

const f1 = (message) => {
    console.log(message);
    return new Promise((res, rej) => {
        setTimeout(() => {
            res('1번 주문 완료');
        }, 1000);
    });
};

const f2 = (message) => {
    console.log(message);
    return new Promise((res, rej) => {
        setTimeout(() => {
            // res('2번 주문 완료');
            // rej(new Error('f2() Error'));
        }, 3000);
    });
};

const f3 = (message) => {
    console.log(message);
    return new Promise((res, rej) => {
        setTimeout(() => {
            res('3번 주문 완료');
        }, 2000);
    });
};

// Promise.race - 하나라도 1등으로 끝나면 종료됨 
console.log('Pormise.all 실행...');
console.time('Pormise.race');
Promise.race([f1('f1'), f2('f2'), f3('f3')]).then(res => {
    console.log(res);
    console.timeEnd('Pormise.race');
});

// Promise.all - 한꺼번에 수행하고 결과를 한번에 줌
//             - 에러발생시 전체적으로 결과를 안줌
console.log('Promise.all 실행...');
console.time('Promise.all');
Promise.all([f1('f1'), f2('f2'), f3('f3')]).then(res => {
    console.log(res);
    console.timeEnd('Promise.all');
});

// 순차적으로 수행
// - 에러발생시 이전의 것은 실행하고 에러난 이후는 오류
console.time('시작');
f1('Hello')
.then((res) => f2(res))
.then((res) => f3(res))
.then((res) => console.log(res))
.catch(console.log)
.finally(() => {
    console.timeEnd('시작');
});
