package class_exercise;

public class Dog {
    private String name;
    private String breed;
    private float weight;
    private boolean isGoodBoy;

    //constructor
    //If you have more than one constructor, go from most parameters to least parameters
    public Dog(String name, String breed, float weight, boolean isGoodBoy) {
        this.name = name;
        this.breed = breed;
        this.weight = weight;
        this.isGoodBoy = isGoodBoy;
    }

    public Dog(String name, String breed, float weight) {
        this.name = name;
        this.breed = breed;
        this.weight = weight;
    }

    //parameterless constructor
    public Dog(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public boolean isGoodBoy() {
        return isGoodBoy;
    }

    public void setGoodBoy(boolean goodBoy) {
        isGoodBoy = goodBoy;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
