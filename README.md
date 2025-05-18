# Number Guessing Game 🎯

A simple yet engaging number guessing game implemented in Java where players try to guess a random number within limited attempts.

## Features

- 🎲 Random number generation between 1-100
- ⏳ Limited attempts (5 guesses)
- 📈 Feedback on each guess (too high/too low)
- 🏆 Win/lose conditions with appropriate messages
- 🖥️ Simple console interface

## How to Play

1. The game selects a random number between 1 and 100
2. You have 5 attempts to guess the number
3. After each guess, you'll get feedback:
   - "Too high!" if your guess is above the target
   - "Too low!" if your guess is below the target
4. If you guess correctly within 5 attempts, you win!
5. If you exhaust all attempts, the game reveals the number

## Example Output

```bash
Guess the number (1-100): 50
Too high! Try again.
Guess the number (1-100): 25
Too low! Try again.
Guess the number (1-100): 37
Too high! Try again.
Guess the number (1-100): 31
Too low! Try again.
Guess the number (1-100): 34
Congratulations! You guessed the number in 4 guesses.
```

```bash
Guess the number (1-100): 10
Too low! Try again.
Guess the number (1-100): 90
Too high! Try again.
Guess the number (1-100): 50
Too high! Try again.
Guess the number (1-100): 30
Too low! Try again.
Guess the number (1-100): 40
Too high! Try again.
Sorry, you ran out of guesses. The number was 37.
```
