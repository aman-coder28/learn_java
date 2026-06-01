void main() {
    Engine ElectricEngine = new Engine("Electric", 200);

    Vehicle MyCar = new Vehicle("Violet", "Vio V1", 200, 2025, ElectricEngine);

    Vehicle MyMotor = new Motor("Violet Motor", "Vio Moto V1", 200, 2026, ElectricEngine, MotorType.two_wheel);

    IO.println(MyMotor);

    IO.println(MyCar);
}
