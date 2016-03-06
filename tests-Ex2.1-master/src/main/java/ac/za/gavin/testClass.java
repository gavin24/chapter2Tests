package ac.za.gavin;

import java.util.ArrayList;

/**
 * Created by gavin.ackerman on 2016-03-06.
 */
public class testClass {


    private int marks;
    public testClass()
    {

    }
    public testClass(int mark)
    {
        marks = mark;
    }

    public static ArrayList v()
    {
        ArrayList v = new ArrayList<String>();
        v.add("blah");
        v.add("fdf");
        return v;
    }
    public static String name(){return "james";}
    public static Object aNull(){testClass tes = null; return tes;}
    public static Object aNonNull(){testClass tes = new testClass(6); return tes;}

    public static float addFloats(float a, float b)
    {
        return a + b;
    }
    public static int addIntegers(int a, int b)
    {
        return a + b;
    }
}
