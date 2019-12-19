'''
문제 3.
숫자를 입력 받아 짝수/홀수를 구분하는 코드를 작성해주세요 :)
'''

number = int(input('숫자를 입력하세요: '))
# 아래에 코드를 작성해 주세요
a = number % 2
if (a > 0) :
    print("홀수")
else :
    print("짝수")

# 1 -> True
# 0 0> False 

if number % 2 == 0: # if number % 2
    print('홀수입니다')
else :
    print('짝수입니다')