// Computed Properties

let n = 'name';
let a = 'age';

const user = {
    [n]: 'Mike',
    [a]: 30,
    [1+4]: 5,
    ['안녕하' + '세요']: 'Hello',
}

console.log(user);
console.log(user['5']);


function makeObj(key, val) {
    return { 
        [key]: val
    }
}

const obj = makeObj('나이', 33);
console.log(obj);

const obj1 = makeObj('성별', 'male');
console.log(obj1);



// 객체 메서드

// Test Object
const user1 = {
    name: 'Mike',
    age: 30,
}

// 객체의 얕은 복사
const user2 = user1;
console.log(user1, user2);

user1.name = 'Lee';
console.log(user1, user2);  // name 이 모드 'Lee'로 변경 됨

// Object.assing()
const user3 = Object.assign({}, user1);
user1.name = 'Tom';
console.log('Object.assing() : ' + user3);
console.log(user1, user3);

// Object.keys()
const result = Object.keys(user1);
console.log(result);

// Object.values()
const values = Object.values(user1);
console.log(values);

// Object.entries()
const entries = Object.entries(user1);
console.log(entries);

// Object.fromEntries()
let arr = [['name', 'Park'], ['age', 30]];
const user5 = Object.fromEntries(arr);
console.log(user5);

let arr1 = [
    ['mon', '월'],
    ['tue', '화'],
]

const days = Object.fromEntries(arr1);
console.log(days);

