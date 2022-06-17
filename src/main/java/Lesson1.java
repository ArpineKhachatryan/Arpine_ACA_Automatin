import java.util.Locale;

public class Lesson1 {
    public static void main(String[] args) {

        System.out.println("We are starting automation course in ACA");

        String str1 ="Arpine";
        String str2 = "Khachatryan";

        System.out.println("This string length is "  + str2.length());
        System.out.println("CharAt method "+ str1.charAt(0));
        System.out.println(str1.concat(" this is fot test"));
        System.out.println("contains check1: " + str1.contains("Ar"));
        System.out.println("Check contents check1: " + str1.equals(str2));
        System.out.println("Index of i...  is " + str1.indexOf(3));
        System.out.println("is empty check " + str1.isEmpty());
        System.out.println("Trim function " + str1.trim());
        System.out.println("replace fuction " + str1.replace('p', 'b'));

        char [] charArray = str1.toCharArray();
        System.out.println(str1.toUpperCase(Locale.ROOT));
        System.out.println(str2.toLowerCase(Locale.ROOT));

        int a =10;      // stugum enq ardyoq kent a te zuyg
        boolean c =a%2==0;
        System.out.println(c);

        int v =3;
        int e =++v;
        System.out.println(e);

        int t =1;
        t+=t;
        System.out.println(t);

        int[] array;

        String [] car = {"Toyota", "Nissan", "Opel"};
        car[0] = "Mazda";
        System.out.println(car.length);
        System.out.println(car[0]);

        int myInt = 9;
        double myDouble = myInt;
        System.out.println(myInt);
        System.out.println(myDouble);   // Casting//

        double number = 89.9;
        int myNumber = (int)number;
        System.out.println(number);   //Casing//
        System.out.println(myNumber);


        








    }
}
