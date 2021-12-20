rint("Hello World!")
3 + 5
100 / 7.2
x <- 10
print(x)

y <- c(1,2,3,4,5)
print(y)
exam <- c(1:10)
print(exam)

exam1 <- c(0:10)
print(exam1)
print(sqrt(2))
print(sqrt(-2))

num1 <- c(1,2,-5,11.7)
print(num)

chr <- c("MJ", 'Jane')
logic <- c(TRUE,FALSE)
num_nan <- c(NaN, 3)

str(num1)
str(chr)
str(logic)
str(num_nan)

a <- 2
b <- 5
a + b
a <- "MJ"
a + b
a <- 2
b <- 5
a + b
a - b
a*b
a/b
a%/%b
b%/%b
a%%b
a^b

test <- c(1:5)
sum(test)
mean(test)
max(test)
sd(test)
var(test)
median(test)
range(test)
length(test)
sum(test) / length(test)

# 논리 연산자
1>3
5<10
d <-  c(1,2,3,4,5,6,7,8,9)
e <- c(1:9)
d[d > 5]
de >= 5

# 논리 연산을 이용한 인덱싱
d[d>=5]
sum(d>=5)
d>5
sum(d[d>=5])

d
logi_result <-  d>5 & d < 8
logi_result
d[logi_result]

# matrix
score <- matrix(c(100,70,72,70,
                70,65,60,90,
                95,90,72,100),nrow=4, ncol=3)
score
rownames(score) <- c('MJ','Jane','Tom','jisoo')
colnames(score) <- c('Korean','Math','English')
score
score[1,3]
score[2,2]
score[2,]
score[,3]


# dataframe
Korean <-  c(100,70,95)
Math <- c(70,65,90)
Grade <- c('우','미','수')
score_dataframe <- data.frame(Korean, Math, Grade)
score_dataframe

score_dataframe$Korean
score_dataframe[1,]
score_dataframe[,1]

score_dataframe$Grade
score_dataframe[,3]
score_dataframe[2,1]


# 패키지 설치 및 로드
install.packages("dplyr")
library(dplyr)

# 데이터 불러오기
getwd()
highway_acci <- read.csv("C:/Users/JBB/Quick_Ref/data_analysis/R/OpenData/Data/한국도로공사_교통사고통계_20201231.csv")
highway_acci

# Data 저장하기
write.csv(highway_acci, file = "highway_acci.csv")
write.table(highway_acci, file = "highway_acci.txt", sep=",")

# 엑셀파일 저장하기
install.packages("writexl")
library(writexl)
write_xlsx(highway_acci, "highway_acci.xlsx")

# 엑셀파일 불러오기
install.packages("readxl")
library("readxl")
highway_acci_excel <- read_excel("highway_acci.xlsx")

# 6. 데이터 정제 기법
# 패키지 설치하기
install.packages("hflights") # 데이터셋 hflight를 설치
library(hflights) # 데이터셋 hflight 로드
hflights # 데이터셋 확인
hf <- hflights

# 데이터 파악 함수
View(hf)
head(hf)
tail(hf)

str(hf) # 데이터 구조, 변수 개수, 변수명, 관찰치 개수, 미리보기
dim(hf) # 데이터의 차원(행, 열의 개수)

names(hf) # 데이터 프레임의 변수명(열이름) 확인
colnames(hf) # 데이터 프레임의 열 이름을 출력
rownames(hf) 
ls(hf) # 데이터 셋의 열이름을 출력 - 정렬되어서 출력
ls() # working 중인 데이터 셋 전체 출력
rm(list=ls()) # 새로운 작업으로 갈때 수행. 이전 작업에 영향받지 않기위함

# deplyr 함수 사용
install.packages("dplyr")
library(dplyr)

hf <- hflights

filter(hf, Month==1, DayofMonth==1) # 1월 1일 데이터 추출
filter(hf, Month==1 | Month==1) # 1월 또는 2월 데이터 추출

