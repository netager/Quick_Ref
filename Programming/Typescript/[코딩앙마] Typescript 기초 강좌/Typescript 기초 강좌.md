# [코딩앙마] TypeScript 강좌
- https://www.youtube.com/watch?v=5oGAkQsGWkc&list=PLZKTXPmaJk8KhKQ_BILr1JKCJbR0EGlx0
- 실습 환경 : https://www.typescriptlang.org/ko/

## 1. 개념
- 브라우저에서 TypeScript 해석 불가하고 JavaScript 만 가능
- 따라서, TypeScript로 작성하고 이를 JavsScript로 변환하는 과정이 필요

- JavaScript(동적언어)로 런타임에 타입 결정 / 오류 발견 됨.
- Java, TypeScript(정적언어)는 컴파일 타임에 타입 결정 / 오류 발견됨

// function add(num1:number, num2:number) {
//     console.log(num1 + num2);
// }

// // add();
// // add(1);
// add(1,2);
// // add(3,4,5);
// // add(1, "world");

// add()

function showItems(arr:number[]) {
    arr.forEach((item) => {
        console.log(item);
    });
}

showItems([1,2,3]);
// showItems(1,2, 3);


## 2. 자료형

// Typescript Data Type

// 기본형
let car:string = 'bmw';
let age:number = 30;
let isAdult:boolean = true;

// 배열
let a:number[] = [1,2,3];
let a2:Array<number> = [1,2,3];
let week:string[] = ['mon', 'tue', 'wed'];
let week2:Array<string> = ['mon', 'tue', 'wed'];
// week.push(1); 

// 튜플(Tuple)
let b:[string, number];
b = ['z', 1];
// b1 = [1, 'z']; 

b[0].toUpperCase();
// b[1].toLowerCase();


// void - return 값이 없는 경우
function sayHello():void {
    console.log('Hello');
}


// never - 에러를 반환하거나, 끝나지 않는 함수
function showError():never {
    throw new Error();
}

function infLoop():never {
    while(true) {
        // do something.
    }
}

// enum - 비슷한 값들끼리 묶는 것
enum Os {
    Windows = 3,
    Ios = 10,
    Android,
}

console.log(Os[10]);    // Ios


enum Os1 {
    Windows = 'win',
    Ios = 'ios',
    Android = 'and',
}

let myOs:Os1;
myOs = Os1.Windows;     // 정해진 특정값만 할당하도록 함


// null, undefined
let aa:null = null;
let bb:undefined = undefined;


## 3. 인터페이스

- 프로퍼티를 정해서 객체를 표현하고자 할때 사용


// 에러 발생
// let user:object;

// user = {
//     name: 'xx',
//     age: 30,
// }

// console.log(user.name);

type Score = 'A' | 'B' | 'C' | 'F';

interface User {
    name : string;
    age : number;
    gender? : string;            // optional
    readonly birthYear : number; // 읽기 전용
    // [grade:number] : string;
    [grade:number] : Score;
}

let user: User = {
    name : 'xx',
    age : 30,
    birthYear : 2000,
    1 : 'A',            // [grade:number] : string 으로 가능
    2 : 'B',            // [grade:number] : Score 로 인행 해당 값만 설정 가능
}

user.age = 10;
user.gender = 'male';   // interface에 gender? - optional(넣어도 되고 안넣어도 됨)
// user.birthYear = 1990; // readonly 속성으로 정의되어 있어서 변경 불가
console.log(user.age);


// interface로 함수 정의
interface Add {
    (num1:number, num2:number): number;
}

const add: Add = function(x, y) {
    return x + y;
}

// add(10, 20, 30); // 인수가 3개라서 오류
// add(10, '20'); // 인수가 string이어서 오류

interface IsAdult {
    (age:number):boolean;
}

const isAdult:IsAdult = (age) => {
    return age > 19;
}
isAdult(30);


// interface로 클래스 정의 ~ implements
interface Car {
    color: string;
    wheels: number;
    start(): void;
}

class Bmw implements Car {
    color;
    wheels = 4;
    constructor(c:string) {
        this.color = c;
    };
    start() {
        console.log('go..');
    };
}

const b = new Bmw('green');
console.log(b)
b.start();


// interface 는 확장이 가능 ~ extends
interface Benz extends Car {
    door: number;
    stop(): void;

}

const benz : Benz = {
    door : 5,
    stop() {
        console.log('stop');
    },
    color : 'red',
    wheels : 4,
    start() {
        console.log('go..');
    },
}

benz.start();
benz.stop();


// 확장은 여러개 가능 함
interface Car {
    color: string;
    wheels: number;
    start(): void;
}

interface Toy {
    name: string;
}

interface ToyCar extends Car, Toy {
    price: number;
}


// 함수 type 정의

// function add(num1, num2) {
//     return num1 + num2;
// }

// 리턴 있는 경우
function add1(num1:number, num2:number):number {
    return num1 + num2;
}

// 리턴 없는 경우
function add2(num1:number, num2:number):void {
    // return num1 + num2;
    console.log(num1+num2);
}

