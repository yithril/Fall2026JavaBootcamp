package org.example;

public class Vehicle extends Asset {
    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    @Override
    public double getValue() {
        double finalValue;

        if (year <= 3) {
            finalValue = this.getOriginalCost() - (this.getOriginalCost() * (0.03 * year));

        } else if (year <= 6) {
            finalValue = this.getOriginalCost() - (this.getOriginalCost() * (0.06 * year));

        } else if (year <= 10) {
            finalValue = this.getOriginalCost() - (this.getOriginalCost() * (0.08 * year));

        } else {
            finalValue = 1000.00;
        }

        // Additional 25% reduction for high mileage
        // unless Honda or Toyota
        if (odometer > 100000 &&
                !makeModel.toLowerCase().contains("honda") &&
                !makeModel.toLowerCase().contains("toyota")) {

            finalValue *= 0.75;
        }

        return finalValue;
    }

}
