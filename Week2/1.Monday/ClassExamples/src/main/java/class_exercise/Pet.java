package class_exercise;

public class Pet {
    private String name;
    private String species;
    private int age;
    private boolean vaccinated;

    public Pet(String name, String species, int age, boolean vaccinated) {
        this.name = name;
        this.species = species;
        this.age = age;
        this.vaccinated = vaccinated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isVaccinated() {
        return vaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }
}
