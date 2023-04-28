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
SQL_STRING = "select * from test"


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
        file_name = f'자료_{str(cnt+1).zfill(7)}.xlsx'
        xlsx_dir = os.path.join(BASE_DIR, file_name)
        
        result.append(row)
        j += 1
    
    # Change Column Name
    # ------------------
    df = pd.DataFrame(result, columns=['first','second'])
    df.to_excel(xlsx_dir, sheet_name='Sheet1', header=True, index=False)

    result.clear()
    del df
    
    end_time = datetime.datetime.today()    
    print(f'[{cnt*NUM_ROWS+j:12,}] Start Time: {start_time}, Cur Time: {end_time}, Proc Time:{end_time - start_time}')
    cnt += 1

cur.close()
connection.close()        
