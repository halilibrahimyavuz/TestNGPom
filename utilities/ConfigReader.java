package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    //bır gorevı var:--> lazım olacak test datası lazım olunca bu class aracılıgıyla getırecek
    //bır kere ulastır sonra donup bakmana gerek yok
    //ne zmn test datası lazım olunca dosyadan data yı ıste ConfıgREADER sana getırsın

    public static Properties properties;

             static{
                     String path="src/configuration.properties";

                               try {
                                     FileInputStream fis=new FileInputStream(path);
                                     properties=new Properties();
                                     properties.load(fis);
                                     fis.close();

                             } catch (IOException e) {
                                 e.printStackTrace();
                      }

                     }

                     public  static String getProperty(String key){

                 return  properties.getProperty(key);
                     }

}
