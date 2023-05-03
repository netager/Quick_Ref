# 이재홍의 언제나 최신 Docker 
- http://www.pyrasis.com



## docker 설치 및 삭제

### 이미 설치된 docker 제거
```shell
$ yum remove docker docker-client
$ docker-client-latest docker-common
$ docker-latest docker-latest-logrotate 
$ docker-logrotate docker-engine
```

### Repository(저장소) 정보를 사용할 수 있는 yum-utils 패키지 설치
```shell
$ yum install -y yum-utils
```

### docker Repository(저장소) 설치
```shell
yum-config-manager --add-repo https://download.docker.com/linux/centos/docker-ce.repo
```

### docker 저장소 활성화
##### docker 야간 저장소 활성화
```shell
$ yum-config-manager --enable docker-ce-nightly
```

### docker test 채널 활성화
```shell 
yum-config-manager --enable docker-ce-test
```

### docker 설치
```shell
$ yum install docker-ce docker-ce-cli containerd.io --allowerasing
```

### docker 시작
```shell
$ systemctl start docker
```

### docker 실행 및 정상 작동하는지 확인
```shell
$ docker run hello-world
```

### docker 버전 확인
```shell
$ docker -v
```

### docker 제거
```shell
$ yum remove docker-ce docker-ce-cli containerd.io
```

### docker 구성 파일 삭제
```shell
$ rm -rf /var/lib/docker
```

## docker 사용해 보기

### search 명령으로 이미지 검색하기 ~ https://hub.docker.com 조회
```shell
$ docker search ubuntu
```

### pull 명령으로 이미지 받기
```shell
$ docker pull ubuntu:latest
```

### images 명령으로 이미지 목록 출력하기
```shell
$ docker images
```

### run 명령으로 컨테이너 생성하기
```shell
$ docker run -i -t --name hello ubuntu /bin/bash
```

### 명령으로 컨테이너 목록 확인하기
```shell
$ docker ps -a
```

### start 명령으로 컨테이너 시작하기
```shell
$ docker start hello
```
### restart 명령으로 컨테이너 재시작하기
- start 된 상태에서 컨테이너 재시작하는 명령
```shell
$ docker restart hello
```

### attach 명령으로 컨테이너 접속하기
```shell
$ docker attach hello
```

### exec 명령으로 외부에서 컨테이너 안의 명령 실행하기
- 이미 실행된 컨테이너에 apt-get, yum 명령으로 패키지 설치 하거나 데몬을 실행할 때 사용
```shell
$ docker exec hello echo "Hello World"
```

### stop 명령으로 컨테이너 정지하기
```shell
$ docker stop hello
```

### rm 명령으로 컨테이너 삭제하기
```shell
$ docker rm hello
```

### rmi 명령으로 이미지 삭제하기
```shell
$ docker rmi ubuntu:latest
```

## Docker 이미지 생성하기

### bash 익히기
- 참조 ~ https://pyrasis.com/jHLsAlwaysUpToDateDocker/Unit04 

### dockerfile 작성하기
- 참조 ~ https://pyrasis.com/jHLsAlwaysUpToDateDocker/Unit04/02


## Docker 살펴보기

### history 명령으로 이미지 히스토리 살펴보기
```shell
$ docker history hello:0.1
```

### cp 명령으로 파일 꺼내기
```shell
$ docker cp hello-nginx:/etc/nginx/nginx.conf ./
```

### commit 명령으로 컨테이너의 변경사항을 이미지로 생성하기
```shell
$ docker commit -a "Foo Bar <foo@bar.com>" -m "add hello.txt" hello-nginx hello:0.2
```

### diff 명령으로 컨테이너에서 변경된 파일 확인하기
- 컨테이너가 실행되면서 변경된 파일 목록을 출력. 비교 기준은 컨테이너를 생성한 이미지 내용
```shell
$ docker diff hello-nginx
```

### inspect 명령으로 세부 정보 확인하기
- 이미지와 컨테이너의 세부 정보를 출력
```shell
$ docker inspect hello-nginx
```


## docker 좀더 활용요하기

### docker 개인 저장소 구축하기
- docker 저장소 서버는 docker 레지스트리(registry) 서버라고 함
```shell
$ systemctl stop docker.socket
$ systemctl stop docker
$ dockerd --insecure-registry localhost:5000 
# 위의 데몬을 직접 실행하지 않고 아래처럼 서비스 형태로 작업함.

# vi /etc/docker/daemon.json 생성
#    {
#      "insecure-registries": ["localhost:5000", "192.168.200.100:5000"]
#    }
$ systemctl restart docker
```

