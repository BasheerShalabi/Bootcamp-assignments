from user import User

Wasim= User("Wasim", "w.a@gmaail.com" , 5000)
Saher= User( "Saher", "s.k@gmail.com", 1000)
Bashir=User("Bashir", "b.s@gmail.com", 2000)

Wasim.make_deposit(4000).make_deposit(300).make_deposit(200).make_withdrawl(3000).display_user_balance()

Saher.make_deposit(5000).make_deposit(330).make_withdrawl(1000).make_withdrawl(300).display_user_balance()

Bashir.make_deposit(290).make_withdrawl(100).make_withdrawl(1000).make_withdrawl(300).display_user_balance()

Wasim.transfer_money(Bashir, 400).display_user_balance()

Bashir.display_user_balance()

