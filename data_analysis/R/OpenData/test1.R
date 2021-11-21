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

# 패키지 설치하기
install.packages("hflights")
library(hflights)
hflights
hf <- hflights

# 데이터 파악 함수
View(hf)
head(hf)
tail(hf)

str(hf)
dim(hf)

names(hf)
colnames(hf) # 열의 이름을 출력
rownames(hf)

ls(hf) # 열의 이름을 출력 - 정렬되어서 출력
rm(list=ls()) # 새로운 작업으로 갈때 수행. 이전 작업에 영향받지 않기위함

# deplyr 함수 사용
install.packages("dplyr")
library(dplyr)

hf <- hflights

filter(hf, Month)