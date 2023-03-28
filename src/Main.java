import java.util.Arrays;

public class Main{


    public static int getLastIndex(String[] names) {
        return names.length - 1;
    }


    public static int getSecondToLastIndex(String[] names) {
        return names.length - 2;
    }

    public static String getFirstElement(String[] names) {
        return names[0];
    }


    public static String getLastElement(String[] names) {
        return names[names.length - 1];
    }


    public static String getSecondToLastElement(String[] names) {
        return names[names.length - 2];
    }


    public static int getSum(int[] ints) {
        int sum = 0;
        for (int i : ints) {
            sum += i;
        }
        return sum;
    }

    // Question 7
    public static int getAverage(int[] ints) {
        int sum = getSum(ints);
        return sum / ints.length;
    }

    // Question 8
    public static int[] extractAllOddNumbers(int[] numbers) {
        int[] result = new int[numbers.length];
        int index = 0;
        for (int i : numbers) {
            if (i % 2 == 1) {
                result[index] = i;
                index++;
            }
        }
        return Arrays.copyOf(result, index);
    }

    // Question 9
    public static int[] extractAllEvenNumbers(int[] numbers) {
        int[] result = new int[numbers.length];
        int index = 0;
        for (int i : numbers) {
            if (i % 2 == 0) {
                result[index] = i;
                index++;
            }
        }
        return Arrays.copyOf(result, index);
    }


    public static boolean contains(String[] names, String element) {
        for (String name : names) {
            if (name.equals(element)) {
                return true;
            }
        }
        return false;
    }


    public static int getIndexByElement(String[] names, String element) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    public static void printOddNumbersInRange(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }


    public static String printGivenStringTimesNumberGiven(String str, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(str);
        }
        return sb.toString();
    }


    public static String repeatFirstThreeLetters(String str, int n) {
        String prefix = str.substring(0, 3);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(prefix);
        }
        return sb.toString();
    }

}
