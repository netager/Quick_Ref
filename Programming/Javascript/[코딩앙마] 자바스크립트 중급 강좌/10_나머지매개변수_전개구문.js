// Rest parameters

function add(...numbers) {
    let result = 0; 
    numbers.forEach((num) => (result += num));
    console.log(result);
    return result;
}

console.log(add(1,2,3));
console.log(add(1,2));
add(1,2,3,4,5,6,7,8,9,10);

console.log('--------------------------------------')

// 전달 받은 모든 수를 더해야 함 - Rest parameters + reduce()
function add1(...numbers) {
    let result1 = numbers.reduce((prev, cur) => (prev += cur), 0);
    console.log(result1);
}

add1(1,2,3);
add1(1,2,3,4,5,6,7,8,9,10);



// 나머지 매개변수를 이용하여
// user 객체를 만들어 주는 생성자 함수를 만들어 봅시다

function User(name, age, ...skills) {
    this.name = name;
    this.age = age;
    this.skills = skills
}

const user1 = new User('Mike', 30, 'html','css');
const user2 = new User('Tom', 20, 'JS','React');
const user3 = new User('Jane', 10, 'English');

console.log(user1);
console.log(user2);
console.log(user3);


// arr1 을 [4,5,6,1,2,3]으로 만드세요
let arr1 = [1, 2, 3];
let arr2 = [4, 5, 6];

// forEach() 이용

arr2.reverse().forEach((num) => {
    arr1.unshift(num)
})

console.log(arr1);


// 전개구문 이용
let arr3 = [1, 2, 3];
let arr4 = [4, 5, 6];

arr3 = [...arr4, ...arr3];
console.log(arr3);


// forEach() 로 객체 생성
let user = {name: 'Mike'};
let info = { age: 30};
let fe = ['JS', 'React'];
let lang = ['Korean', 'English'];

user = Object.assign({}, user, info, {skills: [],
});

fe.forEach((item) => {
    user.skills.push(item);
});
lang.forEach((item) => {
    user.skills.push(item)
});

console.log(user);

// 전개구문 이용
user6 = { 
    ...user,
    ...info,
    skills: [...fe, ...lang],
};

console.log(user6);
