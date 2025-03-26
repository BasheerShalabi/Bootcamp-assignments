from BankAccount import BankAccount
class User:
    def __init__(self, name, email):
        self.name= name
        self.email=email
        self.bankaccount=None

    def add_account(self, balance=0 , int_rate=0):
        if self.bankaccount is None: 
            self.bankaccount = []
        self.bankaccount.append(BankAccount(int_rate,balance))
        return self

    def make_withdrawl(self, amount,accountnumber=0):
        if self.bankaccount is None: 
            return self
        self.bankaccount[accountnumber].make_withdrawl(amount)
        return self
    def display_user_balance(self,accountnumber=0):
        if self.bankaccount is None: 
            return self
        self.bankaccount[accountnumber].display_account_info()
        return self

    def transfer_money(self,other_user, amount,accountnumber=0):
        if self.bankaccount is None: 
            return self
        other_user.make_deposit(amount)
        self.make_withdrawl(amount,accountnumber)
        return self
    def make_deposit(self, amount,accountnumber=0):
        if self.bankaccount is None: 
            return self
        self.bankaccount[accountnumber].make_deposit(amount)
        return self


basheer = User("basheer","a.b@g.com")
shalabi = User("shalabi","a.b@g.com")

basheer.add_account(5000,0.06).add_account(7000)
shalabi.add_account(5000,0.02).add_account(10000,0.01)

basheer.make_deposit(500).make_deposit(300).make_deposit(700).make_withdrawl(2400).bankaccount[0].yeild_interest().display_account_info()
basheer.make_deposit(500,1).make_deposit(300,1).make_deposit(700,1).make_withdrawl(2400,1).bankaccount[1].yeild_interest().display_account_info()

shalabi.make_deposit(300).make_deposit(300).make_withdrawl(100).make_withdrawl(100).make_withdrawl(100).make_withdrawl(100).bankaccount[0].yeild_interest().display_account_info()
shalabi.make_deposit(300,1).make_deposit(300,1).make_withdrawl(100,1).make_withdrawl(100,1).make_withdrawl(100,1).make_withdrawl(100,1).bankaccount[1].yeild_interest().display_account_info()
