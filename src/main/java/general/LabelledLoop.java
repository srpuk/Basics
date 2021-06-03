package general;

public class LabelledLoop {
	
	public static void main(String[] args) {
		
			for(int i=0;i<10;i++) {
				System.out.println("From outer");
				labelled:
				for(int j=0;j<5;j++) {
					System.out.println("From 1st inner");
					for(int k=0;k<4;k++) {
						System.out.println("From 2nd inner");
						if(k==1) {
							break labelled;
						}
					}
				}
			}
	}

}
