#!/usr/bin/python


def finde_primzahlen(max_number=1000):
    prim_list = list()
    prim_list.append(2)

    for n in range(3, max_number + 1):
        is_prim = True
        for prim in prim_list:
            if n % prim == 0:
                is_prim = False
                break
        if is_prim:
            prim_list.append(n)
            #print(n)
        n += 1

    print(prim_list)


finde_primzahlen()