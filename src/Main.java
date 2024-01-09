public class Main {
    public static void main(String[] args) {
        //task1
        System.out.println("task1");
        int[] array = new int[]{1, 2, 3};
        double[] arrayDouble = new double[]{1.57, 7.654, 9.986};
        int[] arrayRandom = new int[2];
        arrayRandom[0] = 2;
        arrayRandom[1] = 3;


        //task2
        System.out.println("task2");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arrayDouble.length; i++) {
            System.out.print(arrayDouble[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < arrayRandom.length; i++) {
            System.out.print(arrayRandom[i] + " ");

        }

        //task3
        System.out.println("task3");


    }
}