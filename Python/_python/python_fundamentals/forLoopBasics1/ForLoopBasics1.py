

for i in range(0,150):
    print(i)

print("-----------------------------------------")

for i in range(5,1000,5):
    print(i)

print("-----------------------------------------")

for i in range(1,100):
    if i%10 is 0:
        print("Coding Dojo")
    elif i%5 is 0:
        print("Coding")
    else:
        print(i)

print("-----------------------------------------")

sum=0
for i in range(0,500000):
    if i%2 is not 0:
        sum+=i
else:
    print(sum)

print("-----------------------------------------")

for i in range(2018,0,-4):
    print(i)

print("-----------------------------------------")

lowNum = 3
highNum = 9
mult=3
for i in range(lowNum,highNum+1,mult):
    print(i)
    
    
    

class Node:
    def  __init__(self,data):
        self.data = data
        self.next = None