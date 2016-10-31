package am.aca.ITFinder.comman.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by Armen on 10/18/2016.
 */
public class MyUtil {

    public static final String DB_URL="jdbc:mysql://localhost:3306/satartup?autoReconnect=true&;useSSL=false&;useUnicode=true&;useJDBCCompliantTimezoneShift=true&;useLegacyDatetimeCode=false&;serverTimezone=UTC";

    public static final String DB_LOGIN = "root";
    public static final String DB_PASSWORD = "root";


    public static final String FILE_PATH ="C:\\Users\\Armen\\IdeaProjects\\StartUp1\\src\\am\\aca\\ITFinder\\comman\\resource\\myproperties.properties";
    public static Properties properties = new Properties();

    public static void loadProperties() {
        try {
            properties.load(new FileInputStream(FILE_PATH));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void printMessage(String key) {
        System.out.print(properties.getProperty(key));
    }


}
