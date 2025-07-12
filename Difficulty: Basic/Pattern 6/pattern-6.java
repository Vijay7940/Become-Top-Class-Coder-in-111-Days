class Solution {

    void printTriangle(int n) {
        // code here
        for(int i=1;i<=n;i++){
            int c=1;
            for(int j=i;j<=n;j++){
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
        }
    }
}