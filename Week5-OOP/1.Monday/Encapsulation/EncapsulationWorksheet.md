# Encapsulation Worksheet


Use the classes in this project as your guide: `BankAccount`, `Car`, and `Circle`.

---

## Part 1 — What is Encapsulation? (Warm-up)

1. In your own words, what does **encapsulation** mean in Java?

   _______________________________________________________________

   _______________________________________________________________

2. Circle the access modifier that **hides** a field from other classes:

   `public` `private` `static` `void`

3. Why might we hide a field instead of making it `public`?

   _______________________________________________________________

---

## Part 2 — BankAccount (protecting data)

Look at `BankAccount.java` and `Main.java`.

4. List the **private fields** in `BankAccount`:

   - _________________

   - _________________

5. Why is this line commented out in `Main.java`?

   `//firstAccount.balance = 100000000;`

   _______________________________________________________________

6. Fill in the blanks for how clients should change the account instead:

   - To add money, call: `firstAccount.___________(100);`
   - To remove money, call: `firstAccount.___________(500);`

7. Look at `withdraw`. What problem could happen if someone withdraws more than the balance? (Hint: check the comments in the method.)

   _______________________________________________________________

8. **True / False:** Encapsulation lets the class control *how* data changes.

   Answer: _________

---

## Part 3 — Circle (derived information)

Look at `Circle.java` and `CircleMain.java`.

9. The field `radius` is _______________ (public / private).

10. Students never write `2 * Math.PI * radius` in `CircleMain`. Instead they call:

    - ______________________________
    - ______________________________

11. Why is that useful? (What stays "hidden" inside the class?)

    _______________________________________________________________

12. Predict the output for:

    ```java
    Circle circle = new Circle(10);
    System.out.println(circle.getDiameter());
    ```

    Diameter = _________

13. If we later changed circumference to use a different formula, would `CircleMain` need to change?

    Yes / No Why? _________________________________

---

## Part 4 — Car (hiding helper methods)

Look at `Car.java` and `CarMain.java`.

14. Which method is **public**? _________________

    Which method is **private**? _________________

15. Why can `CarMain` call `accelerate()` but **not** call `isFuelEmpty()` directly?

    _______________________________________________________________

16. Trace what happens when this runs:

    ```java
    Car batmobile = new Car(100);
    batmobile.accelerate();
    ```

    Fill in:

    - Starting `fuelLevel` = _________
    - Does `isFuelEmpty()` return true or false? _________
    - Does `speed` increase? _________
    - Final `speed` = _________

17. Complete the sentence:

    A **private helper method** is used by _________________ methods inside the same class, but not by outside classes.

---

## Part 5 — Spot the Bug / Fix the Design

18. Someone writes this outside the class:

    ```java
    Car c = new Car(50);
    c.speed = 200;
    ```

    Will it compile with the current `Car` class? Yes / No

    Why? _______________________________________________________

19. Someone wants a getter for balance in `BankAccount`. Draft it:

    ```java
    public ______ getBalance() {
        return ________;
    }
    ```

20. Should `BankAccount` have a `setBalance(double balance)` that sets any value with no checks?

    Yes / No Explain: ___________________________________________

---

## Part 6 — Quick Check (match)

Match each idea to the best example from the project:

| Idea | Letter |
|------|--------|
| 21. Hide a field so other classes can’t change it directly | ___ |
| 22. Use a private method to support public behavior | ___ |
| 23. Return a calculated value without exposing the formula | ___ |

**A.** `Car.isFuelEmpty()` **B.** `BankAccount.balance` **C.** `Circle.getCircumference()`

---

## Part 7 — Exit Ticket

24. Encapsulation = bundling _____________ + _____________ and controlling access with _____________ / _____________.

25. One sentence: How does encapsulation make code safer or easier to maintain?

    _______________________________________________________________
