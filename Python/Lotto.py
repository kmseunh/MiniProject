from random import randint


def generate_numbers(n):
    numbers = []

    while len(numbers) < n:
        new_number = randint(1, 45)
        if new_number not in numbers:
            numbers.append(new_number)
    return numbers


def draw_winning_numbers():
    winning_numbers = generate_numbers(7)
    return sorted(winning_numbers[:6] + winning_numbers[6:])


def count_matching_numbers(numbers, winning_numbers):
    count = 0

    for num1 in numbers:
        for num2 in winning_numbers:
            if num1 == num2:
                count += 1
    return count


def check(numbers, winning_numbers):
    count = count_matching_numbers(numbers, winning_numbers[:6])
    bonus_count = count_matching_numbers(numbers, winning_numbers[6:])

    if count == 6:
        return 1000000000
    elif count == 5 and bonus_count == 1:
        return 50000000
    elif count == 5:
        return 1000000
    elif count == 4:
        return 50000
    elif count == 3:
        return 5000
    else:
        return 0


# Test
print(check([21, 37, 2, 13, 15, 9], [15, 8, 22, 35, 7, 14, 8]))
