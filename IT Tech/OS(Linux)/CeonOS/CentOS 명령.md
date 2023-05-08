# CentOS 명령 모음


yum install -y epel-release yum-utils

## 네트워크 설정
### 설정파일 위치
```bash
$ sudo vi /etc/sysconfig/network-scripts/

$ sudo systemctl restart NetworkManager
$ cp 
``` 

## hostname 설정
```bash
$ sudo hostnamectl set-hostname centos8s1
``` 

## sudo 사용자 추가
```bash
$ usermod -aG wheel netager
``` 

## OpenSSL 설치 - 사설인증서 설치
[사설인증서 만들고 사용하기 : https://www.runit.cloud/2020/04/https-ssl.html](https://www.runit.cloud/2020/04/https-ssl.html "사설인증서 만들고 사용하기")

---
## yum
> YUM 이란 Yellowdog Updater Modified 의 약자로, RPM 기반의 시스템을 위한 자동 업데이터이자 소프트웨어와 같은 패키지 설치/ 삭제 도구

### yum check-update
> 현재 인스톨된 프로그램 중에 업데이트 된 것을 체크해줍니다.

### yum clean all
> 캐시 되어 있는 것을 모두 지웁니다.

### yum deplist
> yum 패키지에 대한 의존성 테스트합니다.

### yum downgrade 패키지
> yum을 통한 패키지 다운그레이드합니다.

### yum erase 패키지
> yum을 통한 시스템에서 삭제합니다.

### yum groupinfo 그룹
> 그룹패키지의 정보를 보여줍니다.

yum groupinstall 그룹
> 그룹패키지를 설치합니다.

### yum grouplist 그룹
> 그룹리스트에 관한 정보를 확인합니다.

### yum groupremove 그룹
> 그룹리스트에 관해 삭제합니다.

### yum help
> yum의 도움말을 확인합니다.

### yum info 그룹 또는 패키지
패키지 또는 그룹의 패키지를 자세하게 확인합니다.

### yum install 패키지
> 시스템으로 패키지의 Install 을 실시합니다.

### yum list
> 서버에 있는 그룹 및 패키지의 리스트를 보여줍니다.

### yum localinstall 패키지
> 로컬에 설치합니다.

### yum makecache
> 캐쉬를 다시 올립니다.

### yum provides FilePath명
> 파일이 제공하는 패키지 정보 출력합니다.

### yum reinstall 패키지
> 패키지를 재인스톨 합니다.

### yum update 패키지
> 패키지를 업데이트합니다.

### yum upgrade 패키지
> 패키지를 업그레이드 합니다.

### yum search 키워드
> 키워드로 시작하는 패키지를 검색할수 있습니다.