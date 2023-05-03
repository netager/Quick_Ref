# Javascript+DOM Quick Start

## (1강) 학습가이드

### HTML 요소들을 객체화 하는 로드 과정이 포함됨
> HTML 파일 --> Document Objects(객체 트리 in Memory) --- Javascript --> 사용자 인터페이스 

### 자바 스크립트 학습 내용
> javascript --> Document Object --> Window Object

## (2강) 자바 스크립트의 탄생과 플랫폼
### 자바 스크립트의 탄생
> 전송하는 데이터에 대한 유효성 검사의 필요성
> Netscape navigator 

### 초창기 자바 스크립트와 그것의 플랫폼
> 유효성 검사를 위한 폼 객체가 전부 였음

## (3강) 실습환경 준비
### 편집 도구
> Visual Studio Code

### 브라우저
> Google Chrome - 사용자가 많고 개발자 도구가 좋음
> Apple Safari, MS Edge, Mozilla Firefox

### 개발용 브라우저
> Visual Studio Code의 Extention : Live Server

## (4강) 자바스크립트 코드 작성
### 스크립트 코드 작성 영역
```javascript
<html>
    <head>
        <script>
        </script>
    </head>
    <body>
        <script>
        </script>
    </body>
        <script>
        </script>
</html>
```

## (5강) 자바 스크립트 Quick Start 범주
> <b>데이터</b>, 연산자, 제어구조, 함수, Document Objects, Browser Object, OOP
> ES6

### 일반적인 언어의 값의 종류와 변수
> 정수, 실수, 문자, 문자열
```javascript
var x = 3;
var x = 3.7;
var x = 'A';
var x = "Hello";
var x; x = 3;
```

### 값과 Wrapper 클래스
> pointer, 참조변수(reference vari), autoboxing(wrapper)

### Wrapper 클래스와 Wrapping 방식
> 부울(Boolean), 정수(Number), 실수(Number), 문자(String), 문자열(String)
> 3개만 있음

```javascript
var x = 3;
var x = new Number(3);
var x;
```
> 할당 안된 변수를 출력하면 undefined 로 출력

### 변수의 초기값 비교
```javascript

var x = 3;
var y;      -- undefined

var x; alert(x == "undefined");
var x; alert(x == undefined); 
```
### 값과 Wrapper 클래스
#### 어떤 메소드를 사용할 수 있는지는 할당되는 객체에 따라서 달라진다.
```javascript
var x;
x.???()
num = 3.4 => new Number(3.4);

num = 3 => new Number(3);
num = 3 "3" => new String("3");
```

## (6강) Array 객체 - 배열 생성과 사용하기
### 배열 객체
#### push/pop 메소드를 이용한 데이터 관리 : Stack
```javascript
var nums = new Array();
nums.push(5)
alert(nums);

nums.push(10);
alert(nums);

nums.push(21);
alert(nums);

var n1 = nums.pop();
alert(nums);

var n2 = nums.pop();
alert(nums);

var n3 = nums.pop();
alert(nums);
```

#### 인덱스를 이용한 데이터 관리 : List
```javascript
var nums = new Array();
nums[0] = 5;
alert(nums);

nums[1] = 10;
alert(nums);

nums[2] = 21;
alert(nums);

alert(nums[0]);
alert(nums[1]);
```

```javascript
var nums = new Array();
nums[3] = 5;
alert(nums);

alert(nums.length);
```

## (7강) Array 초기화와 조작하기
### 배열 객체
#### 배열 객체 초기화
```javascript
var nums = new Array();
var nums = new Array(5);        // 5개의 비어있는 공간을 생성
var nums = new Array(5, 10, 21); // 값으로 입력됨
var nums = new Array(5,10,21,"hello");
alert(typeof nums[3]);
var nums = new Array(5,10,21,"hello", new Array(2,3,4));
alert(nums[4][1]);
```

#### splice() 메소드를 이용한 데이터 관리 : List
```javascript
var nums = new Array(5,10,21, "hello");
nums.splice(2);             // 2번째 부터 지워짐
nums.splice(2, 1);          // 2번째에서 1개 지워짐 
nums.splice(2, 1, "hoho");  // 대체
nums.splice(2, 0, "hoho");  // 삽입  
```

