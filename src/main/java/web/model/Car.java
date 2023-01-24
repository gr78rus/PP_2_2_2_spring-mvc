package web.model;

public class Car {
    private String make;
    private String model;
    private int firstRegistration;

    public Car(String make, String model, int firstRegistration) {
        this.make = make;
        this.model = model;
        this.firstRegistration = firstRegistration;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getFirstRegistration() {
        return firstRegistration;
    }
}