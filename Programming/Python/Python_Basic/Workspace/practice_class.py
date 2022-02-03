class Unit:
    def __init__(self):
        print("Unit 생성자")

class Flyable:
    def __init__(self):
        print("Flyable 생성자")

class FlyableUnit(Unit, Flyable):
    def __init__(self):
        #super().__init__()
        Unit.__init__(self)
        Flyable.__init__(self)

class FlyableUnit1(Flyable, Unit):
    def __init__(self):
        super().__init__()

# 드랍쉽  
dropship = FlyableUnit()      
dropship1 = FlyableUnit1()      
