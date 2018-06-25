import java.util.ArrayList;
import java.util.Collection;

class Collect 
{
    public static void main(String args[])
    {
        Collection <String> c1 = new ArrayList<>();
        Collection <String> c2 = new ArrayList<>();

        c1.add("Elm 1");
        c1.add("Elm 2");
        c2.add("Elm 3");

        c2.addAll(c1);

        System.out.println(c2.toString());
    }
}