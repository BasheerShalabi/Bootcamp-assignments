class MathDojo:
    def __init__(self):
        self.result = 0
    def add(self, *nums):
        for i in range(len(nums)):
            self.result += nums[i]
        return self
    def subtract(self, *nums):
        for i in range(len(nums)):
            self.result -= nums[i]
        return self
# create an instance:
md = MathDojo()

print(md.add(3).add(2,4).add(4,7,9).result)

print(md.subtract(3).subtract(2,4).subtract(4,7,9).result)

x = md.add(2).add(2,5,1).subtract(3,2).result

print(x)    # should print 5
# run each of the methods a few more times and check the result!

