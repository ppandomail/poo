def fizzbuzz(n):
    for i in range(1, n+1):
        if (i % 3 == 0) & (i % 5 == 0):
            print('FizzBuzz')
        else:
            if i % 3 == 0:
                print('Fizz')
            else:
                if i % 5 == 0:
                    print('Buzz')
                else:
                    print(i)


fizzbuzz(20)
