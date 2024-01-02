const mike = {
    name: 'Mike',
};

const tom = {
    name: 'Tom',
};

function showThisName() {
    console.log(this.name);
}

showThisName();
showThisName.call(mike);

function update(birthYear, occupation) {
    this.birthYear = birthYear;
    this.occupation = occupation;
};

update.call(mike, 1999, 'singer');
console.log(mike);

update.call(tom, 2002, 'teacher');
console.log(tom);


const mike1 = {
    name: 'Mike1',
};

const tom1 = {
    name: 'Tom1',
};

function showThisName1() {
    console.log(this.name);
}

function update1(birthYear, occupation) {
    this.birthYear = birthYear;
    this.occupation = occupation;
};

update.apply(mike1, [1999, 'singer']);
console.log(mike1);

update.apply(tom1, [2002, 'teacher']);
console.log(tom1);


// Min, Max 구하는 예제

// Math 함수 적용
const minNum = Math.min(3, 10, 1, 6, 4);
const maxNum = Math.max(3, 10, 1, 6, 4);

console.log(`일반 min : ${minNum}`);
console.log(`일반 max : ${maxNum}`);

// Spread 연산자
let nums = [3, 10, 1, 6, 4]
const minNum1 = Math.min(...nums);
const maxNum1 = Math.max(...nums);

console.log(`Spread 연산자 min : ${minNum1}`);
console.log(`Spread 연산자 max : ${maxNum1}`);

// apply 연산자
const minNum2 = Math.min.apply(null, nums);
const maxNum2 = Math.max.apply(null, nums);

console.log(`appley 메서드 min : ${minNum2}`);
console.log(`appley 메서드 max : ${maxNum2}`);

// call 연산자
const minNum3 = Math.min.call(null, ...nums);
const maxNum3 = Math.max(null, ...nums);

console.log(`call 메서드 min : ${minNum3}`);
console.log(`call 메서드 max : ${maxNum3}`);

// bind - 함수의 this 값을 영구히 바꿀 수 있음
const lee = {
    name: 'Lee',
};

function update1(birthYear, occupation) {
    this.birthYear = birthYear;
    this.occupation = occupation;
};

const updateLee = update.bind(lee);
updateLee(1972, 'banker');
console.log(lee);


//
const user = {
    name: 'Mike',
    showName: function() {
        console.log(`Hello, ${this.name}`);
    },
};

user.showName();

let fn = user.showName;     // fn에 할당할 때 this를 잃어 버림
fn();                       // Hello, undefined

fn.call(user);
fn.apply(user);
console.log('-------------------------');
fn.bind(user);      // 아무것도 출력 안함

let boundFn = fn.bind(user);
boundFn();