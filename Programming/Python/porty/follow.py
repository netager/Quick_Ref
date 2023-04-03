# follow.py
import os
import time

def follow(filename):
    with open(filename, 'r') as f:
        f.seek(0, os.SEEK_END)      # 파일 포인터를 파일의 끝으로부터 0 바이트로 이동

        while True:
            line = f.readline()
            if line == '':
                time.sleep(0.1)     # 짧게 쉬었다가 재시도
                continue
            yield line
            
if __name__ == '__main__':
    for line in follow('../../data/stocklog.csv'):
        fields = line.split(',')
        name = fields[0].strip('"')
        price = float(fields[1])
        change = float(fields[4])
        if change < 0:
            print(f'{name:>10s} {price:>10.2f} {change:>10.2f}')

