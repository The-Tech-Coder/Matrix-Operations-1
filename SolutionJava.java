import java.util.Scanner;

public class MatrixOperations2 {

    public static void main(String[] args) {
        int a[][] = new int[3][3];    
        int b[][] = new int[3][3];

        Scanner x = new Scanner(System.in);
        System.out.println("Enter the elements for matrix row-wise:");
        for(int i=0; i<3; i++){    
            for(int j=0; j<3; j++){    
                a[i][j] = x.nextInt(); 
            }    
                System.out.println();
        }    
        x.close();     

        for(int i=0; i<3; i++){    
            for(int j=0; j<3; j++){    
                b[i][j] = a[j][i];  
            }    
        }    
    
        System.out.println("User's Matrix");  
        for(int i=0; i<3; i++){    
            for(int j=0; j<3; j++){    
                System.out.print(a[i][j]+" ");    
            }    
            System.out.println(); 
        }    

        System.out.println("Transpose of the user's Matrix:");  
        for(int i=0; i<3; i++){    
            for(int j=0; j<3; j++){    
                System.out.print(b[i][j]+" ");    
            }    
            System.out.println();    
        }  

        boolean symmetric = true;
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if (a[i][j] != b[i][j]){
                    symmetric = false;
                    break;
                }
            }
        }
        if(symmetric){
            System.out.println("It is a Symmetric Matrix.");
        }
        else{
            System.out.println("It is not a Symmetric Matrix.");
        }
    }
}
