public class YoutubeSubscriber implements Subscriber{
    private String name;
    public YoutubeSubscriber(String name){
        this.name = name;
    }
    public void update(String video){
        System.out.println(name+"watching the video"+video);
    }
}
