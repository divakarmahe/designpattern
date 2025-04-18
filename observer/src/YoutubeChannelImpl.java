import java.util.ArrayList;
import java.util.List;

public class YoutubeChannelImpl implements YoutubeChannel{
    private List<Subscriber> subs = new ArrayList<>();
    private String video;
    public void addSubscriber(Subscriber sub){
        subs.add(sub);
    }
    public void removeSubscriber(Subscriber sub){
        subs.remove(sub);
    }

    @Override
    public void notifySubscribers() {
        for(Subscriber s : subs){
            s.update(video);
        }
    }
    public void updateNewVideo(String video){
        this.video = video;
        notifySubscribers();
    }
}
