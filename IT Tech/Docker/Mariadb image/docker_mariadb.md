# Docker에 MariaDB 설치

## Docker - Mariadb 이미지 다운로드
```shell
$ docker pull mariadb
```

## Docker - Mariadb 컨테이너 만들고 실행하기
```shell
$ docker run --name mariadb -d -p 3306:3306 --restart=always -e MYSQL_ROOT_PASSWORD=root mariadb
```

## Docker - Mariadb 컨테이너 접속하기
```shell
$ docker exec -it mariadb /bin/bash
```

## Mariadb - 루트 계정으로 데이터베이스 접속하기
```shell
mysql -u root -p
```

## Mariadb - 데이터 베이스 만들기
```sql
$ create database [db_name];
ex) create database test
```

## Mariadb - 사용자 추가하기
```sql
$ create user 'user_name'@'XXX.XXX.XXX.XXX' identified by 'user_password';

ex) create user 'tester'@'%' identified by 'tester1234';
```

## Mariadb - 사용자 권한 부여하기
```sql
grant all privileges on db_name.* to 'user_name'@'XXX.XXX.XXX.XXX';
flush privileges;

ex)
grant all privileges on test.* to 'tester'@'%';
flush privileges;
```
