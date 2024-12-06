package CreationalDesignPatterns.Prototype;

public class Main {
    public static void main(String[] args) {
        // Load initial prototypes into cache
        RobotCache.loadCache();

        long startTime = System.currentTimeMillis();

        // Clone Worker Robot
        Robot clonedWorker = RobotCache.getRobot("Worker");
        clonedWorker.setName("Cloned WorkerBot");
        clonedWorker.setColor("gray");
        long workerCloneTime = System.currentTimeMillis();

        // Clone Warrior Robot
        Robot clonedWarrior = RobotCache.getRobot("Warrior");
        clonedWarrior.setName("Cloned WarriorBot");
        clonedWarrior.setColor("ash");
        long warriorCloneTime = System.currentTimeMillis();

        // Display Results
        System.out.println(clonedWorker);
        System.out.println("Time to clone WorkerBot: " + (workerCloneTime - startTime) + " ms");

        System.out.println(clonedWarrior);
        System.out.println("Time to clone WarriorBot: " + (warriorCloneTime - workerCloneTime) + " ms");
    }
}
