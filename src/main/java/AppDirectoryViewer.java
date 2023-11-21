import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class AppDirectoryViewer {

    static List<MSFile> msFileList = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Marcosoft Directory Tree Viewer");
        System.out.println();

        String directoryPath = args[0];

        createTree(directoryPath,args[0] + "/", 1);

        showTree(msFileList);
    }

    private static void createTree(String fileName, String originalPath, int level) {
        File file = new File(fileName);

        if (file.isFile()) {
            msFileList.add(new MSFile(createFileName(fileName,originalPath),FileType.FILE,level));
            return;
        }

        msFileList.add(new MSFile(fileName.replace(originalPath,""),FileType.DIRECTORY,level));
        String[] fileList = file.list();
        assert fileList != null;
        for (String subFile : fileList) {
            createTree(fileName + File.separator + subFile,originalPath,level + 1);
        }
    }

    private static void showTree(List<MSFile> msFileList){
        for(MSFile file:msFileList){
            //hidden files are not going to be shown
            if(file.getName().charAt(0)!='.'){
                for (int i = 0;i < file.getLevel();i++){
                    if(i == file.getLevel() - 1) System.out.print("  >  ");
                    else System.out.print("  |  ");
                }

                if(file.getFileType()==FileType.DIRECTORY) System.out.println(file.getName().toUpperCase() + createDirectoryDecoration(file.getName(), file.getLevel()));
                else System.out.println(file.getName());
            }
        }
    }

    private static String createFileName(String originalFileName, String originalPath){
        String convertedFileName = originalFileName.replace(originalPath,"");
        if(convertedFileName.contains("/")) convertedFileName = convertedFileName.substring(convertedFileName.lastIndexOf('/') + 1);
        return convertedFileName;
    }

    private static String createDirectoryDecoration(String directoryName, int level){
        int qtd = 150 - directoryName.length() - (5 * level);
        StringBuilder decoration = new StringBuilder();
        decoration.append("-".repeat(Math.max(0, qtd)));
        return " " + decoration;
    }
}

enum FileType {
    FILE,DIRECTORY
}

class MSFile{
    private String name;
    private FileType fileType;
    private int level;

    public MSFile(String name, FileType fileType, int level) {
        this.name = name;
        this.fileType = fileType;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FileType getFileType() {
        return fileType;
    }

    public void setFileType(FileType fileType) {
        this.fileType = fileType;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}