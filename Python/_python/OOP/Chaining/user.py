from bankaccount import Bankaccount
class User:
    def __init__(self, name, email, balance):
        self.name= name
        self.email=email
        self.bankaccount=Bankaccount(balance)
    
    def make_withdrawl(self, amount):
        self.bankaccount.balance -= amount
        return self
    def display_user_balance(self):
        print(self.name, self.bankaccount.balance)
        return self

    def transfer_money(self,other_user, amount):
        other_user.bankaccount.balance += amount
        self.make_withdrawl(amount)
        return self
    def make_deposit(self, amount):
        self.bankaccount.balance +=amount
        return self
        