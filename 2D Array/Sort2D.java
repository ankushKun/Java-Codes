import java.util.*;
public class Sort2D{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int M;
		while(true){
			System.out.print("Input order of matrix : ");
			M = sc.nextInt();
			if(M>3 && M<10){
				break;
			}else{
				System.out.println("Please enter a number>3 and <10");
				continue;
			}
		}
		int A[][] = new int[M][M];
		for(int i=0;i<M;i++){
			for(int j=0;j<M;j++){
				System.out.print("Input ("+i+","+j+") element : ");
				A[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("\nORIGINAL MATRIX ");
		for(int i=0;i<M;i++){
			for(int j=0;j<M;j++){
				System.out.print(A[i][j]+"\t");
			}
			System.out.println();
		}
		//sorting non boundary elements
		// selection sort horizontal elements
		for(int r=1;r<M-1;r++){
			for(int i=1;i<M-2;i++){
				int min_pos = i;
				for(int j=i+1;j<M-1;j++){
					if(A[r][j]<A[r][min_pos]){
						min_pos=j;
						int t=A[r][i];
						A[r][i]=A[r][min_pos];
						A[r][min_pos]=t;
					}
				}
			}	
		}
		// selection sort vertical elements
		for(int c=1;c<M-1;c++){
			for(int i=1;i<M-2;i++){
				int min_pos = i;
				for(int j=i+1;j<M-1;j++){
					if(A[j][c]<A[min_pos][c]){
						min_pos=j;
						int t=A[i][c];
						A[i][c]=A[min_pos][c];
						A[min_pos][c]=t;
					}					
				}
			}	
		}

		System.out.println("\nMODIFIED MATRIX ");
		for(int i=0;i<M;i++){
			for(int j=0;j<M;j++){
				System.out.print(A[i][j]+"\t");
			}
			System.out.println();
		}

		//print only diagonals
		System.out.println("\nDIAGONALS MATRIX ");
		for(int i=0;i<M;i++){
			for(int j=0;j<M;j++){
				if(i+j==M-1 || i==j){
					System.out.print(A[i][j]+"\t");
				}else{
					System.out.print("\t");
				}
				
			}
			System.out.println();
		}
	}
}
