package ex1;

public class File {
    private String content;
    private String id;
    private String adresa;
    private String name;

    public File(String content, String id, String adresa, String name) {
        this.content = content;
        this.id = id;
        this.adresa = adresa;
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void print(){
        System.out.println("content='" + content + '\'' +
                ", id='" + id + '\'' +
                ", adresa='" + adresa + '\'' +
                ", name='" + name + '\'' );
    }

    public FileSnapshot createSnapshot(){
        return new FileSnapshot(content);
    }

    public FileSnapshot restoreToSomePoint(FileSnapshot fileSnapshot){
        return fileSnapshot;
    }
}
