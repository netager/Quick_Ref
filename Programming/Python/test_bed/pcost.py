<<<<<<< HEAD
# pcost.py

=======
>>>>>>> 1b27a3f2ed2fb39c7c019d9d350c38ff09ce819b
import report

def portfolio_cost(filename):
    '''
    Computes the total cost (shares*price) of a portfolio file
    '''
    portfolio = report.read_portfolio(filename)
<<<<<<< HEAD
    return sum([s.shares * s.price for s in portfolio])

def main(args):
    if len(args) != 2:
        raise SystemExit('Usage: %s portfoliofile' % args[0])
    filename = args[1]
    print('Total cost:', portfolio_cost(filename))
=======
    return sum(s['shares'] * s['price'] for s in portfolio)
    

def main(args):
    if len(args) != 2:
        raise SystemExit('Usage: %s portfile' % args[0])
    
    filename = args[1]
    print('Total cost: ', portfolio_cost(filename)) 

>>>>>>> 1b27a3f2ed2fb39c7c019d9d350c38ff09ce819b

if __name__ == '__main__':
    import sys
    main(sys.argv)
