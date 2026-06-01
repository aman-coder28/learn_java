public class Engine {
    public String type;
    public float horsepower;

    public Engine(String type, float horsepower) {
        this.type = type;
        this.horsepower = horsepower;
    }

    public void start() {
        IO.println("started");
    }

    public void stop() {
        IO.println("stopped");
    }
}