package utils;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class ConfigManager {

    public static Properties readPropertiesFile() {
        ConfigManager prop = new ConfigManager();
        Properties props = new Properties();
        try {
            InputStream input = new FileInputStream("./src/test/java/utils/config.properties");
            props.load(input);

        } catch (Exception e) {
            e.getStackTrace();
        }
        return props;

    }

}
