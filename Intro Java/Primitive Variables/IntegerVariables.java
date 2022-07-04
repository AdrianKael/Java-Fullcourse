public class IntegerVariables {
    public static void main(String [] args){
        /* Integers:
            Byte
                Size 8
                Range -128 to 127 / 2^8 to 2^8-1 (0 value also exists that's why its 127 and no 128)
            Short
                Size 16
                Range 2^16 to 2^16 -1
            Int
                Size 32
                Range 2^32 to 2^32 -1
            Long
                Size 64
                Range 2^64 to 2^64 -1
         */
        byte One;
        One = 12;
        // Other way to Define Variable
        byte Two =12;
        // Both ways are correct to define a variable
        System.out.println(One);
        System.out.println(Two);

        short Three =1222;
        System.out.println(Three);

        int Four = 2222222;
        System.out.println(Four);

        long Five= 222222222;
        System.out.println(Five);
        // all these variables are INTEGERS so can't have decimals for that case we use other type of variable
    }
}
