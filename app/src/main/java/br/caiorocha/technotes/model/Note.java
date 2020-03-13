package br.caiorocha.technotes.model;

public class Note {
    private final Integer ID;
    private String title;
    private String content;
    private String location;
    private String alarm;
    private String lastEdit;

    public Note(Integer ID, String title){
        this.ID = ID;
        this.title = title;
    }

    public Integer getID() {
        return ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAlarm() {
        return alarm;
    }

    public void setAlarm(String alarm) {
        this.alarm = alarm;
    }

    public String getLastEdit() {
        return lastEdit;
    }

    public void setLastEdit(String lastEdit) {
        this.lastEdit = lastEdit;
    }
}
