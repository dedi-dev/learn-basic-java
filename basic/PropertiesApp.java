package basic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesApp {
    public static void main(String[] args) {
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("application.properties"));

            System.out.println(properties.getProperty("nama"));
            properties.put("hoby", "Coding");
            System.out.println(properties.getProperty("hoby"));
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("IO Error");
            e.printStackTrace();
        }

        try {
            Properties newProperties = new Properties();
            newProperties.put("nama", "Dedi");
            newProperties.put("umur", "28 tahun");
            newProperties.store(new FileOutputStream("app.properties"), "Data COnfiguration");
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
