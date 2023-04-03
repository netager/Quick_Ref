# test.py

def test_print(msg):
    print('test print %s' % msg)


def main(args):
    if len(args) != 2:
        raise SystemExit('Usage: %s test.py' % args[0])
    test_print(args[1])
        
    
    

if __name__ ==  '__main__':
    import sys
    main(sys.argv)