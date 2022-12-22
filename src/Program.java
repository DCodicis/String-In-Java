
public class Program {
    public static void main(String[] args){

        // קריאה לאות במקום ספציפי
        String s1 = new String("acd de f");
        System.out.println(s1.length());
        System.out.println(s1.charAt(0));
        System.out.println(s1.charAt(5));
        System.out.println(s1.charAt(7));
        System.out.println(s1.charAt(s1.length()-4));

        // בדיקת מיקום של אות
        String s2 = "xyz xx yy z";
        System.out.println(s2.charAt(s2.length()-1));
        System.out.println(s2.indexOf('a'));
        System.out.println(s2.indexOf('Y'));
        System.out.println(s2.indexOf('z'));

        // String חיבור של 
        String s3 = "hello";
        String s4 = "bye";
        String s5 = s3.concat(s4);
        System.out.println(s5);

        String s7 = s3.substring(1,4);
        System.out.println(s7);

        //לא משווים מחרוזות עם ==
        String s8 = "hello";
        if(s3.equals(s8))
            System.out.println("Yes!!!");
        else
            System.out.println("No!!!");

        String s9 = new String("abc");
        String s10 = new String("aBc");
        if(s9.equals(s10))
            System.out.println("same");// לא יודפס כלום כיוון שהמחרוזות לא זהות
        if(s9.equalsIgnoreCase(s10))
            System.out.println("Good");// מתעלם מההבדל של האות הגדולה או הקטנה

        // הדפסת המחרוזת הגדולה יותר
        String s11 = new String("abcde");
        String s12 = new String("ccc");
        if(s11.compareTo(s12)==0) // האם המחרוזות שוות
            System.out.println("The same");
        else
            if(s11.compareTo(s12)>0) // המחרוזת הראשונה גדולה מהשניה
                System.out.println(s11);
            else // המחרוזת השניה גדולה מהראשונה
                System.out.println(s12);
    }
}
