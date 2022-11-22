public class ComputerFile{
    String name;
    int size;
    String modificationDate;
    String contents ="";

    public void editContent(String content){
        contents+=content;
    }

    public void renameFile(String newname){
        name = newname;
    }

}