
import cx_Oracle
import datetime
import pandas as pd
import os

# BASE_DIR="c:/temp/test"
# file_name = f'test{i}.xlsx'
# xlsx_dir = os.path.join(BASE_DIR, file_name)

conn = cx_Oracle.connect("netager", "tnscjs12", "192.168.0.64:1521", encoding="UTF-8")
cur = conn.cursor()
query = "select * from test where rownum < 1000"

cur.execute(query)
num_rows = 10
cnt = 1
while True:
    print(f'Start Count : {cnt}')
    rows = cur.fetchmany(num_rows)
    if not rows:
        break
    for row in rows:
        pass
        #print(row)
