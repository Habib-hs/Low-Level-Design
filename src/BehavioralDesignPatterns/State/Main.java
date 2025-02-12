package BehavioralDesignPatterns.State;

public class Main {
    public static void main(String[] args) {
        TrafficLightContext trafficLight = new TrafficLightContext();

        for (int i = 0; i < 6; i++) {  // Cycle through states
            trafficLight.showState();
            trafficLight.changeState();
        }
    }
}
