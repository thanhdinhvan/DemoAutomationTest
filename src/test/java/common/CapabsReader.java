package common;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.*;

public class CapabsReader {
    public CapabsReader(){}

    public DesiredCapabilities getCapabilities() {
        DesiredCapabilities capabs = new DesiredCapabilities();
        BufferedReader reader;
            try {
                File f = new File(System.getProperty("user.dir") + ConfigReader.getCapabsFilePath());
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String line;
                while ((line = br.readLine()) != null){
                    System.out.println(line);
                    String[] cap = line.split("=");
                    capabs.setCapability(cap[0],cap[1]);
                    line = br.readLine();
                    System.out.println(cap);
                }
                fr.close();
                br.close();
            } catch (Exception ex) {
                System.out.println("Loi doc file: "+ex);
            }
        return capabs;
    }

    public static void main(String[] args) {
        CapabsReader cap = new CapabsReader();
        cap.getCapabilities();
    }

}

