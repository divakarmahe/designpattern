public class GreenState implements TrafficLightState{
    @Override
    public void next(TrafficLightContext context){
        System.out.println("Switching from green to yellow Cars slow down!");
        context.setState(new YellowState());
    }
}
