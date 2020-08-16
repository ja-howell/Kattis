
def main():
    s, t, n = [int(x) for x in input().split()]
    walkingtime = [int(x) for x in input().split()]
    busride = [int(x) for x in input().split()] 
    busintervals = [int(x) for x in input().split()]    

    s += walkingtime[0]

    for l in range(n):
        lastbus = s % busintervals[l]
        waitingtime = 0
        if lastbus != 0:
            waitingtime = busintervals[l] - lastbus
        s += waitingtime
        s += walkingtime[l+1]   

    if s < t:
        print("yes")
    else:
        print("no")

main()
