public class MissingNumberInArray {
    public static void main(String[] args) {
        int total;
        int[] arr = new int[]{1,2,4,5,6};
        total = 6;
        int expected_sum = total *(total + 1)/2;
        int sum = 0;
        for (int a:arr){
            sum +=a;
        }
        System.out.println(expected_sum - sum);
    }
}
