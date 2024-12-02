package CreationalDesignPatterns.Builder;

public class Main {
    public static void main(String[] args) {
        Computer laptop1 = new ComputerBuilder("Intel i7", "16GB")
                .setStorage(512)
                .setBatteryLife(10)
                .setWeight(1.2)
                .setOperatingSystem(Computer.OperatingSystem.Mac)
                .build();

        System.out.println(laptop1);

        Computer laptop2 = new ComputerBuilder("Intel i5", "16GB")
                .setStorage(512)
                .setOperatingSystem(Computer.OperatingSystem.Mac)
                .build();

        System.out.println(laptop2);
    }
}
