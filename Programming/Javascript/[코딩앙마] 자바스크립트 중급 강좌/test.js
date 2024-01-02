const test = {
    name: 'test',
    drive() {
        console.log('testing...');
    },
};

const test1 = {
    name: 'test1',
}

test1.__proto__ = test;
console.log(test1.name);
test1.drive();