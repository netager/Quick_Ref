import requests

res = requests.get("http://google.com")
#res = requests.get("http://naver.com")
#res = requests.get("http://nadocoding.tistory.com")
res.raise_for_status() # 문제가 있으면 종료. 항상 위 문장과 쌍으로 사용

# print("응답코드 : ", res.status_code)
# if res.status_code == requests.codes.ok:
#     print("정상입니다.")
# else:
#     print("문제가 생겼습니다. [에러코드 ", res.status_code, "]")

print(len(res.text))
print(res.text)

with open("mygoogle.html", "w", encoding="utf8") as f:
    f.write(res.text)
    