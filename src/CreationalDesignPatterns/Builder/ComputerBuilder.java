package CreationalDesignPatterns.Builder;

public class ComputerBuilder {
    Computer computer;
    private String processor;
    private String ram;
    private int storageGB;
    private int batteryLife;
    private double weight;
    private Computer.OperatingSystem os;

    // Constructor with mandatory parameters
    public ComputerBuilder(String processor, String ram) {
        this.processor = processor;
        this.ram = ram;
    }

    // Fluent setters
    public ComputerBuilder setStorage(int storageGB) {
        this.storageGB = storageGB;
        return this;
    }

    public ComputerBuilder setBatteryLife(int hours) {
        this.batteryLife = hours;
        return this;
    }

    public ComputerBuilder setWeight(double weight) {
        this.weight = weight;
        return this;
    }

    public ComputerBuilder setOperatingSystem(Computer.OperatingSystem os) {
        this.os = os;
        return this;
    }

    // Build method
    public Computer build() {
        return new Computer(
                processor,
                ram,
                storageGB,
                batteryLife,
                weight,
                os
        );
    }
}
