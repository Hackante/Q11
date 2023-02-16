public class ADJAZENZMATRIX {
   int[][] matrix;
   
   public ADJAZENZMATRIX() {
       matrix = new int[4][4];
       vorbelegen();
   }
   
   public void kantenEinfügen(int zeile, int spalte, int wert) {
       matrix[zeile-1][spalte-1] = wert;
   }
   
   public void vorbelegen() {
       for(int i = 0; i < matrix.length;i++) {
           for(int j = 0; j < matrix.length; j++) {
               matrix[i][j] = -1;
               if(i == j) matrix[i][j] = 0;
           }
        }
   }
   
   public void print() {
       for(int i = 0; i < matrix.length;i++) {
           for(int j = 0; j < matrix.length; j++) {
               System.out.print(matrix[i][j] + " ");
           }
           System.out.println();
        }
   }
}
