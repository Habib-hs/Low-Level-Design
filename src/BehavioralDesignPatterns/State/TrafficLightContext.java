package BehavioralDesignPatterns.State;

public class TrafficLightContext {
    private TrafficLightState state;

    public TrafficLightContext() {
        this.state = new RedLight(); // Initial state
    }

    public void setState(TrafficLightState state) {
        this.state = state;
    }

    public void changeState() {
        state.change(this);
    }

    public void showState() {
        state.display();
    }
}
