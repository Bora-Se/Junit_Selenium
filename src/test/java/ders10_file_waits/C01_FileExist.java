package ders10_file_waits;

import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C01_FileExist {

    @Test
    public void test01(){

        System.out.println(System.getProperty("user.dir"));  //C:\Users\Nuray\IdeaProjects\JUnitInt

        // /Users/ahmetbulutluoz/Desktop/My Desktop/course/selenium/JUnitInt
        // C:\Users\ffyil\Desktop\JUnitInt
        // C:\Users\Notebook\Desktop\TESTER\JUnuitInt
        // C:\Users\toshiba\IdeaProjects\Junit

        System.out.println(System.getProperty("user.home"));  //C:\Users\Nuray
        //C:\Users\Nuray     //C:\Users\Nuray\Desktop\FileTest
        //FileTest dosya ve text in yolu   C:\Users\Nuray\Desktop\FileTest

        // masa ustunde olusturdugumuz txt file'in path'i
        // /Users/ahmetbulutluoz/Desktop/FileTesti/deneme
        // //Users/ahmetbulutluoz/Dowloads

        /*System.getProperty("user.home") tum bilgisayarlarda
          kullaniciya kadar olan path'i verir
          ve bu kisim her bilgisayar ve her kullanici icin farklidir

          user.home'dan sonrasi tum kullanicilar ortak olabilir
          ornegin tum kullanicilarin masaustu

          user.home / Desktop

          downloads %90 kullanici icin

          user.home / Downloads

          eger birden fazla bilgisayarda file ile ilgili bir test yapacaksaniz
          dosya yolunu dinamik olarak olusturmaniz gerekir*/

        // dinamik dosya yolu olusturma
        // masa ustunde FileTesti diye bir klasor ve onun altinda deneme diye bir text dosyasi icin

        String dosyaYolu= System.getProperty("user.home")+"\\Desktop\\FileTest";
        System.out.println(dosyaYolu);   //C:\Users\Nuray\Desktop\FileTest

        System.out.println(Files.exists(Paths.get(dosyaYolu))); //true

        String dosyaYolu2= System.getProperty("user.home")+"\\Desktop\\FileTest\\Deneme.txt";
        System.out.println(dosyaYolu2);   //C:\Users\Nuray\Desktop\FileTest\Deneme.txt

        //System.out.println(Files.exists(Paths.get("istenen dosyanin path i"))); // true yada false dondurur



    }
}
