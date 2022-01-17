print("숫자게임 시작합니다.")
number = 62

exact_num = input("1에서 100사이의 숫자를 추측해봐?")

print("입력값은 = ", exact_num)

guess = int(exact_num)

if guess == number :
    print("맞았습니다.")
else :
    print("틀렸어")