#!/usr/bin/python

def collatz_folge(n):
    folge = list()
    if not isinstance(n, int) or n <= 0:
        print("Das bilden der Collatz-Folge ist nicht möglich. n ist nicht passend gewählt.")
        return

    while (n > 1):
        folge.append(n)
        if n % 2 == 0:
            n = n//2
        else:
            n = 3 * n + 1
    folge.append(1)

    print(folge)


n = int(input("Gebe ein n für Collatz-Folge ein: "))
collatz_folge(n)