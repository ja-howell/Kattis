def main():
    totallength, hcut, vcut = [int(x) for x in input().split()]
    height = 4
    biggestslice = 0

    slice1 = (hcut * vcut * height)
    biggestslice = slice1

    slice2 = (hcut * (totallength - vcut) * height)
    if slice2 > biggestslice:
        biggestslice = slice2
    
    slice3 = ((totallength - hcut) * (totallength - vcut) * height)
    if slice3 > biggestslice:
        biggestslice = slice3
    
    slice4 = ((totallength - hcut) * vcut * height)
    if slice4 > biggestslice:
        biggestslice = slice4
    
    print(biggestslice)

main()
