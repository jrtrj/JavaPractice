public class twoBetweenIntOps {
    private int x1;
    private int y1;
    public twoBetweenIntOps(long x,long y) {
        x1 = Integer.parseUnsignedInt(String.valueOf(x));
        y1 = Integer.parseUnsignedInt(String.valueOf(y));
        int add = x1 + y1;
        int sub = x1 - y1;
        int divide = Integer.divideUnsigned(x1,y1);
        int multiply = x1 * y1;
        int remainder = Integer.remainderUnsigned(x1,y1);

        System.out.println(Integer.toUnsignedString(x1)); // or
        System.out.println(x1); // or
        System.out.println(Integer.toUnsignedString(y1));
        System.out.println(add);
        System.out.println(sub);
        System.out.println(multiply);
        System.out.println(divide);
        System.out.println(remainder);
    }

}
