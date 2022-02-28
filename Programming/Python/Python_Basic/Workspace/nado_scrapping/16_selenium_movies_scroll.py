import time
import requests
from bs4 import BeautifulSoup
from selenium import webdriver

browser = webdriver.Chrome()
#browser.maximize_window()

interval = 2 # 2초에 한번씩 스크롤 내림

url = "https://play.google.com/store/movies"
browser.get(url)

# 현재 문서 높이를 가져와서 저장
prev_height = browser.execute_script("return document.body.scrollHeight")

# 반복 수행
while True:
    # 스크롤을가장 아래로 내림
    browser.execute_script("window.scrollTo(0, document.body.scrollHeight)")
    
    # 페이지 로딩 대기
    time.sleep(interval)
    
    # 현재 문서 높이를 가져와서 저장
    curr_height = browser.execute_script("return document.body.scrollHeight")
    #print("[First] CURR_HEIGHT : ", curr_height, "PREV_HEIGHT : ", prev_height)
    
    
    if curr_height == prev_height:
        break
    
    prev_height = curr_height
    # print("[Second] CURR_HEIGHT : ", curr_height, "PREV_HEIGHT : ", prev_height)

print("[스크롤 완료]", "-" * 80)    

soup = BeautifulSoup(browser.page_source, "lxml")
    
#movies = soup.find_all("div", attrs={"class":"cXFu1"})   
#movies = soup.find_all("div", attrs={"class":"j2FCNc"}) 
  
movies = soup.find_all("div", attrs={"class":"VfPpkd-EScbFb-JIbuQc MxsXJd"}) 

print("LEN(MOVIES) : ", len(movies))

for movie in movies:
    # title = movie.find("span", attrs={"class":"DdYX5"}).get_text() # 인기 영화 제목
    title = movie.find("span", attrs={"class":"DdYX5"}).get_text() # 인기 영화 제목
    rate = movie.find_all("span", attrs={"class":"w2kbF"})[2].get_text() # 평점
    
    link = movie.find("a", attrs={"class":"Si6A0c itIJzb"})["href"]
    # 올바른 링크 :  https://play.google.com/ + link
    
    print(f"제목 : {title}")
    print(f"평점 : {rate}")
    print("링크 : ", "https://play.google.com" + link)
    print("-" * 90)   

browser.quit()