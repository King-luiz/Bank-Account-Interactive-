
# **Interactive BankAccount Program – Java (Advanced Version)**

This project is an **enhanced and interactive version** of the basic BankAccount program.
It allows users to deposit, withdraw, and check their balance **through a menu-driven console interface**.

---

<p align="center">
  <img src="https://img.shields.io/badge/Language-Java-red?style=for-the-badge" />
  <img src="https://img.shields.io/badge/Input-Interactive-yellow?style=for-the-badge" />
  <img src="https://img.shields.io/badge/OOP-Encapsulation-blue?style=for-the-badge" />
  <img src="https://img.shields.io/badge/Level-Intermediate-green?style=for-the-badge" />
  <img src="https://img.shields.io/badge/Status-Completed-success?style=for-the-badge" />
</p>

---

## **📌 Overview**

This program expands the previous version by allowing **real-time user interaction**.
Users can:

* Enter an initial balance
* Deposit money
* Withdraw money
* Check their current balance
* Exit the system

The program is menu-driven and runs inside a loop until the user chooses to exit.

---

## **✨ Key Features**

### ✔️ **Interactive Menu System**

Users can choose actions through keyboard input using a numerical menu.

### ✔️ **Real-time Transaction Processing**

Deposits and withdrawals execute instantly with validation.

### ✔️ **Input Handling with Scanner**

Uses `java.util.Scanner` for user input.

### ✔️ **Error Handling**

Includes checks for:

* Negative deposits
* Negative or zero withdrawals
* Insufficient funds
* Invalid menu choices

### ✔️ **Clean OOP Design**

Fully encapsulated `BankAccount` class with:

* `deposit()`
* `withdraw()`
* `getBalance()`

---

## **📂 Project Structure**

```
├── BankAccount.java                 # Handles account operations
└── BankAccountInteractive.java      # Handles user input & menu display
```

---

## **🧭 Program Flow Diagram**

```
                   ┌────────────────────────┐
                   │ Enter Initial Balance  │
                   └───────────┬────────────┘
                               ▼
                    ┌────────────────────────┐
                    │     Display Menu       │
                    └───────────┬────────────┘
                                │
      ┌─────────────────────────┼─────────────────────────┐
      ▼                         ▼                         ▼
┌──────────────┐       ┌────────────────┐      ┌─────────────────┐
│ Deposit()    │       │ Withdraw()     │      │ Check Balance() │
└──────┬───────┘       └──────┬─────────┘      └─────────┬───────┘
       │                       │                         │
       └───────────────┬──────┴────────┬────────────────┘
                       ▼               ▼
                ┌────────────────────────┐
                │    Back to Menu        │
                └───────────┬────────────┘
                            ▼
                     Exit if option=4
```

---

## **🖥️ Sample Program Output**
<img width="1536" height="1024" alt="ChatGPT Image Nov 24, 2025, 03_08_49 PM" src="https://github.com/user-attachments/assets/221dace2-46d0-4550-a00d-9c797b5b11b1" />


```
Enter initial balance: 5000

===== BANK MENU =====
1. Deposit Money
2. Withdraw Money
3. Check Balance
4. Exit
Choose an option: 1
Enter deposit amount: 2000
Successfully Deposited: 2000

===== BANK MENU =====
Choose an option: 2
Enter withdrawal amount: 7000
Insufficient funds! Withdrawal failed.
```

---

## **🚀 How to Run the Program**

### **1. Compile**

```bash
javac BankAccountInteractive.java
```

### **2. Run**

```bash
java BankAccountInteractive
```
---

## **👤 Developer Information**
```
**Name:** Lewins Mureithi Nderitu (Lewins Luiz)
📱  Phone: +254 112876340
📧 Email:  mureithilewins@gmail.com
🐙 GitHub: https://github.com/King-luiz](https://github.com/King-luiz
```
---

## **⭐ Support & Feedback**

If you like this project, consider giving it a **star ⭐ on GitHub**
