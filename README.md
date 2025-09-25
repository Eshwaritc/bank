# 🏦 Simple Banking System (Java)

This is a **menu-driven console application** built in Java that simulates a very basic banking system.  
It allows users to:

- Create a bank account with an account holder name, account number, and initial balance.
- Deposit money into the account.
- Withdraw money (with balance validation).
- Check account balance.
- Display account details.

---

## 📂 Project Structure


- **BankAccount.class** → Handles account operations (deposit, withdraw, balance check, display details).  
- **BankAccountSystem.class** → Contains the `main()` method and provides a menu-driven interface.
- **BankAccountSystem.java** → This is the main program

---

## 🚀 How to Compile & Run

### 1. Compile the code
javac BankAccountSystem.java

This will generate:

BankAccountSystem.class

BankAccount.class

---

### 2.Run the program

java BankAccountSystem

---

## 📖 Sample Execution

Welcome to Simple Banking System

Enter Account Holder Name: Eshwari

Enter Account Number: 12345

Enter Initial Balance: 1000

========= MENU =========

1. Check Balance
2. Deposit Money
3. Withdraw Money
4. Display Account Details
  
6. Exit

========================

Enter your choice: 1
Current Balance: 1000.0

---

✨ Features

✅ Input validation (prevents negative deposits/withdrawals).

✅ Displays error if withdrawal exceeds balance.

✅ Loops menu until user chooses to exit.

---

🛠️ Requirements

🔸Java Development Kit (JDK 8 or later)

🔸Command line / Terminal / VS Code with Java extensions
