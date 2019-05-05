import java.util.Scanner;

public class main {
	public static void main(String args[]) {
		String[] data = {"A","C","G","T"};
		Scanner number = new Scanner(System.in);
		int n;
		n = number.nextInt();
		
		if (n<=0 || n>4) {
			System.out.println("Error input");
		}
		
		if (n==1) {
			for (int i=0;i<4;i++) {
				System.out.println(data[i]);
			}
		}
		
		if (n==2){
			for (int i=0;i<4;i++) {
				for (int j=0;j<4;j++) {
					if(j!=i) {
						System.out.println(data[i]+data[j]);
					}
				}
			}
		}
		
		if (n==3) {
			for (int i=0;i<4;i++) {
				for (int j=0;j<4;j++) {
					if(j!=i) {
						for (int k=0;k<4;k++) {
							if(k!=j && k!=i) {
								System.out.println(data[i]+data[j]+data[k]);
							}
						}
					}
				}
			}
		}
		
		if (n==4) {
			for (int i=0;i<4;i++) {
				for (int j=0;j<4;j++) {
					if(j!=i) {
						for (int k=0;k<4;k++) {
							if(k!=j && k!=i) {
								for (int l=0;l<4;l++) {
									if(l!=k && l!=j && l!=i) {
										System.out.println(data[i]+data[j]+data[k]+data[l]);
									}
								}
							}
						}
					}
				}
			}
		}
		number.close();	
	}
}
