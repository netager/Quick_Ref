// toString()
let num = 10;
console.log(num.toString());         // '10'
console.log(num.toString(2));        // '1010'

let num2 = 255; 
console.log(num2.toString(16));      // 'ff'  


// ### Math - 수학과 관련된 property와 메소드를 가지고 있음
console.log(Math.PI);                // 3.141592 ......

/*
#### math.ceil() : 올림
```javascript
let num1 = 5.1;
let num2 = 5.7;

Math.ceil(num1);    // 6
Math.ceil(num2);    // 6
```

#### math.floor() : 내림
```javascript
let num1 = 5.1;
let num2 = 5.7;

Math.floor(num1);    // 5
Math.floor(num2);    // 5
```

#### math.round() : 반올림
```javascript
let num1 = 5.1;
let num2 = 5.7;

Math.ceil(num1);    // 5
Math.ceil(num2);    // 6
```

#### 소수점 자릿수
- 요구사항 : 소수점 둘쨰자리까지 표현(셋째 자리에서 반올림)
```javascript
let userRate = 30.1234;

Math.round(userRate * 100) / 100;    // 30.1234 * 100 = Math.round(3012.44) = 3012 / 100 = 30.12
```

#### 소수점 자릿수 : toFixed() - 문자열 반환
- 요구사항 : 소수점 둘쨰자리까지 표현(셋째 자리에서 반올림)
```javascript
let userRate = 30.1234;

userRate.toFixed(2);                // '30.12'

userRate.toFixed(0);                // '30'
userRate.toFixed(6);                // '30.123400' - 0으로 채워 줌

// 문자로 반환되므로 Number()를 이용하여 숫자로 변환
Number(userRate.toFixed(2));        // 30.12
```

#### isNaN()
```javascript
let x = Number('x');        // NaN

// NaN의 특징
x == NaN        // false
x === NaN       // false
NaN == NaN      // false, 특이함

isNaN(x)        // true
isNaN(3)        // false
```

#### parseInt() - 문자열을 숫자로 변경, 문자가 혼용되어 있어도 숫자로 변환 가능(단, 숫자로 시작해야 함.)
```javascript
let margin = '10px'

parseInt(margin);       // 10
Number(margin);         // NaN

let redColor = 'f3';
parseInt(redColor);       // NaN

// 문자이지만 16진수 형이면 16진수로 변경 가능
let redColor = 'f3';
parseInt(redColor, 16);     // 243 - 16진수 F3d을 십진수 243으로 변환하여 리턴

parseInt('11', 2);          // 3
```

#### parseFloat()
```javascript
let padding = '18.5%';

parseInt(padding);      // 18
parseFloat(padding);    // 18.5
```

#### Math.random() - 0 ~ 1 사이 무작위 숫자(실수) 생성
```javascript
Math.random();      // 0.2602 ...
Math.random();      // 0.6302 ...
Math.random();      // 0.5452 ...
Math.random();      // 0.7782 ...

// 1 ~ 100 사이 임의의 숫자를 뽑고 싶다면?
Math.floor(Math.random() * 100) + 1;
```

#### Math.max() / Math.min()
```javascript
Math.max(1, 4, -1, 5, 10, 9, 5.54); // 10
Math.min(1, 4, -1, 5, 10, 9, 5.54); // -1
```

#### Math.abs() - absolute
```javascript
Math.abs(-1); // 1
```

#### Math.pow(n, m) - 거듭제공
```javascript
Math.pow(2, 10); // 1024
```

#### Math.sqrt() - 제곱근(squre root)
```javascript
Math.sqrt(16);       // 4
```
*/