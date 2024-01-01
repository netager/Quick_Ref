// 생성자 함수 : 상품 객체를 생성해 보자

function Item(title, price) {
    // this = {};
    this.title = title;
    this.price = price;
    this.showPrice = function() {
        console.log(`가격은 ${this.price}원 입니다.`);
    }
    // return this;
}

const item1 = new Item('인형', 3000);
const item2 = new Item('가방', 5000);
const item3 = new Item('지갑', 9000);

// console.log(item1, item2, item3);
item3.showPrice();