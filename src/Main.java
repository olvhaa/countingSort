import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wybierz ile tablica ma mieć miejsc");
        int wybor_size = scanner.nextInt();

        System.out.println("Jaka jest maksymalna liczba w twojej tablicy;");
        int max = scanner.nextInt();

        int[] numberArray = new int[wybor_size];


        System.out.println("Wprowadź kolejno " + wybor_size + " liczb." );
        for(int i = 0; i < wybor_size; i++) {
            numberArray[i] = scanner.nextInt();
            if(numberArray[i] < max) {
                System.out.println("Liczba wpisana w tablice nie moze byc wieksza od maksymalnej którą podałeś.");
                System.exit(0);
            }
        }
        System.out.println("Nieposortowana tablica");
        for(int i = 0; i < wybor_size; i++) {
            System.out.print(numberArray[i] + ", ");
        }
        System.out.println();
        System.out.println("Posortowana tablica");
        int[] sortedArray = countingSort(numberArray, max);

        for(int i = 0; i < wybor_size; i++) {
            System.out.print(sortedArray[i] + ", ");
        }
    }

    public static int[] countingSort(int[] numberArray, int max) {
        int[] temp = new int[max + 1];
        int size_array = numberArray.length;

        for(int i = 0; i < temp.length; i++) temp[i] = 0;

        for(int i = 0; i < size_array; i++) {
            temp[numberArray[i]]++;
        }
        int k = 0;
        for(int i = 0; i < max + 1; i++) {
            for(int j = 0; j < temp[i]; j++) {
                numberArray[k] = i;
                k++;
            }
        }
        return numberArray;
    }


}
