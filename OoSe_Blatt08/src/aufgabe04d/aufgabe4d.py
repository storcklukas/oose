#!/usr/bin/python

def primfaktoren(n):
    if n < 2:
        print("Fehler: Zahl zu klein!")
        return
    p = list()
    i = 2
    while n > 1:
        if n % i == 0:
            p.append(i)
            n /= i
            i = 2
        else:
            i += 1
    return p

for a in range(2,101):
    print(str(a) + ": " + str(primfaktoren(a)))