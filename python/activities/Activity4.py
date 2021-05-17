user1 = input("Enter first user name - ")
user2 = input("Enter second user name - ")

while True:

    user1_answer = input(user1+" do you want to choose rock, paper or scissor? ").lower()
    user2_answer = input(user2+" do you want to choose rock, paper or scissor? ").lower()
    
    if user1_answer == user2_answer:
        print("Its a tie!")
    elif user1_answer == "rock":
        if user2_answer == "scissor":
            print("Rocks win!")
        else:
            print("paper win!")

    elif user1_answer == 'scissor':
        if user2_answer == 'paper':
            print("Scissor win!")
        else:
            print("Rock wins!")

    elif user1_answer == 'paper':
        if user2_answer == 'rock':
            print("Paper wins!")
        else:
            print("Scissor win!")
    else:
        print("Invalid input! You have not entered rock, paper or scissors, try again.")

    play_again = input("Do you want to play again? Yes/No - ").lower()
    print(play_again)
    if(play_again == "yes"):
        pass
    elif( play_again == "no"):
        raise SystemExit
    else:
        print("invalid option. Exiting now!")
        raise SystemExit