## (8강) Object 객체
### 객체지향 프로그램밍 언어?
#### 정적인 객체 정의와 동적인 객체 정의
- 정적인 객체 정의 : C++, C#, Java는 class 를 정의하고 객체를 만듦
- 동적인 객체 정의 : javascript는 객체를 만들어 그냥사용(prototype, class)

### Object 객체의 Expand Object
#### 키를 기반으로 데이터를 저장해야 할 때
```javascript
var exam = new Object();  
exam.kor = 30;              // expand object
exam.eng = 70;
exam.math = 80;

alert(exam.kor + exam.eng);
```

### Object 객체 생성하기
#### 키를 이용한 데이터 관리 : Map
```javascript
var exam = new Object();
exam["kor"] = 30;
exam["eng"] = 70;
exam["math"] = 80;

var exam = new Object();
exam.kor = 30;
exam.eng = 70;
exam.math = 80;
```
> 기본으로 exam.eng를 사용하다가 아래와 같이 사용할 때만 exam[key] 방식을 사용하기로 한다
```javascript
var key = "eng";
console.log(exam[key]);
```

## (9강) JSON
### Javascript 데이터 객체와 JSON 생성 방법
#### JavaScript Object
> Boolean   : var n = new Boolean(true);
> Number    : var n = new Number(3);
> String    : var s = new String("hello");
> Array     : var ar = new Array();
> Object    : var ob = new Object();

#### JavaScript Object Notation(JSON)
> Boolean   : var n = true;
> Number    : var n = 3;
> String    : var s = "hello"; or var s = 'hello';
> Array     : var ar = [];
> Object    : var ob = {};

### JSON의 중첩 표현
#### 중첩된 데이터의 구조도 쉽게 표현할 수 있다.
```javascript
var notices = [
                {"id":1, "title":"hello json"},
                {"id":2, "title":"Hi json"},
                {"id":3, "title":"json is ..."}
              ];

```
### 데이터를 구분하기 위한 표현방법
#### CSV, XML, JSON
##### CSV
> 1, hello json
> 2, hi json
> 3, json is ...

##### XML - IBM에서 만듦
> <notices>
>   <notice id="1" title="hello json" />
>   <notice id="2" title="hi json" />
>   <notice id="3" title="json is ..." />

##### JSON
> [
>   {"id":1, "title":"hello json"},
>   {"id":2, "title":"Hi json"},
>   {"id":3, "title":"json is ..."}
> ]

## (10강) eval함수와 JSON 파싱하기

## (11강) JSON 파서를 이용한 파싱 - JSON Parser

## (12강) 자바스크립트 연산자
### 연산자
> 기본값        : 숫자: 12 / 문자열: "hello"
>
> 산술연산자    : +, -, /, %
>
> 비교연산자    : <, >, <=, >=, ==, !=, ===, !==
>
> 논리연산자    : &&, || 
>
> 복합대입연산자: +=, -=, /=, ...
>
> 증감연산자    : ++, --
>
> 삼항연산자    : ?:
>
> 연산제어      : ()
 
### ==, !=, ===, !== 연산자
- 변수가 가리키는 값(==)이 같은지 주소(===)가 같은지 비교
```javascript
var x = 3;
var y = 3;
```

### 산술연산자
- 3 + 4
- 3 + 4 * 2
- 3.5 + 4.6
- 3 + 4.5
- "3" + "4"     ---> 34
- 3.5 + "4"     ---> 3.54
- 3.5 - "2"     ---> 1.5
- 5 < 3 + 4>    ---> true
- "32" > "4"
- 32 > "4"


## (13강) 자바스크립트 제어구조
### 제어구조
> 조건문    : if, while, do-while
>
> 반복문    : while, for, for-in
>
> 선택문    : else, else if, switch

#### for-in - array/object 객체에서 사용
```javascript
<script>
    var ar = ["철수","영희","맹구","동천"];
    for(var i=0; i<4; i++)
        alert(ar[i]);

    for(i in ar)
        alert(ar[i]);
</script>    
```

## (14강) 함수 객체와 표현식
### 함수?? 대입?? 객체??
- javascript는 함수를 정의하지 않고 만든다고 한다
```javascript
var add = new Function("x, y", "return x+y;");
alert(add(3,4));
```

## (15강) 함수의 가변 인자 arguments 콜렉션
```javascript
function add(x,y) {
    return x + y;
};
var sum = add(2,3);
var sum = add(2,3,"hello",3,4,5,6); // 정의된 인자보다 많은 인자 사용
```

