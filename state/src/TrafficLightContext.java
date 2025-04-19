public class TrafficLightContext {
    private TrafficLightState currstate;
    public TrafficLightContext(){
        this.currstate = new RedState();
    }
    public void setState(TrafficLightState state){
        this.currstate = state;
    }
    public void next(){
        currstate.next(this);
    }

}
