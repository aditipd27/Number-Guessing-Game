# Number-Guessing-Game

Here's a detailed and professional README for your **Number Guessing Game** project to use on GitHub:

---

# Number Guessing Game 🎮  

A simple Java-based console application where the player guesses a randomly generated number. This game demonstrates fundamental programming concepts such as loops, conditionals, user input handling, and random number generation.

## Features ✨  
- Generates a random number between 1 and 100.  
- Provides feedback on each guess ("Too high", "Too low").  
- Tracks the number of attempts made by the user.  
- Encourages user interaction through a looping mechanism until the correct number is guessed.  

---

## How to Run 🚀  

1. **Clone the Repository**:  
   ```bash
   git clone https://github.com/yourusername/number-guessing-game.git
   cd number-guessing-game
   ```

2. **Compile the Java File**:  
   ```bash
   javac NumberGuessingGame.java
   ```

3. **Run the Program**:  
   ```bash
   java NumberGuessingGame
   ```

4. **Gameplay Instructions**:  
   - Enter a number between 1 and 100 when prompted.  
   - The game will guide you with hints until you guess the correct number.  
   - Enjoy the challenge! 🎉  

---

## Code Overview 🛠️  

The project contains:  
1. **NumberGuessingGame.java**: The source code file implementing the game logic.  
2. **NumberGuessingGame.class**: The compiled bytecode, ready for execution.  

### Core Logic  
- **Random Number Generation**: Generates the number to be guessed using `java.util.Random`.  
- **User Input**: Reads guesses via `java.util.Scanner`.  
- **Feedback Mechanism**: Offers real-time feedback ("Too high", "Too low", or "Correct").  
- **Looping**: Ensures the game runs until the correct number is guessed.  

---

## Example Gameplay 🖥️  

```plaintext
Welcome to the Number Guessing Game!
Guess a number between 1 and 100:
50
Too high! Try again:
25
Too low! Try again:
37
Congratulations! You've guessed the correct number in 3 tries.
```

---

## Future Improvements 🌟  
- Add a graphical user interface (GUI) using Java Swing or JavaFX.  
- Implement difficulty levels (e.g., Easy: 1-50, Medium: 1-100, Hard: 1-500).  
- Track and display the player's highest score.  
- Add a feature to replay the game without restarting the program.  

---

## License 📜  
This project is licensed under the MIT License. Feel free to use, modify, and distribute the code.  

---

Feel free to customize the repository with this README and let me know if you'd like to include additional details! 🚀
