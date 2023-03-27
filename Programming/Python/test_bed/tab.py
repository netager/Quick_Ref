
import sys

if len(sys.argv) != 2:
    print('Usage: python tab.py file_name')    
else:
    with open(sys.argv[1], 'r') as f:
        memo = f.read()
        print(memo)
#        new_memo = memo.replace('\t', '    ')
        new_memo = memo.replace('\t', '	')
        print(new_memo)
    
    with open(sys.argv[1], 'w') as f:
        f.write(new_memo)

