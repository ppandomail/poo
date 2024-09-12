class FizzBuzzOO:

    def __init__(self, n):
        self.__n = n

    def fizzbuzz(self):
        for i in range(1, self.__n + 1):
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


FizzBuzzOO(20).fizzbuzz()
