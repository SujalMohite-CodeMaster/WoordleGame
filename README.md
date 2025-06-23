# 🎮 Wordle Puzzle Game (Java)

A **command-line implementation** of the popular Wordle game, built with Core Java. Guess the hidden word within 6 attempts, with feedback for correct/incorrect letters!

![Demo Screenshot](https://github.com/SujalMohite-CodeMaster/WoordleGame/blob/master/src/Screenshot%202025-06-23%20102944.png)

## 🛠️ Technologies Used
- **Core Java** (OOPs, Collections, File I/O)
- **Java Scanner** for user input
- **Text-based UI** (No external libraries)

## ✨ Features
- ✅ **Word Validation**: Checks if guesses are valid 5-letter words.
- 📊 **Hints**: Colors indicate correct letters (🟩), misplaced letters (🟨), and incorrect letters (⬛).
- 📁 **Word Bank**: 100+ words loaded from a text file.
- 🔄 **Replayability**: Random word selection for each game.

## 🚀 How to Run
1. **Prerequisites**: Java JDK 8+ installed.
2. **Clone the repo**:
   ```bash
   git clone https://github.com/SujalMohite-CodeMaster/WoordleGame.git
## compile and execute 
cd WoordleGame/src
javac WordleGame.java
java WordleGame

## Project Structure
WoordleGame/
├── src/
│   ├── WordleGame.java      # Main game logic
│   ├── words.txt           # Word bank
├── README.md
