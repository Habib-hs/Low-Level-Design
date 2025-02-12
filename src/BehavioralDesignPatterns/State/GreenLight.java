package BehavioralDesignPatterns.State;

// Green Light State
class GreenLight implements TrafficLightState {
    public void change(TrafficLightContext context) {
        context.setState(new YellowLight());
    }

    public void display() {
        System.out.println("🚦 Green Light - GO");
    }
}