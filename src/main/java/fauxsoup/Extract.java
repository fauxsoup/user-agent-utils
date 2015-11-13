package src.main.java.fauxsoup;

import src.main.java.eu.bitwalker.useragentutils.*;
import net.sf.json.*;
import java.io.*;

public class Extract {
    public static void main(String[] args) throws IOException {
        JSONArray browsers = new JSONArray();
        for (Browser b : Browser.getBrowsers()) {
            browsers.element(b.toJSON());
        }

        JSONArray operating_systems = new JSONArray();
        for (OperatingSystem os : OperatingSystem.getOperatingSystems()) {
            operating_systems.element(os.toJSON());
        }

        write_file("/home/deb/workspace/user-agent-utils/json/browsers.json", browsers.toString(4));
        write_file("/home/deb/workspace/user-agent-utils/json/operating_systems.json", operating_systems.toString(4));
    }

    private static void write_file(String file, String contents) throws IOException {
        FileWriter fw = new FileWriter(file, false);
        PrintWriter pw = new PrintWriter(fw);

        pw.print(contents);

        pw.close();
    }
}