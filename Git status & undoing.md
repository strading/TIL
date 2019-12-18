# Git status & undoing

## 1. commit

```bash
$ git commit
# commit 할 것이 없지만 staging area가 비어있음
On branch master

Initial commit

Untracked files:
        a.txt
nothing added to commit but untracked files present

# 작업한 것도 없고 staging area에도 없음
$ git commit
On branch master

Initial commit

nothing to commit
```

### status

1. 새로 파일 생성 한 경우

```bash
$ git status
On branch master

No commits yet

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        a.txt

nothing added to commit but untracked files present (use "git add" to track)
```

2. add 한 이후

```bash
$ git status
On branch master

No commits yet

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)
        new file:   a.txt
```

### commit 메시지 작성하기

> 부제 : vim 활용 기초

```bash
# Please enter the commit message for your changes. Lines starting
# with '#' will be ignored, and an empty message aborts the commit.
#
# On branch master
#
# Initial commit
#
# Changes to be committed:
#       new file:   a.txt
```

* 편집(입력) 모드 : i
  * 문서 편집 가능
* 명령모드 : esc
  * dd : 해당 줄 삭제
  * (:wq)  : 저장 및 종료
    * w : write (저장)
    * q : quit
  * (:q!) : 강제 종료
    * q : quit
    * ! : 강제

```bash
$ git commit -m "commit message"
```

* 커밋 메시지는 항상 해당 작업 이력을 나타낼 수 있도록 작성한다
* 일관적인 포멧으로 작성하려고 노력한다.

### log

> 커밋은 해시 값(hash value)에 의해서 구분된다. 
>
> SHA-1해시 알고리즘을 사용하며 표현한다.

```bash
$ git log
commit 4e4193647079ea5779babb92524211fa3d15de05 (HEAD -> master)
Author: strading <stradingg@naver.com>
Date:   Wed Dec 18 09:45:10 2019 +0900

    Add a.txt

    a.txt 내용 추가
```

```bash
$ git log --oneline
$ git log -1
$ git log --oneline --graph
$ git log -1 --oneline

```

### commit undoing

```bash
1. 커밋메시지 수정

$ git commit --amend
```

커밋 메시지 수정하는 경우 해시값이 변경되므로, 다른 이력으로 관리가 된다.

**따라서, 공개된 저장소(원격 저장소)에 이미 push 된 경우 절대 수정해서는 안된다.**

2. 특정 파일 추가하기
   * c.txt 파일을 같이 커밋을 하려고 했는데, add를 하지 않고 커밋 해버렸다.

```bash
$ git add c.txt
$ git commit --amend
```

## Staging area

### 1. 커밋 이력이 있는 파일 수정하는 경우

```bash
$ git status

$ git add a.txt
$ git status
```

### add 취소하기

```bash
$ git restore --staged <file>
```

* 구버전의 git에서는 아래의 명령어를 사용해야한다

```bash
$ git reset HEAD <file>
```

### WD 변화 삭제하기

> git에서는 모든 commit 시점으로 되돌릴수는 있다.
>
> 다만 WD 삭제하는 것은 되돌릴 수가 없다.


```bash
$ git restore <file>
```

* 구버전 git에서는 아래의 명령어를 사용해야 한다.

```bash
git checkout --<file>
```























