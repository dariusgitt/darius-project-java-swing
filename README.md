# DARIUS Project - Java Swing Desktop App

A Java desktop application built with Java Swing in NetBeans.
It opens with a Main Menu that lets users choose between two services:

- **Pizza Order** - Order your favorite pizza early
- **PNG Power Recharge** - Recharge your PNG Power meter instantly

Built as an S3 project

## Features

### Main Menu (`MainMenu.java`)
- Navigation to Pizza Order and PNG Power Recharge
- Safe Exit button

### Pizza Order (`PizzaOrder.java`)
- Size selection: Small (K6.00), Medium (K15.00), Large (K20.00)
- Toppings: Onion, Cheese, Mushroom, Chicken
- Quantity input with validation (must be a positive number)
- Price calculation: (size price + topping price) x quantity
- Receipt / order summary shown in output area
- Clear button resets size, quantity and toppings
- Back to Main Menu button

### PNG Power Recharge (`PNGPowerRecharge.java`)
- Enter Meter Number and Recharge Amount
- Calculates Units Purchased: `units = amount / 0.8`
- Saves every recharge to database with timestamp
- Shows receipt: Meter Number, Amount, Units, Recharge Time
- Clear button resets the form
- Back to Main Menu button

## Tech Used
- Java (JDK 8+)
- Java Swing / AWT
- JDBC + UCanAccess
- MS Access Database (`easyPay.mdb`) - table: `Recharge`
- NetBeans IDE

## Database
Table: `Recharge`
| Column | Type |
| --- | --- |
| meterNo | INT |
| rechargeAmount | DOUBLE |
| unitPurchased | DOUBLE |
| rechargeTime | TIMESTAMP |

## Fixes Applied

### 1. Pizza Order - Fixed NullPointerException (Crash)
**Error:** Clicking Place Order without picking a size crashed the app.
```java
// BEFORE - crashes if size is null
if (size.equals("Small")) price += 6.00;
```
**Fix:** Null-safe comparison + message to user:
```java
// AFTER
if ("Small".equals(size)) price += 6.00;
else if ("Medium".equals(size)) price += 15.00;
else if ("Large".equals(size)) price += 20.00;
else {
    ta_output.setText("Please select a pizza size.");
    return;
}
```

### 2. PNG Power Recharge - Fixed Hardcoded Database Path
**Error:** Database path only worked on one school computer:
```java
// BEFORE
String path = "C:\\Users\\STUDENT\\Desktop\\DARIUSJR_SEM3_JAVA\\DariusJr_S3_Project\\easyPay.mdb";
```
**Fix:** Relative path - works on any computer:
```java
// AFTER
String path = "easyPay.mdb";
```
Put `easyPay.mdb` in the project folder.

### 3. PNG Power Recharge - Fixed Crash on Invalid Input
**Error:** Blank input, letters, zero or negative numbers crashed on `Integer.parseInt()` / `Double.parseDouble()`.
**Fix:** Validate before parsing:
- Blank -> "Please enter both Meter Number and Amount."
- Letters -> "Invalid input. Meter Number must be whole number and Amount must be a number."
- Zero / negative -> "Please enter a positive Meter Number and Amount."

### 4. PNG Power Recharge - Database Errors Now Visible + Resources Closed
**Error:** `catch (SQLException)` only printed to console - user saw a blank screen.
**Fix:** Error is now shown in the output area, and `PreparedStatement` / `Connection` are closed after use.

## Project Structure
```
DARIUS_project/
├── MainMenu.java
├── MainMenu.form
├── PizzaOrder.java
├── PizzaOrder.form
├── PNGPowerRecharge.java
├── PNGPowerRecharge.form
├── easyPay.mdb  (not in repo - see Setup below)
├── README.md
└── .gitignore
```

## Setup - IMPORTANT

This project needs the UCanAccess JDBC driver and the Access database.
It will NOT run on another computer without these 2 steps:

1. **Add UCanAccess JARs to your project libraries:**
   - ucanaccess-*.jar
   - jackcess-*.jar
   - hsqldb.jar
   - commons-lang3.jar
   - commons-logging.jar

2. **Database file:**
   - Place `easyPay.mdb` in the project folder

## How to Run
1. Open the project in NetBeans
2. Add the UCanAccess JARs above to Libraries
3. Make sure all files are in package `DARIUS_project`
4. Run > Clean and Build Project
5. Right-click `MainMenu.java` > Run File
   OR run from terminal:
```bash
javac DARIUS_project/*.java
java DARIUS_project.MainMenu
```

## How to Test the Fixes
- Pizza Order > Place Order with no size selected -> shows "Please select a pizza size." (no crash)
- PNG Power > Recharge with blank / letters -> shows "Invalid input..." (no crash)
- PNG Power > Recharge with real meter + amount -> saves to DB + shows receipt
- PNG Power > Recharge with `easyPay.mdb` missing -> shows "Database error..." in the app

## Author
Darius Jnr Jonah - S3 Project 2026
Aspiring Oracle Database Administrator | Java | Oracle DBA
GitHub: https://github.com/dariusgitt
