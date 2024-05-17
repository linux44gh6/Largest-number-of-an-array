import java.util.*;
public class sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the total element number of array");
        int n=sc.nextInt();
        int []a=new int[n];
        int max=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if (a[i] > 0) {
                max=a[i];
            }
        }
        for (int i=0;i<n;i++){
            System.out.println(a[i]);
        }
        System.out.println("max number of the array="+max);
    }
}
