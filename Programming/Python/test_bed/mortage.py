# 월수, 현재까지의 납부액, 남은 원금을 나타내는 테이블을 프린트하게 프로그램을 수정해 보라. 다음과 같이 출력한다.
# 1 2684.11 499399.22
# 2 5368.22 498795.94
# 3 8052.33 498190.15
# 4 10736.44 497581.83
# 5 13420.55 496970.98
# ...
# 308 874705.88 3478.83
# 309 877389.99 809.21
# 310 880074.1 -1871.53
# Total paid 880074.1
# Months 310
# --------------------------------------------
extra_payment_start = 61
extra_payment_end_month = 108
extra_payment = 1000

principal = 500000.0
rate = 0.05
payment = 2684.11
add_payment = payment + extra_payment
total_paid = 0.0
payment_months = 0

while principal > 0:
    payment_months += 1
    
    if extra_payment_start <= payment_months <= extra_payment_end_month:
        payment = add_payment
    else:
        payment = payment
        
    principal = round(principal * (1+rate/12) - payment, 2)
    total_paid = total_paid + payment
    
    if 55 < payment_months < 63:
        print(f'{payment_months:,} {total_paid:>10,.2f} {principal}')    

    if payment_months > 230:
        print(f'{payment_months:,} {total_paid:>10,.2f} {principal}')            
    

#print(f'Total payment months: {payment_months:,} months, Total paid: {total_paid:>10.2f}')    
print(f'Total paid: {total_paid:>10,.2f}\n Months: {payment_months}')    