function isAdult1(age:number):boolean {
    return age > 19;
}

function hello(name?:string) {
    return `Hello, ${name || 'world'}`;
}
console.log(hello());
console.log(hello('Lee'));

function hello1(name = 'world') {
    return `Hello, ${name || 'world'}`;
}

console.log(hello1());
console.log(hello1('Kim'));

function hello2(name:string, age?:number):string {
    if (age !== undefined) {
        return `Hello, ${name}. You are ${age}`;
    } else {
        return `Hello, ${name}`;
    }
}

console.log(hello2('Kim'));
console.log(hello2('Park', 30));


// rest 파라미터를 이용한 함수
function add3(...nums:number[]) {
    return nums.reduce((result, num) => result + num, 0);
}

console.log(add3(1,2,3)); //6
console.log(add3(1,2,3,4,5,6,7,8,9,10)); // 55


// this와 관련된 내용
interface User1 {
    name: string;
}

const Sam: User1 = {name:'Sam'};

// function showName() {
//     console.log(this.name)
// }

// function showName(this:User1) {
//     console.log(this.name)
// }

function showName(this:User1, age:number, gender:'m'|'f') {
    console.log(this.name, age, gender);
}

const a = showName.bind(Sam);
a(30, 'm');


// 함수 overload
interface User2 {
    name: string;
    age: number;
}

function join(name:string, age:number): User2 ;
function join(name:string, age:string): string ;
function join(name:string, age:number|string): User2|string {
    if(typeof age === 'number') {
        return {name, age};
    } else {
        return '나이는 숫자로 입력해줘요';
    }

}

const sam:User2 = join('Sam', 30);
const jane:User2 = join('Jain', '30');


## 5. 리터럴, 유니용/교차타입

// Literal types
const userName1 = 'Bob';    // 문자열 리터럴 타입 : const - 변하지 않는 값 저장 - type : 'Bob'
let userName2 = 'Tom';      // let - 변하는 값 저장 - type : string

// userName2 = 3;              // 오류 발생

let userName3: string | number = 'Tom';     // string 과 number 를 같이 사용하는 방법
userName3 = 3;                              // number 저장 
userName3 = 'Lee';                          // string 저장


type Job = 'police' | 'developer' | 'teacher';

interface User3 {
    name: string;
    job: Job;
}

const user1: User3 = {
    name: 'Bob',
    // job: 'student', // 오류 발생
    job: 'police',
}

interface HighSchoolStudent {
    name: string;
    grade: 1 | 2 | 3;
}



// Union types - or
interface Car {
    name: "car";
    color: string;
    start(): void;
}

interface Mobile {
    name: 'mobile';
    color: string;
    call(): void;
}

function getGift(gift: Car | Mobile) {  // 유니온 타입
    console.log(gift.color);
    // gift.start();   // Mobile 에 start() 가 없어서 오류

    if(gift.name === 'car') {   // 식별 가능한 유니온 타입 
        gift.start();   
    } else {
        gift.call();
    }
}


// 교차 타입(Intersection Types) - and
interface Car1 {
    name: string;
    start(): void,
}

interface Toy {
    name: string;
    color: string;
    price: number;
}

const toyCar: Toy & Car1 = {      // 교차타입은 여러개의 타입을 1개로 합쳐주는 역할
    name: '타요',
    start() {},
    color: 'blue',
    price: 1000,
}


## 6. 클래스(Class)

class Car {
    color: string;
    constructor(color: string) {
        this.color = color;
    }
    start() {
        console.log('start');
    }
}

const bmw = new Car('red');

// public 처리
class Car1 {
    constructor(public color: string) {     // public 넣어줌
        this.color = color;
    }
    start() {
        console.log('start');
    }
}

const bmw1 = new Car1('red');


// readonly 처리
class Car2 {
    constructor(readonly color: string) {     // readonly 넣어줌
        this.color = color;
    }
    start() {
        console.log('start');
    }
}

const bmw2 = new Car2('red');



// 접근 제한자(Access modifier) - public, private, protected
/*
public - 자식 클래스, 클래스 인스턴스 모두 접근 가능
protected - 자식 클래스에서 접근 가능
private - 해당 클래스 내부에서만 접근 가능
*/
class Car3 {
    readonly name: string = "car";
    color: string;
    static wheels = 4;
    constructor(color: string, name: string) {
        this.color = color;
        this.name = name;
    };
    start() {
        console.log('start');
        console.log(this.name);
        console.log(Car3.wheels)    // static 으로 선언된 속성은 Class명을 이용하여 참조해야 함.
    };
}

class Bmw extends Car3 {
    constructor(color: string, name: string) {
        super(color, name);
    }

    showName() {
        console.log(super.name);
    }
}

const z3 = new Bmw('black', 'z4444');
console.log(z3);
// z4.name = 'abcdef';
console.log(z3);
z3.showName();


// 추상 클래스

abstract class Car4 {
    color: string;
    constructor(color: string) {
        this.color = color;
    };
    start() {
        console.log(`${this.color} Car start`);
    };

