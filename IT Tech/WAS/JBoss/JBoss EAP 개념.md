# JBoss EAP, 영상 하나로 마스터 하기

## 1. JBoss가 뭔가요?
- JBoss is WAS(Web Application Server)
    - Client - <HTTP 요청> - Web Server(정적 컨텐츠 제공) - <Plugin 연동> - Web Application Server(동적 프로그램 처리) - <DB Connection> - DB
- Back-end = 미들웨어 = WAS

- WAS 종류
    - IBM WebSphere
    - Oracle WebLogic
    - Tmax JEUS
    - Apache Tomcat
    - Redhat JBoss

- JBoss 이름
    - EJS-OSS(Enterprise Java Bean Open Source Software) in 1999, Marc Fleury
    - JBoss(Jboss Group LLC.) in 2001

- EAP는 뭔가요?
    - History of JBoss EAP
        - JBoss AS(Application )
        - 2006년 Redhat 인수. JBoss EAP로 변경 + JBoss AS(Community Version)
        - 2014년 JBoss AP(Community Version) -> JBoss Wildfly로 변경
        - 현재(2021년) JBoss Wildfly23 - JBoss EAP7.4 : jdk8과 11 지원 - 동일한 CoreEngine 사용
    - java 와 호환
        - Java EE 5 - JBoss AS 5.6 - JBoss EAP 5
        - Java EE 6 - JBoss AS 7 - JBoss EAP 6
        - Java EE 7 - Wildfly 8,9,10/11 - JBoss EAP 7/7.1
        - Java EE 8 - Wildfly 12, 13, 14 - JBoss EAP 7.2
        - Jakarta EE 8 - Wildfly 15, 16, 17, 18 - JBoss EAP 7.3        
        - Jakarta EE 8-MP 3.3 - Wildfly 19, 21 - JBoss EAP 7.3.z & EAP XP 1.0 & EAP XP 2.0       
        - Jakarta EE 8-MP 4.0 - Wildfly 23 - JBoss EAP 7.4 & EAP XP 3               
       *) MP(Micro Process) - MSA를 위해 경량화 되어 있는 버전 - 결과물이 war 가 아닌 jar 같은 가벼운 app를 구동하기 위해 was를 포함하고 있는 경량화된 프레임워크 
       *) XP(Extention Pack)

## 2. JBoss가 뭐가 좋은가요?
### JBoss EAP만의 특장점 6가지
- 비용 절감
- 시장 1위의 점유율
- 벤더 Lock-in 없이 어디에나 사용(Wildfly), EAP는 엔터프라이즈급 서비스에서 SLA를 통해 사용
    - 유연성 - 클라우드 및 컨테이너에 최적화
    - 벤더 Lock-In과 Dependency가 없어 컨테이너 환경 및 클라우드 아키텍처 구현이 가능
        - 다양한 클라우드 환경(Public/Private Cloud)에 구애 받지 않는 Web Application Server
        - 기업형 오픈소스 컨테이너 플랫폼인 Red Hat OpenShift Container Platform에 최적화
- 가볍고 빠른 성능
    - Java EE 웹 프로파일이 포함된 JBoss EAP는 가장 빠른 부팅과 로드시 최소한의 메모리를 소비하면서도 처리량은 가장 높음
- 다양한 인증
    - Java EE 8 / jakarta EE 8 Full profile 인증
    - JDK 8 / 11 지원
    - MSA를 위한 MicroProfile 4.0 지원
- Cloud Native, MSA, DevOps 지원
    - Cloud Native, MSA 를 구현하기 위해서 필수적인 요소는 Container
    - Container images 제공
    - MSA를 위한 경량화된 Framework 인 MicroProfile을 EAP XP로 제공
      *> JBoss EAP XP는 EAP에 기본 제공 됨
    - MICROPROFILE 프레임워크로 제공(MSA 구현을 위해 경량화 시킨 버전)  

## 3. JBoss는 어떻게 사용하나요?
### JBoss EAP 7 설치파일 다운로드
- https://developers.redhat.com/products/eap/download

### JBoss EAP 7의 3가지 쉬운 설치 방식
- 그래픽 환경 설치 방식
    - java -jar jboss-eap-7.4.0-installer.jar
- 압축 해제 설치 방식
- RPM 명령을 통한 설치 방식
    - JBoss EAP 7.4 설치를 위한 Repository 등록
        - subscription-manager repos --enable=jb-eap-7.4-for-rhel-8-ARCH-rpms
    - JBoss EAP 7 과 JDK 8 설치시
        - yum groupinstall jbos-eap7
    - JBoss EAP 7 과 JDK 11을 같이 설치시        
        - yum groupinstall jboss-eap7-jdk11

### JBoss EAP 7의 3가지 쉬운 삭제 방식
- 그래픽 환경 삭제 방식
    - java -jar uninstaller.jar
- 압축 해제 삭제 방식
    - rm jboss-eap-7.4
- RPM 명령을 통한 삭제 방식
    - yum remove jboss-eap7
    - yum remove jboss-eap-jdk11
    - rpm -qa jboss-eap-7.4
    - rpm -e jboss-eap-7.4

### JBoss EAP 7 Fix 패치 예시 (JBoss EAP 7.4.0 -> 7.4.1)
- CLI 및 웹관리콘솔을 통해 펀리한 패치를 지원
    - CLI를 이용한 패치
        - 최신 패치 파일 홈페이지에서 다운로드
            - jboss-eap-7.4.1-patch.zip
        - patch apply 명령으로 패치 적요
            - bin/jboss-cli.sh "patch apply path/jboss-eap-7.4.1.zip"
        - patch info 명령으로 패치 결과 확인
            - bin/jboss-cli.sh "patch info"
- 웹 관리콘솔을 이용한 패치            

### JBoss EAP 7 Minor 업그레이드(JBoss EAP 7.3 -> 7.4)
- 폴더 복제 및 RPM 방식의 Minor 업그레이드 지원
    - 새 설치 경로에 기존 주요 폴더를 복사하는 방식
- RPM 명령을 통한 업그레이드

### JBoss EAP 7 Major 업그레이드(JBoss EAP 6.4 -> 7.4)
- 대화형 업그레이드 방식(Interactive)
- 비 대화형 업그레이드(Non-Interactive)

### 체계적으로 배워보고 싶어요
- https://developers.redhat.com/products/eap/getting-started


