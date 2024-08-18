# GIT, GITHUB 제대로 배우기
- [참고자료] 지옥에서 온 GIT, 생활코딩
- [공식매뉴얼] Pro Git - https://git-scm.com/book/ko/v2
## Version Control System
- Version Management, not by changing the file name
- Backup Recovery Collaboration
- CVS - SVN - GIT
- GIT is incredibly complex - 믿을 수 없을만큼 복잡하다.

## GIT을 사용하는 목적
- 프로그램 논리적 오류시 이전 버전으로 회귀하면서 오류 발견 → Debug로 활용
- 하나의 단위 작업으로 버전 관리를 수행하고 각각의 버전은 작업 내용이 잘 설명될 수 있도록 기록
- 원하는 과거 버전으로 여행할 수 있도록 운전 능력을 가져야 함   
- GIT 관련 프로그램
    > cmder
    > sourcetree

## GIT HEAD
- 저장소를 처음 만들면 HEAD가 생기며 기본적으로 master를 가리키고 있음
- master는 최종 commit한 commit-id를 가리키고 있음

## GIT 환경 설정(Setup)
```shell
$ git --version
$ git config --list
$ git config --global -e

$ git config --global user.name “netager1”
$ git config --global user.email “thinkjbank@gmail.com”

$ git config user.email

# 설정된 항목 조회하기
$ git config --global core.autocrlf  : windows ~ true, 맥 ~ input
$ git config --global alias.st status

#alias 지정
$ git config --h
```
## GIT Workflow의 이해
- Working Directory : 현재 작업하는 공간
    - tracked file
    - modified file : staging area로 옮길수 있는 대상
    - unmodified file
    - untracked file
- Staging Area : 버전 관리 전 사전 공간

- .git Repository : commit에 의한 버전별 관리 공간
- local vs remote
    - push : local -> remote
    - pull : remote -> local

## GIT 명령
- git [명령어] --help
    > 명령어에 대한 도움말
- git init
    > git 으로 관리하고자 하는 폴더에 git repository 생성
- git status
    > 파일의 상태를 출력
- git add a.txt
    > a.txt파일을 Staging Area로 변경
- git rm --cached file-name
    > Staging Area -> Working Area로 변경
- git diff --staged[--cached 와 동일함]
    > Stage Area에 있는 파일을 변경사항을 보여 줌
- git commit
    - git commit -m “Second commit”
    - Staging Area에 있는 파일을 Repo로 저장
- git commit -am “third commit”
    > [ -a ] 옵션은 Working Directory 와 Staging Area에 있는 모든 파일을 commit 함
- git commit --amend
    > commit된 메시지를 변경할 수 있음
- git log
    > commit 된 log 확인
## options
- git log -p : 버전별 변경 내용을 보여줌
- git log [commit-id] : commit-id 이전의 log를 보여줌
- git diff 
- git diff [commit-id1]..[commit-id2]
    > commit-id1 과 commit-id2의 변경 내용을 보여줌
- git diff 
    > Working-Area 내의 변경된 파일의 변경 내역을 보여줌
- git diff --staged[--cached 와 동일함]
    > Stage Area에 있는 파일을 변경사항을 보여 줌

## 원하는 버전으로 이동
```shell
git checkout commit-id[가고 싶은 버전]
git loggit 
git log --all
git log --all --oneline
git checkout commit-id[최신 버전] or git checkout master
```

## Untracted 파일 관리
> Log 파일 등은 버전관리할 필요가 없으므로(untracking) ignore 시킨다
```shell
echo *.log > .gitignore
```

## GIT 과거로의 여행
### 주의 사항
- 과거로의 여행하기 전 .git(Repository)을 백업(복사) 해야 함
- 협업을 위해 github에 저장한 경우 절대 git reset을 하면 안됨

### commit 취소
> git reset commit-id

### 5와 4를 삭제하고 3을 최신 상태로 가려고 함
```shell
git reset commit-id(3) --hard
```
- hard는 어렵지만 쉽다. soft 등 다른 옵션도 있음
- 이전 commit 은 지워지는 것이 아니고 남아는 있음
- git log로 확인

## GIT의 원리
분석방법
소스 분석
git 명령에 따른 .git(Repository)의 변화 관찰

