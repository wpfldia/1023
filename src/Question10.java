public class Question10 {
    public static void main(String[] args) {
        int[] numbers = {20, 30, 50, 70, 90};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        double average = (double) sum / numbers.length;
        System.out.println("배열의 평균: " + average);
    }
}