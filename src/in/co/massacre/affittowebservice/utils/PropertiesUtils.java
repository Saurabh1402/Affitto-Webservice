package in.co.massacre.affittowebservice.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by saurabh on 10/10/17.
 */
public class PropertiesUtils {
    static Properties properties=null;
    public static String getProperties(String key)  {
        if(properties==null){
            try {
                loadProperties();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return properties.getProperty(key);
    }
    public static void loadProperties() throws IOException {
        properties=new Properties();
        properties.load(new FileInputStream("META-INF/config/config.properties"));

    }
}
