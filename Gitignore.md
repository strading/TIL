# Gitignore

> Git을 통한 프로젝트 시작시 반드시 설정하자!

## 활용법

`.gitignore` 파일을 생성 후 git으로 관리하지 않을 파일의 목록을 작성한다.

```
*.xlsx # 확장자가 xlsx인 파일
test/ # test 폴더
a.txt # 확장 파일
```



보통  `.gitingnore`에 등록되는 파일은, IDE(이클립스) 설정과 관련된 내용 혹은 프로그래밍 언어별 임시 파일, 윈도우 등 OS 관련 파일을 등록한다. (프로젝트 소스코드와 무관)

잘 모르는 경우 해당 환경을 [gitignore.io](https://gitignore.io) 에서 검색하여 설정하자.

예) `eclipse` , `java` , `windows ` .....

