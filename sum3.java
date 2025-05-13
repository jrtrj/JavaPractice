public class sum3 {
    private int max;
    public sum3(int a,int b,int c) {
        /*
        max = (a > b)?((a > c)?a:c):((b > c)?b:c);
        System.out.println(max);
         */
        max = (a > b)?Math.max(a,c):Math.max(b,c);
        System.out.println(max);
    }
}