## (16강) 변수의 가시영역과 global 객체 그리고 전역변수
### var 선언 변수는 정적인 방식으로 생성
```javascript
var a = 1;
alert(a)

alert(b)        // undefined 출력
                // 변수는 선언 되었는데 값이 할당 안되었다는 의미
var b = 2;

c = 1;
alert(c);
```

### 전역변수
- 변수를 선언하지 않으면 전역객체가 됨
```javascript
<script>
    var f1 = function() {
        a = 1;     // ---> window.a = 1;  즉, 전역변수
        a++;
        alert(a);
    }
    f1();
</script>
```

### 동일한 변수를 여러 번 선언하는 경우는?
```javascript
<script>
    var a = 1;
    var a = 2;
    alert(a);    // 어떤 값을 사용할까?
</script>
```

### 중괄호를 사용하는 경우
```javascript
<script>
    {
        var a = 1;
    }
    alert(a);
</script>
```

### 함수 안에서 선언한 global 변수
```javascript
<script>
    function f2() {
        var a = 1;
    }
    f2();
    alert(a);
</script>
```

### 함수 안에서 선언한 global 변수
```javascript
<script>
    function f1() {
        a = 1;
    }

    function f2() {
        alert(a);
    }
    f1();
    f2();
</script>
```

## (17강) 클로저(Closure)
### 변수 생명주기와 클로저(Closure)
```javascript
<script>
    function f1() {
        var a = 1;  // 지역변수
        return a
    }
    var a = f1();
    alert(a);
</script>
```

```javascript
<script>
    function f1() {
        var a = 1;  // 지역변수
        return function f2() {
            return a;
        }
    }
    var f = f1();   // 함수를 리턴받음
                    // 자원을 반환하지 못함
                    // f1의 생명은 지속됨
                    // f1은 생명은 f 변수가 다른 값으로 할당될 때
    var a = f();
    alert(a);
</script>
```

## (18강) 브라우저 플랫폼 - Window 플랫폼을 이용한 대화(parseInt, alert, prompt, confirm)
### HTML5에서 확장된 플랫폼의 기능
- UI(동적 문서)
  - Document Object
  - Cascading Style Sheets
- HTML5 API, 멀티미디어, 네트워크 통신, 로컬저장소 
  - Graphics and Media
  - Web Application API
  - Internet Platform API

### 브라우저 객체
- window
- window.location
- window.history
- window.document
  - body, img, form, input 등 

### 최상위 객체인 window 객체
#### window 객체의 Member : 사용자와 상호작용을 위한 기본 도구
- window 메서드(methods)
  - alert()
  - confirm()
  - prompt()
  - setTimeout()
  - clearTimeout()
  - setInterval()
  - clearInterval()
- window 프로퍼티(properties)
  - status
  - defaultStatus

### 대화상자을 이용한 출력 alert()

### 대화상자를 이용한 입력 prompt()

### 데이터 형식 변환하기
- parseInt("abc");      // Returns Nan (Not a Number)
- parseInt("12abc");    // Returns 12
                        // 실전 : 10px 값을 10으로 변환

### 게시글 삭제를 확인하기
- 확인을 위한 대화상자
```html
<script>
    var answer;
    answer = confirm("정말로 삭제하시겠습니까?");
    if(answer)
        alert("삭제 되었습니다.");
</script>
```

## (19강) 이벤트 기반의 윈도우 프로그래밍
### 스크립트 코드 작성 영역
```
1. 페이지가 읽혀질 때 실행
   - <script> </script>
2. <input onXXX="  " /> - 이벤트(사용자 행위시)
   - <input onclick="   " />
   - <input onmouseover="   " /> 
```
```html
<body>
    <input type="button" value="출력" onclick="alert('안내 메시지');" />
</body>
```

### 이벤트와 함수 호출
#### 덧셈결과 출력하기


## (20강) 문서의 엘리먼트 객체 이용하기
### HTML 요소들을 객체화 하는 로드 과정이 포함됨
- HTML 파일 --Load--> Document Object(객체트리 in Memory) --Show(javascript)--> 사용자 인터페이스
```html
<body>
    <div>
        <font></font>
        <input />
    </div>
    <p>
        <form>
            전송할까요?
            <input />
            <input />
        </form>
        hello~
    </p>
    <!-- 주석 -->
</body>
```
```
#document
    - body
        - div
            - font
            - input
        - p
            - form
                - #text
                - input
                - input
            - #text
        - #comment
```

