import sys

src = sys.argv[1]
dst = sys.argv[2]

with open(src, 'r') as f:
    space_content = f.read()
    
tab_content = space_content.replace(' '*4, '\t')

with open(dst, 'w') as f:
    f.write(tab_content)    
