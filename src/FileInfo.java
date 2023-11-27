import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.UserPrincipal;

public class FileInfo {

    public static void printFileInfo(Path filePath) throws IOException {
        Path fileName = null;
        UserPrincipal fileOwner = null;
        String fileType = null;
        long fileSize = 0;
        /* Your code here */
        
        System.out.println("File Name: "+fileName);
        System.out.println("File Type: "+fileType);
        System.out.println("File Size: "+fileSize+" bytes");
        System.out.println("File Owner: "+fileOwner);

    }

    public static void main(String[] args) throws IOException {

        printFileInfo(/* file path */ );

    }
}
