import java.io.File;
import java.io.FileOutputStream;

public class fileManager {

    public static String defaultFileName = "rubrica.xml";
    public static String defaultPath = "./rubrica/";

    private String fileName;
    private String path;

    private File file;
    private FileOutputStream xmlFile;

    public fileManager() throws Exception{
        file = new File(defaultPath);
        boolean bool = file.mkdir();
        if(bool){
            System.out.println("Cartella creata");
        }else{
            System.out.println("Creo la cartella");
        }
        xmlFile = new FileOutputStream(defaultPath + defaultFileName);
    }

    public fileManager(String fileName, String path) throws Exception{
        this.fileName = fileName;
        this.path = path;

        file = new File(this.fileName);
        boolean bool = file.mkdir();
        if(bool){
            System.out.println("Cartella creata");
        }else{
            System.out.println("Creo la cartella");
        }
        xmlFile = new FileOutputStream(this.path + this.fileName);
    }


    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