select(hf, Year, Month, DayOfWeek) # Year, Month, DayOfWeek 열을 추출
select(hf, Year:DayOfWeek) # Year에서 DayOfWeek까지 열을 추출 

# ArrDealy열과 DepDelay열의 차이를 계산한 결과를 gain 변수로 추가
mutate(hf, gain = ArrDelay - DepDelay)

arrange(hf, Year, Month, DayofMonth)
arrange(hf, desc(Month))

distinct(hf, Year)
distinct(hf, Year, Month)

summarise(hf, 지연평균=mean(ArrDelay), 지연최대=max(ArrDelay))
summarise(hf, 지연평균=mean(ArrDelay, na.rm=TRUE), 지연최대=max(ArrDelay, na.rm=TRUE))

summarise(group_by(hf, TailNum), 갯수 = n(), 지연평균 = mean(ArrDelay, na.rm=TRUE))


7. 지하철 승하차 데이터 분석 따라하기_1

## 데이터 로드
getwd() # 현재 작업공간 확인
daejeon_subway <- read.csv("대전광역시도시철도공사_역별 수송실적_20211031.csv") # csv파일 R로 불러오기


## 데이터 확인 및 데이터프레임 이름 변경
View(daejeon_subway) # View창에서 데이터 확인
names(daejeon_subway)
names(daejeon_subway) <- c("연도", "역번호","역명","Jan_승차", "Jan_하차", "Feb_승차","Feb_하차",
                           "Mar_승차","Mar_하차", "Apr_승차","Apr_하차", "May_승차","May_하차", "Jun_승차","Jun_하차",
                           "Jul_승차","Jul_하차", "Aug_승차","Aug_하차", "Sep_승차","Sep_하차", "Oct_승차","Oct_하차",
                           "Nov_승차","Nov_하차", "Dec_승차","Dec_하차")
names(daejeon_subway)

## 데이터 구조 파악
str(daejeon_subway)
dim(daejeon_subway)
dim(daejeon_subway)[1]
length(daejeon_subway)

## 데이터 정재
# 데이터 삭제
daejeon_subway_new <- daejeon_subway[,1:23]
daejeon_subway_new
View(daejeon_subway_new)

## 데이터 분석
# 1월 승차인원이 가장 많은 정류장은?
library(dplyr)
max_Jan <- max(daejeon_subway_new$Jan_승차)
max_Jan
filter(daejeon_subway_new, Jan_승차 == max_Jan)

filter(daejeon_subway_new, Jan_승차 == max(Jan_승차))

Jan_max_row <- arrange(daejeon_subway_new, desc(Jan_승차)) 
Jan_max_row[1,]
(arrange(daejeon_subway_new, desc(Jan_승차)))[1,]

which.max(daejeon_subway_new$Jan_승차)
daejeon_subway_new[which.max(daejeon_subway_new$Jan_승차),]

# 역별 1월과 3월 승차인원의 차이는?
daejeon_subway_new$diff <- daejeon_subway_new$Jan_승차 - daejeon_subway_new$Mar_승차
head(daejeon_subway_new)
daejeon_subway_new1 <- mutate(daejeon_subway_new, diff = Jan_승차 - Mar_승차)
head(daejeon_subway_new1)

# 역별 1월과 3월의 승차인원의 차이를 그래프로?
boxplot(daejeon_subway_new$Jan_승차, daejeon_subway_new$Mar_승차)
boxplot(daejeon_subway_new$Jan_승차, daejeon_subway_new$Mar_승차, main='지하철 승차인원 분포차이',
                                     xlab='1월 vs 3월', ylab='승차인원(명)', names=c('1월','3월'))	
rm(list=ls())

9. 기상정보를 활용한 불쾌지수 분석_1

## 사용할 패키지 설치 및 불러오기
install.packages("dplyr")
install.packages("ggplot2")
library(dplyr)
library(ggplot2)

## 데이터 R로 불러오기
data.raw <- read.csv(file.choose())

