public class File {
    String name;
    String extension;
    int size;
    String contents;


    File(String name, String extension, int size, String contents) {
        this.name = name;
        this.extension = extension;
        this.size = size;
        this.contents = contents;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContents() {
        return contents;
    }

    public String toString(){
        return contents;
    }
    
}
