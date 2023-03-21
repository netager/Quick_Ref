from attr import attrs
import requests
from bs4 import BeautifulSoup

url = "https://play.google.com/store/movies"
headers = {
    "User-Agent":"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/97.0.4692.99 Safari/537.36",
    "Accept-Language":"ko-KR,ko"
    }

res = requests.get(url, headers=headers)
res.raise_for_status()
soup = BeautifulSoup(res.text, "lxml")


movies = soup.find_all("div", attrs={"class":"ULeU3b neq64b"})

for movie in movies:
    try:
        title = movie.find("div", attrs={"class":"Epkrse"}).get_text()
    except AttributeError as err:
        print("Error")
        
    print(title)

# for movie in movies:
#     print(movie)
#     break
    
# print(len(movies))

# mov2 = soup.find_all("span", attrs={"class":"DdYX5"})

# for mov in mov2:
#     print(mov)

# print(len(mov1))
# print(mov1)
# with open("movie.html", "w", encoding="utf8") as f:
#     #f.write(res.text)
#     # f.write(soup.prettify())
#     f.write(movies)

# for movie in movies:
#     # title = movie.find("div", attrs={"class":"DdYX5"}).get_text()
#     # print(title)
#     print(movie)