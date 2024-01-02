// Clouser

function makeCounter() {
    let num = 0;

    return function() {
        return num++;
    };
}

let counter = makeCounter();
console.log(counter());     // 0
console.log(counter());     // 1
console.log(counter());     // 2