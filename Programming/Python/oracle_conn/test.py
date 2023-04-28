import cx_Oracle
import datetime

conn = cx_Oracle.connect("netager", "tnscjs12", "192.168.0.64:1521", encoding="UTF-8")
cur = conn.cursor()
query = "select * from test"

array_size = 10000
cur.arraysize = array_size
cur.execute(query)

cnt = 1
for record in cur:
    if cnt % 100000 == 0:
        print(f'Count Record .... {cnt}')
    cnt += 1 
    


#-------------
#fetch_sizes = [100000, 200000]
#array_sizes = [100, 500, 1000, 5000, 10000, 50000, 100000]

#fetch_size = 10000
# array_size = 10000
# cur.execute(query)
# print(cur.fetchall())

# cur.arraysize = array_size
# start_time = datetime.datetime.today()

# # cur.execute(query).fetchmany(fetch_size)
# # print(f'results length: {len(results)}')
# end_time = datetime.datetime.today()
# # cur.close()
# print(f"arrarysize {array_size} took... {end_time - start_time}")
# #------------------------------------




# fetch_sizes = [100000, 200000]
# array_sizes = [100, 500, 1000, 5000, 10000, 50000, 100000]
# for fetchsize in fetch_sizes:
#     print("# fetchsize {fetchsize}".format(fetchsize=fetchsize))
#     for size in array_sizes:
#         cur = conn.cursor()
#         cur.arraysize = size
#         start_time = datetime.datetime.today()
#         results = cur.execute(query).fetchmany(fetchsize)
#         # print('results:', results)
#         end_time = datetime.datetime.today()
#         cur.close()
#         print("fetchsize {fetchsize} arrarysize {size} took...".format(fetchsize=fetchsize, size=size), end_time - start_time)