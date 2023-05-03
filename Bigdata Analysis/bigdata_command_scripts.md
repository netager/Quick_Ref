## 목차
1. 빅데이터 이해하기
1-1. 빅데이터 개념
1-2. 빅데이터 목적
1-3. 빅데이터 활용
1-4. 빅데이터 프로젝트
1-5. 빅데이터 기술의 변화
1-6. 빅데이터 구현기술
1-7. 빅데이터 보안

2. 파일럿 프로젝트 환경 구성
2-0. 시작하기 전에 
2-1. 파일럿 프로젝트 도메인의 이해 
2-2. 파일럿 아키텍처 이해 1 - 소프트 웨어
2-2. 파일럿 아키텍처 이해 2 - 하드웨어
2-3. 파일럿 PC 환경 구성 - 개발환경 
2-4. VM 통합 환경 구성 
2-5. 빅데이터 클러스터 구성 02 - 기본 SW(하둡, 주키퍼 등) 설치 
2-5. 빅데이터 클러스터 구성 03 - DataNode 추가 및 환경설정
2-5. 빅데이터 클러스터 구성 04 - Putty로 서버 환경 접속 
2-5. 빅데이터 클러스터 구성 05 - 하둡과 주키퍼 명령 사용해 보기 
2-6. 스마트카 로그 시뮬레이터 - 설치 및 실행
2-7. 파일럿 환경 관리 - 시작과 종료 
2-8. 빅데이터 실환경의 이해 
2-9. 마치며

3. 빅데이터 수집 
3-1. 빅데이터 수집 개요 
3-2. 수집에 활용할 기술 1 - 플럼
3-2. 수집에 활용할 기술 2 - 카프카 
3-3. 수집 파일럿 실행 1단계 - 수집 아키텍처 
3-4. 수집 파일럿 실행 2단계 - 수집 환경 구성
3-5. 수집 파일럿 실행 3단계 - 플럼 기능 구현
3-6. 수집 파일럿 실행 4단계 - 카프카 기능 구현
3-7. 수집 파일럿 실행 5단계 - 수집 기능 테스트


4. 빅데이터 적재 1 - 대용량 파일
4-1. 빅데이터 적재 개요
4-2. 빅데이터 적재에 활용하는 기술 - 하둡&주키퍼



# 최초 root / adminuser

# 파일럿 환경의 로그 확인
  - Hadoop 에코시스템 서버들의 로그 위치 : /var/log/디렉터리(cloudera, Hadoop, Oozie 등)
  - Redis 서버 로그 위치 : /var/log/redis_6379.log
  - Storm 서버 로그 위치 : /home/pilot-pjt/storm/logs
  - Zeppelin 서버 로그 위치 : /home/pilot-pjt/zeppelin-0.8.2-bin-all/logs
  
# 의존성 : 시작 순서
  - zookeeper -> hadoop -> yarn

### 1-1 빅데이터 개념
### 1-2 빅데이터 목적
### 1-3 빅데이터 활용
### 1-4 빅데이터 프로젝트
### 1-5 빅데이터 기술의 변화
### 1-6 빅데이터 구현 기술
### 1-6 빅데이터 보안

### 2-1 파일럿 프로젝트 도메인의 이해
### 2-2 빅데이터 파일럿 아키텍처 이해 02 - 소프트웨어
### 2-2 빅데이터 파일럿 아키텍처 이해 02 - 하드웨어 
### 2-3 빅데이터 파일럿 PC 환경 구성 01 - 개발환경
### 2-3 빅데이터 파일럿 PC 환경 구성 02 - 리눅스 가상머신 환경 구성


### 2-4 VM 통합 환경 구성
## 파일럿 PC의 호스트 파일 수정하기
  - 관련 파일 : c:\windows\system32\drivers\etc\hosts
    - 192.168.56.101 server01.hadoop.com
    - 192.168.56.102 server02.hadoop.com  
## 클라우데라 매니저 접속 하기
  - 접속 URL : http://server01.hadoop.com:7180
  - admin/admin

## 클라우데라 매니저 클러스터 구성
  - 클러스터 이름 : Cluster 1
  - Specify Hosts : server01.hadoop.com, server02.hadoop.com
  - 리포지토리 선택 
    - 방식 선택 : Parcel 사용(권장됨)
	- CDH 버전 : CDH-6.3.2-1.cdh6.3.2.p0.1605554
	- 추가 Parcel : 없음
	- 없음
	- 없음
	- 없음
  - Install Parcels : 선택한 Parcel을 다운로드하여 모든 호스트에 설치 됨.
  - Inspect Cluster 
    - I understand the risks, let me continue with cluster setup. 선택하고 계속 진행  
	
  
### 2-5 빅데이터 클러스터 구성 02 - 기본 SW(하둡, 주키퍼 등) 설치
## 설치 위치
# HDFS(하둡)
- 설치 위치
  - NameNode : server01.hadoop.com
  - SecondaryNameNode : server01.hadoop.com
  - Balancer : server01.hadoop.com
  - HttpFS : None
  - NFS Gateway : None
  - DataNode : server02.hadoop.com

# Cloudera Management Service
- 설치 위치
  - Service Monitor : server01.hadoop.com
  - Activity Monitor : None
  - Host Monitor : server01.hadoop.com
  - Event Server : server01.hadoop.com
  - Alert Publisher : server01.hadoop.com 
  
# YARN
- 설치 위치
  - ResourceManger : server01.hadoop.com
  - JobHistory Server : server01.hadoop.com
  - NodeManager : server02.hadoop.com

# 주키퍼
- 설치 위치
  - Server : server02.hadoop.com
 

### 2-5 빅데이터 클러스터 구성 03 - DataNode 추가 및 환경 설정
  - 고사양 파일럿 환경에서 사용 
  
### 2-5 빅데이터 클러스터 구성 04 - HDFS와 주키퍼 명령 사용해 보기
## 환경 설정
# Hadoop 
  - 복제 계수 : 3 -> 1
  - HDFS 권한 검사 : 체크박스를 해제  # 접근권한 해제
  - HDFS 블록 크기 : 128MiB -> 64MiB