### 로컬에 이미지 데이터 저장
- docker 레지스트리 서버도 docker hub를 통해 docker 이미지 제공 함
```shell
$ docker pull registry:latest
# registry:latest 이미지를 컨테이너로 실행
$ docker run -d -p 5000:5000 --name hello-registry -v /tmp/registry:/tmp/registry registry
# --> 이미지 파일은 호스트의 /tmp/registry에 저장 됨.
```
### push 명령으로 이미지 올리기
#### tag 생성
```shell
$ docker tag hello:0.1 localhost:5000/hello:0.1
```

#### 이미지 올리기
```shell
$ docker push localhost:5000/hello:0.1
```

#### 이미지 받기
```shell
$ docker pull 192.168.200.100:5000/hello:0.1
```

### 기본인증 사용하기
1. /etc/hosts 편집 ~ <registry ip> registry.example.com
2. 사설 인증서(Self Signed) 생성
    > 참조 ~ https://pyrasis.com/jHLsAlwaysUpToDateDocker/Unit06



## docker 컨테이너 연결하기
### web server(nginx)와 Mongo DB 연결
```shell
 
$ docker run --name db -d mongo
$ docker run --name web -d -p 80:80 --link db:db nginx
$ cat `docker inspect -f "{{ .HostsPath }}" web`
 
# 네트워크 생성기능 (향후 --link 기능 사라질 수도 있음)

$ docker network create hello-network
$ docker run --name db -d --network hello-network mongo
$ docker run --name web -d -p 80:80 --network hello-network nginx
# web 컨테이너에서 bash를 실행한 뒤에 ping 설치하여 실행
$ docker exec -it web bash
$ dpt update && apt install iputils-ping -y
$ ping db
```


# 6.3 다른 서버의 docker 컨테이너에 연결하기
# ==========================================
# --link 옵션은 같은 서버의 컨테이너끼리 연결하는 옵션
# 앰버서더 컨테이터(ambassador container)를 이용하여 다른 서버의 컨테이너와 연결
# ------------------------------------------------------------------------------
#
## redis 서버 작업
## ---------------
#
## docker pull redis:latest
## docker run -d --name redis redis:latest
#
## docker run -d --link redis:redis --name redis_ambassador -p 6379:6379 svendowideit/ambassador
#
## redis client 작업
## -----------------
#
## docker run -d --name redis_ambassador --expose 6379 -e REDIS_PORT_6379_TCP=tcp://192.168.200.100:6379 svendowideit/ambassador
#
## docker run -i -t --rm --link redis_ambassador redis:latest redis-cli -h redis_ambassador




# 6.4 docker 데이터 볼륨 사용하기
# ===============================
# 데이터를 컨테이너가 아닌 호스트에 저장하는 방식. 컨테이너끼리 데이터를 공유할 때 활용할 수 있음
# docker commit 명령을 통해 이미지 생성해도 데이터 볼륨의 변경 사항은 이미지에 포함되지 않음
# ------------------------------------------------------------------------------------------------
# 
# Example
# -------
# docker run -i -t --name hello-volume -v /data ubuntu /bin/bash
# root@7077a22333ef:/# cd /data/
# root@7077a22333ef:/data# touch hello
# root@7077a22333ef:/data# exit

# docker inspect -f "{{ .Mounts }}" hello-volume
#   --> ls로 확인

# 데이터 볼륨을 사용하여 컨테이너끼리 데이터 공유
# -----------------------------------------------
#
# 첫번째 컨네이너
# ------------------
# docker run -i -t --name hello-volume1 -v /root/data:/data ubuntu /bin/bash
# root@d48da31f04b1:/# cd /data
# root@d48da31f04b1:/data# touch world
# root@d48da31f04b1:/data# exit
#
# 두번째 컨네이너
# ------------------
# docker run -i -t --name hello-volume2 -v /root/data:/data ubuntu /bin/bash
# root@fbb7c667b732:/# ls /data



# 6.5 docker 데이터 볼륨 컨테이너 사용하기
# ========================================

# docker run -i -t --name hello-volume -v /root/data:/data ubuntu /bin/bash
# root@c9779e329513:/# cd /data
# root@c9779e329513:/data# touch hello2
# Ctrl+p, Ctrl+q 로 빠져나옴
#
# 데이터 볼륨 컨테이너
# --------------------
# docker run -i -t --volumes-from hello-volume --name hello ubuntu /bin/bash
# root@c85aaf93b14e:/# ls /data
 


