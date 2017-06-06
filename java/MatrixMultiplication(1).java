import java.util.Scanner;
class MatrixMultiplication {
      public static void main(String args[]) {
              int j;
             int A[][] = new int[20][20];
             int B[][] = new int[20][20];
             int C[][] = new int[20][20];
             Scanner S = new Scanner(System.in);
             System.out.println("Enter the rows and columns of matrix A");      /*Reading matrix A*/
             int rowsA = S.nextInt();
             int coulmnA = S.nextInt();
             for (int i=0; i<rowsA; i++) {
                 for (j=0; j<coulmnA; j++) {
                      A[i][j] = S.nextInt();
                      System.out.print(" ");
                 }
                 System.out.println();
             }
             
             System.out.println("Enter the rows and columns of matrix B");  /*Reading matrix B*/
             int rowsB = S.nextInt();
             int coulmnB = S.nextInt();
             for (int i=0; i<rowsB; i++) {
                 for (j=0; j<coulmnB; j++) {
                      A[i][j] = S.nextInt();
                      System.out.print(" ");
                 }
                 System.out.println();
             }
            j=0;
             if (coulmnB==rowsA){                                          /* loop to perform matrix multiplication*/
                for (int i=0; i<rowsA; i++) {
                    C[i][j]=0;
                    for (j=0; j<coulmnB;j++) {
                        for (int k=0; k<coulmnA; k++) { 
                            C[i][j] = (A[i][k]*B[k][j]) + C[i][j]; 
                         }
                    }
                }
                    
             }
             
              for (int i=0; i<rowsA; i++) {                               /*function to print the resultant matrix*/
                 for (j=0; j<coulmnB; j++) {
                     
                      System.out.print(C[i][j]+" ");
                 }
                 System.out.println();
             }
             
      }
}