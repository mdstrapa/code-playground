import java.io.*;

public class AppGetCMDBCode {
    public static void main(String[] args) {
        try {
            // Assuming the file is in the "resources" folder
            String filePath = "strings.txt";
            readLinesFromFile(filePath);
        } catch (IOException e) {
            e.getMessage();
        }
    }

    public static void readLinesFromFile(String filePath) throws IOException {
        InputStream inputStream = AppGetCMDBCode.class.getClassLoader().getResourceAsStream(filePath);
        if (inputStream != null) {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(getId(line));
                }
            }
        } else {
            System.out.println("File not found: " + filePath);
        }
    }

    public static String getId(String originalLine){
        int initPos = originalLine.indexOf("CMDB-");
        int finishPos = originalLine.lastIndexOf(')');
        return originalLine.substring(initPos,finishPos);
    }
}
