package fr.uracraft.uralogger.logging;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileGenerator {

    public static void createFile() throws IOException {
        File file = new File("plugins/LoggerMaster/Configuration.yml");
        FileWriter writer = new FileWriter(file);
        writer.write("");
    }
}