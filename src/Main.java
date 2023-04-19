import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    private static void task1() {
        int[] salaryArray = generateRandomArray();
        System.out.println(Arrays.toString(salaryArray));

        int salarySum = 0;

        for (int salary: salaryArray) {
            salarySum += salary;
        }

        System.out.println("Сумма трат за месяц составила " + salarySum + " рублей");
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;

    }
    private static void task2() {
        int[] salaryArray = generateRandomArray();
        System.out.println(Arrays.toString(salaryArray));
        Arrays.sort(salaryArray);
        System.out.println("Мин палата " + salaryArray[0] + " Макс выплата " + salaryArray[29]);
    }

    private static void task3() {
        int[] expensesArray = generateRandomArray();
        double expensesMed = 0;

        for (int expenses: expensesArray) {
            expensesMed += expenses;
            expensesMed = expensesMed / 30;
            System.out.println("средние затраты за месяц " + expensesMed);
        }

        System.out.println("Задача 4");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }

    }


}