BRANCH 작업
용어정의
분기되는 현상을 브랜치를 만든다
브랜치가 필요한 경우
고객사의 요청에 의해 원본은 그대로 두고 고객사에 맞는 커스텀 버전을 만들 때
필요한 기능 요청, 근데 실제로 필요 없어 보인다. 그럼 브랜치 만들고 필요 없어질 때 브랜치만 삭제
테스트시 원본은 유지하고 테스트용으로 브랜치 생성
브랜치 생성 및 관리
git branch : 현재의 branch를 출력
git branch [브랜치명]
git branch exp
git checkout [브랜치명]
git checkout exp
git checkout -b iss53 : iss53 branch를 만들고 iss53 branch로 checkout.
파일 수정 후 commit
git commit -am “3”
git log
“3”까지의 commit 상태 로그를 보여줌
git checkout master
master 상태로 전환
git log
“2”까지의 commit 상태 로그를 보여줌
git checkout exp
파일 생성 f2.txt
git commit -am “4”
git checkout master
f2.txt가 폴더에서 사라짐 - exp branch에서 commit을 했으므로
git checkout exp
f2.txt가 폴더에 생김 
git log --branches --decorate
master 와 branch를 구분해서 보여 줌
git log --branches --decorate --graph
그래프를 추가해서 보여줌
git checkout master
master로 이동
새로운 파일(f3.txt) 생성
git commit -am “5”
git log --branches --decorate --graph
master 와 branch를 그래프로 보여줌
git log --branches --decorate --graph --oneline
좀 더 간단하게 출력
git log master..exp    : 현재 위치 - master
분기점 이후에 master 와 exp의 차이를 보여줌
분기점 이후에 master에는 없고 exp에 있는 것을 보여줌
git log exp..master
분기점 이후에 exp에는 없고 master에 있는 것을 보여줌
git log master..exp -p
소스코드의 변경 내역을 보여줌
git diff master..exp
master 와 exp 의 소스 변경 내역을 보여줌


브랜치 병합(Merge)
브랜치를 마스터로 병합
git checkout master - master 상태에서 진행
git merge exp - exp를 master로 병합
git checkout exp - exp branch 상태로 변경
git merge master - master를 exp 병합
master 와 exp 가 동일한 버전으로 생성 되었음
이제 exp는 완전히 동일하므로 삭제 가능
git checkout master
git branch -d exp
exp branch 를 삭제

브랜치의 충동 해결
충돌상황


스태시(Stash)
브랜치를 생성해서 파일 수정중 다른 branch에서 작업해야 하는 경우 사용
f1.txt를 수정하고 저장해서 f1.txt가 branch에서 Modified 상태로 남아 있음
stash 는 “감추다” 의미
Working Stage의 변경사항을 감춘다
stash는 untracked 파일은 관여 하지 않는다
스태시 사용
중단하려고 하는 branch에 위치(exp)해야 함
git stash
working directory and index state 가 git Repo에 저장
git checkout master로 옮겨서 다른 작업을 수행
git checkout exp 
변경 작업을 계속하기 위해 stash 했던 exp로 이동
git stash apply
stash 했던 파일이 다시 보임
git stash list
stash 된 것을 보여줌
git reset --hard HEAD
최종 commit 상태로 HEAD 이동
git stash apply
다시 exp에서 stash 저장된 내용을 복원함
git reset --hard HEAD 해도 stash는 저장되어 있으며 명시적으로 삭제되기 전까지는 보전되어 있음
f2.txt 파일을 만들고 저장해서 git add f2.txt 수행
git stash
두개의 stash 생성되며 {0}이 최신의 것임.
git stash list 로 확인
git stash drop
최신의 stash를 삭제
git stash list로 확인
git stash apply; git stash drop
stash 적용하고 stash drop 함
git stash pop 은 apply 하고 drop을 한번에 하는 명령
GITHUB에서 협업
GITHUB 소스 다운로드
다운로드 받을 폴더로 이동
git clone https://github.com/git/git.git gitsrc
git Repo 도 포함되서 내려옴
원격 저장소 만들기
GITHUB에서 새로운 Repository를 Public으로 생성
내 PC에 관리할 폴더 생성후 git init 수행
원격 저장소 연결
git remote add origin git@github.com:netager1007/gitfth.git
origin : 저장소를 내PC에서 쉽게 사용하기 위한 Alias이고 다른 저장소를 추가하여 사용 가능함. origin은 가장 많이 사용하는 저장소로 사용하는 것이 좋음
git remote
git remote -v
git remote remove [저장소 이름]
저장소 삭제
git branch -M main 
master branch 를 main 이름으로 변경
master 는 세계적으로 주종관계 의미해서 main 으로 사용하는 추세
git push -u origin main    # main or master
원격저장소로 로컬 파일을 저장
local pc에서 f1.txt를 수정한후 add/commit
git push
앞에서 -u option을 설정되어서 ‘git push’만하면 github에 push됨
다른 PC에서 작업 환경 만들기
github에 접속해서 [Code]를 http 주소를 복사
다른 PC 또는 새로운 폴더를 만들어 주고 해당 폴더로 이동
git clone git@github.com:netager1007/gittest.git .
새로운 PC 또는 새폴더(gitfth2)에 다운로드 진행됨
git remote -v

