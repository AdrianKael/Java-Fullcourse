public class MathClass {
    public static void main(String[] args) {
        double root = (int)Math.sqrt(9); //sqrt need a double variable in order to work
        // (int) is used to truncate the numbers, change from double to int
        // Integer.parseInt() used to convert a String to an Integer
        System.out.println(root);

        double base= 5, exp=2;
        double result = Math.pow(base,exp); // take into account the order of the variables, the first variable need to be the base and the second the exponential
        System.out.println(result);

        double num = 4.56;
        long res = Math.round(num); // long to receive a round of double

        float n = 4.23f;
        int r =  Math.round(n); // int to receive a round of float

        System.out.println(res+" "+r);

        double nu = Math.random(); // random number

        System.out.println(nu);

    }
}