    abstract doSomething():void;
}

// const car = new Car4('red');    // 추상클래스는 new 로 생성 불가. 상속을 통해서만 가능 


class Bmw4 extends Car4 {
    constructor(color: string) {
        super(color);
    }

    doSomething():void {
        console.log('doSomething()');
    }
}

const z5 = new Bmw4('black');
z5.start()



## 7. 제네릭(Generic)

function getSize<T>(arr: T[]):number {
    return arr.length;
}

const arr1 = [1,2,3];
console.log(getSize<number>(arr1));         // 입력 type 정의 <>

const arr2 = ['a', 'b', 'c', 'd'];
console.log(getSize<number|string>(arr2));  // 특정 type으로 강제

const arr3 = [false];                       // 안써도 자동으로 인식 됨
console.log(getSize(arr3));


interface Mobile<T> {
    name: string;
    price: number;
    option: T;        // 어떤 옵션을 사용할지 모르는 경우
}

const m1: Mobile<object> = {
    name: 's21',
    price: 1000,
    option: {
        color: 'red',
        coupon: false,
    },

}

const m2: Mobile<string> = {
    name: 's20',
    price: 900,
    option: 'good',
}

const m3: Mobile<{ color: string, coupon: boolean }> = {
    name: 's21',
    price: 1000,
    option: {
        color: 'red',
        coupon: false,
    },

}

console.log(m3.option.color);


// 
interface User {
    name: string;
    age: number;
}

interface Car {
    name: string;
    color: string;
}

interface Book {
    price: number;
}

const user: User = { name: 'a', age: 10 };
const car: Car = {name: 'bmw', color: 'red'};
const book: Book = { price: 3000};

function showName<T extends { name: string }>(data: T): string {
    return data.name;
}

showName(user);
showName(car);
// showName(book);


## 8. 유틸리티 타입(Utility Types)

// keyof
interface User {
    id: number;
    name: string;
    age: number;
    gender: 'm' | 'f';
}

type UserKey = keyof User;  // 'id' | 'name' | 'age' | 'gender'

// const uk:UserKey = 'abc';    // 오류 발생
const uk1: UserKey = 'name';
console.log(uk1);


// Partial<T>

interface User1 {
    id: number;
    name: string;
    age: number;
    gender: 'm' | 'f';
}

// let admin: User1 = {     // 오류 발생
//     id: 1,
//     name: "Bob",
// }

let admin1: Partial<User1> = {  // partial<User1> 을 이용하여 오류 회피
    id: 1,
    name: "Bob",
}


// Required<T>

interface User2 {
    id: number;
    name: string;
    age?: number;
}

let admin2: Required<User2> = {
    id: 1,
    name: 'Bob',
    age: 10,        // 모든 속성을 다 사용해야 
}


// Readonly<T>

interface User3 {
    id: number;
    name: string;
    age?: number;
}

let admin3: Readonly<User3> = {
    id: 1,
    name: 'Bob',
}

admin3.id = 4;  // Readonly 사용하면 오류 발생



// Record<K, T>  ~ K : Key, T : Type

interface Score {
    "1": "A"|"B"|"C"|"D";
    "2": "A"|"B"|"C"|"D";
    "3": "A"|"B"|"C"|"D";
    "4": "A"|"B"|"C"|"D";
}

const score: Score = {
    1: "A",
    2: "C",
    3: "B",
    4: "D",
};

const score1: Record<"1"|"2"|"3"|"4", "A"|"B"|"C"|"D"> = {
    1: "A",
    2: "C",
    3: "B",
    4: "D",
};

type Grade2 = "1"|"2"|"3"|"4";
type Score2 = "A"|"B"|"C"|"D";
const score2: Record<Grade2, Score2> = {
    1: "A",
    2: "C",
    3: "B",
    4: "D",
};

// 예제
interface User4 {
    id: number;
    name: string;
    age: number;
}

function isValid(user: User4) {
    const result: Record<keyof User4, boolean>= {
        id: user.id > 0,
        name: user.name !== '',
        age: user.age>0,
    }
    return result;
}

let result = isValid({id: 2, name: 'Lee', age: 30,});
console.log(result);



// Pick<T, K>

interface User5 {
    id: number;
    name: string;
    age: number;
    gender: 'M'|'F';
}

const admin5: Pick<User5, "id" | "name"> = {
    id: 0,
    name: "Bob",
}


// Omit<T, K> ~ Pick의 반대

interface User6 {
    id: number;
    name: string;
    age: number;
    gender: 'M'|'F';
}

const admin6: Omit<User6, "age" | "gender"> = {
    id: 0,
    name: "Bob",
}



// Exclude<T1, T2> ~ T1에서 T2를 제외 함

type T1 = string | number;
type T2 = Exclude<T1, number>;          // string
type T3 = Exclude<T1, number | string>; // never



// NonNullable<Type> - null과 undefined 를 뺌

type T4 = string | null | undefined | void;
type T5 = NonNullable<T4>;









