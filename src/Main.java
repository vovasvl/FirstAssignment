import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,k;
        System.out.println("Введите количество элементов массива");
        n = input.nextInt();
        int[] list = new int[n];
        System.out.println("Введите элементы массива по одному");
        for (int i=0; i<n; i++){
            k=input.nextInt();
            list[i]=k;
        }
        System.out.println("Максимум массива = "+max(list));
    }
    public static int max(int[] obj){
        int m= obj[0];
        for (int i =0; i<obj.length; i++){
            if(obj[i]>m){
                m=obj[i];
            }
        }
        return m;
    }
}