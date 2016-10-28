package am.aca.ITFinder.comman.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by Armen on 10/18/2016.
 */
public class MyUtil {
    public final static String URL = "jdbc:mysql://localhost:3306/satartup?autoReconnect=true&useSSL=false";
    public final static String LOGIN = "root";
    public final static String PASSWORD = "root";

    private static Integer nextTelNumerID = 1;

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
