package CreationalDesignPatterns.Prototype;

import java.util.HashMap;
import java.util.Map;

// The Cache (Stores Prototypes)
class RobotCache {
    private static Map<String, Robot> robotMap = new HashMap<>();

    // Load prototypes into cache
    public static void loadCache() {
        Robot workerRobot = new Robot("WorkerBot", "Worker");
        Robot warriorRobot = new Robot("WarriorBot", "Warrior");

        robotMap.put("Worker", workerRobot);
        robotMap.put("Warrior", warriorRobot);
    }

    // Get a cloned robot from the cache
    public static Robot getRobot(String type) {
        try {
            Robot cachedRobot = robotMap.get(type);
            return (Robot) cachedRobot.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}

