let arr = [27, 8, 5, 13];

arr.sort((a, b) => {
    console.log(a, b);
    return a - b;
});

console.log(arr);



// 누적 값 구하기
let arr1 = [1,2,3,4,5];

let result = 0;
arr1.forEach(num => {
    result += num;
})

console.log(result);

// reduce(fn, 초기값)
const result1 = arr1.reduce((prev, cur) => {
    return prev + cur;
}, 0);

console.log(result1);


// 객체에서의 reduce() 사용
let userList = [
    { name: 'Mike', age: 30 },
    { name: 'Tom', age: 10 },
    { name: 'Jane', age: 27 },
    { name: 'Sue', age: 26 },
    { name: 'Harry', age: 42 },
    { name: 'Steve', age: 60 },
];

let result2 = userList.reduce((prev, cur) => {
    if(cur.age > 19) {
        prev.push(cur.name);
    }
    return prev;
}, []);

console.log(result2);


// 나이의 합
let result3 = userList.reduce((prev, cur) => {
    prev += cur.age;
    return prev;
}, 0);

console.log(result3);

// 이름이 3자인 사람
let result4 = userList.reduce((prev, cur) => {
    if(cur.name.length === 3) {
        prev.push(cur.name);
    };
    return prev;
}, []);

console.log(result4);

