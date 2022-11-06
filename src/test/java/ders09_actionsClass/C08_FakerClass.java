package ders09_actionsClass;

import com.github.javafaker.Faker;
import org.junit.Test;

public class C08_FakerClass {

    @Test
    public void test01(){

        Faker faker=new Faker();

        System.out.println(faker.name().firstName());  //Michael
        System.out.println(faker.name().fullName());  //Hector Jerde

        System.out.println(faker.address().fullAddress());  //0704 Edith Junction, Lake Bradlymouth, CA 15687
        System.out.println(faker.internet().password());    //ytnrsgp0l08



    }
}