### 문서 객체의 속성 사용하기
```html
<html>
    <head>
        <script>
            function printResult() {
                var x, y;
                x = prompt("Input x", 0);
                y = prompt("Input y", 0);
                alert(x+y);
            }
        </script>
    </head>
    <body>
        <input type="button" value="출력" onclick="printResult();" />
    </body>
</html>
```
```html
<html>
    <head>
        <script>
            function printResult() {
                var x, y;
                x = prompt("Input x", 0);
                y = prompt("Input y", 0);
                btnPrint.value= x + y;
            }
        </script>
    </head>
    <body>
        <input type="button" value="출력" onclick="printResut();" id="btnPrint" />    
```

## 객체 생성과 사용 시점의 문제

```html
<html>
    <head>
        <script>
            function printResult() {
                var x, y;
                x = prompt("Input x", 0);
                y = prompt("Input y", 0);
                alert(x+y);
            }
        </script>
    </head>
    <body>
        <input type="button" value="출력" onclick="printResult();" />
    </body>
</html>

<html>
    <head>
        <script>
            function printResult() {
                var x, y;
                x = prompt("Input x", 0);
                y = prompt("Input y", 0);
                btnPrint.value= x + y;
            }
            // script내에서 함수를 대입할때는 함수가 참조하는 함수 객체를 대입해야 함
            //소괄호를 넣으면 함수 호출이 됨.
            btnPrint.onclick = printResult; //에러발생
        </script>
    </head>
    <body>
        <input type="button" value="출력" id="btnPrint" />
    </body>
</html>


## (21강) 코드 초기화와 엘리먼트 객체 선택하기
### 스크립트 작성 방식
#### 객체 생성과 사용 시점의 문제
1. 객체가 생성된후 스크립트 정의하는 방식
2. load() 메서드 사용 방식
    - window.load() : 이것을 사용
    - body.load()

### 스크립트 작성 방식
#### 객체 아이디 명명 방법의 문제
- html은 낙타표기법 사용하지 않고 대쉬 사용 : btn-print
- javascript에서는 대시(-) 사용하면 오류 발생. 낙타표기법 사용
- 올바른 사용법 : html은 대쉬(-) 표기법. javascript : 낙타 표기법 사용

- 오류 예시
```html
<body>
    <script>
        function init() {
            btn-print.onclick = printResult; // 오류 발생
        }
    </script>
    <input type="button" value="출력" id="btn-print" />
