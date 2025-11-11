public class SumAndAverage {
   public static void main(String[] args) {
       int[] numbers = {5, 10, 15, 20, 25, 30};
       int sum = 0;
       for (int num : numbers) {
           sum += num;
       }
       double avg = (double) sum / numbers.length;
       System.out.println("sum is " + sum);
       System.out.println("average is " + avg);
   }
}
