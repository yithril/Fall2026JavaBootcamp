package class_exercise;

public class Shipment {
    private String trackingNumber;
    private double weightKg;
    private long distanceMiles;
    private char priority;
    private boolean delivered;

    public Shipment(String trackingNumber, double weightKg, long distanceMiles, char priority, boolean delivered) {
        this.trackingNumber = trackingNumber;
        this.weightKg = weightKg;
        this.distanceMiles = distanceMiles;
        this.priority = priority;
        this.delivered = delivered;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public void setWeightKg(double weightKg) {
        this.weightKg = weightKg;
    }

    public long getDistanceMiles() {
        return distanceMiles;
    }

    public void setDistanceMiles(long distanceMiles) {
        this.distanceMiles = distanceMiles;
    }

    public char getPriority() {
        return priority;
    }

    public void setPriority(char priority) {
        this.priority = priority;
    }

    public boolean isDelivered() {
        return delivered;
    }

    public void setDelivered(boolean delivered) {
        this.delivered = delivered;
    }
}
