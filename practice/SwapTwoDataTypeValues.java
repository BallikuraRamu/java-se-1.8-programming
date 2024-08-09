public class SwapTwoDataTypeValues {
    public static void main(String[] args) {
        int a = 10; int b = 20;
        SwapTwoDataTypeValues values = new SwapTwoDataTypeValues();
        values.intValues(a,b);
        String s = "R"; String r = "A";
        stringValues(s,r);
    }

    private void intValues(int a,int b) {
        a = a +b; // a =30
        b = a - b; // 30 - 20 = 10
        a = a-b; // 30 - 10 = 20
        System.out.println(a + " "+ b);
    }
    private static void stringValues(String s1,String s2){
        s1 = s1 + s2; // append 2d value to 1st
        s2 = s1.substring(0,s1.length()-s2.length());
        s1 = s1.substring(s2.length());
        System.out.println(s1+" "+s2);
    }
}
