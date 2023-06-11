public class ExerciseMain {
    public static void main(String[] args) {
        int arrayNumeric[] = { 90, 86, 94, 200, 93939, 9009 };

        contains(arrayNumeric, 202029);
        findIndexArray(arrayNumeric, 200);
        int sum = 0;
        for (int i = 0; i < arrayNumeric.length; i++) {
            sum = sum + arrayNumeric[i];
        }

        System.out.println("This is the avarage of array " + sum / arrayNumeric.length);

    }

    public static void contains(int arry[], int numberContain) {
        for (int i = 0; i < arry.length; i++) {
            if (arry[i] == numberContain) {
                System.out.println("This is contains " + numberContain);
            }
        }
    }

    public static void findIndexArray(int array[], int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                System.out.println("This is index of i" + i);
            }
        }
    }

    public int findIndexArrays(int array[], int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }

        }
        return -1;
    }

}