## 데이터 전처리
# 데이터 확인 및 데이터프레임 이름 변경
View(data.raw)
head(data.raw)
tail(data.raw)
str(data.raw)
dim(data.raw)
length(data.raw)
names(data.raw)

# 변수명 변경 
names(data.raw)
names(data.raw) <- c("일자","평균기온","최대기온","최소기온", "평균지표온도",
                     "최대지표온도","최소지표온도","습도","일사량","풍속")	
names(data.raw)

# 일교차 변수 추가하기 1
(data.raw$최대기온 - data.raw$최소기온)
data.raw$일교차 <- (data.raw$최대기온 - data.raw$최소기온)
head(data.raw)	

# 일교차 변수 추가하기 2  
data.raw_tempdist <- mutate(data.raw, 일교차 = 최대기온 - 최소기온)
head(data.raw_tempdist)  

# 월(month) 변수 추가하기 
data.month <- mutate(data.raw_tempdist, 월 = substr(data.raw_tempdist$일자,6,7))	
head(data.month)
substr(data.raw_tempdist$일자,6,7)
dim(data.month)      
View(data.month)


10. 기상정보를 활용한 불쾌지수 분석_2
## 데이터 분석
# 일교차의 기초 통계량 구하기 
mean(data.raw_tempdist$일교차)
sd(data.raw_tempdist$일교차)
max(data.raw_tempdist$일교차)
min(data.raw_tempdist$일교차)
var(data.raw_tempdist$일교차)


# 데이터 그룹화 시키기 
data.group <- group_by(data.month, 월)
View(data.group  )

# 그룹화 된 데이터로 월 평균 일교차 확인 및 변수 추가
data.group_avg <- summarise(data.group, avg=mean(일교차))
head(data.group_avg)
data.avg.td <- mutate(data.group, 월평균 = mean(일교차))
head(data.avg.td)
View(data.avg.td)  

# 불쾌지수 변수 생성 
# 불쾌지수 = 1.8T - 0.55(1 - RH)(1.8T - 26) + 32
#             (T:기온(섭씨), RH:상대습도(%))
data.thi <- mutate(data.month, 불쾌지수 = 1.8 * 평균기온 - 0.55 *(1-습도/100)*(1.8*평균기온 - 26) * 32)
head(data.thi)
View(data.thi)


# 불쾌지수 변수 생성 
# 불쾌지수 70 초과인 날은 몇일?
data.thi$불쾌지수 > 70
data.thi_70 <- data.thi[data.thi$불쾌지수 > 70,]
head(data.thi_70)
dim(data.thi_70)[1]

filter(data.thi, 불쾌지수>70) # 왜 오류가 나지???

## 데이터 시각화 
# 월 평균 일교차 그래프 그리기
ggplot(data = data.group_avg, aes(x=as.numeric(월), y=avg)) + 
       geom_line() + 
       geom_point()	

ggplot(data = data.group_avg, aes(x=as.numeric(월), y=avg)) + 
       geom_line() + 
       geom_point(size=2, color = 'red') + ggtitle("월 평균 일교차") +
       ylab("기온") + xlab("월") + theme(plot.title = element_text(hjust = 0.5))		   
                                                                    

# 불쾌지수 그래프 그리기
head(data.thi$일자)
str(data.thi$일자)
head(as.Date(data.thi$일자))
str(as.Date(data.thi$일자))    

ggplot(data = data.thi, aes(x=as.Date(일자), y=불쾌지수)) + geom_line() +
       ggtitle("일별 불쾌지수") + xlab("날짜")

# 불쾌지수가 70인 경계선 추가 
ggplot(data = data.thi, aes(x=as.Date(일자), y=불쾌지수)) + geom_line() +
       ggtitle("일별 불쾌지수") + xlab("날짜") +
       geom_hline(yintercept=70, linetype="dashed", size=1, color="red")			 

rm(list=ls())
[Ctrl] + L


11. 유동인구 데이터 분석 따라하기_1 
## 데이터 불러오기
# 사용할 패키지 설치 및 불러오기
install.packages("dplyr")
library(dplyr)

