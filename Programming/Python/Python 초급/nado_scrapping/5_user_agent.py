import requests

url = "http://nadocoding.tistory.com"
headers = {"User-Agent":"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/97.0.4692.99 Safari/537.36"}

res = requests.get(url, headers=headers)
res.raise_for_status() # 문제가 있으면 종료. 항상 위 문장과 쌍으로 사용

with open("nadocoding.html", "w", encoding="utf8") as f:
    f.write(res.text)
    