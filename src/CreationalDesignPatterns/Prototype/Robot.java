package CreationalDesignPatterns.Prototype;

public class Robot implements Cloneable {
    private String name;
    private String type; // For example, Worker, Warrior, etc.
    private String color;

    public Robot(String name, String type) {
        // Simulating expensive object creation
        try {
            System.out.println("Creating Robot...");
            Thread.sleep(5000); // Simulates 5 seconds of creation time
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.name = name;
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("Cloning Robot...");
        return super.clone(); // Performs shallow copy
    }

    @Override
    public String toString() {
        return "Robot{name= " + name + " , type= " + type + " , color=" + color +"}";
    }
}
