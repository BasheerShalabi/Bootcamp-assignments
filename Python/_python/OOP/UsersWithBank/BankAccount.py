class BankAccount:
    def __init__(self,int_rate, balance):
        self.balance=balance
        self.int_rate=int_rate
    
    def make_withdrawl(self, amount):
        self.balance -= amount
        return self
    
    def display_account_info(self):
        print(self.balance)
        return self
    
    def make_deposit(self, amount):
        self.balance +=amount
        return self
    
    def yeild_interest(self):
        self.balance += self.balance*self.int_rate
        return self