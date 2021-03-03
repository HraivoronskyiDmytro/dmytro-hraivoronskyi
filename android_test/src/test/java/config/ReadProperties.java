package config;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Properties;

public class ReadProperties {

    private Properties property;

    public void initProperty(String propertiesFileName) {
        try {
            FileInputStream fis;
            this.property = new Properties();

            fis = new FileInputStream(Paths.get("src","test","resources", propertiesFileName)
                    .toAbsolutePath()
                    .toString());
            property.load(fis);
        } catch (IOException e) {
            System.err.println("Error: properties file is absent");
        }
    }


    public String getValue(String propName) {
        return property.getProperty(propName);
    }

}