# 6.6 docker 베이스 이미지 생성하기
# =================================
# dockerfile로 이미지를 생성할때 docker hub에서 제공하는 이미지를 기반으로 생성
# 여기에서는 나만의 베이스 이미지를 생성하는 방법으로 진행
# -----------------------------------------------------------------------------
#
# centos 베이스 이미지 생성하기
# -----------------------------
# centos용 부트스트랩 바이너리 파일을 받아와야 하기 때문에 centos가 설치된 호스트에서 진행
#
# 부트스트랩 도구인 supermin 설치
# -------------------------------
# yum install supermin
# supermin --prepare yum -o supermin.d
# supermin --build --format chroot supermin.d -o appliance.d
# mkdir -p appliance.d/etc/yum/vars
# echo 8 > appliance.d/etc/yum/vars/releasever
#
# docker import 명령으로 베이스 이미지 생성
# -----------------------------------------
# tar -C appliance.d -c . | docker import - centos
#
# 인터넷에 있는 파일을 사용하는 방법
# ----------------------------------
# docker import http://example.com/centos.tgz centos
#
# 확인
# ----
# docker images
# docker run -i -t --name hello centos /bin/bash
# bash-5.1# cat /etc/centos-release
# CentOS Stream release 9


# 빈 베이스 이미지 생성하기
# -------------------------
# 아무것도 들어있지 않은 베이스 이미지 생성 방법 ~ scratch 이미지
# scratch 이미지는 아무것도 없어 컨테이너로 생성되지 않음. dockerfile을 작성하여 사용자가 만든 실행 파일을 넣음
# -------------------------------------------------------------------------------------------------------------
# tar cv --files-from /dev/null | docker import - scratch
#
# mkdir hello
# cd hello
#
# hello.c 생성
# -----------
## #include <stdio.h>
## int main()
## { 
## 	printf("Hello Docker\n");
##      return 0;
## }
#
# gcc hello.c -static -o hello

# Dockerfile 저장
# ---------------
## FROM scratch
## ADD ./hello /hello
## CMD ["/hello"]

# docker build --tag hello:0.1 .
# docker run --rm hello:0.1



# 7. dockerfile 자세히 알아보기
# =============================
# 참조 ~ https://pyrasis.com/jHLsAlwaysUpToDateDocker/Unit07
# ----------------------------------------------------------



# 8. docker compose 사용하기
# ==========================
# 여러 컨테이너를 손쉽게 생성할 수 있도록 함

# docker run 으로 컨테이너 생성하기
# ---------------------------------
# docker network create example-network
# docker run -d --name mysql --network example-network -v mysql-data:/var/lib/mysql \
             -e MYSQL_ROOT_PASSWORD=examplepassword \
             -e MYSQL_DATABASE=db mysql:5.7

# mysql 접속
# ----------
# docker exec -it mysql mysql -u root -p
#
# mysql> CREATE TABLE Users (id VARCHAR(100) NOT NULL, password VARCHAR(100) NOT NULL, PRIMARY KEY (id));


# 프로그램 작성
# -------------
# app.js 와 package.json 생성 ~ 교재 참고

# node:16-alpine 이미지로 app.js 실행
# -----------------------------------
# docker run -it --name app -p 8080:8080 -w /app -v ~/app:/app --network example-network \
    -e MYSQL_HOST=mysql \
    -e MYSQL_USER=root \
    -e MYSQL_PASSWORD=examplepassword \
    -e MYSQL_DB=db \
    node:16-alpine sh -c "npm install && node app.js"

# 웹브라우저로 접속
# -----------------
# http://192.168.200.100:8080

# 예제 컨테이너 삭제
# ------------------
# docker rm -f app
# docker rm -f mysql


# 8.2 docker-compose.yml 파일 작성하기
# ====================================
# 앞에서 생성한 컨테이너를 docker compose로 구성. docker compose는 docker-compose.yml 파일에 정의

# docker-compose.yml 생성
# -----------------------
# 교재 참고

# docker compose를 이용한 컨테이너 생성
# -------------------------------------
# docker compose up -d

# docker ps
# docker compose ps

# compose에서 db 접속
# -------------------
# docker compose exec -it mysql mysql -u root -p


# table 생성
# ----------
# mysql> USE db;
# mysql> CREATE TABLE Users (id VARCHAR(100) NOT NULL, password VARCHAR(100) NOT NULL, PRIMARY KEY (id));
# mysql> exit


# db 와 node app 컨테이너 생성
# ----------------------------
# docker-compose.yml 생성 ~ 교재 참고


# docker compose를 이용한 컨테이너 생성
# -------------------------------------
# docker compose up -d
# docker compose ps


# docker compose로 만든 컨테이너 정지, 재시작, 삭제
# -------------------------------------------------
# docker compose stop
# docker compose start
# docker compose restart
# docker compose down ~ 컨테이너 삭제


# 데이터베이스 볼륨 확인 및 삭제
# ------------------------------
# docker volume ls
# docker volume rm app_mysql-data



