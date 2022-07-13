import java.util.Arrays;

public class Arrays_class {
    public static void main(String[] args) {
        /*

        SYNTAX
        TypeofVar[] NameofArray = new TypeofVar[dimension];

        int [] age = new int[4];
        long [] age = new long[4];
        float [] height = new float [3];
        double [] height = new double [3];
        boolean [] state = new boolean [5];
        char [] gender = new chat[2];
        String [] name = new String[2];
        */

        int [] numbers = new int[3];

        numbers[0] = 5;
        numbers[1] = 10;
        numbers[2] = 13;

        for(int i=0;i<numbers.length;i++){
            System.out.println(Arrays.toString(numbers)); //System.out.println(numbers[i]);
        }
    }
}
