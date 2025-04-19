public class YellowState implements TrafficLightState{
    @Override
    public void next(TrafficLightContext context){
        System.out.println("Switching from Yellow to red cars stop!!");
        context.setState(new RedState());
    }
}
