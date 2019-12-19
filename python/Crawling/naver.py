'''
1. request -> naver.com에 요청 보냄
2. response -> bs4로 변형
3. webborowser
'''

import requests
from bs4 import BeautifulSoup as bs

import webbrowser

url = "https://www.naver.com"
requests.get(url)
response = requests.get(url).text

# 'html.parser -> 받아올 형식
doc = bs(response, "html.parser")

# . -> class를 가져오겠다
# # -> id를 가져오겠다
# result = doc.select_one(".ah_k")

result = doc.select(".ah_k")
print(result)

search_url = "https://search.naver.com/search.naver?query="
for i in range(5):
    webbrowser.open(search_url + result[i].text)
