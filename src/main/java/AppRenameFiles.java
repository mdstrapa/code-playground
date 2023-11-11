import java.io.File;
import java.io.IOException;
import java.nio.file.*;

public class AppRenameFiles {

    public static void main(String[] args) {
        // Specify the directory path and the template for renaming
        String directoryPath = "/Users/marcosstrapazon/Downloads/filesToRename";
        String fileRenameTemplate = "Marcos_file_%s";

        // Call the renameFiles method
        getFiles(directoryPath, fileRenameTemplate);
    }

    public static void getFiles(String directoryPath, String template) {
        File dir = new File(directoryPath);

        // Check if the provided path is a directory
        if (!dir.isDirectory()) {
            System.err.println("Error: Not a directory");
            return;
        }

        // Get list of files in the directory
        File[] files = dir.listFiles();

        // Check if the directory is empty
        if (files == null || files.length == 0) {
            System.out.println("Directory is empty. No files to rename.");
            return;
        }

        // Iterate through each file and rename it
        int fileCounter = 0;
        for (File file : files) {
            if (file.isFile()) {
                fileCounter++;
                renameFile(directoryPath, template, file, fileCounter);
            }
        }
    }

    private static void renameFile(String directoryPath, String template, File file, int fileCounter) {
        String fileName = file.getName();
        String fileExtension = "";

        // Extract file extension (if any)
        int dotIndex = fileName.lastIndexOf('.');
        if (dotIndex != -1) fileExtension = fileName.substring(dotIndex);

        // Generate the new file name using the template and the file counter
        String newFileName = String.format(template, fileCounter) + fileExtension;

        // Create the new file path
        Path sourcePath = file.toPath();
        Path destinationPath = Paths.get(directoryPath, newFileName);

        // Attempt to rename the file
        try {
            Files.move(sourcePath, destinationPath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File renamed: " + file.getName() + " -> " + newFileName);
        } catch (IOException e) {
            System.err.println("Error renaming file: " + file.getName());
            e.printStackTrace();
        }
    }
}
