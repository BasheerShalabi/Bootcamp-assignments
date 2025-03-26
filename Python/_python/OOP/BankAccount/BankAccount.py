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


basheer = BankAccount(0.04,6000)
shalabi = BankAccount(0.03,5000)

basheer.make_deposit(500).make_deposit(300).make_deposit(700).make_withdrawl(2400).yeild_interest().display_account_info()

shalabi.make_deposit(300).make_deposit(300).make_withdrawl(100).make_withdrawl(100).make_withdrawl(100).make_withdrawl(100).yeild_interest().display_account_info()

