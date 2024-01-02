const user = {
    name: 'Mike',
}

console.log(user.name);
console.log(user.hasOwnProperty('name'));
console.log(user.hasOwnProperty('age'));

console.log(user);

// prototype 을 알기위해 상속 이용
const Car = {
    wheels: 4,
    drive() {
        console.log(`drive ... ${this.name}`)
    },
};

const bmw = {
    color: 'red',
    navigation: 1,
};

const benz = {
    color: 'black',
};

const audi = {
    color: 'blue',
};

bmw.__proto__ = Car;
benz.__proto__ = Car;
audi.__proto__ = Car;

const x5 = {
    color: 'white',
    name: 'x5',
}

x5.__proto__ = bmw; // prototype chain

benz.drive();
console.log(x5.name);
console.log(x5.navigation);
x5.drive();

console.log('-----------------------------');
for(p in x5) {
    console.log(p);
}

console.log(Object.keys(x5));   // x5에만 있는 key 가 나옴
console.log(Object.values(x5));

for(p in x5) {
    if (x5.hasOwnProperty(p)) {
        console.log('o', p);
    } else {
        console.log('x', p);
    }
}


// 생성자 이용
const Bmw1 = function(color) {
    this.color = color;
};

Bmw1.prototype.wheels = 4;
Bmw1.prototype.drive = function () {
    console.log('drive...');        
};
Bmw1.prototype.navigation = 1;
Bmw1.prototype.stop = function () {
    console.log('stop...');            
};

const x6 = new Bmw1('red');
const z6 = new Bmw1('blue');

// x6.__proto__ = car;
// z6.__proto__ = car;

console.log(x6);
console.log(z6);

console.log(x6.color);
console.log(x6.navigation);

x6.drive();
x6.stop();


// instanceof 메서드
console.log(x6 instanceof Bmw1);

// constructor 메서드
console.log(x6.constructor === Bmw1);


// 좀 더 깔끔한 코드   
const Bmw2 = function(color) {
    this.color = color;
};

Bmw2.prototype = {
    constructor: Bmw2,      // constructor 관계를 이어주기 위해 삽입
    wheels: 4,
    drive() {
        console.log(`Start... ${this.color}`);
    },
    navigation: 1,
    stop() {
        console.log(`Stop... ${this.color}`);
    },
};

const x7 = new Bmw2('green');
console.log(x7);
x7.drive();
x7.stop();

console.log(x7.constructor === Bmw2);   // constructor 관계가 깨짐


// color를 변경하지 못하도록 Closure 사용
const Bmw3 = function (color) {
    this.color = color;
};
const x8 = new Bmw3('red');
console.log(x8.color);
x8.color = 'black';
console.log(x8.color);  // color를 변경할 수 있음

// Closure 사용
const Bmw4 = function (color) {
    const c = color;
    this.getColor = function() {
        console.log(c);
    };
};
const x9 = new Bmw4('yellow');
console.log(x9.color);

x9.color = 'blue';
console.log(x9.color);  // color를 변경할 수 있음
console.log(x9);
x9.getColor();