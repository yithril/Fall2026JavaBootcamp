package patterns.builder.nestedstatic;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza.Builder("Large", "Thin Crust")
                .addExtraCheese()
                .addPepperoni()
                .addMushrooms()
                .build();

        Pizza pizza2 = new Pizza.Builder("Small", "Deep Dish")
                .addMushrooms()
                .addPepperoni()
                .build();

        System.out.println(pizza);
    }
}
