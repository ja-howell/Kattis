
def main():
    s, t, n = input().split()
    s = int(s)
    t = int(t)
    n = int(n)

    walkingtime = []
    tempwalktime = input().split()
    for walk in tempwalktime:
        walkingtime.append(int(walk))

    busride = [] 
    tempbustime = input().split()
    for bustime in tempbustime:
        busride.append(int(bustime))

    busintervals = []    
    tempintervals = input().split()
    for interval in tempintervals:
        busintervals.append(int(interval))

    s += walkingtime[0]

    for l in range(n):
        while busintervals[l] < s:
            busintervals[l] += busintervals[l]
        s += (busintervals[l] - s)
        s += walkingtime[l+1]   

    if s < t:
        print("yes")
    else:
        print("no")

main()
