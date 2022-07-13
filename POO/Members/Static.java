package Members;
// Static Members of a Class
public class Static {
    private static String Phrase = "First Phrase"; //now is normal Attribute, but if we add 'static' now will be changed by any object, does not have a Value for each obj

    private static int Add(int a,int b){
        return (a+b);
    }

    public static void main(String[] args) {
        Static obj = new Static();
        Static obj2 = new Static();

        // obj2.Phrase="Second Phrase"; // set again 'Phrase' so change

        //System.out.println(obj.Phrase); // 'Second Phrase'
        //System.out.println(obj2.Phrase); // 'Second Phrase'

        System.out.println(Static.Phrase); // can be directly called without an obj, now it belongs to the class not the objects
        System.out.println("The Summation is :"+Static.Add(3,4));

    }
}
