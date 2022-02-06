from selenium import webdriver

browser = webdriver.Chrome()
#browser.maximize_window() # 창 최대화

url = "https://flight.naver.com"
browser.get(url)

# 가는 날 선택 클릭
#browser.find_element_by_class_name("tabContent_option__2y4c6 select_Date__1aF7Y").click()
browser.find_element_by_xpath('//*[@id="__next"]/div/div[1]/div[4]/div/div/div[2]/div[2]/button[1]').click()
#browser.find_element_by_link_text("가는 날").click()

# 이번달 27, 28일 선택
#browser.find_elements_by_link_text("27")[0].click()
print(browser.find_elements_by_link_text("27"))

# browser.find_elements_by_link_text("28")[0].click()
#browser.find_element_by_class_name("sc-crzoAE hnpClg inner").click()
# browser.find_element_by_xpath('//*[@id="__next"]/div/div[1]/div[10]/div[2]/div[1]/div[2]/div/div[2]/table/tbody/tr[4]/td[4]/button').click()

# browser.find