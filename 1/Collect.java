import java.util.ArrayList;
import java.util.Collection;

class Collect 
{
    public static void main(String args[])
    {
        Collection <String> c1 = new ArrayList<>();

        c1.add("Elm 1");
        c1.add("Elm 2");

        System.out.println(c1.toString());
    }
}