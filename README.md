# ChaiCode Java Labs

Master Java fundamentals through **47 real-world, story-based challenges**. Each exercise puts you in a practical scenario — cinema ticketing, ATM withdrawals, email validation, and more.

**279 JUnit tests across 10 topics**

Edit the Java files on your machine and run tests with Maven. Only edit files under `src/main/java/` — never change the test files.

---

## Table of contents

1. [Prerequisites](#prerequisites)
2. [Setup guide](#setup-guide)
3. [How to run tests](#how-to-run-tests)
4. [Topics covered](#topics-covered)
5. [Suggested learning order](#suggested-learning-order)
6. [Project structure](#project-structure)
7. [How to solve a challenge](#how-to-solve-a-challenge)
8. [Troubleshooting](#troubleshooting)
9. [Progress checklist](#progress-checklist)

---

## Prerequisites

Everything you need before opening the project.

### Required

| Requirement | Minimum version | Why you need it |
|-------------|-----------------|-----------------|
| **Java JDK** | 17 or higher | Compiles and runs the lab code |
| **Internet connection** | — | First Maven run downloads JUnit and dependencies |
| **Terminal** | — | PowerShell, Command Prompt, or Mac/Linux terminal |

### Optional (recommended)

| Tool | Why it helps |
|------|--------------|
| **VS Code** or **IntelliJ IDEA** | Edit Java with syntax highlighting and one-click test runs |
| **Extension Pack for Java** (VS Code) | Run individual tests from the editor |
| **Git** | Version control for your solutions |

### You do NOT need

| Tool | Reason |
|------|--------|
| **Maven installed globally** | This project includes `mvnw` / `mvnw.cmd` (Maven Wrapper) |
| **Paid IDE license** | IntelliJ Community Edition is free and works fine |

### System requirements

- **Windows 10/11**, **macOS**, or **Linux**
- ~200 MB disk space (more after first Maven build in `target/`)
- JDK 17+ from [Adoptium](https://adoptium.net/) or [Oracle](https://www.oracle.com/java/technologies/downloads/)

---

## Setup guide

Follow these steps once before you start solving challenges.

### Step 1 — Install Java JDK 17+

**Windows**

1. Download JDK 17+ from [Adoptium](https://adoptium.net/)
2. Run the installer (keep default options)
3. Restart your terminal and IDE after install

**macOS**

```bash
brew install openjdk@17
```

Or download from Adoptium and install the `.pkg`.

**Linux (Ubuntu/Debian)**

```bash
sudo apt update
sudo apt install openjdk-17-jdk
```

### Step 2 — Verify Java is installed

Open a terminal and run:

```bash
java -version
```

You should see output like:

```
openjdk version "17.0.x" ...
```

Also check the compiler:

```bash
javac -version
```

If either command is not found, Java is not on your PATH. Reinstall JDK or add `JAVA_HOME` to your environment variables.

**Windows — set JAVA_HOME (if IDE cannot find Java)**

1. Search **Environment Variables** in Windows
2. Add a new system/user variable:
   - Name: `JAVA_HOME`
   - Value: `C:\Program Files\Eclipse Adoptium\jdk-17.x.x-hotspot` (your actual JDK path)
3. Add `%JAVA_HOME%\bin` to your `Path` variable
4. Restart terminal and IDE

### Step 3 — Get the project on your machine

If you already have the folder, skip to Step 4.

```bash
# Example — clone or copy the project folder
cd C:\coding-room
# Your project should be at:
# C:\coding-room\chaicode-java-labs
```

### Step 4 — Open the project

**VS Code**

1. **File → Open Folder**
2. Select `chaicode-java-labs` (the folder that contains `pom.xml`)
3. Install **Extension Pack for Java** when prompted
4. Wait for the Java language server to finish loading (status bar bottom-right)

**IntelliJ IDEA**

1. **File → Open**
2. Select the `chaicode-java-labs` folder
3. IntelliJ detects Maven automatically — click **Load Maven Project** if asked

### Step 5 — First build (download dependencies)

Open a terminal **in the project root** (where `pom.xml` lives).

**Windows (PowerShell or Command Prompt)**

```powershell
cd C:\coding-room\chaicode-java-labs
.\mvnw.cmd test
```

**macOS / Linux**

```bash
cd /path/to/chaicode-java-labs
chmod +x mvnw
./mvnw test
```

**What to expect on first run**

- Maven downloads JUnit and plugins (1–3 minutes depending on network)
- You will see **many failing tests** — this is normal
- Your job is to implement the methods and make tests pass

**Successful first run looks like:**

```
Tests run: 279, Failures: ..., Errors: ...
BUILD SUCCESS   ← build succeeded (tests may still fail until you write code)
```

If the build itself fails (compile errors, Maven not found), see [Troubleshooting](#troubleshooting).

### Step 6 — Fix PowerShell execution policy (Windows only, if needed)

If you see:

```
.\mvnw.cmd cannot be loaded because running scripts is disabled
```

Run once:

```powershell
Set-ExecutionPolicy -Scope CurrentUser RemoteSigned
```

Or use **Command Prompt** instead:

```cmd
cd C:\coding-room\chaicode-java-labs
mvnw.cmd test
```

### Step 7 — Confirm you are in the right folder

Your terminal should list these files:

```
pom.xml
mvnw.cmd        (Windows) or mvnw (Mac/Linux)
README.md
src/
```

Always run Maven commands from this folder, not from `src/`.

---

## How to run tests

All commands below assume you are in the project root.

**Windows:** use `.\mvnw.cmd`  
**macOS / Linux:** use `./mvnw`

---

### Run ALL tests (entire lab)

Runs every test class in the project (279 tests).

```powershell
.\mvnw.cmd test
```

```bash
./mvnw test
```

Use this to check overall progress after completing several challenges.

**Example output when done:**

```
Tests run: 279, Failures: 0, Errors: 0, Skipped: 0
BUILD SUCCESS
```

---

### Run ONE challenge (entire test class)

Each challenge has one test class, e.g. `EmployeeBadgeTest` for `EmployeeBadge.java`.

```powershell
.\mvnw.cmd test -Dtest=EmployeeBadgeTest
```

```bash
./mvnw test -Dtest=EmployeeBadgeTest
```

**More examples:**

```powershell
.\mvnw.cmd test -Dtest=TicketPricingTest
.\mvnw.cmd test -Dtest=ShoppingCartTotalTest
.\mvnw.cmd test -Dtest=PalindromeCheckerTest
.\mvnw.cmd test -Dtest=LoanEMITest
```

This is the recommended way to work — solve one challenge, run its test class, then move on.

---

### Run a SINGLE test case (one test method)

Use `ClassName#methodName` to run exactly one test.

```powershell
.\mvnw.cmd test -Dtest=EmployeeBadgeTest#managerBadge
```

```bash
./mvnw test -Dtest=EmployeeBadgeTest#managerBadge
```

**More examples:**

```powershell
.\mvnw.cmd test -Dtest=TicketPricingTest#childAge5Weekday
.\mvnw.cmd test -Dtest=PrimeCheckerTest#seventeenIsPrime
.\mvnw.cmd test -Dtest=RestaurantBillTest#standardBill
```

Use this when debugging one failing case without running the whole class.

---

### Run MULTIPLE challenges (several test classes)

Separate class names with commas (no spaces).

```powershell
.\mvnw.cmd test -Dtest=EmployeeBadgeTest,ProductListingTest,FitnessProfileTest
```

```bash
./mvnw test -Dtest=EmployeeBadgeTest,ProductListingTest,FitnessProfileTest
```

**Run all tests in one topic (wildcard):**

```powershell
# All variables challenges
.\mvnw.cmd test -Dtest=com.chaicode.variables.*Test

# All conditionals challenges
.\mvnw.cmd test -Dtest=com.chaicode.conditionals.*Test

# All for-loop challenges
.\mvnw.cmd test -Dtest=com.chaicode.forloop.*Test
```

**Run multiple specific methods from the same class:**

```powershell
.\mvnw.cmd test -Dtest=EmployeeBadgeTest#managerBadge+staffBadge
```

---

### Quick reference — testing commands

| Goal | Command (Windows) |
|------|---------------------|
| Run **all** tests | `.\mvnw.cmd test` |
| Run **one challenge** | `.\mvnw.cmd test -Dtest=EmployeeBadgeTest` |
| Run **one test case** | `.\mvnw.cmd test -Dtest=EmployeeBadgeTest#managerBadge` |
| Run **multiple challenges** | `.\mvnw.cmd test -Dtest=TestA,TestB,TestC` |
| Run **whole topic** | `.\mvnw.cmd test -Dtest=com.chaicode.variables.*Test` |
| Compile only (no tests) | `.\mvnw.cmd compile` |
| Clean + full test run | `.\mvnw.cmd clean test` |

On Mac/Linux, replace `.\mvnw.cmd` with `./mvnw`.

---

### Run tests from your IDE

**VS Code**

1. Open a test file, e.g. `src/test/java/com/chaicode/variables/EmployeeBadgeTest.java`
2. Click **Run Test** above a `@Test` method (single case)
3. Click **Run Tests** above the class name (whole challenge)
4. Or open the **Testing** sidebar (flask icon) and run from there

**IntelliJ IDEA**

1. Open a test file
2. Green ▶ next to a method → run one test case
3. Green ▶ next to the class name → run all tests in that class
4. Right-click `src/test/java` → **Run 'All Tests'** for the full lab

---

## Topics covered

| Topic | Package | Challenges | Concepts |
|-------|---------|------------|----------|
| Variables & Data Types | `variables` | 3 | `int`, `double`, `boolean`, `String`, records |
| Operators | `operators` | 4 | Arithmetic, comparison, logical, compound |
| Conditionals | `conditionals` | 12 | `if/else`, `switch`, ternary, validation |
| For Loop | `forloop` | 4 | Summation, factorial, primes, FizzBuzz |
| While Loop | `whileloop` | 4 | Digit manipulation, savings planner, ATM |
| Do-While Loop | `dowhileloop` | 3 | Survey input, PIN retry, order counting |
| Scanner | `scanner` | 3 | `java.util.Scanner`, parsing input |
| Methods | `methods` | 4 | Parameters, return types, overloading patterns |
| Arrays (1D & 2D) | `arrays` | 5 | Search, stats, matrices, gradebook |
| Strings & StringBuilder | `strings` | 5 | `String` methods, `StringBuilder`, validation |

---

## Suggested learning order

1. **Variables** → `EmployeeBadge.java`, `ProductListing.java`, `FitnessProfile.java`
2. **Operators** → `RestaurantBill.java`, `SaleDiscount.java`, `TimeBreakdown.java`, `GameScoreComparer.java`
3. **Conditionals** → `TicketPricing.java` through `SeasonActivity.java` (12 challenges)
4. **For Loop** → `ShoppingCartTotal.java`, `FactorialCalculator.java`, `PrimeChecker.java`, `FizzBuzzCounter.java`
5. **While Loop** → `ATMWithdrawal.java`, `DigitSum.java`, `ReverseDigits.java`, `SavingsPlanner.java`
6. **Do-While Loop** → `SurveyAverage.java`, `PinValidator.java`, `PizzaOrders.java`
7. **Scanner** → `CafeOrder.java`, `StudentRegistration.java`, `SimpleCalculator.java`
8. **Methods** → `GeometryAreas.java`, `TemperatureConverter.java`, `LoanEMI.java`, `GreetingGenerator.java`
9. **Arrays** → `ClassroomStats.java`, `InventorySearch.java`, `CinemaSeats.java`, `MatrixAddition.java`, `GradebookAverage.java`
10. **Strings** → `PalindromeChecker.java`, `EmailValidator.java`, `SlugBuilder.java`, `TitleCase.java`, `CreditCardMask.java`

---

## Project structure

```
chaicode-java-labs/
├── pom.xml
├── mvnw / mvnw.cmd
├── README.md
│
├── src/main/java/com/chaicode/
│   ├── variables/          ← YOU EDIT THESE
│   ├── operators/
│   ├── conditionals/       (12 real-world stories from ChaiCode)
│   ├── forloop/
│   ├── whileloop/
│   ├── dowhileloop/
│   ├── scanner/
│   ├── methods/
│   ├── arrays/
│   └── strings/
│
└── src/test/java/com/chaicode/
    └── ...                 ← DO NOT EDIT (JUnit tests)
```

---

## How to solve a challenge

1. Open a challenge file (e.g. `src/main/java/com/chaicode/variables/EmployeeBadge.java`)
2. Read the Javadoc at the top — it explains the story, rules, and return values
3. Replace `// Your code here` with your implementation
4. Run that challenge's tests:

```powershell
.\mvnw.cmd test -Dtest=EmployeeBadgeTest
```

5. If one test fails, run just that case to debug:

```powershell
.\mvnw.cmd test -Dtest=EmployeeBadgeTest#managerBadge
```

6. When all tests in the class pass, move to the next challenge

---

## Conditionals challenges (from ChaiCode)

| # | Class | Test class | Story |
|---|-------|------------|-------|
| 01 | `TicketPricing` | `TicketPricingTest` | Starlight Cinema ticket pricing |
| 02 | `TrafficLight` | `TrafficLightTest` | SafeDrive traffic light simulator |
| 03 | `GradeCalculator` | `GradeCalculatorTest` | Ms. Parker's report cards |
| 04 | `WeatherAdvice` | `WeatherAdviceTest` | TrailBuddy hiking app |
| 05 | `LibraryCard` | `LibraryCardTest` | Maple Town Library |
| 06 | `ShippingCalculator` | `ShippingCalculatorTest` | ShopSwift store shipping |
| 07 | `CoffeeShop` | `CoffeeShopTest` | Bean & Brew Cafe |
| 08 | `TaxCalculator` | `TaxCalculatorTest` | Sam's freelance taxes |
| 09 | `PasswordStrength` | `PasswordStrengthTest` | SecureApp signup |
| 10 | `TipCalculator` | `TipCalculatorTest` | TipEasy restaurant |
| 11 | `ParkingFee` | `ParkingFeeTest` | City Central Parking |
| 12 | `SeasonActivity` | `SeasonActivityTest` | WanderLust Travel |

---

## Troubleshooting

### `'java' is not recognized`

- Install JDK 17+ from [Adoptium](https://adoptium.net/)
- Set `JAVA_HOME` and add `%JAVA_HOME%\bin` to `Path`
- Restart terminal and IDE

### `'mvn' is not recognized`

You do **not** need global Maven. Always use:

```powershell
.\mvnw.cmd test
```

Not `mvn test`.

### PowerShell blocks `mvnw.cmd`

```powershell
Set-ExecutionPolicy -Scope CurrentUser RemoteSigned
```

Or use Command Prompt: `mvnw.cmd test`

### First run is slow or fails on network

- Check internet connection
- Retry: `.\mvnw.cmd test`
- Corporate proxy may require Maven proxy settings

### All tests fail with `expected X but was 0` or `was ""`

Normal before you write solutions. Implement the method in the challenge file.

### `NullPointerException` in tests

Some challenges return objects (`BorrowResult`, `StudentInfo`, etc.). Your method is still returning `null` — finish the implementation.

### VS Code does not show Run Test buttons

- Install **Extension Pack for Java**
- Reload: `Ctrl+Shift+P` → **Developer: Reload Window**
- Open the folder that contains `pom.xml`

### IntelliJ shows red errors but `mvnw test` works

**File → Invalidate Caches → Invalidate and Restart**, or right-click `pom.xml` → **Maven → Reload project**

### Test reports on disk

After a test run, detailed reports are in:

```
target\surefire-reports\
```

---

## Progress checklist

### Variables & Data Types
- [ ] EmployeeBadge
- [ ] ProductListing
- [ ] FitnessProfile

### Operators
- [ ] RestaurantBill
- [ ] SaleDiscount
- [ ] TimeBreakdown
- [ ] GameScoreComparer

### Conditionals
- [ ] TicketPricing … SeasonActivity (12 total)

### Loops
- [ ] ShoppingCartTotal, FactorialCalculator, PrimeChecker, FizzBuzzCounter
- [ ] ATMWithdrawal, DigitSum, ReverseDigits, SavingsPlanner
- [ ] SurveyAverage, PinValidator, PizzaOrders

### Scanner
- [ ] CafeOrder, StudentRegistration, SimpleCalculator

### Methods
- [ ] GeometryAreas, TemperatureConverter, LoanEMI, GreetingGenerator

### Arrays
- [ ] ClassroomStats, InventorySearch, CinemaSeats, MatrixAddition, GradebookAverage

### Strings
- [ ] PalindromeChecker, EmailValidator, SlugBuilder, TitleCase, CreditCardMask

---

Good luck — start with `EmployeeBadge.java` and run `.\mvnw.cmd test -Dtest=EmployeeBadgeTest`!
