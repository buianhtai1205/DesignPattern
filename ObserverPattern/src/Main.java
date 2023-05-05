import Model.VideoMedia;
import Notifies.EmailNotification;
import Notifies.PhoneNotification;
import Notifies.YoutubeNotification;

public class Main {
    public static void main(String[] args) {
        VideoMedia videoMedia = new VideoMedia();
        new EmailNotification(videoMedia);
        PhoneNotification phoneNotification = new PhoneNotification(videoMedia);
        YoutubeNotification youtubeNotification = new YoutubeNotification(videoMedia);

        System.out.println("--------------------------------------------------------");
        videoMedia.setTitle("Design Pattern");

        videoMedia.detachObserver(phoneNotification);
        videoMedia.detachObserver(youtubeNotification);

        System.out.println("--------------------------------------------------------");
        videoMedia.setDescription("Design Pattern is good for everyone who want to become senior developer");

        videoMedia.attachObserver(phoneNotification);

        System.out.println("--------------------------------------------------------");
        videoMedia.setFileName("DS1011");
    }
}