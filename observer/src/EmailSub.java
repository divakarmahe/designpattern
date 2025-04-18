public class EmailSub implements Subscriber{
    private String email;
    public EmailSub(String email){
        this.email = email;
    }
    public void update(String video){
        System.out.println("email sending to" +email+  "new video uploaded"+ video);
    }
}
