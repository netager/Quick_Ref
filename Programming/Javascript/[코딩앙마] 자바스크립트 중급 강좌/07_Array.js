// forEach

let arr = ['Mike', 'Tom', 'Jane'];

arr.forEach((name, index, arr) => {
    console.log(`${index+1}, ${name}`);
});



// find() / findIndex()
let arr1 = [1,2,3,4,5];
const result = arr1.find((item) => {    // 요소를 순회하면서 나머지가 0인 요소를 찾아 해당 첫번째 요소값을 반환
    return item % 2 === 0;  
});

console.log(result)

// 객체가 들어 있는 배열 : indexOf() 사용 보다는 find() 사용
let userList = [
    {name: 'Mike', age: 30},
    {name: 'Jane', age: 27},
    {name: 'Tom', age: 10},
]

let result1 = userList.find((user) => {     // return이 true일때의 요소값을 반환 함.
    if (user.age < 19) {
        return true;
    } else {
        return false;                       // 해당 요소가 없으면 undefined 반환 
    }
});

console.log(result1);


// findIndex() 
let result2 = userList.findIndex((user) => {    // return이 true일때의 요소값의 index를 반환 함.
    if (user.age < 19) {
        return true;
    } else {
        return false;                           // 해당 요소가 없으면 -1 반환
    }
});

console.log(result2);       // 2



// arr.map()

let userList1 = [
    {name: 'Mike', age: 30},
    {name: 'Jane', age: 27},
    {name: 'Tom', age: 10},
];

let newUserList1 = userList.map((user, index) => {
    return Object.assign({}, user, {
        id: index + 1,
        isAdult: user.age > 19,
    });
});

console.log(newUserList1);
console.log(userList1);



