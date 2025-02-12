package BehavioralDesignPatterns.State;

class YellowLight implements TrafficLightState {
    public void change(TrafficLightContext context) {
        context.setState(new RedLight());
    }

    public void display() {
        System.out.println("🚦 Yellow Light - PREPARE TO STOP");
    }
}