import sys
import test

def spam(name):
    print('[spam()] ', name)
    blah('Lovely Lee')

def blah(msg):
    print('[blah()] ', msg)

def main(argv):
    print(argv)
    spam("Hi my name is Spam")

if __name__ == '__main__':
    import sys
    main(sys.argv)
