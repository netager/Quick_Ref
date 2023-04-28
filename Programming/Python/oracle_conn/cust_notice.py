import oracledb
import pandas as pd
import datetime
import os

# File Location
# -------------
BASE_DIR="c:/temp/test"


# sql cursor array size
# ---------------------
array_size = 250000


# Assign saved file count
# -----------------------
NUM_ROWS = 250000


# sql query
# ---------
SQL_STRING = "select * from cust_notices"


# Information of Oracle Connection
# ---------------------------------
connection = oracledb.connect(user="netager", password="tnscjs12", host='localhost', port=1521)
cur = connection.cursor()
cur.arraysize = array_size
cur.execute(SQL_STRING)

start_time = datetime.datetime.today()

cnt = 0
while True:
    rows = cur.fetchmany(size=NUM_ROWS)

    if not rows:    
        break

    result = []
    j = 0
    for row in rows:

        # formatting file name and file saved location
        # ---------------------------------------------
        file_name = f'고객정보이용_관련_전북은행_{str(cnt+1).zfill(4)}.xlsx'
        xlsx_dir = os.path.join(BASE_DIR, file_name)
        
        result.append(row)
        j += 1
    
    # Change Column Name
    # ------------------
    df = pd.DataFrame(result, columns=['고객관리부점코드','부점명','고객식별자','검사대상기간 전체접촉건수','접촉연번','접촉일자','접촉채널','마케팅 캠페인 기획부점','캠페인명','메시지 내용','접촉시점 마케팅 동의의 전산상 등록여부(Y/N)','마케팅 동의 전산등록일자','동의서 형태\(전산/서면\)', '전산상 접촉 가능한 동의 채널'])
    df.to_excel(xlsx_dir, sheet_name='Sheet1', header=True, index=False)

    result.clear()
    del df
    
    end_time = datetime.datetime.today()    
    print(f'[{cnt*NUM_ROWS+j:12,}] Start Time: {start_time}, Cur Time: {end_time}, Proc Time:{end_time - start_time}')
    cnt += 1

cur.close()
connection.close()        
