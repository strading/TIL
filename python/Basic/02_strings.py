'''
String 조작하기

1. 글자 합체

2. 글자 삽입(수술)

3. 글자 자르기

'''

# 1. 글자 합체

hphk = "happy" + " " +  "hacking"

print(hphk)

# 2. 글자 삽입

name = "이진호"
age = "23"

text = "안녕하세요 제 이름은 {} 이고, 나이는 {} 살 입니당!!".format(name , age)

print(text)

f_text = f"안녕하세요 제 이름은 {name}이고, 나이는 {age} 살 입니당!!"
print(f_text)

# 3. 글자 자르기

text_name = text[:15]   #앞에서 부터 15글자
print(text_name)

text_age = text[15:]    # 뒤에서 부터 15글자
print(text_age)

text_split = text.split()
print(text_split)