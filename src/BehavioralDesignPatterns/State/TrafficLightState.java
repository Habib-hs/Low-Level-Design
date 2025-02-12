package BehavioralDesignPatterns.State;

public interface TrafficLightState {
    void change(TrafficLightContext context);
    void display();
}
