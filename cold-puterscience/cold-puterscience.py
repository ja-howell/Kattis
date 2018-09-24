days = input()
days = int(days)
coldDays = 0
temps = input().split()

for i in temps:
    if int(i) < 0:
        coldDays = coldDays + 1

print(coldDays)
