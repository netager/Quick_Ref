# portfolio.py

from collections import Counter
import stock

class Portfolio:
    def __init__(self):
        self._holdings = []
    
    def __iter__(self):
        return self._holdings.__iter__()
    
    def __len__(self):
        return len(self._holdings)
    
    def __getitem__(self, index):
        return self._holdings[index]
    
    def __contains__(self, name):
        return any([ s.name == name for s in self._holdings ])
    
    @property
    def total_cost(self):
        # return sum([ s.cost for s in self._holdings ])    # 리스트 컴프리핸션
        return sum(s.cost for s in self._holdings)          # 제너레이터 표현식 
    
    def tabulate_shares(self):
        total_shares = Counter()
        for s in self._holdings:
            total_shares[s.name] += s.shares
        return total_shares

    def append(self, holding):
        if not isinstance(holding, stock.Stock):
            raise TypeError('Expected a Stock instance')
        self.holdings.append(holding)
