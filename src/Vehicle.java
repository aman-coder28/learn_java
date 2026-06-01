public class Vehicle {
    private final String name;
    private final String model;
    private final float speed;
    private final int year;
    private final Engine engine;

    public Vehicle(String name, String model, int speed, int year, Engine engine) {
        this.name = name;
        this.model = model;
        this.speed = speed;
        this.year = year;
        this.engine = engine;
    }

    public String getEngineInfo() {
        return "Engine Type: " + engine.type + " has " + engine.horsepower + " horsepower.";
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Model: " + model + ", Speed: " + speed + "kms, Made in: " + year + " and "
                + getEngineInfo();
    }
}
