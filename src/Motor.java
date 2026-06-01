public class Motor extends Vehicle {
    private MotorType type;

    public Motor(String name, String model, int speed, int year, Engine engine, MotorType type) {
        super(name, model, speed, year, engine);

        this.type = type;
    }

    @Override
    public String toString() {
        return "Type: " + type.type;
    }
}
