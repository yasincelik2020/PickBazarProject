package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    /*
ConfigurationReader class test method’larimiz ile Configuration.properties
arasinda iletisimi saglar.
Bu class’da test class’larindan kolayca ulasmak icin static method bulunur
Method static oldugundan method icerisinden cagiracagimiz variable da
static olmalidir.
Kullanacagimiz static variable’a ilk degeri atamak icin(instantiate) de static block
kullaniriz.
*/
    public static Properties properties;   //Create Properties instance

    static{
        String filePath="config.properties";  //path of the configuration file
        try {
            FileInputStream fis=new FileInputStream(filePath);
            // fis dosyayolunu tanimladigimiz configuration.properties dosyasini okudu
            properties=new Properties();
            properties.load(fis); // fis'in okudugu bilgileri properties'e yukledi
            //close the file
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static String getProperty(String key){
        /*
          test method'undan yolladigimiz string key degerini alip
          Properties class'indan getProperty( ) method'unu kullanarak
          bu key'e ait String data typedaki value'u bize getirdi
          Dosyayı okumak için bu metodu oluşturuyoruz
         */
        return properties.getProperty(key);
    }
}
