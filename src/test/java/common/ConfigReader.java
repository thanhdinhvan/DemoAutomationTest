package common;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {
    static Properties properties = null;

    static  {
        properties = new Properties();
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream("config");
            properties.load(inputStream);
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            if(inputStream != null){
                try {
                    inputStream.close();
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }

    public  static String getPlatFormName(){
        return properties.getProperty("PLATFORM_NAME");
    }
    public  static String getAppiumServerUrl(){
        return properties.getProperty("APPIUM_SERVER_URL");
    }
    public  static String getCapabsFilePath(){
        return properties.getProperty("CAPABS_FILE_PATH");
    }

}
