// ES2021
// String.replaceAll

const str1 = 'Hello World';

// String.replace()
console.log(str1.replace('He', 'Hi'));
console.log(str1.replace('Hello', 'Hi'));
console.log('--------------------------------------');

// replace() regExp 사용하여 전체 변경
console.log(str1.replace(/l/g, '~'));
console.log('--------------------------------------');

// String.replaceAll()
console.log(str1.replaceAll("l","~"));
console.log('--------------------------------------');

// 특수문자가 들어가는 경우 어려워짐 - repaceAll()을 사용하면 쉬움
const str2 = "I'm [Mike]. This is Tom's [Car].";
console.log(str2.replaceAll("[", "~").replaceAll("]", "~"));
console.log('--------------------------------------');

// 특수문자가 들어가는 경우 어려워짐 - repace()을 사용하면 어려움
console.log(str2.replace(/\[/g, "~").replace(/\]/g, "~"));
console.log('--------------------------------------');


// ES22021
// Promise.any

const rejPromise = new Promise((res, rej) => {
    setTimeout(() => {
        rej('fail...');
    }, 1000);
});

const resPromise = new Promise((res, rej) => {
    setTimeout(() => {
        res('success');
    }, 2000);
})

// Promise.race() : 가장 먼저 완료된 결과값으로 이행/거부
Promise.race([rejPromise, resPromise])  
.then(() => console.log('성공'))
.catch(e => console.log(e));
console.log('--------------------------------------');

// Promise.any() : 가장 먼저 이행된 객체 반환. 모두 거부되면 .catch문 수행
Promise.any([rejPromise, resPromise]) 
.then(() => console.log('성공'))
.catch(e => console.log(e));
console.log('--------------------------------------');

// Promise.any() - 모두 거부된 경우
Promise.any([rejPromise, rejPromise])   // 거부, 거부
.then(() => console.log('성공'))
.catch(e => console.log(e));
console.log('--------------------------------------');



// ES2021
// 논리 할당 연산자

function add(num1, num2) {
    num1 ||= 0;     // num1 = num1 || 0;
    num2 ||= 0;     // num2 = num2 || 0;
    console.log(num1 + num2);
}

add();
add(1,2);
console.log('--------------------------------------');

/*
name = name && `Hello ${name}`;
name &&= `Hello ${name}`;

// ?? : Nullish coalescing operator : null 병합 연산자
// - null 이거나 undefined 인 경우 해당
name = name ?? 'Mike';      
name ??= 'Mike'
*/
let num = 0;
let a = num || 3; // a = 3 할당, num = 0 false 이므로 3이 할당됨
console.log(a);
console.log('--------------------------------------');

num = 0;
let b = num ?? 3; // b = 0 할당, ??는 null 이나 undefined 를 확인하기 때문에. true/false 확인하는거 아님
console.log(b);
console.log('--------------------------------------');


// ES2021
// 숫자 구분자

// let billion = 1,000,000,000;    // 10억, 숫자 사이에 쉼표 허용 안함
let billion = 1_000_000_000;
console.log(billion);
console.log('--------------------------------------');


// ES2021
// WeakRef = weak reference ~ 약한 참조 ~ 가능하면 사용하지 말라
// -----------------------------------------------------------
// 자바스크립트에는 가비지 컬렉터가 있음 - 사용하지 않는 객체는 자동 메모리 해제
// 객체가 참조되고 있는면 메모리 해제가 되지 않음

// 약한 참조는 가비지 컬렉터의 대상이 됨
let user = {name: 'Mike', age:30};
const weakUser = new WeakRef(user); // 약한 user

user = null;

const timer = setInterval(() => {
    const wUser = weakUser.deref();
    if(wUser) {
        console.log(wUser.name);
    }else {
        console.log('제거 되었습니다.');
        clearInterval(timer);
    }
}, 1000);


class MyCache {
    constructor() {
        this.cache = {}
    }

    add(key, obj) {
    this.cache[key] = new WeakRef(obj)  // 약한 참조
    // this.cache[key] = new obj           // 강한 참조    
    }

    get(key) {
        let cachedRef = this.cache[key].deref()
        if(cachedRef) {
            return cachedRef
        } else {
            return false;
        }
    }
}

