from flask import Flask, render_template
import datetime
import random

exam = Flask(__name__)

@exam.route("/vonvon")
def vonvon(num):
    que1 = ["잘생김", "매너", "매력", "돈"]
    que2 = ["많이", "적게", "적당히", "이빠이"]
    que3 = ["넣자!", "말자!"]

    que11 = random.sample(que1, num)
    que22 = random.sample(que2, num)
    que33 = random.sample(que3, num)

    print(que11)
    print(que22)
    print(que33)


    return render_template("movie.html",movies=que11)
    return render_template("movie.html",movies=que22)
    return render_template("movie.html",movies=que33)
    


if __name__ == "__main__":
    exam.run(debug=True)