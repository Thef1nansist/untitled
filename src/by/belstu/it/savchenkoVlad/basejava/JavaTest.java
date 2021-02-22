package by.belstu.it.savchenkoVlad.basejava;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Objects;

import static java.lang.Math.*;



public class JavaTest {
    private static int sing;

    final int aint = 10;
    public final int bint = 10;
    public static final int cint = 10;

    public static void main(String[] args) throws UnsupportedEncodingException {

        WrapperString ob = new WrapperString("Hi");
        ob.replace('H','p');

        char ichar = '1';
        String istr = "11";
        int iint = 11;
        short ishort = 11;
        byte ibyte = 11;
        long ilong = 11L;
        double idouble = 11;
        boolean ibool = true;

        String result = istr + iint;
        System.out.println(result);

        result = istr + ichar;
        System.out.println(result);

        result = istr + idouble;
        System.out.println(result);

        byte bresult = (byte) (ibyte + iint);
        System.out.println(bresult);

        int iresult = (int) (idouble + ilong);
        System.out.println(iresult);

        long lresult = 0 + 2147483647;
        System.out.println(lresult);


        System.out.println(sing);

        System.out.println(ibool && false);

        System.out.println(ibool ^ false);

//       System.out.println(false + true);

        long along = 9223372036854775807L;
        long blong = 0x7ffffffffffL;

        System.out.println(along);
        System.out.println(blong);

        char cchar = 'a';
        char dchar = '\u0061';
        char echar = 97;

        System.out.println(cchar);
        System.out.println(dchar);
        System.out.println(echar);

        System.out.println((char)(cchar + dchar + echar));

        System.out.println(3.45 % 2.4);
        System.out.println(1.0 / 0.0);
        System.out.println(0.0 / 0.0);

        System.out.println(Float.intBitsToFloat(0x7F800000));
        System.out.println(Float.intBitsToFloat(0xFF800000));

        System.out.println(PI);
        System.out.println(E);

        System.out.println(min(PI, E));



        Boolean newBool = true;
        Character newChar = 'a';
        Integer newInt = 10;
        Byte newByte = 10;
        Short newShort = 10;
        Long newLong = 10L;
        Double newDouble = 10D;

        System.out.println(newInt>>2);
        System.out.println(newInt>>>2);
        System.out.println(~newInt);
        System.out.println(newInt&newShort);
        System.out.println(newInt * 2);
        System.out.println(newInt - newShort);
        System.out.println(newInt + newLong);

        System.out.println(Long.MAX_VALUE + " # LONG # " + Long.MIN_VALUE);
        System.out.println(Double.MAX_VALUE + " # DOUBLE # " + Double.MIN_VALUE);

        int in = 0;
        byte bt = 0;
        in = Integer.valueOf(newInt);
        bt = Byte.valueOf(newByte);
        System.out.println(in);
        System.out.println(bt);
        int par = Integer.parseInt("10");
        System.out.println(par);
        Integer valof = Integer.valueOf(25);
        System.out.println(valof);
        int hex = Integer.compare(10,20);
        System.out.println(hex);


        //ToDO: f
        String s34 = "2345";
        int s343 = 0;
        Integer s344 = new Integer(s34);
        Integer s35 = Integer.valueOf(s34);
        s343 = Integer.parseInt(s34);
        System.out.println(s35);
        System.out.println(s344);
        System.out.println(s343);

        //строку в массив байтов
        byte[] b3 = s34.getBytes();
        System.out.println(b3);
        // обратно
        String str = new String(b3);
        System.out.println(str);
        // строку в логику
        String s1 = "True";
        String s2 = "yes";
        boolean bool1, bool2,bool3, bool4;

        bool1 = Boolean.parseBoolean(s1);
        bool2 = Boolean.parseBoolean(s2);
        System.out.println(bool1);
        System.out.println(bool2);

        bool3 = Boolean.valueOf(s1);
        bool4 = Boolean.valueOf(s2);
        System.out.println(bool3);
        System.out.println(bool4);

        // compareTo

        String strok1 = "Hi";
        String strok2 = "Hi";
        if(strok2 == strok1){
            System.out.println("Равны");
        }
        else
            System.out.println("not");
        Boolean bl = strok1.equals(strok2);
        int i1 = strok1.compareTo(strok2);
        System.out.println(bl);
        System.out.println(i1);

        String str4 = "I love Natasha";
        String[] worlds = str4.split(" ");
        for (String world : worlds){
            System.out.println(world);
        }
        boolean mm = str4.contains("love");

        System.out.println(mm);

        int mi = str4.length();
        System.out.println(mi);

        //g
        char[][] c1;
        char[] c2[] = {{'a','b'},{'a','b'}};
        char c3[][] = {{'a','b'},{'a','b'}};
        c1 = new char[3][];


        c1[0] = new char[2];
        c1[1] = new char[3];
        c1[2] = new char[4];

        for(int i = 0; i<c1.length; i++){
            System.out.println(c1[i]);
        }
        boolean comRez = c2 == c3;
        System.out.println(comRez);

        for (char[] i: c2)
              {
                  for (char j: i
                       ) {
                      System.out.println(j);
                  }

        }










    }
}
class WrapperString{
    private String stroks;

    public String getStroks() {
        return stroks;
    }

    public void setStroks(String stroks) {
        this.stroks = stroks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WrapperString that = (WrapperString) o;
        return Objects.equals(stroks, that.stroks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stroks);
    }

    @Override
    public String toString() {
        return "WrapperString{" +
                "stroks='" + stroks + '\'' +
                '}';
    }
    public  WrapperString(String str){
        this.stroks = str;
    }
    public void replace (char oldchar, char newchar)
    {
    stroks.replace(oldchar, newchar);
    }
}

