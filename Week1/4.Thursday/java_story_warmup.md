# Warm-Up: Tell the Story of This Java Program

## Instructions

Read the Java program below. Imagine you are explaining to someone who has never programmed before what the computer is doing.

Write a short story explaining the program from beginning to end. Explain what each important line does, how the values change, and what the user sees on the screen.

You do not need to explain the package declaration or memorize Java terminology. Focus on understanding what the program does.

## The Program

```java
import java.util.Scanner;

public class PizzaParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the pizza party!");
        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("How many pizzas did you order?");
        int pizzas = scanner.nextInt();

        System.out.println("How many extra pizzas do you want?");
        int extraPizzas = scanner.nextInt();

        pizzas += extraPizzas;
        pizzas++;

        double cost = pizzas * 12.0;

        System.out.println("Your name is " + name);
        System.out.println("Total pizzas: " + pizzas);
        System.out.printf("Total cost: $%.2f%n", cost);
    }
}
```

## Questions to Answer in Your Story

1. What happens when the program starts?
2. What does the `Scanner` allow the program to do?
3. How does the program get the user's name?
4. How does the program get the number of pizzas?
5. What happens when `pizzas += extraPizzas;` executes?
6. What does `pizzas++;` do?
7. How does the program calculate the total cost?
8. What is the difference between `println` and `printf` in this program?
9. What would the final output be if the user entered:
   - **Name:** Alex
   - **Pizzas ordered:** 3
   - **Extra pizzas:** 2

## Bonus Question

Why is `12.0` used instead of `12` in the cost calculation?
