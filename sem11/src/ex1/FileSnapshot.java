package ex1;

public class FileSnapshot {
    private String content;
    private int version;
    private String dateTime;
    private String message;

    public FileSnapshot(String content, int version, String dateTime, String message) {
        this.content = content;
        this.version = version;
        this.dateTime = dateTime;
        this.message = message;
    }

    public FileSnapshot(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
    public String getDetails(){
        return "version " + version + " date time " + dateTime + " message " + message;
    }
}
