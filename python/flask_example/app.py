from flask import Flask

# 지금부터 flask 서버의 이름이 app
app = Flask(__name__)

#url을 관리해주는 친구 > @app.route("/")
@app.route("/")
def hello():
    return "hello world!"