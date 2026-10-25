import java.util.Scanner;
class Main{

    public static void main(String[] args) {  
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n=sc.nextInt();
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        System.out.println("Enter the "+n+" elements of the array");
        for (int i=0;i<n;i++){
            int val=sc.nextInt();
            if(val>max) max=val;
            if(val<min) min=val;

        }
        int span=max-min;
        System.out.println("The span of the array is"+span);
    }
    
}