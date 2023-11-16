import java.io.File;

public class AppDirectoryViewer {

    public static void main(String[] args) {
        System.out.println("Marcosoft Directory Viewer");
        System.out.println();

        String directoryPath = "/Users/marcosstrapazon/";

        File rootDirectory = new File(directoryPath);

        for(File file:rootDirectory.listFiles()){
            // we are not going to show hidden files and folders
            if(file.getName().charAt(0)!='.'){
                if(file.isDirectory()) {
                    System.out.println("> " + file.getName());
                    for(File subDirFile:file.listFiles()){
                        if(subDirFile.getName().charAt(0)!='.'){
                            if(subDirFile.isFile()) System.out.println("  - " + subDirFile.getName());
                        }
                    }
                }
            }
        }

    }

}