GITHUB를 통한 협업
local 저장소 만들기
현재 위치 : c:\Users\User
git clone https://github.com/netager1007/gitfth.git git_home
git clone https://github.com/netager1007/gitfth.git git_office
git_home에서 파일 수정후 add/commit 수행
git push
회사에서 작업 수행
git_office 에서 제일 먼적 git pull 수행
SSH를 이용해서 로그인 없이 원격저장소 사용하기
ssh-keygen 수행하여 key 생성



원격 GIT 서버 만들기
(원격) 저장소 생성
git 유저 생성
mkdir /home/git/git; cd /home/git/git
git init --bare remote
(로컬) 원격 GIT Repo 접속
git init
git remote add origin ssh://git@172.31.52.102/home/git/git/remote/
git push
git push --set-upstream origin master
(로컬) 새로운 PC에서 Clone
git clone ssh://git@172.31.52.102/home/git/git/remote/ office
SSH를 이용한 자동로그인1(수동)
(로컬) Home Directroy로 이동
(로컬) ssh-keygen -t rsa
id_rsa(private key), id_rsa.pub(public key)
(원격) 홈 디렉토리(/home/git)에 .ssh 폴더 생성
mkdir .ssh
(원격)  ./ssh 폴더에서 authorized_keys파일을 생성하고 로컬의 id_rsa.pub의 내용을 붙여 넣음
(로컬) ssh git@172.31.52.102 실행시 비밀번호 없이 들어감
SSH를 이용한 자동로그인2(자동)
(로컬) ssh-copy-id git@172.31.52.102 하면 public-key를 원격에 복사함
GIT FULL 과 GIT FETCH의 원리
GIT FULL
원격의 최종 커밋을 내 로컬에 가져옴
GIT FETCH
원격의 초종 커밋을 가져오지만 로컬의 최종 COMMIT과 병합하지 않음
최종 커밋(origin/master), HEAD → master 상태
git diff HEAD origin/master
git merge origin/master : ‘git full’한 것과 같은 효과가 됨
TAG
branch와 유사하지만 다름
GITHUB에서 releases라고 있는데 이것은 사용자들에게 오픈된 버전 관리
v2.11.0-rc0 의 commit-id는 1fe8f2c 이다.

branch도 commit-id를 관리하지만 계속 변경됨. but tag관련 commit-id 는 변하면 안됨.
Light Weight Tag

TAG 생성
git tag 1.0.0 master : 현재 master branch의 commit-id로 tag 생성
git log 확인
생성한 TAG 버전으로 가기
git checkout [tag 명]
git checkout master
git tag 삭제하기
git tag -d 1.1.1
tag 조회하기
git tag
Annotated Tag
더 많은 정보를 주석으로 넣을 수 있음
Annotated Tag 생성
git tag -a 1.1.0 -m “bug fix”
git tag -v 1.1.0
TAG를 원격저장소에 저장
git push로는 tag 정보가 올라가지 않음
git push --tags
GITHUB의 release 정보가 갱신되는 것을 확인할 수 있음
REBASE
merge와 유사한 기능이나 차이가 있음. rebase는 어렵고 위험함.

GIT을 이용한 프로젝트의 흐름
http://nvie.com/posts/a-successful-git-branching-model/



[참고] Git 명령 Reference
