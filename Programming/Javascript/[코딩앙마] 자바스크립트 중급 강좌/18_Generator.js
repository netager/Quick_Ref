// Generator
// - next(), return(), throw()
function* fn() {
    try {
        console.log(1);
        yield 1;
        console.log(2);
        yield 2;
        console.log(3);
        console.log(4);
        yield 3;
        return 'finish';
    } catch (e) {
        console.log(e);
    };
};

const a = fn(); // generator 객체만 반환하고 함수는 실행되지 않음
console.log(a.next());
// console.log(a.return('END'));
console.log(a.throw(new Error('err')));
console.log(a.next());
console.log(a.next());
console.log(a.next());
console.log(a.next());

// 배열에서의 iterator
console.log('--------------------------------')
const arr = [1,2,3,4,5];
const it = arr[Symbol.iterator]();
console.log(it.next());
console.log(it.next());

//
console.log('--------------------------------')
function* fn1() {
    yield 4;
    yield 5;
    yield 6;
}

const aa = fn1();
console.log(aa[Symbol.iterator]() === aa);
console.log('--------------------------------')

for(let num of aa) {
    console.log(num);
};

console.log('--------------------------------')
// 문자열 iterator
const str = 'hello';
console.log(str[Symbol.iterator]);  // string 에도 iterator 존재

const xx = str[Symbol.iterator]();
console.log(xx.next());
console.log(xx.next());

for(let s of str) {
    console.log(s);
}

// next()에 인수 전달
function* fn2() {
    const num1 = yield '첫번째 숫자를 입력해주세요';
    console.log(num1);

    const num2 = yield '두번째 숫자를 입력해주세요';
    console.log(num2);

    return num1 + num2;
};

const a1 = fn2();
console.log(a1.next());
console.log(a1.next(4));
console.log(a1.next(3));


console.log('------------------------------');
// generator 는 값을 미리 만들어 두지 않음
function* fn3() {
    let index=0;
    while(true) {
        yield index++;
    }
};

const a2 = fn3();
console.log(a2.next());
console.log(a2.next());
console.log(a2.next());
console.log(a2.next());


console.log('------------------------------');
// generator - yield* 을 이용 - 다른 generator 불러오기
function* gen1() {
    yield 'W';
    yield 'o';
    yield 'r';
    yield 'l';
    yield 'd';
}

function* gen2() {
    yield 'Hello';
    yield* gen1();
    yield '!';
}

console.log(...gen2());