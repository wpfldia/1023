public class Question9 {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5};
        int[] copy = new int[original.length];

        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }

        System.out.println("복사된 배열:");
        for (int i = 0; i < copy.length; i++) {
            System.out.println(copy[i]);
        }
    }
}