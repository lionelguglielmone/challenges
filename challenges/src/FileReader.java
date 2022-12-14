import java.io.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class FileReader {

    public static String readFileAndConcatenateLines(String path) throws IOException{
        return Files.lines(Paths.get(path)).collect(Collectors.joining());
    }

}