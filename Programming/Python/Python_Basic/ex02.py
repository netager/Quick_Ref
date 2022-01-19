# input() 함수는 사용자로부터 입력을 받는 용도인테 문자열 형태로 저장

number = int(input("참석자 수를 입력하세요 : "))  # type 변환

print(type(number))

chickens = number
beers = number * 2
cakes = number * 4

print("chickens:", chickens)
print("beers:", beers)
print("cakes:", cakes)