package ders06_junit;

import org.junit.Assert;
import org.junit.Test;

public class C07_Assertions {

    @Test
    public void test01(){

        int sayi1= 10;
        int sayi2= 20;
        int sayi3= 30;

        //sayi1 in sayi2 den kucuk oldugunu test edin
        Assert.assertTrue(sayi1<sayi2);

        //sayi1 in sayi2 den buyuk olmadigini test edin
        Assert.assertFalse(sayi1>sayi2);

        //say1 in sayi2 ye esit oldugunu test edin
        Assert.assertEquals(sayi1,sayi2);
    }
    /*@Test
    public void test2(){
        Assert.assertEquals();
    }*/
}
