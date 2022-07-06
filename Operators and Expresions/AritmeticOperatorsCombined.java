public class AritmeticOperatorsCombined {
    public static void main(String[] args) {
        int num=10,y;

        num += 5;
        y=--num;
        // also possible to have operators as: /= *= -= %=
        // ++ or -- to increment or decrement
        System.out.println(num+" "+y);
    }
}