# 파일 불러오기 
data.raw <- read.csv(file.choose(), header=T)
data.raw <- read.csv(file.choose(), header=T, sep=",")
data.raw <- read.csv(file.choose(), header=T, fileEncoding="UCS-2LE")	# 맨 마지막 페이지 무시하고 불러오기
data.raw <- read.csv(file.choose(), header=T, fileEncoding="UTF-8")

# 데이터 확인 및 데이터프레임 이름 변경과
View(data.raw)
head(data.raw, 10)
tail(data.raw)
str(data.raw)
dim(data.raw)
names(data.raw)
# rename() - 데이터프레임 변수명(열이름) 변경 (reshape 패키지 설치해야 함)

names(data.raw)[5:28]
names(data.raw)[5:28] <- c("m10under","m10","m20","m25","m30","m35","m40","m45","m50","m55","m60","m65over",
                           "f10under","f10","f20","f25","f30","f35","f40","f45","f50","f55","f60","f65over")
names(data.raw)							   


## 데이터 전처리
# 남녀별 유동인구 합계 변수 추가하기 
data.use <- mutate(data.raw,
                   m_total = m10under+m10+m20+m25+m30+m35+m40+m45+m50+m55+m60+m65over,
                   f_total = f10under+f10+f20+f25+f30+f35+f40+f45+f50+f55+f60+f65over,
                   mf_total = m_total + f_total)

View(data.use)
data.use

## 데이터 분석
# 유동인구 상위 10개 지역은?
data.arrange <- arrange(data.use, desc(mf_total))
head(data.arrange)
data.arrange10 <- head(data.arrange,10)
head(data.arrange10)

# 구역별 남성의 유동인구가 가장 많은 연령층은?
View(data.use)
data.use[,5:16]
max.col(data.use[5:16])
m_max_which <- max.col(data.use[5:16])+4
m_max_which
names(data.use)[m_max_which]  

data.use[,17:28]
max.col(data.use[17:28])
m_max_which <- max.col(data.use[5:16])+4
m_max_which
names(data.use)[m_max_which]  

data.major.age = mutate(data.use, 
                        major_m = names(data.use)[max.col(data.use[5:16])+4],
                        major_f = names(data.use)[max.col(data.use[17:28])+4])							
View(data.major.age)
data.major

# 남녀별 유동인구가 가장 많은 연령대는?
m_age_table <- table(data.major.age$major_m)
f_age_table <- table(data.major.age$major_f)

m_age_table
f_age_table

# 지역별 최대 유동인구 연령별 빈도수 그리기 
barplot(m_age_table, xlab="연령대", ylab="빈도 수", ylim=c(0,800), main="남성 유동인구 막대그래프")	
barplot(f_age_table, xlab="연령대", ylab="빈도 수", ylim=c(0,800), main="여성 유동인구 막대그래프")

# 지역별 최대 유동인구 연령별 빈도수 그리기2
age_table <- rbind(m_age_table, f_age_table) # 에러 발생
colnames(age_table) <- c("20대","30대","40대","50대")
bar.text <- barplot(age_table, beside=T, legend=c("man","woman"),
                       xlab = "연령대", ylab="빈도 수", ylim=c(0,800), main = "남성 유동인구 막대그래프")
text(bar.text, age_table, labels=age_table, pos=3)						 

# 유동인구 최대 지역의 연령별 파이 차트 그리기
data.arrange10
data.arrange10_t <- t(data.arrange10)
data.arrange10_t
View(data.arrange10_t)
head(data.arrange10_t, 10)

data_m_1 <- data.arrange10_t[5:16, 1] # 가장 많은 유동인구 지역의 세대별 유동인구(남성)
data_m_1

pie(data_m_1, main="세대별 유동인구")
pct <- round(data_m_1/sum(data_m_1)*100)
pct
lbls <- paste(pct, "%", sep="")
lbls  
pie(data_m_1, labels=lbls, main="세대별 유동인구")



