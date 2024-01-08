const pr = new Promise((resolve, reject) => {
    setTimeout(() => {
        // resolve('OK');
        reject(new Error('err...'));
    }, 1000);
});

console.log('시작');
pr.then((result) => {
    console.log(result);
}).catch((err) => {
    console.log(err);
}).finally(() => {
    console.log('끝');
});


const f1 = (callback) => {
    setTimeout(function () {
        console.log('1번 주문 완료');
        callback();
    }, 1000);
};

const f2 = (callback) => {
    setTimeout(function () {
        console.log('2번 주문 완료');
        callback();
    }, 3000);
};

const f3 = (callback) => {
    setTimeout(function () {
        console.log('3번 주문 완료');
        callback();
    }, 2000);
};

console.log('시작');

f1(function () {        // callback에 callback 사용 반복 : callback hell(콜백 지옥)
    f2(function () {
        f3(function () {
            console.log('끝');
        });
    });
});


// Promise 로 변경
const g1 = () => {
    return new Promise((res, rej) => {
        setTimeout(() => {
            res('1번 주문 완료');
        }, 1000);
    });
};

const g2 = (message) => {
    console.log(message);
    return new Promise((res, rej) => {
        setTimeout(() => {
            res('2번 주문 완료');
        }, 3000);
    });
};

const g3 = (message) => {
    console.log(message);
    return new Promise((res, rej) => {
        setTimeout(() => {
            res('3번 주문 완료');
        }, 2000);
    });
};

console.log('시작');
g1()
.then((res) => g2(res))
.then((res) => g3(res))
.then((res) => console.log(res))
.catch(console.log)
.finally(() => {
    console.log('끝');
});