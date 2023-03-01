import random

player_cards = []
dealer_cards = []
gameOver = False

# 카드 생성
def create_card():
    cards = [11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10]
    return random.choice(cards)


for _ in range(2):
    player_cards.append(create_card())
    dealer_cards.append(create_card())

# 카드 점수 계산
def calculate_score(cards_score):
    total = sum(cards_score)
    if total == 21:
        return 0
    elif total > 21:
        return total
    elif total < 21:
        return total

# 게임 종료
def stopGame():
    if player_score == 0:
        print(f"Player Win!!")
        return True
    elif dealer_score == 0:
        print(f"Dealer Win!!")
        return True
    elif player_score > 21:
        print(f"Player 점수가 21 이상이기 때문에 Lose..")
        return True
    elif dealer_score > 21:
        print(f"Dealer 점수가 21 이상이기 때문에 Lose..")
        return True
    return False

# 점수 비교
def compare(player, dealer):
    print(f"player cards: {player_cards}, dealer cards: {dealer_cards}")
    print(
        f"player score: {calculate_score(player_cards)}, dealer cards: {calculate_score(dealer_cards)}")
    if player > dealer:
        print("Player Win!!")
    else:
        print("Player Lose..")
    return True


# 게임 시작
print("블랙잭 게임을 시작하겠습니다.")

while not gameOver:
    print(f"player's cards: {player_cards}, dealer's cards: {dealer_cards[0]}")
    player_score = calculate_score(player_cards)
    dealer_score = calculate_score(dealer_cards)
    print(f"player's score: {calculate_score(player_cards)}")

    if stopGame():
        break

    doHit = str(input("Hit 하시겠습니까?? Type 'y' or 'n': "))

    if doHit == 'y':
        player_cards.append(create_card())
    elif doHit == 'n':
        while dealer_score < 17:
            print("dealer가 카드 한 장을 뽑습니다.")
            dealer_cards.append(create_card())
            dealer_score = calculate_score(dealer_cards)
        gameOver = compare(player_score, dealer_score)
