package Notifies;

import Base.NotifyObserver;
import Base.Subject;
import Model.VideoMedia;

import java.util.Objects;

public class EmailNotification extends NotifyObserver {
    public EmailNotification(Subject subject) {
        this.subject = subject;
        this.subject.attachObserver(this);
    }
    @Override
    public void notify(Objects arg) {
        VideoMedia videoMedia = (VideoMedia) subject;
        String notifyString = "Email Notify Change Data\nTitle: " + videoMedia.getTitle()
                + "\nDescription: " + videoMedia.getDescription()
                + "\nFileName: " + videoMedia.getFileName();
        System.out.println(notifyString);
    }
}
