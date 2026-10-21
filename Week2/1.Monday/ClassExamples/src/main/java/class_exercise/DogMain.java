package class_exercise;

public class DogMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Dog dog2 = new Dog("fido", "golden retriever", 50f, true);
        Dog dog3 = new Dog("fluffles", "pomeranian", 5f);

        dog.setName("Bowser");
        dog.setBreed("Chihuahua");

    }
}
