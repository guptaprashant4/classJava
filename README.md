# classJava

A collection of Java programs written for an introductory Java programming course in college.

---

## Projects

### Higher Lower Dice Game — `HighLowGame.java`

A two-player dice game where you compete against the computer. Both sides roll 5 dice, and you guess whether your total will be higher or lower than the computer's. Displays ASCII art dice faces for each roll.

```
$ javac HighLowGame.java && java HighLowGame

Welcome
Higher Lower Game
...
Rolling dice....

[your 5 dice displayed as ASCII art]
Your total: 18

Computer rolling dice....

Enter your guess
Is your number higher or lower than computer's?
Type h/hi/higher if you guess your value will be higher
Type l/lo/lower if you guess your value will be lower

 --> higher

Computer's dice:
[computer's 5 dice displayed as ASCII art]
Computer total: 14

You guessed correctly.
You Won!!
```

---

### Roman Numeral Converter — `romanToDecimal.java`

Converts a decimal number (1–999) to its Roman numeral equivalent. Handles hundreds, tens, and units digits separately using switch statements.

```
$ javac romanToDecimal.java && java romanToDecimal

The program will convert base ten numbers to Roman numerals

Enter base ten numbers ranging from 1 to 999
If you want to enter 769, simply enter 769 and hit Enter/Return
--> 769

The isolated digits are: 7 6 9
The roman numeral for entered base ten number is: DCCLXIX
```

---

### Array Comparison — `ArrayComparison.java`

Generates two random arrays of 20 integers (range -10 to 15) and compares them element by element, reporting how many times each array had the higher value and how many ties occurred.

```
$ javac ArrayComparison.java && java ArrayComparison

index  0:  -3   5
index  1:   7  -1
index  2:  12  12
...

array 1 has  8 highs
array 2 has  9 highs
 There are  3 tie(s)
```

---

### Rock Paper Scissors — `rockPaperScissor/`

A Rock Paper Scissors game playable against the computer.

---

### Other Files

| File | Description |
|---|---|
| `first_java_program.java` | First Hello World / intro program |
| `print_random_num.java` | Generates and prints a random number |

---

## Requirements

- Java 8 or higher

## Compiling and Running

```bash
javac FileName.java
java FileName
```

For example:

```bash
javac HighLowGame.java
java HighLowGame
```

---

## Course

Introductory Java Programming course in college.
