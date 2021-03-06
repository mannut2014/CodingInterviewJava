public class DuplicationNumberDemo {
    public void duplicationNumber(int[] array) {
        if (array.length == 0) {
            System.out.println("Array is empty.");
            return;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0 || array[i] > array.length - 1){
                System.out.println("Input error");
                return;
            }
        }

        for (int i = 0; i < array.length; i++) {
            while (i != array[i]) {
                if (array[i] == array[array[i]]) {
                    System.out.println("One duplication number is " + array[i] + ".");
                    return;
                }
                int temp = array[i];
                array[i] = array[temp];
                array[temp] = temp;
            }
            if (i == array.length - 1) {
                System.out.println("No duplication number.");
                return;
            }
        }

    }
}
