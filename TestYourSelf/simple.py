""" FIND THE BEST, AVERAGE AND WORST CASES FOR ALL THE ALGORITHMS
    THERE SHOULD BE A DETAILED ANALYSIS OF EACH LINE
"""



def FIND1(A, v):
    i = 0              
    while i < len(A)-1 and A[i] != v:
        i+=1
    if i == len(A):
        return -1
    return i

def FIND2(A, v):
    i = 0
    j = len(A)-1
    while i <= j:
        if A[i] == v:
            return i
        elif A[j] == v:
            return j
        else:
            i+=1
            j-=1
    return -1

def INSERTION(A, idx, val):
    A[idx] = val 

def MINIMUM(A):
    M = A[0]
    for i in A[1:]:
        if A[i] < M:
            M = A[i]
    return M

def MAXIMUM(A):
    M = A[0]
    for i in A[1:]:
        if A[i] > M:
            M = A[i]
    return M





