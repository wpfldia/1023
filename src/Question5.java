public class Question5 {
    public static void main(String[] args) {
        int[] num = {3, 7, 2, 19, 4};
        int max = num[0];

        for(int i = 1;i<num.length;i++)

        {
            System.out.print(" /i ="+i);
            System.out.print("max =" + max);
            System.out.print("/ i =" + num[i]);

            if (num[i] > max) {
                max = num[i];
            }
            System.out.println();
        }
        System.out.print(max);
    }

}