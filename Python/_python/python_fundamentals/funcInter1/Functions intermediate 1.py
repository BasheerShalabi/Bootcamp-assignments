import random

def randInt(min=0,max=100):
    if min>max:
        return 0
    return round((random.random()*abs(max) )+min) 


print(randInt())
print(randInt(max=10))
print(randInt(min=2))
print(randInt(3,6))
print(randInt(-6,-3)) # can take negatives
print(randInt(0,0))
