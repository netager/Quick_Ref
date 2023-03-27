# 어느 날 아침, 당신은 시카고의 시어스 타워(Sears tower) 근처를 거닐다가 보도에 1 달러 지폐를 한 장 올려뒀다. 
# 그 후 매일 외출할 때마다 그 위에 지폐를 얹어 탑을 쌓으며, 높이는 매일 두 배로 불어난다. 
# 돈으로 쌓은 탑의 높이가 시어스 타워의 높이와 같아지려면 시간이 얼마나 걸릴까?
# ------------------------------------------------------------------------------------------------------
# bounce.py
bill_thickness = 0.11 * 0.001  # mm 를 m 로 변환
sears_height = 442             # 442m
num_bills = 1
day = 1

while num_bills * bill_thickness < sears_height:
    print(f'Days: {day:3}, Num Bills: {num_bills:10}, Bills Height: {num_bills * bill_thickness:10}')
    day += 1
    num_bills = num_bills * 2

print('Number of days: ', day)    
print(f'Number of bills: {num_bills}, WON : {num_bills * 1300}')    
print('Final height: ', num_bills * bill_thickness)    
