package BehavioralDesignPatterns.State;

class RedLight implements TrafficLightState {
    public void change(TrafficLightContext context) {
        context.setState(new GreenLight());
    }

    public void display() {
        System.out.println("🚦 Red Light - STOP");
    }
}