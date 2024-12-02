package CreationalDesignPatterns.Builder;

public class Computer {
    //required attributes
    private String processor;
    private String ram;

    //additional attributes
    private int storageGB;
    private int batteryLife;
    private double weight;
    private OperatingSystem os;

    public enum OperatingSystem {
        Windows, Mac, Linux
    }

    // Package-private Constructor
     Computer(String processor, String ram, int storageGB,
                      int batteryLife,
                     double weight, OperatingSystem os) {
        this.processor = processor;
        this.ram = ram;
        this.storageGB = storageGB;
        this.batteryLife = batteryLife;
        this.weight = weight;
        this.os = os;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", ram='" + ram + '\'' +
                ", storageGB=" + storageGB + " GB" +
                ", batteryLife=" + batteryLife + " hrs" +
                ", weight=" + weight + "KG" +
                ", os=" + os +
                '}';
    }
}
