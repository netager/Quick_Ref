# Docker Basic
- https://watch-n-learn.tistory.com/16

## 도커 기본 명령어
### 시스템 명령
- docker version
- docker system info
- docker system df
    > 도커 디스크 사용 상태 확인
    > docker system df -v
   
- docker system prune
    > 사용하지 않는 이미지, 컨테이너, 볼륨, 네트워크 등을 일괄 삭제

- docker login
    > 도커 허브 레포지토리를 사용하기 위해 로그인이 필요하다.
    > docker login -u netager1 -p tns100%

- locker logout

## 이미지 관리 명령
- docker pull
- docker image ls
    > docker images 동일 
- docker images

- docker image inspect
    > 이미지에 대한 상세 정보를 확인한다.
    > docker image inspect 이미지명
    > json 구조의 데이터 구조를 가지며, 이 구조로 정보를 보여준다.  (json : JavaScript Object Notation ; 텍스트 기반 데이터 포맷)
    > 컨테이너의 모든 정보 확인 가능 (빌드옵션, 네트워크정보, 유니온파일시스템, 이름, ID 등 기타 모든 자세한 정보들)
    > json에서 특정 값을 확인할때는 아래 옵션처럼 --format 옵션을 사용하여 json 형식 데이터의 계층 구조를 지정한다.
    > 이 구조는 레벨 구조이다. Id, Parent, DockerVersion 같은 것들이며, 그 하위는 .으로 구분하여 표현한다. 예시 참고

- docker image tag
    > 명령어로서의 tag는 현재 존재하는 image에 대해 새로운 이름과 태그를 추가하는 것이다.

- docker push
    > 이미지를 도커 허브 등의 레포지토리에 업로드
    > docker push netager1/hello-world:latest

- docker search
    > 기본적으로 도커허브에 공개된 이미지를 검색한다.
    > docker search oracle

- docker image rm

- docker image prune

- docker container commit
    > 내가 이미지를 가져와서 여러가지 수정 후, commit 하면 내가 수정한 정보를 그대로 가진 이미지를 생성할 수 있다.

## 컨테이너 실행 및 조작 관련 명령
- docker container create

- docker container run

docker container attach

docker container exec

 

● 컨테이너 정보 확인 명령

docker container ps

docker container stats

docker container inspect

docker container top

docker container port

docker container diff

docker container logs

docker container ls

 

● 컨테이너 관리 명령

docker container stop

docker container start

docker container kill

docker container restart

docker container prune

docker container pause

docker container unpause

docker container rename

docker container cp

 

● 컨테이너/이미지 백업 명령

docker container export

docker container import

docker image save

docker image load

 

● 네트워크 명령

docker network ls

docker network create

docker network connect

docker network disconnect

docker networkinspect

docker network rm

brctl show

 

● 볼륨 명령 
docker volume create 
docker volume ls 
docker volume rm 
docker volume prune 
docker volume inspect