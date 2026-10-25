import java.util.Scanner;
class findelement{

    public static void main(String[] args) { 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element to search for ");
        int t=sc.nextInt();
        System.out.println("Enter the number of elements");
        int n=sc.nextInt();
        int[] arr=new int[n];
         System.out.println("Enter the "+n+" elements of the array");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans=find(arr,t);
        System.out.println(ans);
    }
    public static int find(int[] arr,int d){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==d){
                return i;
            }
        }
        return-1;
    }
}