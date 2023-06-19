import sys

T = int(sys.stdin.readline())
arr = []

for i in range(0, T) :
    A, B = map(int, sys.stdin.readline().split())
    arr.append(A + B)

for i in arr : print(i)