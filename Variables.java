public class Variables {
    public static void main(String[] args) {
        /* types of variables
        boolean (-127 to 127)
        short (-32000 to 32000)
        int (-2billion to 2billion)
        long (huge number) always ends with a capital L
        float (fractional number ends with f)
        double ( fractional number)
        char (single letter in single quotes)
        string (collection of chars in double quotes)
         */
        int age = 24; //initialization

        // swapping two variables
        /* this can be done by introducing a third variable
         */
        String x = "Money";
        String y = "Cash";
        String temp;
        temp = x;
        x = y;
        y = temp;
        System.out.println(x);
        System.out.println(y);
    }
}
