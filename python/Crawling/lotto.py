import random
import json

import requests

numbers = random.sample(range(1, 46) , 6)
print(numbers)

url = "https://www.dhlottery.co.kr/common.do?method=getLottoNumber&drwNo=836"

response = requests.get(url)
print(response.text)

lotto = json.loads(response.text)
print(lotto)

winner = []

for i in range(1, 7):
    winner.append(lotto.get(f"drwtNo{i}"))

print(winner)

# Python 함수

def pickLotto():
    picked = sorted(random.sample(range(1, 46), 6))
    print(picked)
    matched = len(set(winner) & set(picked))
    print(matched)

    if matched == 6:
        print("1등")
    elif matched == 5:
        print("2등")
    elif matched == 4:
        print("3등")
    elif matched == 3:
        print("4등")
    elif matched == 2:
        print("5등")
    else:
        print("꽝")

pickLotto()