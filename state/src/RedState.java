public class RedState implements TrafficLightState{
    @Override
    public void next(TrafficLightContext context){
        System.out.println("Switching from Red to green cars go!!");
        context.setState(new GreenState());
    }
}
