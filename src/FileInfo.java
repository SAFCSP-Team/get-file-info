import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.UserPrincipal;

public class FileInfo {

    public static void printFileInfo(Path filePath) throws IOException {
        /* Your code here */
        Path fileName = null;
        UserPrincipal fileOwner = null;
        String fileType = null;
        long fileZie = 0;

        System.out.println("File Name: "+fileName);
        System.out.println("File Type: "+fileType);
        System.out.println("File Size: "+fileZie+" bytes");
        System.out.println("File Owner: "+fileOwner);

    }

    public static void main(String[] args) throws IOException {

        printFileInfo(/* file path */ );

    }
}