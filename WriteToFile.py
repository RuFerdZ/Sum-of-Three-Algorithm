
count = int(input("How many numbers to generate: "))
import random
f = open("SumOfThree.txt", "w")
for x in range (count):
    num = random.randint(-10,10)*5
    f.write(str(num)+"\n")
f.close()
