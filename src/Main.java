
public class Main {
    public static void main(String[] args) {
        int[] list = {1,2,3};
        System.out.println(max(list));
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