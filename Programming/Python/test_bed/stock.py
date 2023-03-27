class Stock:
    def __init__(self, name, shares, price):
        self.name = name
        self.shares = shares
        self.price = price
<<<<<<< HEAD
        
    def cost(self):
        return self.shares * self.price
        
    def sell(self, shares):
        self.shares -= shares            
=======
    
        
    def cost(self):
        return self.shares * self.price  
    
    
    def sell(self, shares):
        self.shares -= shares
        return self.shares  
>>>>>>> 1b27a3f2ed2fb39c7c019d9d350c38ff09ce819b
