Feature: FizzBuzz
  3의 배수에서는 Fizz, 5의 배수에서는 Buzz, 3과 5의 배수에서는 FizzBuzz, 나머지는 숫자를 출력하는 프로그램을 작성

  Scenario Outline: FizzBuzz의 동작
    When <input>을(를) 입력하면
    Then <output>이(가) 출력된다
    Examples:
      | input | output |
      | 1     | 1      |
      | 2     | 2      |
      | 3     | Fizz   |
      | 5     | Buzz   |
      | 6     | Fizz   |
      | 10    | Buzz   |
      | 15    | FizzBuzz   |
      | 30    | FizzBuzz   |
