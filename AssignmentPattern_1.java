package in.iNEURON.ai;

public class AssignmentPattern_1 {

	public static void main(String[] args) {
		int n=11;
		System.out.println();
		System.out.println();
		for(int i=0; i<n;i++) {
			// code for i font
			for(int j=0; j<n;j++) {
				if((j==n/2 && i!=1 && i!=3) ||(j==n/2 -1 && i<3) ||(j==n/2 +1 && i<3) ) {
					System.out.print("**");
				}else {
					System.out.print("  ");
				}
			}
			// code for N font
			for(int j=0; j<n;j++) {
				if((i==j) ||(j==0)||(j==n-1) ) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			System.out.print(" ");
			System.out.print(" ");
			System.out.print(" ");
			// code for E font
			for(int j=0; j<n;j++) {
				if((i==0 && j<n-2) || (i==n/2 && j<n-2 )||(i==n-1 && j<n-2 )
					||(j==0)	) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.print(" ");
			System.out.print(" ");
			// code for U font
				for(int j=0; j<n;j++) {
					if((j==1 && i!=n-1)||(j==n-2 && i!=n-1)||(i==n-1 && j>1 && j<n-2) ) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
					
				}
				// code for R font
				for(int j=0; j<n;j++) {
					if((j==n/2 -1) || (i==0 && j>=n/2 -1 && j<n-1)||(j==n-1 && i!=0 && i<n/2 -1)
							||(i==n/2 -1 && j>=n/2 -1 && j<n-1) ||(i==j && j>= n/2 -1) ) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
					
				}
				System.out.print(" ");
				System.out.print(" ");
				System.out.print(" ");
				System.out.print(" ");
			// code for O font
				for(int j=0; j<n;j++) {
					if((j==1 && i!=0 && i!=n-1)||(j==n-2 && i!=0 && i!=n-1 )
					||(i==0 && j>1 && j<n-2) ||(i==n-1 && j>1 && j<n-2)			) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
					
				}
				System.out.print(" ");
				System.out.print(" ");
				System.out.print(" ");
				System.out.print(" ");
				// code for font N
				for(int j=0; j<n;j++) {
					if((i==j) ||(j==0)||(j==n-1) ) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
			
			
			
			
			
			
			System.out.println();
		}
	
	}

}
