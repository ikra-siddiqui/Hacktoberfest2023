public class CountSetBits {

    //counting set bits of all numbers before n (including it) and storing in array
    public static int[] countBits(int n) {
        int ans[] = new int[n+1];
        for(int i=1;i<n+1;i++) {
            ans[i]=(ans[(i & (i-1))])+1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int n=3;
         int arr[]=countBits(n);
         for(int i=0;i<n+1;i++)
            System.out.println(arr[i]);
    }
}   

