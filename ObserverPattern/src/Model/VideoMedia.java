package Model;

import Base.Subject;

public class VideoMedia extends Subject {
    private int id;
    private String title;
    private String description;
    private String fileName;

    public VideoMedia() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        videoDataChange();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
        videoDataChange();
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
        videoDataChange();
    }

    public void videoDataChange() {
        notifyObserver(null);
    }
}