# 12. Docker로 Spring Boot 애플리케이션 구축하기
# ==============================================

# 12.1 OpenJDK 설치하기
# ---------------------
# 우분투
# ------
# sudo apt update
# sudo apt install -y wget
# wget https://download.java.net/java/GA/jdk18.0.2.1/db379da656dc47308e138f21b33976fa/1/GPL/openjdk-18.0.2.1_linux-x64_bin.tar.gz
# tar vxzf openjdk-18.0.2.1_linux-x64_bin.tar.gz
# echo "export PATH=~/jdk-18.0.2.1/bin:$PATH" >> .bashrc
# source .bashrc

# CentOS
# ------
# sudo yum install -y wget
# wget https://download.java.net/java/GA/jdk18.0.2.1/db379da656dc47308e138f21b33976fa/1/GPL/openjdk-18.0.2.1_linux-x64_bin.tar.gz
# tar vxzf openjdk-18.0.2.1_linux-x64_bin.tar.gz
# echo "export PATH=~/jdk-18.0.2.1/bin:$PATH" >> .bashrc
# source .bashrc


# 12.2 Spring Boot Dockerfile 작성하기
# ------------------------------------
# git 에서 예제 Spring Boot 클론
# ------------------------------
# yum install -y git
# git clone https://github.com/spring-guides/gs-spring-boot.git

# .dockerignore 파일 생성
# -----------------------
# cd gs-spring-boot/initial
#
# .dockerignore 생성
# -----------------
## .grakdle
## .mvn
## .idea
## build


# Dockerfile 생성
# ---------------
# 교재 참조

# 이미지 생성
# -----------
docker build --tag spring-boot .

# 컨테이너 실행
# -------------
# docker run -it --rm -p 8080:8080 spring-boot

# 확인
# ----
# http://192.168.200.100:8080



# 12.3 MySQL 데이터베이스 설정하기
# ================================

# mysql 컨테이너 생성
# -------------------
# cd ~/gs-spring-boot/initial
# docker network create spring-boot-network
# docker volume create mysql-data
# docker run -d --name db \
    -p 3306:3306 \
    --network spring-boot-network \
    -v mysql-data:/var/lib/mysql \
    -e MYSQL_ROOT_PASSWORD=examplepassword \
    -e MYSQL_DATABASE=example \
    mysql:5.7


# Spring Data JPA를 이용한 db 접속
# --------------------------------
# ~/gs-spring-boot/initial/src/main/resources/application.properties 생성 ~ 교재 참조


# build.gradle 수정
# -----------------
# ~/gs-spring-boot/initial/build.gradle 수정 ~ 교재 참조


# HelloController.java 수정
# -------------------------
# ~/gs-spring-boot/initial/src/main/java/com/example/springboot/HelloController.java ~ 교재 참조


# ORM Entity 클래스 생성
# ----------------------
# ~/gs-spring-boot/initial/src/main/java/com/example/springboot/User.java 생성 ~ 교재 참조


# Repository 인터페이스 생성
# --------------------------
# ~/gs-spring-boot/initial/src/main/java/com/example/springboot/UserRepository.java 생성 ~ 교재 참조


# Spring Boot 앱 실행
# -------------------
# cd ~/gs-spring-boot/initial
# MYSQL_HOST="127.0.0.1" ./gradlew bootRun


# 12.4 docker compose로 spring boot와 mysql 컨테이너 생성하기
# ===========================================================

# docker run 으로 컨테이너 생성
# -----------------------------
#
# mysql 컨테이너 생성
# -------------------
# ~/gs-spring-boot/initial$ sudo docker network create spring-boot-network
# ~/gs-spring-boot/initial$ sudo docker volume create mysql-data
# ~/gs-spring-boot/initial$ sudo docker run -d --name db \
    -p 3306:3306 \
    --network spring-boot-network \
    -v mysql-data:/var/lib/mysql \
    -e MYSQL_ROOT_PASSWORD=examplepassword \
    -e MYSQL_DATABASE=example \
    mysql:5.7

# spring boot 앱 컨테이너 생성
# ----------------------------
# ~/gs-spring-boot/initial$ docker run -d --name app -p 8080:8080 \
    --network spring-boot-network \
    -e MYSQL_HOST=db \
    spring-boot


# 위의 docker run을 이용한 컨테이너를 docker compose로 생성
# ---------------------------------------------------------
# ~/gs-spring-boot/initial/docker-compose.yml 생성 ~ 교재 참조


# 컨테이너 생성
# -------------
# docker compose up -d


# 확인
# ----
# http://192.168.200.100:8080


# 컨테이너 삭제
# -------------
# docker compose down

# docker volume ls
# docker volume rm initial_mysql-data
# docker network rm 











