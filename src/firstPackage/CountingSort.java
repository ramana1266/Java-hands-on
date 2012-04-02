package firstPackage;
public class CountingSort{
	   
    public static void main(String[] args){
        int[] A ={1,3,2,3,3,2,3,3,1,0,3,2,2,3,0};
        int[] B = counting_sort(A,3);
        for(int i=0;i<B.length;i++){
            System.out.print(B[i]+ "");
        }
    }
   
    public static int[] counting_sort(int[] A,int k){
        int[] C = new int[k+1];
        int[] B = new int[A.length];
        for(int i=0;i<=k;i++){
            C[i]=0;
        }
        for(int j=0;j<A.length;j++){
            C[A[j]]+=1;
        }
        for(int i=1;i<=k;i++){
            C[i]+=C[i-1];
        }
        for(int j = A.length-1;j>=0; j-- )
        {
            B[C[A[j]]-1]=A[j];
            C[A[j]]-=1;
        }
        return B;
               
    }

}