from random import randint


def generate_numbers():
    numbers = []

    while len(numbers) < 3:
        new_number = randint(0, 9)
        if new_number not in numbers:
            numbers.append(new_number)
    return numbers


def take_guess():
    new_guess = []

    while len(new_guess) < 3:
        num = int(input("{}번째 수를 입력해주세요: ".format(len(new_guess)+1)))

        if num < 0 or num > 9:
            print("0에서 9까지의 수를 입력해주세요.")
        elif num in new_guess:
            print("중복되는 숫자는 입력할 수 없습니다.")
        else:
            new_guess.append(num)
    return new_guess


def get_score(guess, answer_list):
    strike = 0
    ball = 0

    for i in range(3):
        if guess[i] == answer_list[i]:
            strike += 1
        elif guess[i] in answer_list:
            ball += 1
    return strike, ball


# 게임 시작
ANSWER = generate_numbers()
tries = 0

while True:
    user_guess = take_guess()
    s, b = get_score(user_guess, ANSWER)

    print("{}S {}B\n".format(s, b))
    tries += 1

    if s == 3:
        break
print("{}번 만에 성공!".format(tries))
