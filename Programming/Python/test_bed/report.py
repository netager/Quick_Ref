# report.py
<<<<<<< HEAD

import fileparse
import stock
import prices
import tableformat
=======
'''
Reporting Program Tools
'''
import fileparse
from babel.numbers import format_currency

>>>>>>> 1b27a3f2ed2fb39c7c019d9d350c38ff09ce819b

def read_portfolio(filename):
    '''
    Read a stock portfolio file into a list of dictionaries with keys
    name, shares, and price.
    '''
    with open(filename) as lines:
<<<<<<< HEAD
        # return fileparse.parse_csv(lines, select=['name','shares','price'], types=[str,int,float])

        # Convert Dictionary to Object     
        portdicts = fileparse.parse_csv(lines, select=['name','shares','price'], types=[str,int,float])
        print('[report.py]<read_portfolio()> Return to Object')
        return [ stock.Stock(d['name'], d['shares'], d['price']) for d in portdicts ]

def read_prices(filename):
    '''
    Read a CSV file of price data into a dict mapping names to prices.
    '''
    with open(filename) as lines:
        return dict(fileparse.parse_csv(lines, types=[str,float], has_headers=False))

        # Convert Dictionary to Object     
        # portdicts = fileparse.parse_csv(lines, types=[str,float], has_headers=False)
        # return [ prices.Prices(d.name, d.price) for d in portdicts ]


def make_report_data(portfolio,prices):
    '''
    Make a list of (name, shares, price, change) tuples given a portfolio list
    and prices dictionary.
    '''
    rows = []
    for stock in portfolio:
        current_price = prices[stock.name]
        change = current_price - stock.price
        summary = (stock.name, stock.shares, current_price, change)
        rows.append(summary)
    return rows

def print_report(reportdata, formatter):
    '''
    Print a nicely formated table from a list of (name, shares, price, change) tuples.
    '''
    formatter.headings(['Name', 'Shares', 'Price', 'Change'])
        
    for name, shares, price, change in reportdata:
        rowdata = [ name, str(shares), f'{price:0.2f}', f'{change:0.2f}' ]
        formatter.row(rowdata)

def portfolio_report(portfoliofile, pricefile, fmt):        
    '''
    Make a stock report given portfolio and price data files.
    '''
    # Read data files 
    portfolio = read_portfolio(portfoliofile)
    prices = read_prices(pricefile)

    # Create the report data (보고서 데이터 생성)
    report = make_report_data(portfolio, prices)

    # Print it out
    formatter = tableformat.create_formatter(fmt)
    print_report(report, formatter)
    

def main(args):
    if len(args) != 4:
        raise SystemExit('Usage: %s portfile pricefile' % args[0])
    portfolio_report(args[1], args[2], args[3])
=======
        return fileparse.parse_csv(lines, select=['name','shares','price'], types=[str, int, float])    


def read_prices(filename):
    '''
    Read a CSV file of price data into a dict mapping names to prices
    '''
    with open(filename) as lines:
        return dict(fileparse.parse_csv(lines, types=[str, float], has_headers=False))


def make_report_data(portfolio, prices):
    '''
    make a list of (name, shares, price, change) touples given a portfolio list and prices dictionary.
    '''
    rows = []
    for stock in portfolio:
        current_price = prices[stock['name']]
        change = current_price - stock['price']
        summary = (stock['name'], stock['shares'], current_price, change)
        rows.append(summary)
    return rows    


def print_report(reportdata):
    '''
    Print a nicely formated table from a list of (name, shares, price, chang) tuple
    '''
    headers = ('Name', 'Shares', 'Price', 'Change')
    print('%10s %10s %10s %10s' %headers)
    print(('-'*10+' ')* len(headers))
    for row in reportdata:
        print('%10s %10d %10.2f %10.2f' % row)


def portfolio_report(portfoliofile, pricefile):
    '''
    Make a stock report given portfolio and price data files
    '''
    # Read data files
    portfolio = read_portfolio(portfoliofile)
    prices = read_prices(pricefile)
    
    # Create the report data
    report = make_report_data(portfolio, prices)
    
    # Print it out
    print_report(report)


def main(args):
    if len(args) != 3:
        raise SystemExit('Usage: %s portfile pricefile' % args[0])
    
    portfolio_report(args[1], args[2])

>>>>>>> 1b27a3f2ed2fb39c7c019d9d350c38ff09ce819b

if __name__ == '__main__':
    import sys
    main(sys.argv)
