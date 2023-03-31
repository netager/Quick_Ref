# ticker.py

from follow import follow
import csv
import report
import tableformat

def select_columns(rows, indices):
    for row in rows:
        yield [ row[index] for index in indices ]


def convert_types(rows, types):
    for row in rows:
        yield [ func(val) for func, val in zip(types, row) ]
    

def make_dict(rows, headers):
    for row in rows:
        yield dict(zip(headers, row))
        

def parse_stock_data(lines):
    rows = csv.reader(lines)
    rows = select_columns(rows, [0, 1, 4])
    rows = convert_types(rows, [str, float, float])
    rows = make_dict(rows, ['name','price', 'change'])
    return rows


def filter_symbols(rows, names):
    # for row in rows:
    #     if row['name'] in names:
    #         yield row
    yield (row for row in rows if row['name'] in names)
     
        # if any([ name.name == row['name'] for name in names ]):
        #     yield row


def ticker(portfile, logfile, fmt):
    portfolio = report.read_portfolio(portfile)
    rows = parse_stock_data(follow(logfile))             # 생산자/처리자
    rows = filter_symbols(rows, portfolio)
    formatter = tableformat.create_formatter(fmt)
    formatter.headings(['Name','Price','Change'])
    for row in rows:
        formatter.row([ row['name'], f"{row['price']:0.2f}", f"{row['change']:0.2f}"] )
    

def main(args):
    if len(args) != 4:
        raise SystemExit('Usage: %s portfile pricefile' % args[0])
    
    ticker(args[1], args[2], args[3])


rows = ticker('../../data/portfolio.csv', '../../data/stocklog.csv', 'txt')    


if __name__ == '__main__':
    import sys
    main(sys.argv)            
