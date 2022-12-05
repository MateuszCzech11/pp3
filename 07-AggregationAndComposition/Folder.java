import java.util.ArrayList;

public class Folder {

    String name;
    String editDate;
    int folderSize = 0;
    ArrayList<File> folderContents = new ArrayList<File>();


    public Folder(String name, String editDate) {
        this.name = name;
        this.editDate = editDate;
    }

    public int getFolderSize() {
        return folderSize;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addFile(File plik){
        folderContents.add(plik);
        folderSize++;
    }

    public void removeFile(File plik){
        folderContents.remove(plik);
        folderSize--;
    }
    public void printContents(){
        for(File i: folderContents){
            System.out.printf(i.name+i.extension+ ": ");
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        File plik1 = new File("notatki", ".txt", 2, "dwa plus dwa");
        File plik2 = new File("zadania", ".zip", 0, "zadanie 1 i 2");
        Folder f= new Folder("zajecia", "5 gru");
        f.addFile(plik1);
        f.printContents();
        f.addFile(plik2);
        f.printContents();
        f.removeFile(plik2);
        f.printContents();
    }
    
}