# YARN
  - yarn.scheduler.max : 1GiB -> 1.5GiB
  - yarn.nodemanger.resource.memory-mb : 1GiB -> 5GiB
  - Scheduler 클래스(yarn.resourcemanager.scheduler.class : FifoScheduler로 변경 

# 실무에서 Hadoop 디렉토리 하위 경로의 복제계수를 10으로 변경하면 조회시 속도 향상. 물론 자원의 소비는 감안
$ hadoop fs -setrep 10 -R /user/hadoop/


### 2-5. 빅데이터 클러스터 구성
## HDFS 명령어 사용(server02.hadoop.com)
$ hdfs dfs -put Sample.txt /tmp
$ hdfs dfs -ls /tmp
$ hdfs dfs -cat /tmp/Sample.txt
$ hdfs dfs -mv /tmp/Sample.txt /tmp/Sample2.txt
$ hdfs dfs -get /tmp/Sample2.txt   # HDFS에 저장된 파일을 로컬 파일시스템으로 가져오기
$ hdfs dfs -rm /tmp/Sample2.txt    # HDFS에 저장된 파일 삭제(휴지통)
$ hdfs dfs -rm -skipTrash /tmp/Sample2.txt    # HDFS에 저장된 파일 삭제

$ hdfs dfs -stat '%b %o %r %n' /tmp/Sample.txt  # hdfs 저장된 파일 상태 확인
                                                # 파일크기(%b), 파일 블록크기(%o), 복제수(%r), 소유자명(%u), 파일명(%n)
$ hdfs fsck /         # HDFS 파일 시스템 상태 검사, 전체크기, 디렉러리 수, 파일수, 노드수 등 파일시스템의 전체 상태를 보여줌
$ hdfs dfsadmin -report  # 하둡 파일싯템의 기본 정보 및 통계를 보여줌

# HDFS 파일의 비정상 상태
$ hdfs dfsadmin -safemode leave    # 안전모드 상태로 전환됐다면 강제로 안전모드를 해제
$ hdfs fsck / -delete              # 손상된 파일을 강제로 삭제
$ hdfs fsck / -move                 # 손상된 파일을 /lost+found 디렉터리로 옮김


## 주키퍼(zookeeper) 명령어 사용
$ zookeeper-client     # 주키퍼 클라이언트 실행

# 주키퍼 Z노드 등록/조회/삭제
[zk: localhost:2181(CONNECTED) 0] create /pilot-pjt bigdata # Z노드 생성
[zk: localhost:2181(CONNECTED) 0] ls /                      # Z노드 조회  
[zk: localhost:2181(CONNECTED) 0] get /pilot-pjt
[zk: localhost:2181(CONNECTED) 0] delete /pilot-pjt         # Z노드 삭제

### 스마트카 로그 시뮬레이터 - 설치 및 실행
# 1. 작업폴더 생성 (root)
  - $ cd /home
  - $ mkdir /home/pilot-pjt
  - $ mkdir /home/pilot-pjt/working
  - $ mkdir /home/pilot-pjt/working/car-batch-log
  - $ mkdir /home/pilot-pjt/working/driver-realtime-log
  - chmod 777 -R /home/pilot-pjt

# 2. java 컴파일과 실행환경을 1.7에서 1.8로 변경
  - $ rm /usr/bin/java
  - $ rm /usr/bin/javac
  - $ ln -s /usr/java/jdk1.8.0_181-cloudera/bin/javac /usr/bin/javac
  - $ ln -s /usr/java/jdk1.8.0_181-cloudera/bin/java  /usr/bin/java
  - $ java -version
  
# 3. 시뮬레이터 실행
  - 실시간 로그(Driver Log)
    - $ java -cp bigdata.smartcar.loggen-1.0.jar com.wikibook.bigdata.smartcar.loggen.DriverLogMain 20160101 3  
  - 배치 로그(Car Log)
    - $ java -cp bigdata.smartcar.loggen-1.0.jar com.wikibook.bigdata.smartcar.loggen.CarLogMain 20160101 3  

  
### 3.2 수집에 활용할 기술 : 플럼(flume)
# 플럼 설치
  - 설치 위치 : server02.hadoop.com

# 플럼 환경 설정
  - java heap : 50MiB -> 100MiB

# 플럼 동작 
# Source -> Channer -> Sink
# Source -> Interceptor -> Channel -> Sink(2개)

# 플럼 동작 
  - Flume [구성] - 구성파일 편집


### 3.3 수집에 활용할 기술 : 카프카(kafka)
# 설치 위치
  - kafka Broker : server02.hadoop.com
  - kafka MirrorMaker : None
  - Gateway : None

# 환경 설정
  - Data Retention Time : 7일 -> 10분
  
# 카프카 토픽 생성
  - $ kafka-topics --create --zookeeper server02.hadoop.com:2181 --replication-factor 1 --partitions 1 --topic SmartCar-Topic 

# 카프카 Producer 사용
  - kafka-console-producer --broker-list server02.hadoop.com:9092 -topic SmartCar-Topic
  
# 카프카 Consumer1 사용
  - kafka-console-consumer --bootstrap-server server02.hadoop.com:9092 --topic SmartCar-Topic --partition 0 --from-beginning

# 카프카 Consumer2 사용  
  - kafka-console-consumer --bootstrap-server server02.hadoop.com:9092 --topic SmartCar-Topic --partition 0 --from-beginning  
  
# Provider(N) -> 카프카 Broker(Topic1, Topic2) -> Consumer(N개)

3.3 수집 파일럿 실행 1단계 - 아키텍처

3.4 수집 파일럿 실행 2단계 - 환경 구성
## 플럼 설치
#1. CM의 홈에서 [서비스 추가] 화면으로 이동한다. 추가할 서비스 유형 중 [Flume]을 선택하고 우측 하단의 [계속] 버튼을 클릭한다.
#2. 플럼을 설치할 서버 호스트를 server02.hadoop.com으로 선택하고 [확인] -> [계속] 버튼을 클릭한다.
#3. 설치 완료 메시지가 보이면 플럼을 Server02에 성공적으로 설치한 것이다. [완료] 버튼을 클릭해 플럼 설치를 종료한다.
#4. CM의 홈 화면에 플럼 메뉴가 추가되었고 프럼의 Default 그룹의 Heap Memory가 너무 작게 설정되어 있다.
    - CM홈 -> [Flume] -> [구성]에서 검색란에 "java heap"이라고 입력.
	  - 변경전 : 50, 변경후 : 100
#5. CM홈 -> [Flume] 우측의 콤보박스를 선택하고 [시작]메뉴을 선택해 플럼 에이전트를 구동한다.

3.5 수집 파일럿 실행 3단계 - 플럼 수집 기능
## SmartCar 에이전트 생성 
# Agent 이름 : SmartCar_Agent
# 구성파일 - CH03 폴더 확인

3.6 수집 파일럿 실행 4단계 - 카프카 기능
## 카프카 Topci 생성 
  - $ kafka-topics --create --zookeeper server02.hadoop.com:2181 --replication-factor 1 --partitions 1 --topic SmartCar-Topic 
  - replication-factor 옵션은 카프카를 다중 Broker로 만들고 전송한 데이터를 replication-factor 개수만큼 복제하게 되는데,
    파일럿 프로젝트에서는 단일 카프카 브로커이므로 복제 개수는 1개만 설정  
  - partitions 옵션은 해당 Topic에 데이터들이 partitions의 개수만큼 분리 저장하게 된다. 이 역시 다중 Broker에서 쓰기/읽기 성능 향상을 위해
    사용하는 옵션이다. 파일럿 환경에서는 1로만 설정한다.  

## 카프카 Producer 사용 
# 카프카 Producer 사용
  - $ kafka-console-producer --broker-list server02.hadoop.com:9092 -topic SmartCar-Topic

# 카프카 Consumer 사용
  - kafka-console-consumer --bootstrap-server server02.hadoop.com:9092 --topic SmartCar-Topic --partition 0 --from-beginning


3.7  수집 파일럿 실행 5단계 - 수집기능 테스트
## SmartCar 로그 시뮬레이터 작동
#1. Server02에 SSH 접속하고 bigdata.smartcar.loggen-1.0.jar 가 위치한 곳으로 이동한다.
    - $ cd /home/pilot-pjt/working

#2. 스마트카 로그 시뮬레이터를 백그라운드 방식으로 실행한다.
    - $ java -cp bigdata.smartcar.loggen-1.0.jar com.wikibook.bigdata.smartcar.loggen.CarLogMain 20160101 3 &
    - $ java -cp bigdata.smartcar.loggen-1.0.jar com.wikibook.bigdata.smartcar.loggen.DriverLogMain 20160101 3 &

#3. 정상 작동하는 지 확인 
    - /home/pilot-pjt/working/SmartCar 경로에 SmartCarStatusInfo_20160101.txt 파일 생성 확인
	  - $ cd /home/pilot-pjt/working/SmartCar 
	  - $ vi SmartCarStatusInfo_20160101.txt 
	- /home/pilot-pjt/working/driver-realtime-log 경로에 SmartCarDriverInfo.log 파일 생성 확인   
	  - $ cd /home/pilot-pjt/working/driver-realtime-log
	  - $ tail -f SmartCarDriverInfo.log 

#4. SpoolDir 경로로 옮김  
    - $ mv /home/pilot-pjt/working/SmartCar/SmartCarStatusInfo_20160101.txt /home/pilot-pjt-working/car-batch-log/

#5. 카프카 Consumer 작동
    - kafka-console-consumer --bootstrap-server server02.hadoop.com:9092 --topic SmartCar-Topic --partition 0

## 파일럿 환경의 로그 확인 
# 빅데이터 시스템에서는 에코시스템들의 로그를 확인하는 것이 중요하다. 많은 소프트웨어가 설치되고 서로간의 의존성이 커서 로그를 통해 다양한 문제점을 확인
    하기 때문이다.
	- Hadoop 에코시스템 서버들의 로그 확인 : /var/log/디렉터리( cloudera, Hadoop, oozie 등)
	- Redis 서버 로그 위치 : /var/log/redis_6379.log 
	- Storm 서버 로그 위치 : /home/pilot-pjt/storm/logs/
	- Zeppelin 서버 로그 위치 : /home/pilot-pjt/zeppelin-0.8.2-bin-all/logs
	
## HDFS 문제 발생
# HDFS 파일 시스템 검사 : $hdfs fsck /

# HDFS에 Safe 모드 발생 후 빠져나오지 못할 경우
  - $ hdfs dfsadmin -safemode leave    # 안전모드 상태로 전환됐다면 강제로 안전모드를 해제
# HDFS에 CORRUPT BLOCKS/FILES 등이 발생해 복구가 불가능한 경우  
  - $ hdfs fsck / -delete              # 손상된 파일을 강제로 삭제
  - $ hdfs fsck / -move                # 손상된 파일을 /lost+found 디렉터리로 옮김


4. 빅데이터 적재 1 (대용량 파일)
4.1 빅데이터 적재 개요
4.2 빅데이터 적재에 활용하는 기술 - 하둡 & 주키퍼 
# 하둡 소개
4.3 적재 파일럿 실행 1단계 - 적재 아키텍처 
4.4 적재 파일럿 실행 2단계 - 적재 환경 구성
4.5 적재 파일럿 실행 3단계 - 적재 기능 구현
## SmartCar 에이전트 수정 

4.6 적재 파일럿 실행 4단계 - 적재 기능 테스트 
## 플럼의 사용자 정의 Interceptor 추가
   - FTP 클라이언트인 파일질라 실행해 Server02에 접속 
   - 업로드 경로: /opt/cloudera/parcels/CDH/lib/flume-ng/lib 
   - CH04/bigdata.smartcar.flume-1.0.jar 파일을 /opt/cloudera/parcels/CDH/lib/flume-ng/lib 경로에 업로드 


## 플럼의 Conf 파일 수정
#1. CM홈 -> [Flume] -> [구성]을 선택해서 CH04/예제4.2/SmartCar_Agent.conf 파일을 열어 복사후 붙여 넣는다.

#2. 플럼의 [변경 내용 저장] 버튼을 클릭한다.

#3. CM 홈으로 다시 이동해서 플럼을 재시작한다.

## SmartCar 로그 시뮬레이터 작동
#1. cd /home/pilot-pjt/working 

#2. 스마트카 상태정보 생성 시뮬레이터 실행 

#3. 정상 확인 

## 플럼 이벤트 작동 
#1. 스마트카 상태 로그를 car-batch-log로 move
    - $ mv /home/pilot-pjt/working/SmartCar/SmartCarStatusInfo_20160101.txt /home/pilot-pjt/working/car-batch-log/ 

#2. 플럼의 실행 로그 확인 
    - $ cd /var/log/flume-ng/ 
	- $ tail -f /var/log/flume-ng/flume-cmf-flume-AGENT-server02.hadoop.com.log 
	  - "... Writer callback called"라는 메시지가 보이면 모든 HDFS 적재가 성공적으로 끝난 것이다.  
	
#3. HDFS 적재 확인
    - $ hdfs dfs -ls -R /pilot-pjt/collect/car-batch-log/
	- $ hdfs dfs -cat /pilot-pjt/collect/car-batch-log/wrk_date=20160529/car-batch-log.14xxxx.log 
    - $ hdfs dfs -tail /pilot-pjt/collect/car-batch-log/wrk_date=20160529/car-batch-log.14xxxx.log 

#4. 시뮬레이터 프로세스 종료 
    - $ ps -ef | grep smartcar.log 
    - $ kill -9 [pid]


5. 빅데이터 적제 2 - 실시간 데이터

5.0. 시작하기 전에

5.1. 빅데이터 실시간 적재 개요

5.2. 실시간 적재에 활용하는 기술 01 - HBase & Redis

5.2. 실시간 적재에 활용하는 기술 02 - Storm & Esper.pdf

5.3. 실시간 적재 파일럿 실행 1단계 - 아키텍처

5.4. 실시간 적재 파일럿 실행 2단계 01 - 환경구성
5.4. 실시간 적재 파일럿 실행 2단계 02 - HBase 설치

## HBase
# HBase 설치
  - Master : server02.hadoop.com  
  - HBase REST Server : None
  - HBase Thrift Server : server02.hadoop.com  
  - RegionServer : server02.hadoop.com  


# HBase 구성
  - HBase Thrift Http 서버 설정  : "HBase(서비스 전체)" 항목의 체크박스에 Check
  

# HBase 사용
$ hbase shell
> create 'smartcar_test_table', 'cf'
> put 'smartcar_test_table', 'row-key1', 'cf:model', 'Z0001'
> put 'smartcar_test_table', 'row-key1', 'cf:no', 	'12345'
> get 'smartcar_test_table', 'row-key1'
 
> disable 'smart_test_table'
> drop 'smart_test_table'
> exit

# HBase 웹 관리자 화면
- http://server02.hadoop.com:16010

# HBase는 자원 소모가 높은 서버이므로 사용하지 않을때에는 일시정지.

# 간단한 HBase 명령어
$ hbase shell
  > create 'smartcar_test_table', 'cf'    # 테이블 및 컬럼패밀리 생성
  > put 'smartcar_test_table', 'row-ke1','cf:model','z0001'  # 데이터 insert
  > get 'smartcar_test_table', 'row-ke1'  # 데이터 조회
  > disable 'smartcar_test_table'            # 테이블 삭제전 disable
  > drop 'smartcar_test_table'               # 테이블 drop
  
  > list_snapshots
  > delete_snapshots 'snapshot 이름'
  > list                              # 테이블 리스트 
  > disable 'table_name'
  > drop 'table_name'
  > count 'table_name'
  > get 'table_name', 'key'
  > deleteall 'table_name','key'
  > scan 'table_name', {STARTROW=>'1234', ENDROW=>'1235'}
  > scan 'table_name', {STARTROW=>'1234', LIMIT=>10}
  > scan 'table 이름', {COLUMNS=>'패밀리이름:컬럼이름', LIMIT=>10, FILTER=>"ValueFilter(=, 'binary:조건값')"
  > scan 'table 이름', {LIMIT=>10, COLUMNS=>['패밀리네임'], FILTER => "(SingleColumnValueFilter('패밀리네임', '필드명',=,'binary:조건값1',true, true)) AND (SingleColumnValueFilter('패밀리네임', '필드명',=,'binary:조건값2',true,true))"}
  > scan 'table 이름', {LIMIT=>10, COLUMNS=>['패밀리네임:필드명'], TIMERANGE=> [start_timestamp, end_timestamp]} 

5.4 실시간 적재 파일럿 실행 2단계 03 - Redis 설치
$ yum install -y gcc*
$ yum install -y tcl

-----------------------------------------------------------------------------------------------
- [ CentOS 6 yum Repo 설정 Start ] -------------------------------------------------------------
-----------------------------------------------------------------------------------------------
1. # cd /etc/yum.repos.d/
   # mkdir old
   # mv * old/.
   # mv old/CentOS-Base.repo .
3. # vi CentOS-Base.repo
4. [base] [updates] [extras] ----아래 내용 복붙 ----
5. # yum clean all
6. # yum install -y gcc*
7. # yum install -y tcl


---아래 내용 복붙----
[base]
name=CentOS-$releasever - Base
#mirrorlist=http://mirrorlist.centos.org/?release=$releasever&arch=$basearch&repo=os&infra=$infra
baseurl=http://vault.centos.org/centos/$releasever/os/$basearch/
gpgcheck=1
gpgkey=file:///etc/pki/rpm-gpg/RPM-GPG-KEY-CentOS-6

#released updates
[updates]
name=CentOS-$releasever - Updates
#mirrorlist=http://mirrorlist.centos.org/?release=$releasever&arch=$basearch&repo=updates&infra=$infra
baseurl=http://vault.centos.org/centos/$releasever/updates/$basearch/
gpgcheck=1
gpgkey=file:///etc/pki/rpm-gpg/RPM-GPG-KEY-CentOS-6

#additional packages that may be useful
[extras]
name=CentOS-$releasever - Extras
#mirrorlist=http://mirrorlist.centos.org/?release=$releasever&arch=$basearch&repo=extras&infra=$infra
baseurl=http://vault.centos.org/centos/$releasever/extras/$basearch/
gpgcheck=1
gpgkey=file:///etc/pki/rpm-gpg/RPM-GPG-KEY-CentOS-6

#additional packages that extend functionality of existing packages
[centosplus]
name=CentOS-$releasever - Plus
#mirrorlist=http://mirrorlist.centos.org/?release=$releasever&arch=$basearch&repo=centosplus&infra=$infra
baseurl=http://vault.centos.org/centos/$releasever/centosplus/$basearch/
gpgcheck=1
enabled=0
gpgkey=file:///etc/pki/rpm-gpg/RPM-GPG-KEY-CentOS-6

#contrib - packages by Centos Users
[contrib]
name=CentOS-$releasever - Contrib
#mirrorlist=http://mirrorlist.centos.org/?release=$releasever&arch=$basearch&repo=contrib&infra=$infra
baseurl=http://vault.centos.org/centos/$releasever/contrib/$basearch/
gpgcheck=1
enabled=0
gpgkey=file:///etc/pki/rpm-gpg/RPM-GPG-KEY-CentOS-6

-----------------------------------------------------------------------------------------------
- [ CentOS 6 yum Repo 설정 End ] ---------------------------------------------------------------
-----------------------------------------------------------------------------------------------
 

$ cd /home/pilot-pjt
$ wget http://download.redis.io/releases/redis-5.0.7.tar.gz
$ tar -xvf redis-5.0.7.tar.gz

$ cd /home/pilot-pjt/redis-5.0.7
$ make
$ make install
$ cd /home/pilot-pjt/redis-5.0.7/utils
$ chmod 755 install_server.sh
$ ./install_server.sh

# Redis 설치 확인
$ vi /var/log/redis_6379.log

$ service redis_6379 status [start/stop]

# Redis 서버에 원격접근 가능토록 설정
$ vi /etc/redis/6379.conf

  -> bind 127.0.0.1 부분을 주석처리
  -> protected-mod yes -> no
$ service redis_6379 restart

# Redis CLI 로 데이터 저장/조회
$ redis-cli
> set key:1 Hello!BigData
> get key:1
> del key:1
> quit



5.4 실시간 적재 파일럿 실행 2단계 04 - Storm 설치

$ cd /home/pilot-pjt
$ wget https://archive.apache.org/dist/storm/apache-storm-1.2.3/apache-storm-1.2.3.tar.gz
$ tar -xvf apache-storm-1.2.3.tar.gz
$ ln -s apache-storm-1.2.3 storm

# Storm 환경설정
$ cd /home/pilot-pjt/storm/conf

$ vi storm.yaml
  > storm.zookeeper.servers:                       # zookeeper 정보
  >  - "server02.hadoop.com"

  > storm.local.dir: "/home/pilot-pjt/storm/data"  # 스톰 작동을 위한 데이터 저장소

  > nimbus.seeds: ["server02.hadoop.com"]          # Nimbus 정보

  > supervisor.slots.ports:                        # Worker의 포트로써 포트의 갯수만큼 Worker가 만들어짐
     - 6700

  > ui.port: 8088                                  # Storm UI 접속 포트

# Storm 로그 레벨 조정 (info(INFO) -> error
$ cd /home/pilot-pjt/storm/log4j2
$ vi cluster.xml    # info 를 ERROR 로 변경
$ vi worker.xml     # INFO 를 ERROR 로 변경

# Storm을 편리하게 사용하기 위한 설정
$ vi /root/.bash_profile
  > PATH=$PATH:/home/pilot-pjt/storm/bin

$ source /root/.bash_profile

## Storm 설치
# Java 환경 설정(jdk1.8)
$ java -version
$ rm /usr/bin/java
$ rm /usr/bin/javac
$ ln -s /usr/java/jdk1.8.0_181-cloudera/bin/javac /usr/bin/javac
$ ln -s /usr/java/jdk1.8.0_181-cloudera/bin/java /usr/bin/java

# 자동 기동 스크립트 설정 (storm-nimbus, storm-supervisor, storm-ui)
https://gist.github.com/yulrizka 에서 스크립트 다운로드후 /etc/rc.d/init.d 에 저장

# CH05/예제5.1 경로에 있는 3개의 파일을 업로드

$ chmod 755 /etc/rc.d/init.d/storm-nimbus
$ chmod 755 /etc/rc.d/init.d/storm-supervisor
$ chmod 755 /etc/rc.d/init.d/storm-ui

# 서비스 등록 스크립트에 대한 Log 및 Pid 디렉터리를 만듬
$ mkdir /var/log/storm
$ mkdir /var/run/storm

$ service storm-nimbus [storm-supervisor/storm-ui] start/stop/status

# Storm UI 접속 및 상태 모니터링
- http://server02.hadoop.com:8088

# 스톰도 주키퍼 의존도가 높다. 주키퍼의 z노드인 /storm의 위치에 스톰의 주요 설정값이 관리되고 있음.

# Storm 기동 순서 : storm-nimbus -> storm-supervisor -> storm-ui (중지는 반대로)



# HBase Region 스플릿
- 저사양 파일럿 환경 : 리전 스플릿 수를 2로 설정(yarn 기반)
$ hbase org.apache.hadoop.hbase.util.RegionSplitter DriverCarInfo HexStringSplit -c 2 -f cf1


5.5 실시간 적재 파일럿 실행 3단계 - 적재 기능
# Storm Topology 배포
1. bigdata.smartcar.storm-1.0.jar 를 /home/pilot-pjt/working 에 업로드
2. storm 명령을 통해 DriverCarInfo라는 이름으로 배포. 배포하기 전 Storm 실행 확인
$ cd /home/pilot-pjt/working
$ storm jar bigdata.smartcar.storm-1.0.jar com.wikibook.bigdata.smartcar.storm.SmartCarDriverTopology DriverCarInfo


# Storm Topology 제거 
$ storm kill "배포시 사용했던 Topology 이름" -> $ storm kill "DriverCarInfo"

# storm topology 확인
- http://server02.hadoop.com:8088 로 확인
 

# 적재 테스트
1. 로그 시뮬레이터 작동

2. HBase 적재 확인
$ hbase shell
  > count 'DriverCarInfo'   # DriverCarInfo 테이블에 적재된 데이터 로우 수를 1000 단위로 출력
  > scan 'DriverCarInfo', {LIMIT=>20}  # 20개 데이터만 조회
  > scan 'DriverCarInfo', {STARTROW=>'00001030106102-Z0020', LIMIT=>1}
  > scan 'DriverCarInfo', {COLUMNS=>['cf1:car_number','cf1:area_numbr'], FILTER=>"RowFilter(=,'regexstring:30106102') AND SingleColumnValueFilter('cf1', 'area_numbr' ,=, 'regexstring:D04')"}  

3. Hbase 웹관리자에 접속해서 적재한 데이터가 분산 적재되는지 확인
- http://server02.hadoop.com:16010/


# Redis에 적재된 데이터 확인
$ redis-cli
$ 127.0.0.1:6379> smembers 20160103

5.6 실시가 적재 파일럿 실행 4단계 - 적재 테스트
# Redis 클라이언트 애플리케이션 작동
- bigdata.smartcar.redis-1.0.jar를 /home/pilot-pjt-working 으로 업로드

- 레디스 클라이언트 애플리케이션 실행 - redis에 있는 데이터를 가져와서 과속한 차량에 경고, 메시지를 보낼 수 있음
$ cd /home/pilot-pjt/working
$ java -cp bigdata.smartcar.redis-1.0.jar com.wikibook.bigdata.smartcar.redis.OverSpeedCarInfo 20160103

# 실시간 로그 시뮬레이터 중지
$ ps -ef | grep smartcar.log/redis_6379
$ kill -9 [pid]

# 적재 테스트가 종료되면 원할한 자원 관리를 위해 수집/적재 서비스를 정지 시킴.
# 아래 순서로 정지
- 플럼 서비스 : CM홈 -> [Flume] -> [정지]
- 카프카 서비스: CM홈 -> [Kafka] -> [정지]
- 스톰 서비스: server02 접속
$ service storm-ui stop
$ service storm-supervisor stop
$ service storm-nimbus stop
- 레디스 서비스: server02에 ssh 접속 
$ service redis_6379 stop
- HBase 서비스: CM홈 -> [HBase] -> [정지]


6. 빅데이터 탐색

## pig
- 실무로 배우는 빅데이터 기술(확장편): https://bit.ly/bigdata2nd


6.4 탐색 파일럿 실행 2단계 - 탐색 환경 구성

### 미사용 수집/적재 서비스 중지	
  - 플럼 서비스 : CM 홈 -> [Flume] -> [정지]
  - 카프카 서비스 : CM 홈 -> [Kafka] -> [정지]
  - 스톰 서비스 : server02.hadoop.com에 접속하여 정지
    $ service storm-ui stop
    $ service storm-supervisor stop
    $ service storm-ui stop	


### 탐색 소프트웨어 설치 및 설정
## Hive 설치
# 설치 방법
  - CM을 이용하여 Hive 서비스 추가
  - Hive 작동에 필요한 의존성 선택
  - Select Dependendencies(Hbase, HDFS, YARN(MR2 included), Zookeeper) 선택
  - 설치 프로그램 위치
    - Gateway : server02.hadoop.com
    - Hive MetaStore Server : server02.hadoop.com
    - WebHCat Server : None
    - HiveServer2 : server02.hadoop.com
  - Hive의 MetaStore로 사용되는 데이터베이스 설정 
    - 내장된 데이터베이스 사용 
    - PostgreSQL, server01.hadoop.com:7432, hive, hive (defalut)
  - Hive의 데이터웨어하우스 디렉토리와 메타스터어의 포트번호를 기본값으로 유지한 상태로 진행
  - Hive 설치 진행됨
  
  - HIVE 암호 : hive/lqvbwxaLFz 

## Oozie 설치
# 설치 방법
  - CM을 이용하여 Hive 서비스 추가
  - Oozie 작동에 필요한 의존성 선택
    - Select Dependendencies(Hbase, HDFS, Hive, YARN(MR2 included), Zookeeper) 선택
  - 설치 프로그램 위치
    - Oozie Server : server02.hadoop.com
  - Oozie에서 사용하는 데이터베이스 설정  
    - 내장된 데이터베이스 사용 
    - PostgreSQL, server01.hadoop.com:7432, oozie_oozie_server, oozie_oozie_server (defalut)
  - Oozie의 변경 내용 검토 : default로 진행 
  - Oozie 설치 진행됨

# Oozie 설정
  - Launcher Memory : 2GB -> 1GB

## Hue 설치 (admin/admin)

# 설치 방법
  - yum mirror list 설정	
    - $ echo "http://vault.centos.org/6.10/os/x86_64/" > /var/cache/yum/x86_64/6/base/mirrorlist.txt
	- $ echo "http://vault.centos.org/6.10/extras/x86_64/" > /var/cache/yum/x86_64/6/extras/mirrorlist.txt
    - $ echo "http://vault.centos.org/6.10/updates/x86_64/" > /var/cache/yum/x86_64/6/updates/mirrorlist.txt
    - $ echo "http://vault.centos.org/6.10/sclo/x86_64/rh" > /var/cache/yum/x86_64/6/centos-sclo-rh/mirrorlist.txt
    - $ echo "http://vault.centos.org/6.10/sclo/x86_64/sclo" > /var/cache/yum/x86_64/6/centos-sclo-sclo/mirrorlist.txt

  - 휴를 설치하기 위해서는 Python 2.7이 설치되어 있어야 함 - server02 서버에 설치
    - $ yum install centos-release-scl
	- $ yum install scl-utils
	- $ yum install python27
	- $ source /opt/rh/python27/enable  # 
	- $ python --version

  - 파이썬 패키지인 psycopg2 설치 
    - $ yum --enablerepo=extras install epel-release   # epel 저장소 활성화
    - $ yum install python-pip
	- $ yum install postgresql-devel
	- bash -c "source /opt/rh/python27/enable; pip install psycopg2==2.6.2 --ignore-installed"

  - CM을 이용하여 Hue 서비스 추가
  - Hue 작동에 필요한 의존성 선택
    - Select Dependendencies(Hbase, HDFS, Hive, Oozie, YARN(MR2 included), Zookeeper) 선택
  - 설치 프로그램 위치
    - Hue Server : server02.hadoop.com
	- Load Balancer : None
  - 데이터베이스 설정 : default로 계속 진행	
  - Hue 설치 진행됨

# Hue 설정
  - Time Zone 변경 
    - "시간대" : America/Los_Angeles -> Asia/Seoul
  - HBase 브라우저를 사용하기 위한 옵션 설정 
    - Hbase Thrift 서버 : HBase Thrift Server(server02) 선택  
	 
## Spark 설치
# 설치 방법
  - CM을 이용하여 Hue 서비스 추가
  - Spark 작동에 필요한 의존성 선택
    - Select Dependendencies(Hbase, HDFS, YARN(MR2 included), Zookeeper) 선택
  - 설치 프로그램 위치
    - History Server : server02.hadoop.com
	- Gateway : server02.hadoop.com
  - Spark 설치 진행됨
  - 스파크를 YARN에서 작동하도록 구성했으므로 YARN 서비스와 스파크를 재시작
    - YARN 재시작 : CM 홈 [YARN] 선택후 재시작
	- Spark 클라이언트 구성 배포 : [클라이언트 구성 배포] 아이콘을 선택/실행 
	- Spark 시작 : CM홈 에서 Spark 시작
  - 스파크 정상 설치 확인위해 Spark history 서버에 접속하여
    - 스파크 히스토리 서버 : http://server02.hadoop.com:18088/
	

6.5 탐색 파일럿 실행 3단계 - 데이터 탐색 & 처리1

### HDFS에 적재된 데이터 확인 
 - 휴 접속 : http://server02.hadoop.com:8888
         : CM 홈 -> [Hue] -> 상단의 Hue 웹 UI
 - 좌측 상단의 드롭다운 메뉴 클릭 -> [파일] 
 
### HBase에 적재된 데이터 확인 
 - 좌측 상단의 드롭다운 메뉴 클릭 -> [HBase] 

6.5 탐색 파일럿 실행 3단계 - 데이터 탐색 & 처리2
  - Hive는 MapReduce를 통해서 쿼리 수행
  
### Hive 를 이용한 External 데이터 탐색(1/5)
  - Hive는 Hadoop에 있는 데이터를 탐색하는 도구
  - Hive 쿼리를 이용해 스마트카 상태 정보를 탐색하기 위한 하이브의 External 테이블을 생성하고 실행
    - c:/bigdata-master/CH06/HiveQL/그림-6.44.hql

### Hive 를 이용한 External 데이터 탐색(2/5)
  - "스마트카 상태 정보"를 위한 하이브 테이블을 생성했으면 이제 작업일자를 기준으로 파티션 정보를 생성
  - 플럼을 통해 HDFS로 적재한 데이터를 Alter table 명령을 실행해 작업 일자 기준으로 파티션 정보를 추가 
  - 작업했던 날짜로 입력(wrk_date=20210508)
  - ALTER TABLE SmartCar_Status_Info ADD PARTITION(wrk_date='20210508');
  
### Hive 를 이용한 External 데이터 탐색(3/5)
  - Hive의 External 테이블로 만들어진 SmartCar_Status_Info 테이블에서 단순 SELECT 쿼리 실행 
    (참고로, Ctrl + Enter 단축키를 이용하면 편집기 상에서 커서가 위치한 곳의 쿼리가 실행됨)
  - select * from SmartCar_Status_Info limit 5;

### Hive 를 이용한 External 데이터 탐색(4/5)
  - 조건절을 포함하는 하이브 쿼리 실행. 
  - select car_number, avg(battery) as battery_avg
      from SmartCar_Status_Info
	 where battery < 60
	 group by car_number;

### Hive 를 이용한 External 데이터 탐색(5/5)
  - 실행된 하이브 쿼리 모니터링은 출력되는 로그창을 통해서도 확인할 수 있지만 [Job Browser] 메뉴를 통해
    맵리듀스로 변환되어 실행된 Job 정보도 확인할 수 있음


6.5 탐색 파일럿 실행 3단계 - 데이터 탐색 & 처리3
### 하이브 이용한 HBase 데이터 탐색(1/4)
  - HBase 서비스를 시작 - CM 홈 -> [HBase] -> [시작]
  - HBase 데이터 조회 방법
    - HBase Shell을 이용하는 방법
	- Hue에서 HBase 조회하는 방법
	- 두 방법다 뭔가 불편함. HBase를 SQL처럼 사용하면 좋을 것 같다. Hive에서 HBaseStorageHandler를 이용하여 조회하면 유용 
	
### 하이브 이용한 HBase 데이터 탐색(2/4)
  - 휴 상단 메뉴의 쿼리 콤보박스에서 [편집기] -> [Hive]를 선택해 하이브의 쿼리 편집기로 이동.
  - 하이브의 External 테이블을 생성하는데, HBaseStorageHandler를 이용해 SmartCar_Drive_Info 테이블 생성 
  - create external table smartcar_drive_info(
      r_key string,
	  r_date string,
	  car_number string,
	  speed_pedal string,
	  break_pedal string,
	  steer_angle string,
	  direct_light string,
	  speed string,
	  area_number string)
	stored by 'org.apache.hadoop.hive.hbase.HBaseStorageHandler'
	with serdeproperties (
	  "hbase.columns.mapping" = "cf1:date, cf1:car_number,
	                             cf1:speed_pedal,
								 cf1:break_pedal,
								 cf1:steer_angel,
								 cf1:direct_light,
								 cf1:speed,
								 cf1:area_number")
	tableproperties(
	  "hbase.table.name" = "DriverCarInfo");
	
### 하이브 이용한 HBase 데이터 탐색(3/4)
  - 위의 쿼리가 실행되면 SmartCar_Drive_Info 테이블의 정보가 메타스토어에 등록되고, 하이브 쿼리를 통해 HBase에 적재된 테이블을 탐색할 수 있다.
  
### 하이브 이용한 HBase 데이터 탐색(4/4)
  - HBase 서비스를 정지시킨다

6.5 탐색 파일럿 실행 3단게 - 데이터 탐색 & 처리 4
### 데이터셋 추가
  - 스마트카 마스터 데이터 와 스마트카 차량용품 구매 이력 데이터를 추가 적재한다.
    외부 파일(CarMaster.txt, CarItemBuyList_202003.txt)을 휴 파일 브라우저 업로드 기능을 이용해
	두 개의 파일을 적재하고 하이브 External Table로 정의한다.
  - 휴를 통해서 파일을 HDFS에 직접 저장하는 방식을 실행

  1. 휴의 파일브라우저 기능을 실행. 디렉터리 위치를 /pilot-pjt/collect로 이동
  2. /pilot-pjt/collect 위치에서 "car-master" 디렉터리를 생성한후 "car-master" 로 이동
  3. CH06/CarMaster.txt 파일을 HDFS의 /pilot-pjt/collect/car-master/ 경로에 업로드 
  4. 휴의 파일 브라우저에서 /pilot-pjt/collect/car-master/CarMaster.txt를 열어본다
  5. CH06/CarItemBuyList_202003.txt 파일을 /pilot-pjt/collect/buy-list/ 경로에 업로드 
  6. 추가한 두개의 데이터 셋인 "스마트카 마스터"와 "스마트카 상품 구매 이력"을 하이브의 External 테이블로
     정의한다. 휴 상단메뉴의 [Query Editor] -> [Hive]를 선택해 하이브의 쿼리 편집기로 이동한후 
	 스마트카 마스터 테이블인 smartcar_master를 생성한다.
  7. "스마트카 마스터" 테이블의 데이터를 하이브 쿼리를 이용해 확인한다.
     - select * from smartcar_master;
  8. "스마트카 차량용품 구매이력"에 대해 하이브 테이블인 smartcar_item_buylist를 생성한다.
  9. 하이브 쿼리를 이용해 확인
     - select * from smartcar_item_buylist limit 10;
  
	 
6.5 탐색 파일럿 실행 3단계 - 데이터 탐색 & 처리 5
### Spark를 이용한 추가 데이터셋 탐색
  1. 스파크가 설치된 server02에 접속하여 스파크 쉘을 실행. 
     정상적인 스파크 쉘 기동이 완료되면 "scala>" 프롬포트가 나타난다.
     - $ spark-shell  
	 
  2. Spark-SQL 컨텍스트를 이용해 하이브에서 생성한 "스마트카 마스터 데이터"인 samrtcar_master 테이블을 조회할 수 있다.
     "age >= 18" 조건으로 spark-SQL 컨텍스트를 정의해 스파크 DataFrame 변수인 smartcar_master_df에 할당한다.
     - scala> val smartcar_master_df = spark.sqlContext.sql("select * from smartcar_master where age >= 18")
	 
  3. 스파크-SQL로 age가 18 으로 만들어진 DataFrame을 출력한다. 상위 20개의 항목이 표시되고, age 필드를 보면
     18 미만인 데이터는 보이지 않는다.
     - scala> smartcar_master_df.show()
	 
  4. age가 18세 이상으로 정제된 데이터셋을 하이브의 Managed 테이블인 SmartCar_Master_Over18에 별도로 저장한다.
     - scala> smartcar_master_df.write.saveAsTable("SmartCar_Master_Over18")
	   -> Hive DataWareHouse(DW)의 Managed 영역으로 저장하는 거임.
	   
  5. 휴의 [Query 편집기] -> [Hive]로 이동해서 스파크-SQL에서 만든 테이블인 smartcar_master_over18이 생성되었는지
     확인하고 smartcar_master_over18에 "age > 18"에 해당하는 데이터만 존재하는지 하이브 QL로 조회해 본다.
     - select * from smartcar_master_over18 where age > 18 limit 10;
	 
  6. 동일 쿼리를 파일럿 환경의 하이브와 스파크에서 각각 실행했을 때 수행시간을 비교.
     - 실행 쿼리 : select * from smartcar_master_over18 where age > 18 and sex = '남';
       - Hive : 62초, Spark : 20초


6.6 탐색 파일럿 실행 4단계 - 01. 탐색 주제영역
### 탐색 주제영역
  - 실제 환경에서는 데이터웨어하우스를 구축하고 데이터 마트를 구축해야 하나 파일럿 환경에서는 lake영역에서 바로 데이터 마트로 구축 함.
  - 1. 스마트카 상태 모니터링 정보
       - 이용할 테이블 
	     - 스마트카 마스터 데이터 : smartcar_master_over18)
		 - 스마트카 상태 정보 데이터 :(smartcar_status_info)
	   - 워크플로 이름 : subject1-workflow
	   - 스케줄러 이름 : subject1-coordinator
	   - 수행 주기 : 01:00 / 1day
	   - 생성할 마트 테이블 : managed_smartcar_status_info
  
  - 2. 스마트카 운전자 운행기록 정보
       - 이용할 테이블 
	     - 스마트카 마스터 데이터(smartcar_master_over18)
		 - 스마트카 운전자 운행 데이터(smartcar_drive_info_2)
	   - 워크플로 이름 : subject2-workflow
	   - 스케줄러 이름 : subject2-coordinator
	   - 수행 주기 : 02:00 / 1day
	   - 생성할 마트 테이블 : managed_smartcar_drive_info

  - 3. 이상 운전 패턴 스마트카 정보 
       - 이용할 테이블 
	     - 스마트카 운전자 운행기록 정보(managed_smartcar_drive_info)
	   - 워크플로 이름 : subject3-workflow
	   - 스케줄러 이름 : subject3-coordinator
	   - 수행 주기 : 03:00 / 1day
	   - 생성할 마트 테이블 : managed_smartcar_symptom_info

  - 4. 긴급 점검이 필요한 스마트카 정보 
       - 이용할 테이블 
	     - 스마트카 상태 모니터링 정보(managed_smartcar_status_info)
	   - 워크플로 이름 : subject4-workflow
	   - 스케줄러 이름 : subject4-coordinator
	   - 수행 주기 : 04:00 / 1day
	   - 생성할 마트 테이블 : managed_smartcar_emergency_check_info

  - 5. 운전자의 차량용품 구매 이력 정보 
       - 이용할 테이블 
	     - 스마트카 마스터 데이터(smartcar_master_over18)
		 - 스마트카 차량용품 구매 이력 데이터(smartcar_item_buylist)
	   - 워크플로 이름 : subject5-workflow
	   - 스케줄러 이름 : subject5-coordinator
	   - 수행 주기 : 05:00 / 1day
	   - 생성할 마트 테이블 : managed_smartcar_item_buylist_info
	   
	   

6.6 탐색 파일럿 실행 4단계 - 데이터 준비
### 스마트카 상태정보 데이터 생성(1/2)
  - 로그 시뮬레이터를 이용해 오늘 날짜의 "스마트카 상태 정보 데이터"를 생성한다.
  - 플럼 서비스 시작 : CM 홈 -> [Flume] -> [시작]
  
### 스마트카 상태정보 데이터 생성(2/2)
  - 스마트카 상태 정보 배치 수행 - 현재 날짜를 기준으로 수행 

### 스마트카 상태정보 데이터 적재 및 확인(1/2)
  - 스마트카 상태 정보 데이터를 플럼의 수집 디렉터리로 옮긴다.

### 스마트카 상태정보 데이터 적재 및 확인(2/2)
  - 오늘 날짜의 스마트카 상태 정보가 HDFS에 정상적으로 적재되었는지 확인 
    - $ hdfs dfs -ls /pilot-pjt/collect/car-batch-log/
	

### 스마트카 운전자 운행 로그 생성 및 확인(1/6)
  - 수집 및 적재 서비스 기동
    - 플럼 서비스 : CM 홈 -> [Flume] -> [시작]
    - 카프카 서비스 : CM 홈 -> [Kafka] -> [시작]
    - 스톰 서비스 : server02.hadoop.com에 ssh로 접속 
      - service storm-nimbus start 
      - service storm-supervisor start 
      - service storm-ui start 
    - redis 서비스 : server02.hadoop.com에 ssh로 접속 
      - service redis_6379 start 
    - HBase 서비스 : CM 홈 -> [HBase] -> [시작]

### 스마트카 운전자 운행 로그 생성 및 확인(2/6)
  - 현재 날짜로 10의 운전자 운행 로그 생성 

### 스마트카 운전자 운행 로그 생성 및 확인(3/6)
  - tail -f /home/pilot-pjt/working/driver-realtime-log/SmartCarDriverInfo.log

### 스마트카 운전자 운행 로그 생성 및 확인(4/6)
  - 휴에 접속해 [메뉴] -> [HBase] -> [DriverCarInfo] 테이블을 선택해 실행일자의 운행데이터가 생성되었는지 확인 
  - HBase 브라우저 검색에 실행일자를 역변환한 로우키의 prefix "00000070111202"를 입력하면 등록된 로우키 목록이
    자동 완성되어 나타난다. 이 가운데 아무 로우키나 선택하고 뒤에 콤마(",")를 입력하고 [검색] 버튼을 클릭하면 해당 로우키
	스마트카 운전자의 실시간 운행 정보가 HBase에서 조회된다. 
	
### 스마트카 운전자 운행 로그 생성 및 확인(5/6)
  - 레디스 cli를 실행해 오늘 날짜로 과속한 스마트카 차량 정보를 확인한다.
    - $ redis-cli
    - 127.0.0.1:6379> smembers 실행일자(20211107)
  - 과속 차량이 3대 이상 발견되면 스마트카 운전자에 대한 운행 로그 시뮬레이터를 종료한다.

### 스마트카 운전자 운행 로그 생성 및 확인(6/6)
# 적재 테스트가 종료되면 원할한 자원 관리를 위해 수집/적재 서비스를 정지 시킴.
# 아래 순서로 정지
  - 플럼 서비스 : CM홈 -> [Flume] -> [정지]
  - 카프카 서비스: CM홈 -> [Kafka] -> [정지]
  - 스톰 서비스: server02 접속
    - $ service storm-ui stop
    - $ service storm-supervisor stop
    - $ service storm-nimbus stop
  - 레디스 서비스: server02에 ssh 접속 
    - $ service redis_6379 stop
  - HBase 서비스: CM홈 -> [HBase] -> [정지]  


6.6 탐색 파일럿 실행 4단계 - 03. 주제1-스마트카 상태정보 모니터링1
### 스마트카 상태 정보 모니터링 
  - 현재 하이브의 External에 '스마트카 상태 정보 데이터'가 적재되어 있음
  - 이 데이터를 우지 워크플로를 이용해 Managed 영역으로 매일 옮기고, 이때 '스마트카 마스터 데이터'와
    Join을 통해 데이터를 통합하는 작업을 한다.
  - 워크플로의 하이브 작업에 사용될 하이브 QL은 CH6/HiveQL/경로에서 확인

  - 우지 서비스 시작
    - CM 홈 -> [Oozie] -> [시작]

## 스마트카 상태 정보 모니터링 - 실습
# 주제 영역1 에서 사용할 작업 디렉터리를 만든다
  - 휴의 좌측 드롭박스 메뉴에서 [문서] 메뉴을 선택해 내 문서 기능을 실행
  - 하이브 스크립트 파일을 저장하기 위한 작업 폴더를 "workflow"라는 이름으로 생성
  - workflow 폴더 밑에 하위 작업 폴더로 "hive_script"를 추가로 생성
  - hive_script 폴더 밑에 하위 작업 폴더로 "subject1"을 생성 
  - hive_script 폴더 밑에 나머지 주제영역에서도 사용할 subjct2, subject3, subject4, subject5 폴더를
    각각 생성 
# 주제 영역1 에서 사용할 하이브 스크립트 파일 3개를 만든다. 먼저 내 문서에서 /workflow/hive_script/subject1
  위치로 이동 
  - [새문서] -> [Hive 쿼리] 선택
# 하이브 쿼리를 작성할 수 있는 에디터가 활성화 됨 
# 하이브 에디트 창에 DDL 문장을 입력하고 상단의 [저장] 버튼을 클릭. 파일 입력창이 나타나면 "create_table_managed_smartcar_status_info.hql"
  로 입력하고 [Save] 버튼을 클릭. 하이브 QL은 CH06/HiveQL/그림-6.69.hql 참조
# 계속해서 내 문서 /workflow/hive_script/subject1의 위치에 두 번째 하이브 스크립트 파일을 만듬
  - subject1 디렉터리에서 [새문서] -> [Hive 쿼리 선택]  
# 하이브 에디트 창에 External의 SmartCar_Status_Info 테이블에 작업일자(오늘날짜)를 기준으로 파티션 정보
  를 추가하는 스크립트를 작성한 후 저장한다. 파일 입력창이 나타나면 이름을 "alter_partition_smartcar_status_info.hql"
  로 입력하고 [Save] 버튼을 클릭 
# 내문서의 /worker/hive_script/subject1 위치에 세번째 하이브 스크립트 파일을 만든다
  - [새문서] -> [Hive 쿼리] 선택 

# 하이브 에디트 창이 활성화되면 먼저 동적 파티션을 생성하기 위한 하이브 환경변수 값을 설정해야 한다. 동적 파티션은
  지정된 특정 필드값을 기준으로 자동 파티션되는 기능인데, 다음의 옵션을 반드시 지정해야 한다.
  - set hive.exec.dynamic.partition = true;
  - set hive.exec.dynamic.partition.mode = nonstrict;
  
  동적 파티션 설정에 이어서 External 영역에 생성돼 있는 두 테이블인 SmartCar_Master_Over18과 
  SmartCar_Status_Info를 조인해서 조회된 데이터를 앞서 만든 Managed 테이블인 Managed_SmartCar_Status_Info에
  삽입하는 하이브 스크립트를 작성하고 [저장] 버튼을 클릭한다. 파일명은 "insert_table_managed_smartcar_status_info.hql"
  로 지정한다.

# 상단의 쿼리 콤보박스에서 [스케줄러] -> [Workflow]를 선택해서 실행할 워크플로를 만든다

# 첫번째 작업으로 주제 영역1의 데이터를 관리하기 위해 Managed 영역에 하이브 테이블을 만드는 작업을 추가한다.
  워크플로의 작업 툴 박스에서 "Hive 쿼리(HiveServer2 스크립트)" 작업을 워크플로의 첫번째 작업 노드에 
  드래그 앤드 드롭한다.

# 사용할 Hive 쿼리 스크립트 파일을 선택한다. 앞 단계에서 만든 내문서의 /workflow/hive_script/subject1에 
  만들어 놓은 create_table_managed_smartcar_status_info.hql을 선택한 후 [추가] 버튼을 만든다.
  
# 두 번째 작업으로 데이터를 가져올 External 영역의 SmartCar_Status_Info 테이블에 오늘 날짜로 파티션 정보를
  설정하는 하이브 작업을 만든다. 워크플로의 작업 툴박스에서 "Hive 쿼리" 작업을 워크플로우의 두 번째 작업노드에
  드래그 앤드 드롭한다.  
  
# 그림 6.71의 하이브 스크립트 안에서 정의한 작업일자(수집일자) 매개변수인 ${working_day}의 값을 그림 6.77의
  워크플로 매개변수와 연결한다. 이때 working_day 매개변수에 ${today}를 설정하는데, 이 값은 잠시후 우지의 
  예약 스케줄러에서 정의해 등록한다.
  - working_day=${today}

# 마지막 작업으로 첫번째 작업에서 만든 Managed_SmartCar_Status_Info 테이블에 데이터를 저장하기 위한 하이브
  작업을 만든다. 워크플로의 작업 툴박스에서 "Hive 쿼리" 작업을 워크플로의 네번재 작업 노드에 드래그 앤드 드롭한다.

# 사용할 Hive 쿠리 스크립트 파일을 선택한다. 앞 단계에서 만든 내 문서의 /workflow/hive_script/subject1에
  있는 insert_table_managed_smartcar_status_info.hql을 선택한후 [추가] 버튼을 클릭한다.
  
# 이번에도 하이브 스크립트 안에서 정의한 작업일자(수집일자)를 설정하는데 이 값은 잠시 후 우지의 예약 작업의 스케줄러
  설정 단계에서 정의한다.
  - working_day=${today}

# 워크플로의 이름을 지정한다. 워크플로 상단의 "My Workflow"를 클릭하고 "Subject1-Workflow" 변경한 후
  [확인] 버튼을 클릭한다.

# 워크플로 작성을 완료한다. 우측 상단의 [저장] 버튼을 누른다.

# 이제 작성한 워크플로를 작동하기 위한 예약 작업을 생성한다. 그림6.83처럼 상단의 쿼리 콤보박스에서 [스케줄러] -> [예약]을
  선택한다.

# 예약 작업의 이름을 "Subject1-예약"으로 입력한다.

# 예약 작업에서 사용할 워크플로를 선택한다. 앞서 만든 주제 영역1의 워크플로인 "Subject1-Workflow"를 선택한다.

# 예약 작업의 워크플로를 주기적으로 실행하기 위한 일종의 배치 잡 스케줄러다. 그림 6.86처럼 스케줄러 실행 주기와
  옵션 값을 설정한다. 시작일자와 종료일자는 파일럿 프로젝트 실습일자에 맞춰 입력한다.
  - 실행 간격 : 매일, 01시
  - 시작 일자 : 2021년 11월 21일, 00시 00분
  - 종료 일자 : 2021년 11월 30일, 23시 59분
  - 시간대 : Asia/Seoul

# 워크플로에서 사용할 매개변수인 today 값을 설정한다.
  - 앞서 워크플로의 하이브 작업에서 작업일자(수집일자) 매개변수를 "working_day=${today}로 등록했다. today의
    값을 예약 작업의 내장 함수를 통해 다음과 같이 설정한다.
	- ${coord:formatTime(coord:dateTzOffset(coord:nominalTime(),"Asia/Seoul"),'yyyyMMdd')}
	
# 우지의 예약 작업 설정이 모두 끝났다. [저장] 버튼을 누르고 작성을 완료한다.	
	
# 제출된 예약 작업 상태를 확인해 본다. 우측 상단의 [Job] 버튼을 클릭하고 잡 브라우저에서 [일정]을 선택한다. 앞서
  등록한 "Subject1-예약"이 설정한 스케줄러 시간에 따라 "PREP(준비), "Running(실행)" 상태 등으로 표기되며,
  매일 새벽 01시가 되면 등록된 워크플로가 작동하게 된다.
 
# 잡 브라우저에서는 등록된 잡의 현황, 진행 상태, 처리 이력과 결과 등을 확인할 수 있다.

# 특정 워크플로가 실행 중일 때는 그림 6.93처럼 작업 진행 상태를 프로그레스바로 곧바로 확인할 수 있다.

# 예약된 작업들이 활성화되어 실행될 때는 우측 상단에 [Job Browser]의 버튼 우측에 실행 중인 잡의 개수가 표시된다.
  [작업 미리보기]를 클릭하면 실행 중이거나 종료된 잡의 상세 정보를 확인할 수 있다.

# "Subject1-Workflow"가 정상적으로 작동했으면, 휴의 Hive Editor로 이동해서 그림 66.59와 같이 하이브 QL을
  작성해 실행한다. "biz_date=20200322"의 날짜는 독자들의 파일럿 환경의 실행 일자에 맞춰 입력한다.
  참고로 워크플로를 통해 만들어지는 managed_smartcar_status_info 같은 테이블이 하이브 편집기에서 곧바로
  표기되지 않아 하이브 편집기에서 해당 테이블 관련 쿼리를 실행할 때 에러가 발생할 수 있다. 이때는 하이브 테이블 
  목록 상단의 [새로고침] 버튼을 클릭해 테이블 목록을 새롭게 갱신한다.
  - select * from managed_smartcar_status_info where biz_date = '20200322' limit 10
 
# 실행 결과는 다음과 같다. 가장 우측 열의 biz_date 컬럼에 날짜가 "20200322"인 것을 확인할 수 있다.

# 한번 등록한 예약 작업은 종료 기간까지 계속 활성화된 상태로 남아 있게 되어 파일럿 환경의 리소스를 차지하게 된다.
  파일럿 환경에서는 매일 워크플로가 실행될 필요가 없으니 실행 및 테스트가 끝난 작업은 휴 좌측 드롭박스 메뉴의
  [Job] -> [일정]을 선택해 실행 중인 예약 작업들을 모두 중지시킨다.

# Tip
  - 테스트를 위해 워크플로를 즉시 실행할 수 있는 좀 더 쉬운 방법이 있다.
  - [내 문서]에서 실행할 워크플로를 선택하고 들어가 상단의 [수정] 버튼을 클릭하고 매개변수의 
    작업일자(매개변수: working_dat=YYYYMMDD)를 그림 6.87처럼 독자의 파일럿 상황에 맞춰 직접 입력한 후 상단의
	[저장] -> [제출] 버튼을 차례로 누르면 워크플로가 즉시 실행된다. 매개변수 설정이 필요없는 워크플로는 곱바로 
	[저장] -> [제출]을 선택하면 된다.
	- working_day=20200322

# [주제 영역별 매개변수 설정]
  - 주제영역1 : 플럼이 하둡에 적재한 날짜(개인별 실행중인 파일럿의 현재 작업일자 값으로, 모를경우 하둡 적재경로인
              "/pilot-pjt/collect/car-batch-log/wrk_date=YYYYMMDD"에 디렉터리의 날짜값을 이용한다.
              Server02에 접속해서 $ hdfs dfs -ls -R /pilot-pjt/collect/car-batch-log/
  - 주제영역2 : 스마트카 시뮬레이션 날짜(로그시뮬레이터 실행시 설정한 날짜로, 책기준 "20200322" 입력)		
  - 주제영역3 : 스마트카 시뮬레이션 날짜(로그시뮬레이터 실행시 설정한 날짜로, 책기준 "20200322" 입력)			  
  - 주제영역4 : 스마트카 시뮬레이션 날짜(로그시뮬레이터 실행시 설정한 날짜로, 책기준 "20200322" 입력)			  
  - 주제영역5 : 미사용

6.6 탐색 파일럿 실행 4단계 - 03. 주제1-스마트카 상태정보 모니터링2
# 실습 임.

  
6.6 탐색 파일럿 실행 4단계 - 03. 주제2-스마트카 운전자 운행기록 정보



7.3 분석 파일럿 실행 1단계 - 분석 아키텍처

7.4 분석 파일럿 실행 2단계 - 분석 환경 구성 
### 임팔라 설치 
  - Cloudera 에서 설치
  - Server02에 설치 
  - 휴에서 Impala Editor를 사용할 수 있도록 임팔라 서비스를 활성화
    - CM홈 -> [Hue] -> [구성]에서 검색에 "Impala"라고 입력하면 서비스 설정이 나타남
	- "Impala"와 "none"중에서 [Impala]를 선택하고 [변경내용 저장] 버튼을 누른다.
    - CM홈 -> [Impala] -> [재시작]
	- CM홈 -> [Hue] -> [재시작]
	- 휴 상단에 있는 쿼리 콤보박스에서 [편집기] -> [Impala] 메뉴가 새로 추가됐다.
	
### 스쿱 설치 
  - Cloudera 에서 설치
  - 스쿱은 1과 2가 있는데 파일럿 환경에서는 [Sqoop 1 Clinet]을 설치 
  - Server02에 설치
  - 스쿱1은 클라이언트로 서버가 기동되지 않는다.
  - 스쿱 메뉴에 활성화된 [클라이언트 구성 재배포] 버튼을 클릭해 설치를 완료한다.
  
### 제플린 설치 
  - 스파크를 웹 UI에서 사용
  - Cloudera에서 지원하지 않음.
  - 스파크 서비스 시작
    - 스파크 서비스 : CM홈 -> [Spark] -> [시작]
  - Server02에 접속해 제플린 0.8.2 아카이브 파일을 다운로드 한다.
    - $ cd /home/pilot-pjt/
    - $ wget http://archive.apache.org/dist/zeppelin/zeppelin-0.8.2/zeppelin-0.8.2-bin-all.tgz
  - 다운로드가 완료되면 tar 파일의 압축을 해제한다. /home/pilot-pjt/zeppelin-0.8.2-bin-all 경로에 생성
    - $ tar -xvf zeppelin-0.8.2-bin-all.tgz
    - $ ln -s zeppelin-0.8.2-bin-all zeppelin 
  - 제플린의 환경 정보를 설정한다.
    - $ cd /home/pilot-pjt/zeppelin/conf  
    - $ cp zeppelin-env.sh.template zeppelin-env.sh
  - 복사한 zeppelin-env.sh 파일을 열어서 제일 하단에 JAVA_HOME, SPARK_HOME, HADOOP_CONF 환경변수를 설정.
    - $ vi zeppelin-env.sh 
	  - export JAVA_HOME=/usr/java/jdk1.8.0_181-cloudera 
	  - export SPARK_HOME=/opt/cloudera/parcels/CDH/lib/spark 
	  - export HADOOP_CONF_DIR=/etc/hadoop/conf
  - 하이브의 임시 디렉터리를 제플린이 사용하기 위해 /tmp/hive 경로의 권한을 변경한다.
    - $ chmod 777 /tmp/hive
  - 제플린에서 하이브 인터프리터를 사용하기 위해 하이브 설정 파일을 복사해 놓는다.
    - $ cp /etc/hive/conf/hive-site.xml /home/pilot-pjt/zeppelin/conf 
  - 제플린 서버의 바인딩 주소를 127.0.0.1에서 0.0.0.0으로 변경해 외부(파일럿 PC의 브라우저)에서 제플린에 직접
    접속할 수 있게 설정한다. 추가로 서비스 포트는 8080에서 8081로 변경해 스파크 마스터 서비스의 포트(8080)와
	충돌하지 않도록 변경한다. 
	- $ cd /home/pilot-pjt/zeppelin/conf
	- $ cp zeppelin-site.xml.template zeppelin-site.xml
	- 복사한 zeppelin-site.xml 파일을 열어서 22 ~ 30번째 줄 사이에 있는 바인딩 주소와 포트번호를 변경한다.
	  - $ vi zeppelin-site.xml
	  - zeppelin.server.addr
	    - 변경전: 127.0.0.1    
		- 변경후: 0.0.0.0
	  - zeppelin.server.port
        - 변경전: 8080
        - 변경후: 8081	
  - 제플린 명령을 편리하게 사용하기 위해 root 계정의 프로파일에 패스를 설정한다.
    - $ vi /root/.bash_profile 
	- 프로파일에 "PATH=$PATH:/home/pilot-pjt/zeppelin/bin"을 추가한다.
	- $ source /root/.bash_profile 
  - 제플린 설치가 완료됨. 제플린이 정상적으로 설치되었는지 여부를 제플린을 구동해서 확인한다.
    - $ zeppelin-daemon.sh start 
  - 웹 브라우저를 열어 제플린의 시작 페이지에 접속해 정상적으로 설치됐는지 확인한다.
    - URL: http://server02.hadoop.com:8081/
	
### 머하웃 설치
  - 하둡의 분산환경에서 머신러닝을 지원하는 SW
  - Server02에 접속하고 아파치 머하웃(Mahout-0.13.0)을 다운로드 및 압축 해제한다.
    - $ cd /home/pilot-pjt/
    - $ wget http://archive.apache.org/dist/mahout/0.13.0/apache-mahout-distribution-0.13.0.tar.gz 
    - tar -xvf apache-mahout-distribution-0.13.0.tar.gz	
  - 머하웃 설치 위치에 편하게 접근하기 위해 링크를 설정한다.
    $ ln -s apache-mahout-distribution-0.13.0 mahout 
  - 프로파일을 수정해 환경변수를 설정한다. PATH와 JAVA_HOME 위치를 설정 
    - $ vi /root/.bash_profile 
    - PATH=$PATH:/home/pilot-pjt/mahout/bin 
      export JAVA_HOME=/usr/java/jdk1.8.0_181-cloudera 
    - source /root/.bash_profile 
  - 설치가 끝나고 아래 mahout 명령을 실행해 본다. 
    - $ mahout 
	
7.5 분석 파일럿 실행 3단계 - 임팔라로 실시간 분석
## 하이브 QL을 임팔라에서 실행하기 
# 휴의 쿼리 편집기에서 임팔라를 선택한다.

# 임팔라 에디터를 실행하면 가끔 데이터베이스가 표시되지 않을 때가 있다. 이때는 데이터베이스의 새로고침(Refresh) 버튼을 누른다.

# 임팔라 Editor에서 "운전 패턴 스마트카 정보" 하이브 QL를 실행하고 출력된 결과다. 기존 하이브에서 
  30초 이상 걸렸던 결과가 빠르게 조회되면서 대화형 분석이 가능해 진다.
  - select * from managed_smartcar_symptom_info where biz_date = '20211114'

# 6장의 주제영역에 대한 스카트카 분석 쿼리를 임팔라를 이용해 추가로 실행해 본다. 6장에서 하이브로 실행했을 때의
  탐색 시간과는 비교가 안 되게 빠른 속도로 데이터가 조회되는 것을 확인할 수 있다.
  - 긴급 점검이 필요한 스마트카 정보 조회
    - select * from managed_smartcar_emergency_check_info where biz_date = '20211114'
  - 스마트카 차량용품 구매 이력 정보 조회
    - select * from managed_smartcar_item_buylist_info where biz_month = '202003'
	
    
## 임팔라를 이용한 운행 지역 분석
# 임팔라 Editor에서 그림7.35의 쿼리를 입력하고 실행. 쿼리를 자세히 보면 Rank() 함수 등이 들어 있어 하이브에서
  실행하면 오버헤드가 큰 쿼리지만 임팔라를 이용하면 빠른 응답속도가 결과로 출력. 
  - 실행쿼리는 CH07/ImpalaSQL/ 에 있음.
  
# 정상적으로 실행됐다면 각 지역별로 가장 과속한 차량이 조회될 것이다.

# 차트 보기로 전체 데이터를 막대그래프로 전환해서 시각화한다.

## 인메모리 기반 분석 엔진 사용
  - 임팔라는 빠른 응답 속도를 보여 주지만 많은 리소스를 사용. 특히 메모리 사용률이 높은데, 분산 환경의 데이터를
    처리할 때 발생하는 중간 데이터 셋을 모두 메모리에 올려 놓고 작업하기 때문임. 반면 하이브는 중간 데이터셋을
    디스크에 저장해 느리지만 안정적이다. 빅데이터 하둡 환경에서는 임팔라와 하이브를 상황에 맞춰 선택적으로 사용해햐 함.
    마트화된 소규모 데이터셋을 대상으로 빠른 애드혹 분석을 수행할 때는 임팔라를 사용하고, 대규모 데이터셋에서 
    긴 시간 가공 및 추출 작업에는 반드시 하이브를 이용해야 한다. 임팔라 사용이 빈번하면 하둡 클러스터에 메모리
    오버헤드가 발생해 장애로 이어질 수 있다. 보통은 업무 마감 후 빅데이터웨어하우스의 대규모 배치 작업에는
    안정적인 하이브가 적합하고, 업무 시간 중에 마트 데이터를 대상으로 애드혹한 탐색적 분석에는 빠른 임팔라가 
    적합하다. 마트 데이터는 집계/요약된 작은 데이터셋으로, 임팔라 작업시 메모리에 대한 부담이 적기 때문이다.
    또한 이 같은 문제를 근본적으로 해결하기 위해 빅데이터 시스템을 배치계와 분석계로 분리 구성하고, 배치 처리된 
    데이터를 분석계에 주기적으로 복사하는 아키텍처를 만들기도 한다. 이때 DistCp라는 하둡 분산 카피 기술이 이용된다.
	
	
7.6 분석 파일럿 실행 4단계 - 제플린 실시간 분석
## 제플린을 이용한 운행 지역 분석
# 제플린이 구동됐는지 확인하고, 미 구동시 Server02에서 제플린 서버를 실행한다.
  - $ zeppelin-daemon.sh start
  - $ zeppelin-daemon.sh status # 제플린 상태 확인 

# 크롬 브라우저를 실행하고 제플린 환경에 접속해 화면을 확인하다.
  - URL: http://server02.hadoop.com:8081/  

# 제플린 NoteBook을 생성한다. Note Name에는 "SmartCar-Project"를 입력하고 Default Interpreter로는
  spark를 선택하고 [Create] 버튼을 클릭한다.

# 먼저 HDFS 명령어를 실행해 분석할 "스마트카 운전자의 운행" 파일을 확인한다. 노트부에서 셀 명령이 가능하도록
  바인딩하기 위해 "%sh"로 입력한 후 엔터키를 누른다.

# 하이브의 Managed 영역에 만들어져 있는 "스마트카 운전자 운행 정보" 파일을 확인하기 위해 다음 명령어를 입력하고
  오른쪽의 [실행] 버튼을 클릭하거나 단축키로 Shift+Enter를 이용한다.
  - hdfs dfs -cat /user/hive/warehouse/managed_smartcar_drive_info/biz_date=20211114/* | head

# 노트북에서 결과를 확인할 수 있다.  
  
# 앞의 HDFS 데이터셋 확인 명령이 끝나면 하단에 새로운 입력창(Paragraph)이 활성화 된다.

# 스파크의 스칼라 코드를 그림 7.43처럼 작성한다. 작성할 스칼라 코드는 HDFS에서 데이터를 로드하고, 로드한 데이터셋을
  대상으로 스파크에서 활용하기 위한 데이터 구조로 만드는 간단한 작업이다. 
  - 실행할 스파크-SQL은 CH07/Zeppelin-SparkSQL 에서 참고하며 입력이 완료되면 우측 상단의 [실행] 버튼을 누른다.

# 정상적으로 실행하면 메시지 확인.
  - 그림 7.43 예제의 마지막 줄을 보면 로드한 데이터셋을 스파크-SQL로 분석하기 위해 임시 테이블인 DriveInfo를
    생성한 것을 확인할 수 있다. 그럼 스파크-SQL을 실행하기 위해 "%spark.sql"을 입력하고 엔터키를 누른다.

# 스파크-SQL 쿼리를 입력하고 실행한다.
  - 스마트카다 운행한 지역의 평균 속도를 구하고, 평균 속도가 높은 순서대로 출력한다.

# 실행결과 확인

# 출력된 결과의 상단에 있는 차트 버튼을 누르면 다양한 형식의 차트를 재구성해 볼 수 있다.

# 또한 기존 스파크-SQL의 조건 변수를 설정해서 좀 더 효율적인 분석을 할 수 있다. Having 절을 추가해서 평균 속도에
  대한 동적 변수인 AvgSpeed를 정의학 실행해 보자.
  - 동적 변수 설정 : ${AvgSpeed=60}
  
## 제플린은 다양한 인터프리터(스파크, 하이브, 플링크, R, 카산드라 등)를 이용할 수 있다. 또한 제플린 인터페이스를
   구현해서 새로운 인터프리터를 추가 및 확장할 수 있고, 현재도 많은 인터피리터들이 개발 중이다.
   특히 제플린에서는 Spark-Group(spark, pyspark, spark.sql, spark.ml, spark.mahout, spark.r 등)
   을 쉽고 편리하게 사용할 수 있다는 것이 장점이라 할 수 있다.
   - 제플린 서비스 정지 
     - $ zeppelin-daemon.sh stop 

# 제플린을 이용하면 Spark를 쉽게 사용할 수 있다.	

7.7.7 분석 파일럿 실행 5단계
## 머하웃과 스파크ML을 이용한 머신러닝 
  - 머하웃과 스파크ML 같은 머신러닝 기술은 복잡도가 높은 비즈니스 로직을 자동으로 생성 및 관리하거나,
    대규모 단순 반복 작업에서 패턴들을 찾아 효율화하는데 사용된다. 이때 자동으로 만들어 진 프로그램을
    모델이라고 하며, 모델은 대규모 데이터에서 과거의 패턴을 찾아 정의하는 학습 과정을 통해 만들어 진다.
    학습이 완료된 모델에 현재의 데이터를 입력해서 앞으로 발생할 일들을 예측하면서 신속한 의사결정을 내리도록
    지원한다. 이번 장에서는 지급까지 수집, 적재, 처리한 스마트카의 데이터셋을 가지고 세 가지 마이닝 기버인
    추천, 분류, 군집 기능을 머하웃(추천)과 스파크ML(분류, 군집)을 이용해 좀 더 활용성 있는 분석을 진행한다.
    참고로 스파크ML의 작업 환경으로 제플린을 사용한다.

## 스마트카 차량용품 추천	
  - 머하웃 추천 - 스마트카 차량용품 추천
    - 데이터 마이닝의 추천에 사용될 데이터셋은 "스마트카 차량용품 구매 이력" 정보로서 하이브의 Managed 영역에
	  있는 Managed_SmartCar_Item_BuyList_Info 테이블에 약 10만건의 데이터가 적재돼 있다.
	  
# 먼저 "스마트카 용품 구매이력" 데이터를 머하웃의 추천기에서 사용 가능한 형식으로 재구성한 파일을 만들어야 한다.
  휴의 Hive Editor에서 다음 QL을 실행한다. (CH07/HiveQL/그림-7.52.hql)
  - insert overwrite local directory '/home/pilot-pjt/mahout-data/recommendation/input'
    ROW FORMAT DELIMITED
	FIELDS TERMINATED BY ','
	select hash(car_number), hash(item), score from managed_smartcar_item_buylist_info
	
# 추천기의 입력 데이터로 사용될 파일이 정상적으로 만들어 졌는지 확인한다. Server02에서 확인.
  - more /home/pilot-pjt/mahout-data/recommendation/input/*

# 이제 앞서 생성한 "000000_0" 파일을 머하웃 추천기의 입력 데이터로 사용하기 위해 HDFS에
  /pilot-pjt/mahout/recommendation/input/ 경로를 생성하고 "00000_0" 파일을 저장한다.
  - $ hdfs dfs -mkdir -p /pilot-pjt/mahout/recommendation/input
  - $ hdfs dfs -put /home/pilot-pjt/mahout-data/recommendation/input/* /pilot-pjt/mahout/recommendation/input/item_buylist.txt 
  
# 이제 머하웃의 추천 분석기를 실행한다. 머하웃의 주요 명령은 CH07/Mahout/에 있으니 활용한다.
  - $ mahout recommenditembased -i /pilot-pjt/mahout/recommendation/input/item_buylist.txt -o /pilot-pjt/mahout/recommendation/output/ -s SIMILARITY_COOCCURRENCE -n 3
  - 사용된 매개변수와 옵션은 다음과 같다.
    - i - 추천 분석에 사용할 입력 데이터
    - o - 추천 분석 결과가 출력될 경로 
    - s - 추천을 위한 유사도 알고리즘
    - n - 추천할 아이템 개수 	

# 분석 결과가 저장된 HDFS의 /pilot-pjt/mahout/recommendation/output/ 에 있는 파일을 휴의 파일 브라우저로
  열어서 확인한다. 해당 경로에는 두 개의 파일인 "part-r-00000", "part-r-00001"이 생성돼 있을 것이다. 이 가운데
  하나를 열어서 추천 결과를 확인한다.
  
# 추천 분석을 재실행할 때는 기존 결과 파일을 삭제한 후 재실행해야 한다. 아래 명령은 관련 삭제 명령이니 참고.
  이후 분류, 군집 분석에서도 같은 명령을 중복 실행할 때 이미 존재하는 파일(경로)이라는 에러가 발생할 수 있다.
  그때는 해당 경로의 파일을 삭제한 후 재실행한다.
  - $ hdfs dfs -rm -R -skipTrash /pilot-pjt/mahout/recommendation/output 
  - $ hdfs dfs -rm -R -skipTrash /user/root/temp 
  
7.7 분석 파일럿 실행 5단계 - 스파크 ML
## 스마트카 상태정보 예측(분류)
# 데이터 마이닝의 분류에 사용될 데이터셋은 "스마트카 상태 정보"로 하이브의 Manage 영역에 Managed_SmartCar_Status_Info
  라는 이름의 테이블에 약 200만건의 데이터가 적재되어 있다.
 
## 랜덤 포레스트(Random Forest) 알고리즘
  - 랜덤 포레스트는 학습을 통해 각각의 특징을 가지는 여러 개의 의사결정 트리를 앙상블로 구성하는 알고리즘이다.
    단일 의사결정 트리와 달리 모델의 오버피팅을 최소화하면서 일반화 성능을 향상시킨 머신러닝 기법이다.
  - 여러 의사결정 트리로부터 얻어진 결과를 모아 최종 분류값을 결정하는데 이때 평균을 이용하거나, 과반수 투표
    방식 등을 이용한다.
	
## 스마트카 상태정보 예측(분류)
#1. 하이브를 이용해 트레이닝 데이터셋을 만드는 작업을 한다. 먼저 "스마트카 상태 정보" 데이터를 머하웃 분류기의
  입력 데이터로 사용하기 위해 하이브로 재구성한다. 휴의 Hive Editor에서 다음의 QL을 실행
  - CH07/HiveQL/그림-7.60.hql
  
#2. 예측변수와 목표변수 값이 들어간 "스마트카 상태 정보" 입력 데이터셋이 정상적으로 만들어졌는지 확인
    - $ more /home/pilot-pjt/spark-data/classification/input/* 

#3. 분류기의 트레이닝 데이터셋을 만들기 위해 우선 두 개의 파일을 리눅스의 cat명령을 이용해 하나의 파일로 합쳐
    classification_dataset.txt라는 이름의 파일을 만든다.
    - $ /cd/home/pilot-pjt/spark-data/classification/input
    - $ cat 000000_0 000001_0 > classification_dataset.txt
	
#4. 스파크의 입력 데이터로 사용하기 위해 HDFS의 /pilot-pjt/spark-data/classification/input/ 경로를
    생성하고 classification_dataset.txt 파일을 저장한다.
    - $ hdfs dfs -mkdir -p /pilot-pjt/spark-data/classification/input
	- $ hdfs dfs -put /home/pilot-pjt/spark-data/classification/input/classification_dataset.txt
	    /pilot-pjt/spark-data/classification/input

#5. 스파크 머시러닝에 사용할 학습 데이터가 준비됐다. 파일럿 프로젝트에서는 스파크ML을 실행하기 위해 제플린을
    활용한다. 제플린이 종료됐으면 다음 명령어를 통해 제플린 서버를 실행하고, 크롬 브라우저를 통해 제플린 웹IDE
    에 접속한다.
    - $ zeppelin-daemon.sh restart 
    - 제플린 웹IDE URL: http://server02.hadoop.com:8081/
	
#6. 제플린 상단 메뉴의 [Notebook] -> [Create new note]를 선택하고 [Note Name]으로 "SmartCar-Classification"
    을 입력하고, [Default Interpreter]는 "spark"를 선택한 후 [Create] 버튼을 클릭한다.

#7. 이제 스파크ML 프로그래밍을 시작한다. 스파크ML은 크게 자바, 파이썬, 스카라로 개발할 수 있다. 파일럿 플그램에서는
    스칼라를 이용하겠다. 첫 번째 입력창(paragraph)에 사용할 라이브러리를 다음과 같이 입력하고 Shift+Enter 또는
    우측 상단의 [Run] 버튼으로 실행한다. 관련 전체 소스코드는 CH07/SparkML/SmartCar-Classification.scala를 참고한다.
	
#8. 하이브에서 생성해 둔 학습 데이터를 로드하고, 결과를 확인하기 위해 다음과 같이 코드를 입력한 후 실행 버튼을 
    클릭한다. 5개의 데이터가 조회된다.
    - val ds = spark.read.csv("/pilot-pjt/spark-data/classification/input/classification_dataset.txt")
    - ds.show(5)

#9. 다음 코드를 통해 이상징후 탐지 모델에 사용할 칼럼만 선택해 스파크 데이터셋을 새로 만든다.

#10. 다음 작업을 통해 문자형 카테고리 칼럼을 숫자형 칼럼으로 생성하고, 기존 칼럼은 삭제한다.

#11. 머신러닝에 사용할 변수를 벡터화해서 feature라는 필드에 새로 생성하고 해당 값들에 대해 스케일링 작업도 진행하는
     코드를 실행한다.

#12. 전처리 작업이 끝난 스파크 학습 데이터셋을 LibSVM 형식의 파일로 HDFS의 "/pilot-pjt/spark-data/classification/smartCarLibSvm"
     경로에 저장한다.

#13. LibSVM 형식으로 학습 데이터가 잘 저장됐는지 확인하기 위해 휴의 좌측 상단에 있는 드롭다운 메뉴를 클릭하고
     [브라우저] -> [파일]을 선택해 파일 브라우저에서 "/pilot-pjt/spark-data/classification/smartCarLibSvm" 경로에
     확장자가 .libsvm인 파일을 열어본다. 그림7.68에서 볼 수 있듯이 각 행마다 첫 번째 값이 레이블(0.0-정상, 1.0-비정상)이고,
     그 다음은 피처값으로 1~14번의 인덱스 번호가 붙은 스마트카 상태 데이터로서 1번의 car_capacity부터 14번의 battery 상태값으로
     구성돼 있다.

#14. 제플린의 스파크ML 컨텍스트로 해당 파일을 다시 로드한다.

#15. 레이블과 피처의 인덱서를 만들고, 전체 데이터셋을 학습(Training)과 테스트(Test) 데이터로 나누는 코드를 실행한다.

#16. 이제 랜덤 포레스트 머신러닝을 위한 파라미터를 설정한 후, 스파크ML 파이프라인을 만들고 Training 데이터셋으로 
     모델을 학습시킨다. 랜덤 포레스트 모델은 파일럿 프로젝트 특성상 5개의 트리로만 만든다. 모델 학습에는 약 3 ~ 5분
     정도의 시간이 걸린다.
     - 저사양 파일럿 환경 : 트리의 개수를 "5" -> "3"으로 조정한다.
     - setNumTree(3)

#17.모델 학습이 성공적으로 끝나면 다음 코드로 랜덤 포레스트 모델의 설명력을 확인해 본다. 총 5개의 트리가 만들어 졌고
    각 변수에 정의된 디시전 값을 확인할 수 있다.
	
#18. 모델 학습이 성공적으로 끝나면 테스트 데이터로 모델의 정확도를 확인해 보기 위한 평가기를 실행한다.
 	
#19. 데스트 데이터로 예측 정확도를 확인해 본다.

#20. 다음 코드로 스마트가의 정상/비정상 예측에 대한 Confusion Matrix를 확인할 수 있다.

## Precision(정밀도) - 모델이 비정상으로 분류한 스마트카 중에서 실제 비정상인 스마트카 비율
## Recall(재현율) - 실제 비정상인 스마트카 중에서 모델이 비정상 스마트카로 분류한 비율
## F1-Score - Precision과 Recall의 조화평균

#21. 다음 코드로 Precision, Recall, F1-Score에 대한 평가 결과를 확인할 수 있다.


7. 분석 파일럿 실행 5단계 - 03. 스마트카 고객 정보 군집
## 스마트카 고객정보 군집 분석1
# 데이터 마이닝 중 3번째인 군집 분석을 진행. 사용될 데이터셋은 "스마트카 고객 마스터 정보"로 하이브의
  External 영역에 SmartCar_Master 테이블이다.

# 머하웃 Canopy 분석
   - K-Means의 중요한 K값을 찾기 위해 Canopy 분석 
# 스파크ML K-Means 분석 

#01. 휴의 하이브 에디터로 "스마트카 마스터 정보" 데이터셋을 조회해서 로컬 디스크에 저장한다. 휴의 하이브 에디터
     에서 다음의 QL을 실행한다. "CH07/hiveQL/그림-7.82.hql 

#02. 군집분석을 하기 위한 "스마트카 사용자 마스터" 데이터셋이 정상적으로 만들어졌는지 확인하다. Server02에
     SSH로 접속하고 다음 명령을 실행해 내용을 확인한다.
  - $ more /home/pilot-pjt/mahout-data/clustering/input/*

#03. 머하웃의 Canopy 분석의 입력 데이터로 사용하기 위해 HDFS 상에 /pilot-pjt/mahout/clustering/input/
     경로를 생성하고 앞서 생성한 "스마트카 사용자 마스터" 데이터인 "000000_0" 파일의 이름을 "smartcar_master.txt"로
     변경해 HDFS에 저장한다.
  - $ hdfs dfs -mkdir -p /pilot-pjt/mahout/clustering/input/
  - $ cd /home/pilot-pjt/mahout-data/clustering/input
  - $ mv 000000_0 smartcar_master.txt
  - $ hdfs dfs -put smartcar_master.txt /pilot-pjt/mahout/clustering/input   
  
#04. HDFS에 정상적으로 적재되었는지 휴의 파일 브라우저로 확인

#05. 머하웃의 Canopy 분석을 하기 위해서는 원천 파일이 시퀀스 파일이어야 한다. HDFS에 적재한 고객 마스터 데이터인
     "smartcar_master.txt" 파일은 텍스트 파일 형식이므로 시퀀스 파일로 변환한다. 시퀀스 파일은 키/값 형식의
     바이너리 데이터셋으로 분산 환경에서 성능과 용량 면에서 효율성을 높인 데이터 포맷이다. 이번 군집분석에서는 시퀀스
     파일의 키를 차량 번호로 하고, 나머지 사용자 마스터(차량연도, 차량 용량, 모델, 나이, 연령 등)를 값으로 구성하기
     위해 간단한 시퀀스 파일 변환 프로그램인 "com.wikibook.bigdata.smartcar.mahout.TextToSequence"를
     이용한다. 소스 프로그램은 "workplace/bigdata.smartcar.mahout에 있으니 참고.
     TextToSequence 프로그램을 실행하기 위해 사전에 빌드해 놓은 bigdata.smartcar.mahout-1.0.jar 파일을
     Server02의 /home/pilot-pjt/mahout-data에 업로드한다.
  - FTP를 통해 Server02에 접속 
  - 머하웃 작업 경로 : /home/pilot-pjt/mahout-data 
  - "CH07/bigdata/smartcar.mahout-1.0.jar 파일을 /home/pilot-pjt/mahout-data에 업로드 

#06. 텍스트 형식의 "스마트카 사용자 마스터" 파일을 시퀀스 파일로 변환한다. 변환 대상은 앞서 HDFS에 저장해 둔 
     /pilot-pjt/mahout/clustering/input/smartcar_master.txt 파일이고, 변환 결과는 HDFS의
     /pilot-pjt/mahout/clustering/output/seq에 생성된다.
  - $ hadoop jar /home/pilot-pjt/mahout-data/bigdata.smartcar.mahout-1.0.jar com.wikibook.
    bigdata.smartcar.mahout.TextToSequence /pilot-pjt/mahout/clustering/input/smartcar_master.
    txt /pilot-pjt/mahout/clustering/output/seq 

#07. 변환된 시퀀스 파일을 휴의 파일 브라우저를 통해 확인해 보자. 해당 경로에 part-m-00000이라는 이름의 시퀀스 파일이
     생성됐을 것이다. 파일을 클릭해도 바이너리 형식으로 내용은 확인할 수 없다.
  - 참고로 시퀀스 파일의 내용을 확인하기 위해 다음의 HDFS 명령을 이용할 수 있다.
    - $ hdfs dfs -text /pilot-pjt/mahout/clustering/output/seq/part-m-00000  

#08. 시퀀스 파일로 변환된 스마트가 마스터 데이터를 확인했으면 해당 시퀀스 파일을 로우별(차량번호)로 n-gram 기반의
     TF(Term Frequency) 가중치가 반영된 벡터 데이터로 변환한다. n-gram의 벡터 모델은 단어의 분류와 빈도 수를
     측정하는 알고리즘 정도로 이해하자. 여기서는 차량번호별 각 항목의 단어를 분리해 벡터화하기 위해 사용하겠다.
     다음 명령을 실행해 스마트카 마스터 데이터를 다차원의 공간 벡터로 변환해 HDFS의 /pilot-pjt/mahout/clustering/output/vec에
	 생성한다.
  - $ mahout seq2sparse -i /pilot-pjt/mahout/clustering/output/seq -o /pilot-pjt/mahout/clustering/
      output/vec -wt tf -s 5 -md 3 -ng 2 -x 85 --namedVector
  - 옵션 설명 
    - wt : 단어 빈도 가중치 방식
	- md : 최소 문서 출현 횟수 
	- ng : ngrams 최댓값 
	- namedVector : 네임벡터 데이터 생성
  - 맵리듀스 잡이 여러 차례 실행되고 벡터 데이터가 정상적으로 만들어지면 휴의 파일 브라우저를 통해 
    /pilot-pjt/mahout/clustering/output/vec 경로에 df-count, df-vector 등의 디렉터리와 파일이 
    생성돼 있음을 확인할 수 있다. 

#09. Canopy 군집분석으로 최적의 군집 개수를 파악하기 위해서는 센트로이드로부터 거리를 나타내는 t1, t2 옵션을 바꿔가며
     반복적인 군집분석을 수행해야 한다. 다음과 같음 명령을 첫번째 Canopy 군집분석을 실행해 본다.
  - $ mahout canopy -i /pilot-pjt/mahout/clustering/output/vec/tf-vectors/ -o 
      /pilot-pjt/mahout/clustering/canopy/out -dm org.apache.mahout.common.distance.
      SquaredEuclideanDistanceMeasure -t1 50 -t2 45 -ow
  - 적용된 옵션 
    - i : 벡터 파일 경로 
    - o : 출력 결과 경로 
    - dm : 군집 거리 측정 알고리즘 
    - t1 : 거리값1
    - t2 : 거리값2 
	
  - Canopy 군집분석이 정상적으로 수행되면 HDFS의 /pilot-pjt/mahout/clustering/canopy/out/ 경로에 
    clusters-xx-final이라는 디렉터리가 만들어지고 그 안에 결과 파일이 생성돼 있을 것이다.
    첫 번째 실행에서 "t1=50, t2=45"로 설정하고, 유사도 거리 측정을 위해 SquareEuclideanDistanceMeasure
    를 사용했다. 참고로 Canopy 군집부석에서는 t1, t2의 길이가 그림 7.89처럼 "t1 > t2"이어야 하고, 중심점으로부터 
    "t2"의 반경 안에 있는 데이터는 해당 군집의 데이터로 확정되며, "t2"와 "t1" 사이에 데이터는 다른 군집 영역에 다시 
    포함되어 다른 군집의 데이터로 취급될 수 있다. 

#10. Canopy 군집분석 결과를 다음 명령어로 확인한다.
  - $ mahout clusterdump -i /pilot-pjt/mahout/clustering/canopy/out/clusters-*-final 
  - 그림 7.90에서 보면 Canopy 군집분석 결과 1개의 군집이 만들어졌다. 만약 1개의 군집으로 분석됐다면 t1, t2의
    초기값을 너무 크게 잡은 것이다. 
  - t1:50, t2:45, 클러스터 개수:1

#11. t1, t2의 값을 각각 10, 8로 설정한 후 실행
  - $ mahout canopy -i /pilot-pjt/mahout/clustering/output/vec/tf-vector/ -o 
      /pilot-pjt/mahout/clustering/canopy/out -dm org.apache.mahout.common.distance.
      SquareEuclideanDistanceMeasure -t1 10 -t2 8 -ow
  - Canopy 군집분석에 대한 실행 결과를 다음 명령어로 확인
    - $ mahout clusterdump -i /pilot-pjt/mahout/clustering/canopy/out/clusters-*-final 
  
#12. t1, t2의 값을 각각 12, 10로 설정한 후 실행
  - $ mahout canopy -i /pilot-pjt/mahout/clustering/output/vec/tf-vector/ -o 
      /pilot-pjt/mahout/clustering/canopy/out -dm org.apache.mahout.common.distance.
      SquareEuclideanDistanceMeasure -t1 12 -t2 10 -ow
  - Canopy 군집분석에 대한 실행 결과를 다음 명령어로 확인
    - $ mahout clusterdump -i /pilot-pjt/mahout/clustering/canopy/out/clusters-*-final 
  - 148개의 군집이 생성. 분석 요건과 데이터의 성격에 따라 적절한 군집의 개수를 판단.

	
## 스마트카 고객정보 군집 분석2
#13. Canopy 군집분석에서 나온 클러스터 수(148)를 참고해서 다음에 진행할 K-Means 군집의 K값을 "148"보다 좀
     더 큰 값인 "200"으로 확정한다. K-Means 분석은 제플린에서 스파크ML을 이용한다. 먼저 제플린이 종료됐다면
     다음 명령어를 통해 제플린 서버를 실행하고, 크롬 브라우저를 통해 제플린 웹IDE에 접속한다.
  - $ zeppelin-daemon.sh start
  - 제플린 웹IDE URL: http://server02.hadoop.com:8081/

#14. 제플린 상단 메뉴의 [Notebook] -> [Create new note]를 선택하고 [Note Name]은 "SmartCar-Clustering"으 
     로 입력하고 [Default Intercepter]는 "spark"를 선택한 후 [Create] 버튼을 클릭한다.

#15. 첫 번째 입력창(Paragraph)에 사용할 라이브러리를 다음과 같이 입력하고 Shift+Enter 또는 우측 상단의 [Run]
     버튼으로 실행한다. 관련 전체 소스코드는 CH07/SparkML/SmartCar-Clustering.scala를 참고한다.

#16. 하이브에서 생성해 둔 스마트카 마스터 데이터셋을 로드하고, 결과를 확인하기 위해 다음과 같이 코드를 입력한 후
     실행 버튼을 클릭한다. 5개의 데이터가 조회된다.
  - val ds = spark.read.option("delimiter", " ").csv("/pilot-pjt/mahout/clustering/input/smartcar_master.txt")
  - ds.show(5)

#17. 다음 코드를 실행해 스마트카 마스터 데이터셋의 컬럼명, 타입 등을 재구성한다.
  - val dsSmartCar_Master_1 = ds.selectExpr(
                              "cast(_c0 as string) car_number",
							  "cast(_c1 as string) car_capacity",
							  "cast(_c2 as string) car_year",
							  "cast(_c3 as string) car_model",							  "cast(_c4 as string) car_number",
							  "cast(_c5 as string) sex",
							  "cast(_c6 as string) marriage",
							  "cast(_c7 as string) job",
							  "cast(_c8 as string) region"
							  )

#18. 다음 작업을 통해 문자형 카테고리 컬럼을 숫자형 컬럼으로 생성해 새로운 컬럼으로 추가한다.

#19. 앞선 머하웃의 Canopy 분석의 결과 중 스마트카 마스터 데이터에서 유효한 변수(차량용량, 차량연식, 차량모델, 
     운전자성별, 운전자결혼여부)만 선정해 클러스터링의 Features 변수로 사용한다.

#20. 기존 필드를 삭제하고 재구성된 스마트카 마스터 데이터셋을 확인해 본다. 이제 스파크ML을 이용해 K-Means 군집
     분석을 하기 위한 데이터 전처리 작업이 끝났다.
	 
#21. 다음 코드로 K-Means 군집 분석을 실행한다. 군집(클러스터)의 개수는 앞선 머하웃의 Canopy 분석에서 얻은 결과에
     따라 200을 설정한다.

#22. K-Means 군집의 결과를 다음 코드를 실행해 확인해 본다. 출력된 결과 중 prediction 필드는 군집 번호로서 
     0번 ~ 199번까지 총 200개의 군집을 나타내며, car_number 필드는 각 군집번호에 포함된 차량번호를 나타낸다.
	 
#23. 군집 모델의 정확도를 평가하기 위해 다음 코드를 실행해 평균 실루엣(Silhouette) 스코어를 확인해 본다. 실루엣
     스코어는 -1 ~ 1의 값을 가지며 각각 다음과 같은 의미를 가진다.
  - -1에 가까운 값 : 잘못된 군집에 포함된 개체가 많음
  -  0에 가까운 값 : 군집에 포함되지 않은 개체가 많음
  -  1에 가까운 값 : 군집에 포함된 개체가 많음
  즉, 1에 가까운 값일수록 좋은 군집 모형일 가능성이 높다. 그림 7.104를 보면 실루엣 스코어가 0.85로, 비교적 좋은 
     군집 모델로 평가될 것으로 예상된다.

#24. 군집된 결과를 데이터 탐색 과정을 통해 좀 더 분석해 보자. 앞서 군집 결과인 그림 7.103을 보면 1번 군집에 15개의
     차량 번호가 군집됐다. 15개의 차량 번호를 임팔라의 쿼리로 조회해서 어떤 특징이 있는지 확인해 본다. 휴를 실행해
     상단의 쿼리콤보에서 [편집기] -> [Impala]를 선택한 후 임팔라 편집기에서 다음 쿼리를 실행한다.	

#25. 조회 결과인 그림 7.106을 보면서 군집 1번의 특징을 파악해 보자.
  - 고객 성향 : 1번 군집은 50 ~ 60대의 기혼 남성들로, 스마트카 F모델 차량을 선호한다.
  - 소득 추정 : 1번 군집에 속한 고랙군의 차량은 1500CC 이하의 차랴으로, 소득 수준이 낮을 것으로 추정된다.
  - 분석 결과 : 스마트카를 신규 구입하거나 재구매할 가능성이 있는 50 ~ 60대 기혼 남성 고객을 대상으로 저가형 
              스마트카 F모델을 타깃 마케팅한다.


7.8 분석 파일럿 실행 6단계 - 스쿱 
## 분석 결과 외부 제공
# 빅데이터시스템에서 외부 RDBMS로 또는 반대로 데이터를 Import, Export 함.

## 스쿱의 내보내기 기능 - 이상 운전 차량 정보
# 사용할 DBMS 정보 및 환경 설정
  - RDBMS 유형 : PostgreSQL
  - 설치 IP : 192.168.56.101
  - 설치 포트 : 7432
  - 데이터베이스 : postgresql 
  - 접속 계정 : cloudera-scm
  - 접속 패스워드 : vsqBur5ygT
    - 패스워드이 경우 독자들의 파일럿 환경마다 다소 차이다 있다. Server01에 접속해 다음 명령으로 확인하다.
	- $ cat /var/lib/cloudera-scm-server-db/data/generated_password.txt

#1. PostgreSQL에 콘솔로 접속해서 기본적인 데이터베이스 작업을 진행한다. 먼저 Server01의 SSH를 통해 접속한 후
    다음 명령으로 PostgreSQL 데이터베이스에 연결한다.
  - $ psql -U cloudera-scm -p 7432 -h localhost -d postgres 
  - 패스워드 입력창이 나타나면 그림 7.108에서 확인한 패스워드를 입력. 
    - vsqBur5ygT

#2. HDFS에 "이상 운전 패턴" 데이터를 PostgreSQL의 테이블로 저장하기 위한 RDBMS 테이블을 생성.
    테이블 명은 samartcar_symptom_info로 한다.
  - postgres=# create table smartcar_symptom_info(
       car_number      varchar,
       speed_p_avg     varchar,
       speed_p_symptom varchar,
   	   break_p_avg     varchar,
	   break_p_symptom varchar,
	   steer_a_cnt     varchar,
	   steer_p_symptom varchar,
	   biz_date        varchar
	   );

  - select 쿼리를 실행해서 정상적으로 생성됐는지 확인해 본다.
    - postgres=# select * from smartcar_symptom_info;
#3. Server01에서 스쿱 명령을 실행하기 위해 새로운 SSH 창을 하나 더 열어 Server01에 접속. 먼저 스쿱 명령을
    실행하기 위해서는 PostgreSQL JDBC 드라이버를 스쿱의 라이브러리 경로에 복사해 놓아야 한다. 
    - $ cp /opt/cloudera/parcels/CDH/jars/postgresql-*.jar /opt/cloudera/parcels/CDH/lib/sqoop/lib
  - 다음으로 내보내기 명령을 실행한다. 
    - $ sqoop export --connect jdbc:postgresql://192.168.56.101:7432/postgres --username cloudera-scm 
	    --password vsqBur5ygT --table smartcar_symptom_info --export-dir /user/hive/warehouse/managed_smartcar_symptom_info 
	- --username : PostgreSQL 계정
    - --password : PostgreSQL 패스워드
    - --table : PostgreSQL 데이터베이스 테이블명 
    - --export-dir : 내보내기 할 HDFS 데이터 경로 
  - 내보내기 확인
    - postgres=# select * from smartcar_symptom_info;

## 스쿱을 활용할 떄 주의할 점 
  - 일반적으로 RDBMS는 중요 업무 시스템의 온라인 서비스 저장소로 사용되는데, 이때 스쿱의 대규모 Export/Import 맵(Map) 작업들이
    RDBMS에 연결되면서 큰 오버헤드를 발생시킬수 있기 때문이다. 예를 들어, 100대의 하둡 데이터노드가 있고, 스쿱 명령으로 대규모 데이터에 
    대한 가져오기/내보내기를 할 경우 최악의 경우에 100대의 서버에서 동시에 Map 작업이 생성되어 RDBMS로 연결된 JDBC 작업이 수행될 수 있기 
    때문이다. 이로 인해 RDBMS의 자원 점유율이 커지고 RDBMS를 사용하는 중요 온라인 시스템 서비스에 영향을 줄 수 있다.
    스쿱의 실행 옵션 중 --split-by 또는 --num-mappers를 이용하면 문제를 최소화할 수 있으니 참고.

	
8.1 분석환경 확장 개요
## 분산환경 분석 도구 Vs. 외부환경 분석 도구 
## 분산 환경을 지원하는 분석 도구 
  - 외부 독립형 분석 도구의 단점은 대용량 데이터를 이용한 분석 및 학습에 과도한 시간이 소요된다는 것이다. 최근에는 GPU 파워를 이용해 
    빠른 연산은 가능해졌으나 대용량 데이터 로드에 발생하는 I/O 오버헤드와 자원(CPU/메모리) 증설 한계는 피할 수 없다. 이 같으 이유로
    최근 들어 독립형 방식의 분석 도구도 대규모 분산환경(스케일아웃 방식)을 지원하기 위한 다양한 시도를 하고 있다.
    텐서프로는 지난 2016년 4월경 텐서플로 분산 버전을 공식적으로 출시했고, R은 오래전부터 RHive를 통해 하둡 분산 환경에서 분석
    작업을 수행할 수 있도록 지원해 왔다.
    하지만 분산 분석 환경의 경우 요청 작업을 여러 대의 서버에 나누어 실행해야 하고, 그 결과를 다시 하나로 모으는 맵/리듀스 메커니즘
    (그림4.4 참고)이 기본적으로 요구된다. 이러한 이유로 분산 환경에서 기존 분석 알고리즘이 작동하기 위해서는 프로그램 수정과 복잡도가 
    증가하며 환경에 대한 호환성 문제를 고려해야 한다.
    사용하려는 분석 도구와 라이브러리의 분산 컴퓨팅 지원 여부는 관련 소프트에어의 공식 사이트에서 확인한 후 사용하기 바란다.
    참고로 대표적인 분산 환경인 아파치 스파크(http://spark.apache.org)에서 지원하는 주요 머신러닝 알고리즘(MLlib)은 다음 표와 같다.
  - Classification(분류)
    - Logistic regression
	- Decision tree classifier
	- Random forest classifier
	- Gradient-boosted tree classifier 
	- Multilayer perceptron classifier 
	- Linear Support Vector Machine 
	- One-vs-Rest classifier(a.k.a One-vs-All)
	- Naive Bayes
  - Clustering(군집)
    - K-Means
	- Latent Dirichlet allocation(LDA) 
	- Bisecting k-means
	- Gaussian Mixture Model(GMM)
  - Regression(회귀)
    - Linear regresion
	- Generalized linear regression
	- Available families
	- Decision tree regression
	- Random forest regression
	- Gradient-boosted tree regression
	- Survival regression
	Isotonic regression 
	
# R을 이용한 회귀분석 - 스마트카 배기량에 따른 운전자의 연소득 예측 
# 텐서플로 이용한 신경망 분석 - 주행 중 스마트카의 사고 위험 징후 판별
# 예측 모델 API 구성 - 딥러닝 모델을 웹서비스 REST API로 구성 


8.2 R을 이용한 회귀분석 - 운전자 연소득 예측 
## 스마트카 배기량에 따른 운전자 연소득 예측 
  - 로컬 파일 -> 하이브 -> RJDBC -> R 

## 선형 회귀분석의 기본 원리
  - 선형 회귀분석을 깊게 이해하려면 여러가지 수학적 회귀 공식과 통계 기법 이론이 필요하지만 기본 원리만 알고 있어도 
    선형 회귀분석을 구현하는 데 크게 어려움이 없다. 선형 회귀분석은 그림8.3에서 보는 것처럼 입력값(X)와 결과값(Y)의 
    데이터 관계가 선형을 이루는 건 알고 있지만 정확한 기울기 값을 정의하는 모델을 찾고자 할 때 사용한다. 
  - 예를 들면, 임의의 회귀선을 긋고 기울기와 편향값이 업데이트되면서 회귀선이 이동하는데, 각 점간의 거리에 대한 평균값이
    최소가 되는 회귀선에서 이동을 멈추게 되고 이 선이 최적의 선형 회귀 모델이 되는 것이다.

## 로지스틱 회귀분석의 기본 원리 
  - 로지스틱 회귀분석도 선형 회귀분석과 유사한 방식을 사용하나 회귀선이 아닌 결과값을 "0"과 "1"로 가지는 
    시그모이드 함수를 쓴다는 차이점이 있다. 그림 8.4와 같이 임의의 시그모이드 선을 긋고 각 점 간의 거리에 대한 평균 또는
    엔트로피를 비교해 가며 최적의 로지스틱 회귀 모델을 찾는다.

## R설치 및 환경구성
  - R 다운로드 및 설치: https://www.r-project.org
  - R-studio 다운로드 및 설치 : https://www.rstudio.com/

## 분석 데이터셋 생성
#1. "스마트카 고객 마스터2" 파일을 Server02로 업로드한다.
  - FTP 클라이언트 파일질라 실행
  - 파일럿 작업경로 : /home/pilot-pjt/working 
  - CH08/CarMaster2Income.txt 파일을 /home/pilot-pjt/working에 업로드 

#2. Hue에서 하이브 에디터에 접속해 SmartCar_Master2Income 테이블을 생성한다. 이때 스마트카 배기량(car_capacity)과
    연소득(income) 필드의 데이터 타입은 int(숫자형)로서 각각 회귀분석의 독립변수와 종속변수로 사용된다. 
  - 테이블 생성문 : CH08/그림-8.7.hql 
  

#3. 로컬 파일시스템에 적재된 "스마트카 고객 마스터2.txt" 파일을 앞서 생성한 하이브 테이블인 SmartCar_Master2Income에
    직접 로드한다.
  - LOAD DATA LOCAL
           INPATH '/home/pilot-pjt/working/CarMaster2Income.txt'
           OVERWRITE INTO TABLE SmartCar_Master2Income;

#4. 하이브 테이블에 로컬파일이 정상적으로 로드됐는지 조회 쿼리를 실행해 본다.
  - select car_number, car_capacity, income from SmartCar_Master2Income;


## 하이브 클라이언트 라이브러리 구성
#1. 사용자의 파일럿 PC에 하이브 클라이언트 라이브러리를 관리하기 위한 두 개의 디렉터리를 생성한다.
  - c://hiveJar 디렉터리를 생성한다.
  - c://hadoopJar 디렉터리를 생성한다.

#2. Server02로 부터 관련 라이브러리를 다운로드한다. 총 8개의 Jar 파일로 하이브 클라이언트 라이브러리 파일 5개와 
    하둡 클라이언트 라이브러리 파일 3개다. 먼저 Server02에 FTP로 접속해 하이브 클라이언트 라이브러리 파일 5개를 
    c://hiveJar 디렉터리에 다운로드 한다.
  - 하이브 클라이언트 라이브러리
    - 경로 : /opt/cloudera/parcels/CDH/jars/
    - 파일 : hive-jdbc-2.1.1-cdh6.3.2.jar, hive-service-2.1.1-cdh6.3.2.jar, httpclient-4.5.3.jar,
            httpcore-4.4.6.jar, hive-jdbc-2.1.1-cdh6.3.2-standalone.jar 
  - 하둡 클라이언트 라이브러리 
    - 경로 : /opt/cloudera/parcels/CDH/jars/
    - 파일 : hadoop-common-3.0.0-cdh6.3.2.jar, libthrift-0.9.3.jar, hadoop-client-3.0.0-cdh6.3.2.jar

## 하이브 데이터 로드 
#1. R-Studio 실행

#2. 필요한 R 패키지 "DBI", "rJava", "RJDBC"를 추가로 설치한다. 다음 명령을 R 콘솔에서 차례로 실행한다.
    R 패키지 설치 명령을 실행하면 CRAN(The Comprehensive R Archive Network)에서 직접 다운로드하므로
	인터넷이 연결된 상태여야 한다.
  - > install.packages("DBI")
  - > install.packages("rJava")
  - > install.packages("RJDBC") 
  - > install.packages("log4r")
  
#3. 추가 패키지 설치가 완료되면 설치된 패키지의 라이브러리를 로드한다.
  - > library("DBI")
  - > library("rJava")
  - > library("RJDBC")
  - > library("log4r")

#4. 이제 파일럿 환경의 하이브 데이터웨어하우스에 접속해 "스마트카 고객 마스터2" 테이블인 "SmartCar_Master2Income"
    테이블을 확인해 보겠다. 앞서 hiveJar와 hadoopJar 디렉터리를 R의 클래스패스로 설정했다.
	다음의 R 명령은 "CH08/R명령.txt"로 제공하니 참조.

#5. 하이브의 JDBC 드라이버를 로드하고 Server02에 설치돼 있는 하이브 서버2로 접속한다. 이때 접속 계정과 비밀번호는 
    브라우저를 통해 "http://server01.hadoop.com:7180/api/v11/clusters/Cluster 1/services/hive/config"
    에 접속하면 확인할 수 있다. - admin/admin  
	- 계정 : hive1/jXWW8OXx6i

  - 다음 명령을 통해 하이브 JDBC를 로드하고 하이브 서버 2에 연결한다.
    - > drv <- JDBC("org.apache.hive.jdbc.HiveDriver", "C://bigdata/hiveJar/hive-jdbc-2.1.1-cdh6.3.2.jar",identifier.quote="`")
    - > conn <- dbConnect(drv, "jdbc:hive2://server02.hadoop.com:10000/default", "hive1","jXWW8OXx6i")
  
#6. 하이브의 데이터웨어하우스에 생성된 테이블 목록을 조회한다. 참고로 저자의 경우 "Smartcar_Master2Income"
    테이블만 조회했지만 6, 7장에서 만든 다른 하이브 테이블도 조회가 가능하다.
  - > dbListTables(conn);

#7. 여기까지 성공적으로 진행되면 이제 하이브의 "스마트카 고객 마스터2" 테이블에 질의하고 내용까지 확인해 보자.
  - > data <- dbGetQuery(conn, "select * from smartcar_master2income")
  - > View(data) 
  

8.2 R을 이용한 회귀분석 - 운전자 연소득 예측 
## 데이터 탐색 및 회귀분석 생성 
#1. 먼저 히스토그램과 박스플롯 명령으로 "income" 데이터의 분포도를 파악하고, Q-Q 플롯 기능을 이용해 정규성을 
    확인한다.
  - > hist(data$smartcar_master2income.income)
  - > boxplot(data$smartcar_master2income.income)
  - > qqnorm(data$smartcar_master2income.income)
  - > qqline(data$smartcar_master2income.income)  
  
#2. 이제 "스마트카 고객 마스터2" 데이터셋을 트레이닝 데이터셋으로 삼아 스마트카의 배기량에 따라 운전자의 연소득을 
    예측하는 회귀모델을 만들고 그 결과를 확인해 보자.
  - > model <- lm(data$smartcar_master2income.income~smartcar_master2income.car_capacity, data=data)
  - > summary(model) 

#3. 이제 생성된 회귀모델을 테스트해 보자. 테스트 데이터로 "CH08/CarMaster2Income_Test.txt" 파일을 이용한다.
    총 30건의 데이터가 있으며 스마트카의 배기량 정보화 운전자의 연소득 정보 등으로 구성돼 있다. 여기서 스마트카 배기량 
    데이터 30건을 앞서 만든 회귀모델에 입력해 운전자의 연소득을 예측해 본다. 그리고 그 예측 결과를 운전자의 실제 여소득과 
    비교해서 회귀모델에 대한 정확도를 확인한다.
  - CH08/CarMaster2Income_Test.txt 파일을 "c://bigdata/test_data" 디렉터리를 만들어 복사한다.
  - > test_data <- read.csv("c://bigdata/test_data/CarMaster2Income_Test.txt", sep="|", 
      header=T, encoding="UTF-8")
  - > predict(model, test_data, interval="prediction")

8.3 텐서플로 신경망 분석 - 스마트카 이상 징후
## 주행 중 스마트카 위험 징후 판별(분류)
# 로컬파일 -> CSV 로더 -> 텐서플로/케라스 -> 텐서보드
                                  -> 플라스크(웹애플리케이션)

## 신경망 딥러닝의 기본 원리 
  - 신경망 분석의 매커니즘을 간단하게 알아보자. 신경망의 구성요소는 크게 입력층, 은닉층, 출력층으로 이뤄지며, 각각의
    층은 뉴런(활성화 함수)으로 구성된다. 또한 은닉층의 레이어와 뉴런의 구성 방식에 따라 DNN, RNN, CNN 등으로 
    신경망의 종류가 나뉜다.

## 설치 및 환경 구성
  - 아나콘다(Anaconda) 설치: https://continuum.io/downloads
  - 텐서플로 설치(파이썬 pip 명령으로 설치) 

## 개발 환경 실행 
#1. Anaconda3에서 Anaconda Prompt를 실행한다. 기본 설정대로 설치했다면 [시작] -> [모든 프로그램] ->
    [Anaconda3(64-bit)] -> [Anaconda Prompt]를 차례로 선택해 실행할 수 있다. 

#2. 다음 명령으로 파이썬3.5 환경을 구성한다. 환경의 이름은 "py35"로 지정한다.
  - (base) c:\Users\[사용자명]> conda create -n py35 python=3.5
 
#3. 파이썬 3.5 환경을 활성화한다. 파이썬 3.5 환경의 이름을 "py35"로 지정했으므로 "active py35"를 입력한다.
    참고로 아나콘다 프롬포트는 독자의 PC 환경에 따라 다르게 표시된다.
  - (base) c:\Users\[사용자명]> activate py35 

#4. 파이썬 3.5 환경의 프롬프트가 표시되면 이번에는 텐서플로와 개발에 필요한 추가 라이브러리들을 아래 명령으로 설치하낟.
  - (py35) > python -m pip install --upgrade pip
  - (py35) > conda install tensorflow
  - (py35) > conda install notebook
  - (py35) > conda install pandas
  - (py35) > conda install matplotlib
  - (py35) > conda install scikit-learn
  - (py35) > conda install keras
  - (py35) > pip install pywin32

  - 설치가 모두 완료되면 주피터 노트북을 실행한다.
    - (py35) > jupyter notebook 

#5. 주피터 노트북이 정상적으로 실행되면 노트북에 접속한다. 주피터 노트북 창이 활성화되면 그림 8.19처럼 우측 상단의
    [New] -> [Python 3]을 차례로 선택한다. 

#6. 노트북에 텐서프로 라이브러리를 임포트하는 코드를 입력하고 "Shift + Enter" 수행. 
  - import tensorflow as tf 
 

## 딥러닝 학습 및 평가 
#1. 학습할 데이터셋을 "c://bigdata/training_data" 경로를 만들어 복사한다. 
  - "CH08/CarDrivingIncidentInfo.csv" 파일을 "c://bigdata/training_data" 디렉터리를 만들어 복사해 놓는다.
  - "CH08/CarDrivingIncidentInfo_Test.csv" 파일을 "c://bidata/test_data" 디렉터리를 만들어 복사해 놓는다.  

#2. 주피터 노트북에서 필요한 라이브러리를 임포트하고, 학습데이터를 판다스의 데이터프레임으로 로드하는 코드를 입력한후 실행한다.
    전체 소스코드는 "CH08/smartcar_dnn_model.py"에 있음.

#3. 다음 코드를 입력해 데이터프레임에 로드된 학습데이터를 배열 구조의 입력값(X)과 결과값(Y)로 분리 구성하고 범주화와
    스케일 작업으로 데이터 전처리를 진행한다. 

#4. DNN 모델을 케라스의 Sequential로 구성한다. 입력 레이어, 은닉1 레이어, 은닉2 레이어, 은닉3 레이어, 출력 레이어를
    정의하고 활성화 함수는 Relu 와 Softmax로 설정한다. 모델을 컴파일하고 요약 정보를 출력한다. 
	
#5. 정의한 모델을 학습시킨다. 배치 사이즈 2000으로, 에폭은 50번을 반복하며 학습을 진행한다. 에폭이 진행될 때마다 loss 값은 
    줄고 정확도는 증가하는 모습을 볼 수 있다. 추가로 진행 과정을 테서보드 이벤트 로그로 지정했다. 
	
#6. 다음 코드를 실행해 학습된 DNN 모델의 최종 결과값을 확인해 본다. 정확도가 0.9997(99%)까지 향상됐다. 

#7 이어서 학습 결과를 시각화해 출력해 본다. 훈련/검증 정확도(train/val acc)와 훈련/검증 손실값(train/val loss)이 
   각각 상승/하향 곡선을 그리다가 애폭 10을 기점으로 완만해진 결과를 얻었다. 

#8. 학습된 모델을 테스트 데이터로 예측(y_predict_result) 후, 실제값(Y_test)과 비교해 성능을 평가하는 ROC 차트를
    출력해 본다. ROC 차트를 해석하자면 대각선 라인을 중심으로 ROC 커브가 상단에 형성되면 좋은 모델이고, 하단에 형성되면 
    좋지 않은 모델이다. 아래 DNN 모델의 경우 ROC 커브가 민감도(Sensitivity) 1에 매우 근접해서 정확도가 100%에 
    가까운 결과를 보여 준다.

#9. 마지막으로 생성된 모델을 다음 경로를 만들어 저장한다. 이후 단계에서 저장된 모델을 활용해 웹 애플리케이션 서비스를 만들어 보곘다.


## 텐서보드 사용 
#1. Anaconda Prompt를 실행 

#2. 파이썬 3.5 환경을 활성화 
  - (base) > activate py35 
  
#3. 프롬포트에 "tensorboard --logdir ./graph"를 입력해 텐서보드를 실행한다. 실행 로그가 출력되면 마지막 줄에
    텐서보드에 접속할 수 있는 URL이 표시된다. 이 URL을 복사해 둔다. 
  - (py35) > tensorboard --logdir ./graph 

#4. 크롬브라우저를 실행해 복사한 URL을 이용하여 텐서보드에 접속하면 학습된 DNN 모델의 결과를 다양한 시각화를 통해 
    확인할 수 있다. 
  - 텐서보드 접속 URL : http://[컴퓨터명]:6006 
 
## AI기반 애플리케이션 구축 
# 주행중인 스마트카 -> 주행정보(10개) -> API -> 웹 애플리케이션(플라스크) -> 이상징후 판별결과 -> 주행중인 스마트카 

#1. 파이썬 3.5 환경을 활성화 
  - (base) > activate py35 

#2. 파이썬 3.5 환경에서 pip 명령을 통해 플라스크를 설치한다. 
  - (py35) > pip install flask 

#3. 플라스크 설치가 완료되면 웹 애플리케이션 프로그램을 작성한다.
    [시작] -> [모든 프로그램] -> [Anaconda3(64-bit)] -> [Anaconda Navigator(Anaconda3)]를 실행한다. 
    아나콘다 내비게이터가 활성화되면 애플리케이션 대시보드에서 Spyder의 [Launch] 버튼을 클릭해 파이썬 개발 도구인
    스파이더(Spyder)를 실행한다.

#4. 스파이더가 실행되면 에디터 창에 플라스크의 REST API로 사용할 소스코드를 그림 8.33처럼 작성한다. 관련 소스코드는 
    "CH08/smartcar_dnn_service.py"로 제공하므로 참조한다. 

#5. 파일럿 PC의 C 드라이브에 "c://bigdata/flask" 폴더를 생성하고, flask 하위 폴더로 "app" 폴더를 생성한다. 
  - c://bigdata/flask/app/ 

#6. 스파이더 에디터에서 [File] -> [Save] 메뉴를 선택하고 앞에서 작성한 플라스크 REST API의 소스코드를 
    "c://bigdata/flask/app/" 경로에 "smartcar_dnn_service.py"라는 이름으로 저장한다. 

#7. 이제 스마트카 이상징후 판별 서비스를 위한 플라스크 서비스 서버를 실행한다. 
    [시작] -> [모든 프로그램] -> [Anaconda3 (64-bit)] -> [Anaconda Prompt(Anaconda3)]를 차례로
    선택해 py35 환경을 활성화하고, 앞에서 저장한 "smartcar_dnn_service.py" 프로그램을 실행한다. 
  - (base) > activate py35 
  - (py35) > python c://bigdata/flask/app/smartcar_dnn_service.py 

#8. 플라스크의 REST API 서비스가 정상적으로 실행되면 다음과 같은 메시지가 출력된다. 
  - Running on http://0.0.0.0:9001/"

#9. 주행 중인 스마트카의 10개 상태 값(0 ~ 2)을 가정해 정의한다. 

#10. 크롬 브라우저를 실행해 플라스크에서 실행중인 스마트카 이상징후 판별 REST API 서비스를 호출한다. 주행 중인 
     스마트카의 상태값 10개를 정의한 전체 URL은 다음과 같다. 
  - REST API 서비스 URL: http://127.0.0.1:9001/smartcar/predict?wea=2&temp=0&hum=1&arrOthCar=2
                       &time=0&acciArea=1&drvCond=1&innCond=2&carSpd=2&steeAng=0 
  - 위 REST API URL을 크롬 브라우저에 입력해 스마트카 이상징후 판별 서비스 API를 호출한다. 

#11. API 호출 결과가 그림 8.35처럼 출력된다. "prediction:"은 이상징후 판별 결과이고, "success:"는 API 처리 결과다. 


8.4 파일럿 프로젝트 확장하기 
## 빅데이터 샘플 파일 활용 
# 예측 모델 및 분석 대회 플랫폼
  - https://www.kaggle.com 

# 캘리포니아 주립대의 머신러닝 데이터 
  - http://archive.ics.uci.edu/ml/index.php 

# 대한민국 공공 데이터 포털 
  - http://www.data.go.kr 

# 미국정부 데이터 카달로그 
  - https://catalog.data.gov/dataset 

# 서울 열린 데이터 광장 
  - http://data.seoul.go.kr/index.jsp  

## 빅데이터 기술 확장 
  - 유튜브 강의 : http://bit.ly/bigdata2nd 
    - 약 20개의 기술 요소를 다루고 있음.
    - Pig, Sqoop Import, Tensorflow, Oozie, NiFi, Hive Bucket, Hadoop HDFS 등 


### 빅데이터, AI 기반 스마트카 플랫폼
  - 스마트카 - 외부 데이터 - 빅데이터 수집 - 빅데이터 레이크 - 빅데이터 웨어하우스(마트) - AI 개발/분석 - AI 학습/운영 
    - AI 모델 서비스(flask) - 외부 업무 시스템 

	