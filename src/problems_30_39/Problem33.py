# alex sullivan
# problem 33

# The fraction 49/98 is a curious fraction, as an inexperienced mathematician
# in attempting to simplify it may incorrectly believe that 49/98 = 4/8, which is correct,
# is obtained by cancelling the 9s.
#
# We shall consider fractions like, 30/50 = 3/5, to be trivial examples.
#
# There are exactly four non-trivial examples of this type of fraction, less than one in
# value, and containing two digits in the numerator and denominator.
#
# If the product of these four fractions is given in its lowest common terms, find
# the value of the denominator.
def solve(i, j):
    for num in xrange(0,2):
        for den in xrange(0,2):
            curr_num = ((i) / pow(10,num))%10
            curr_den = ((j) / pow(10,den))%10

            other_num = ((i) / pow(10,abs(num-1)))%10
            other_den = ((j) / pow(10, abs(den-1)))%10



            if(curr_num == 0 or curr_den == 0):
                continue

            if(other_den == 0):
                continue

            if(curr_num == curr_den):
                if((i*1.0)/j == (other_num*1.0) / other_den ):
                    print i,j


def solve33():
    for i in xrange(10,100):
        for j in xrange(i,100):
            if(i == j ):
                continue

            solve(i, j)


if __name__ == "__main__":
    solve33()
    # solve(49, 98)
