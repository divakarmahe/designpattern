public class Main {
    public static void main(String[] args) {
        YoutubeChannelImpl channel = new YoutubeChannelImpl();
        YoutubeSubscriber alice = new YoutubeSubscriber("alice");
        YoutubeSubscriber bob = new YoutubeSubscriber("bob");
        channel.addSubscriber(alice);
        channel.addSubscriber(bob);
        channel.updateNewVideo("Java Design Patterns Tutorial");
        channel.removeSubscriber(bob);
        channel.updateNewVideo("Observer Pattern in Action");
    }
}