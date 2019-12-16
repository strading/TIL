# Git 기초

## 0. 준비 사항

* [git bash]([https://gitforwindows.org](https://gitforwindows.org/))
  * git을 활용하기 위한 CLI(Command Line Interface)를 제공한다.
  * source tree, github desktop 등을 통해 GUI 환경에서도 활용 가능하다.

## 1. 로컬 저장소 활용하기

### 1. 저장소 초기화

```bash
$ git init
Initialized empty Git repository in C:/Users/student/Desktop/til/.git/
(master) $
```



* 저장소(repository)를 초기화 하게 되면, `.git` 폴더가 해당 디렉토리에 생성된다.
* bash 창에서는 (master) 라고 표기된다.
  * 현재 브랜치가 master라는 것을 의미함.

### 2. add - staging area

> git으로 관리되는 파일들은 Working directory(작업 환경), Staging Area, commit 단계를 거쳐 이력에 저장된다.

```bash
$ git add a.txt # 파일명
$ git add images/ # 폴더명
$ git add # 현재 디렉토리의 모든 파일 및 폴더
```

* add 후 상태

```bash
$ git add .
$ git status
On branch master

No commits yet

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)
        new file:   image/Doraemon.png
        new file:   "\353\247\210\355\201\254\353\213\244\354\232\264(markdown) \352\270\260\354\264\210.md"
        new file:   "\354\240\234\353\252\251 \354\227\206\354\235\214.md"


```

### commit



> 커밋은 코드의 이력을 남기는 과정이다.

```bash
$ git commit -m {커밋 메시지}
[master (root-commit) 4c28e6d]  마크다운 및 git 기초정리
 3 files changed, 129 insertions(+)
 create mode 100644 image/Doraemon.png
 create mode 100644 "\353\247\210\355\201\254\353\213\244\354\232\264(markdown) \352\270\260\354\264\210.md"
 create mode 100644 "\354\240\234\353\252\251 \354\227\206\354\235\214.md"
```

* 커밋 메시지는 항상 해당 이력에 대한 정보를 담을 수 있도록 작성하는 것이 좋다.
* 일관적인 커밋 메시지를 작성하는 습관을 들이자.
* 이력 확인을 위해서는 아래의 명령어를 활용한다.

```bash
$ git log
commit 4c28e6dae8b78942d642d1ed213464c11a7303aa (HEAD -> master)
Author: strading <stradingg@naver.com>
Date:   Mon Dec 16 14:28:08 2019 +0900

     마크다운 및 git 기초정리
```



**항상 status 명령어를 통해 git의 상타를 확인하자! commit 이후에는 log 명령어를 통해 이력들을 확인하자!**



## 원격 저장소 활용하기

> 원격 저장소(remote repository)를 제공하는 서비스는 다양하게 존재한다.
>
> github을 기준으로 설명한다

### 0. 준비하기

* Github에서 저장소(repository) 생성

### 1. 원격 저장소 설정

```bash
$ git remote add origin {github url}
```

* {`github url`}부분에는 원격 저장소 url을 작성한다.
* 원격 저장소(remote)로 {`(github url)`} 이라는 이름으로 추가(add)하는 명령어이다.
* 원격 저장소  목록을 보기 위해서는 아래의 명령어를 활용한다.

```bash
$ git remote -v
origin  https://github.com/strading/Today.git (fetch)
origin  https://github.com/strading/Today.git (push)

```

### 2. push

```bash
$ git push origin master

```

* 설정된 원격 저장소(origin)으로 push!

폴더의 내용을 수정 및 삭제, 생성 등을 하게 된다면, add, commit, push 명령어를 통해서 이력을 저장하고 `push` 명령어를 통해 업로드한다.