</body>
```
- 앞으로 사용할 방법
```html
<head>
    <script>
        function printResult() {
            var btnPrint = document.getElementById("btn-print");
            ...;
        
        function init() {
            var btnPrint = document.getElementById("btn-print");
            btnPrint.onclick = printResult;
        }
        window.onload = init;
    </script> 
</head>
<body>       
    <input type="button" value="출력" id="btn-print" />
</body>
```

## (22강) 스크립트 코드의 지역화
### 이벤트 함수를 작성하는 일반적인 방식
#### 스크립트를 사용하는 기본 구조

## (23강) 코드분리와 이벤트 바인딩 방법 두 가지
### 스크립트 작성 방식
#### 익명 함수를 이용한 이벤트 핸들링
- html 과 script를 나누어서 분업화(협업) 장점 발생
```html
<head>
<script>
    window.onload = function() {
        var btnPrint = document.getElementById("btn-prnt");
        btnPrint.onclick = function() {
            ...;
        };
    }
</script>
</head>
```
- script를 2번 사용했던니 window.load 가 대체됨으로써 문제 발생
```html
<head>
<script src="index.js"></script>
<script src="test.js"> 
</script>
</head>
```
- event(window.onload)를 초기화 하지 않고 적재하는 방법으로 해결
```html
<script src="code1.js"></script>
<script src="code2.js"></script>
<script src="code3.js"></script>

function init() { ... }
window.onload = init;  // code1.js

function init() { ... }
window.onload = init;  // code2.js

function init() { ... }
window.onload = init;  // code3.js
```
- 해결방법
```html
window.addEventListener("load", function() {
    alert("test1");
});

window.addEventListener("load", function() {
    alert("test2");
});
```

## (24강) 첫 예제 간단한 계산기 프로그램 만들기
### 예제 프로그램 : Ex1 작성


## (25강) 노드 선택 방법 개선하기
### 하위 엘리먼트 선택하기
- document.getElementsByTagName();
- document.getElementsByClassName();

```html
<section>
    <h1></h1>
    <ul>
        <li id="num1">번호1</li>
        <li id="num2">번호2</li>
        <li id="num3">번호3</li>
    </ul>
</section>        
```
```html
<section id="sec1">
    <h1></h1>
    <ul>
        <li>번호1</li>
        <li>번호2</li>
        <li>번호3</li>
    </ul>
</section>        

```html
var lis = sec1.getElementsByTagName("li");
lis[0].textContent = "Hello";
```

### 예제 프로그램 : Ex2 작성

## (26강) Selector API
### Selectors API Level 1
- querySelector
- querySelectorAll

### Documnet 인터페이스의 노드 선택 방법
- getElementsByName()
- getElementsByClassName()

### Selectors API Level1 
- querySelector()
- querySelectorAll()

예제 프로그램 : Ex2, Ex2-2 작성

## (27강) Node와 Element Node 그리고 또 다른 노드 선택방법
- html이 객체로 로드가 되면 계보가 생김
```
#document(node)
    - body(node)
        - div(node)
            - font(nodd)
            - input(node)
        - p(node)
            - form(node)
                - #text(node)
                - input(node)
                - input(node)
            - #text(node)
        - #comment(node)
```
- 하나 하나를 모두 node라고 함

### 문서를 구성하는 노드들의 계보를 표현하는 방법 : 부모/자식

#### .childNodes[]
- 주석도 노드임 - 태그사이의 공백도 노드로 인식 함.
#### .children[]
- 태그만 노드로 인식 - children 사용


## (28강) Node의 종류
### 문서를 구성하는 노드들
### 문서를 구성하는 Node의 종류(Type) 들
- #document(9)  - DocumentType(10)          - <!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML ...> (DOCTYPE)
  -             - Element(1)                - <textarea><p><font> (textarea, p, font)
                    - Attr(2)               - <textarea rows="30 cols="40"> (rows, cols)
                    - Entity(6)             - &lt;뉴렉처&gt;&nbsp;(lt, nbsp)
                    - EntityReference(5)    - &lt;뉴렉처&gt;&nbsp;(&) 
                    - Text(3)               - <p>뉴렉처</p> (뉴렉처)
                - comment(8)                - <!-- 주석 -->
                - CDATASection(4)           - <![CDATA[<,>,]]>
                - Notation(12)              - <font color="#ffff00" size="10px"> (#ffff00, 10px)

### 문서를 구성하는 Node 객체들


## (29강) Node 인터페이스


## (30강) 엘리먼트 노드의 속성 다루기
### 엘리먼트 객체의 속성을 사용하기
#### HTML 태그의 속성과 객체의 속성은 거의 일치
- html ---> document 객체 ---> document.getElementById() or qeurySelector()

```html
<input type="text" id="txt1" value"" />
<img src="pic1.jpg" id="img1" />
```

```
document - body - txt1
                - img1
```

``` html
var img1=document.getElementById("img1");
img1.???(속성-attr) // 변경
```                

## (31강) 스타일 변경하기
### style 속성을 이용해서 스타일 변경하기
```html
<body>
    <script>
        function changeImage() {
            var txt1 = document.getElementById("txt1");
            var img1 = document.getElementById("img1");
            img1.src = txt1.value;
            txt1.style.border="10px solid #0000ff";
        }
    </script>
<form>
    <input id="txt1" />
    <input type="button" onclick="changeImage();" value="변경" />
    <img id="img1" src="test.jpg" style="border:5px solid #ff0000;" />
```      

## (32강) 텍스트 노드 추가/삭제하기
### 자바 스크립트를 위한 입/출력 객체
#### 현재 문서에 문자열 추가하기 : 현재 document 트리에 노드 추가

### Document 객체
#### document 객체의 기능 : 문서의 자식 노드 객체 생성
- Element
> createElement(in DOMString tagName)
>           raises(DOMException);
- Text
> createTextnode(in DOMString data);

### Node 객체의 주요 기능
#### 노드 조작하기
> Node  insertBefore(in Node newChild, in Node refChild)
>               raises(DOMException);
> Node  replaceChild(in Node newChild, in Node refChild)
>               raises(DOMException);
> Node  removeChild(in Node newChild, in Node refChild)
>               raises(DOMException);
> Node  appendChild(in Node newChild, in Node refChild)
>               raises(DOMException);
> Boolean  hasChildNodes();
> Node  cloneNode(in boolean deep);

### 텍스트 노드 추가하기
1. 텍스트 노드 생성
> var txt = document.createTextNode("안녕하세요.");
2. 텍스트 노드를 추가할 엘리먼트 노드 선택
> var div1 = document.getElementById("div1");
3. 엘리먼트 노드에 텍스트 노드 추가하기
> div1.appendChild(txt);

## (33강) 엘리먼트 노드 추가/삭제하기

## (34강) 노드 복제와 템플릿

## (35강) 노드 삽입 및 대체하기
### 노드 객체 선택하기
- parentNode
- firstChild
- lastChild
- previousSibling
- nextSibling

### 새로 추가된 메서드 - targetElement.insertAdjacentElement(position, element)
- 'beforebegin' : Before the targetElement itself
- 'afterbegin' : Just inside the targetElement, before its first child
- 'beforeend' : Just insie the targetElement, after its last child
- 'afterend' : After the targetElement itself
```html
<!-- beforebegin -->
<p>
    <!-- afterbegin -->
    foo
    <!-- beforeend -->
</p>
<!-- afterend -->
```

## (36강) 다중 엘리먼트 선택 방법과 일괄 삭제

## (37강) 두 엘리먼트의 자리 바꾸기

## (38강) 제목 클릭으로 게시글 정렬하기

## (39강) 이벤트와 이벤트 객체
### 이벤트 객체
#### 이벤트에서 발생한 부가정보를 제공
- 클릭했어요 : 어느위치를? 누굴 클릭한거야?
- 키보드가 눌렸어요 : 어디에서? 어떤키가? 어떤키와 함께?
> [window.]event 객체

### 이벤트 종류에 따른 이벤트 객체

### 이벤트레퍼런스

### DOM3 Events Interface Inheritance
- Event - UIEvent - FocusEvent
                  - MouseEvent - WheelEvent
                  - InputEvent
                  - KeyboardEvent
                  - CompositionEvent
        - CustomEvent  

## (40강) 이벤트 객체의 target 속성(event.target)
### 이벤트가 발생한 객체는 event.target
#### 클릭한 이미지의 위치 정보 출력하기
- 클릭 - alert(event.target.src);

## (41강) 이벤트 버블링을 이용해 사용자 이벤트 처리
### 이벤트 전파 방식의 이해

![이벤트 전파방식]([뉴렉처]%20study_img/이벤트전파방식.png "이벤트 전파방식")


## (42강) 이벤트 버블링 멈추기
### 같은 부모를 공유하지만 다른 행위를 해야 하는 경우

## (43강) 여러 버튼을 가진 화면에서 이벤트를 처리하는 방법

## (44강) 엘리먼트의 기본행위 막기

## (45강) DOM 이벤트 객체 인터페이스
### 이벤트 객체
#### 이벤트에서 발생한 부가정보를 제공
- 클릭했어요 : 어느위치를? 누굴 클릭한거야?
- 키보드가 눌렸어요 : 어느 윈도우에서? 어떤키가? 어떤키와 함께?
### 이벤트 종류에 따른 이벤트 객체
### 이벤트 레퍼런스
#### DOM3 Events Interface Inheritance
- Event - UIEvent - FocusEvent
                  - MouseEvent - WheelEvent
                  - InputEvent
                  - KeyboardEvent
                  - CompositionEvent
        - CustomEvent  

## (46강) DOM 이벤트 트리거
### 불편한 문제 : 컨트롤 중에 스타일이 적용되지 않는 컴포넌트
### 파일 선택 상자를 대신하는 <span /> 태그 사용
```html
.gallery-file {
    display:none;
}
<div>
    <input type="file" id="gallery-file" class="gallery-file" />
    <span id="file-button" class="file-button">파일선택</span>
</div>
```
### click 이벤트 트리거 구현코드 - 웹 표준 방식
```html
var fileButton = document.getElementById("file-button");
fileButton.addEventListener("click", function() {
    var event = new MouseEvent("click", {
        'view':window,
        'bubbles':true,
        'cancelable':true
    });
    var file = document.getElementById(".gallery-file");
    file.dispatchEvent(event);
});

## (47강) DOM 이벤트 트리거 구현하기

## (48강) 클릭 위치에 박스 옮기기(마우스 이벤트 객체 사용하기 #1)
-> 봐야함.

