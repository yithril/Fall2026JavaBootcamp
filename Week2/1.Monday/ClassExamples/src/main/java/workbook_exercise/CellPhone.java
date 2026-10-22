package workbook_exercise;

//Plain Ol' Java Object POJO
public class CellPhone {
    private String serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner = "Jonathan";
    private int numberOfButtons;

    public CellPhone(){
        //default values
        this.serialNumber = "";
        this.model = "Nokia";
        this.numberOfButtons = 6;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getNumberOfButtons() {
        return numberOfButtons;
    }

    public void setNumberOfButtons(int numberOfButtons) {
        this.numberOfButtons = numberOfButtons;
    }
}
