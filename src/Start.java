import java.util.InputMismatchException;
import java.util.Scanner;
public class Start {
    public static void main(String[]args){
        try {
            Scanner sc = new Scanner(System.in, "cp1251");
            System.out.println("Введите сколько строк");
            int a = sc.nextInt();
            System.out.println("Введите сколько номер");
            int b = sc.nextInt();
            int n = 0;
            int[][] arr = new int[a][b];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.println("Введите элемент строки " + i + " под номером " + j);
                    arr[i][j] = n;
                    n++;
                }
            }
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print("arr[" + i + "][" + j + "]=" + arr[i][j] + ";");
                }
                System.out.println();
            }
            System.out.println("Введите искомую строку");
            int z = sc.nextInt();
            System.out.println("Введите искомый номер");
            int x = sc.nextInt();
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (arr[i][j]==arr[z][x]){
                        System.out.println("то что искали");
                        System.out.print("arr[" + i + "][" + j + "]=" + arr[i][j] + ";");
                    }
                }
            }
            System.out.println();
        }catch (InputMismatchException e){
    System.out.println("введено не число");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("нет такого номера или строки.");
        }
    }
}
