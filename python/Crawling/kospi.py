import requests
from bs4 import BeautifulSoup as bs


url = "https://finance.naver.com/sise/"

response = requests.get(url).text

bs(response, "html.parser")
soup = bs(response, "html.parser")

kospi = soup.select_one("#KOSPI_now")

print(kospi.text)