package hpit.com;

public class Bt5HinhVe {
	public static void hinha(int h) {
		for(int i=1; i<=h; i++) {
			for(int j=1; j<=h; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
	
	public static void hinhb(int h) {
		for(int i=1; i<=h; i++) {
			for(int j=1; j<=h; j++) {
				if(i==1 || i==h || j==1 || j==h) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
	}
	
	public static void hinhc(int h) {
		for(int i=1; i<=h; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
	
	public static void hinhd(int h) {
		for(int i=1; i<=h; i++) {
			for(int j=1; j<=i; j++) {
				if(j==1 || j==i || i==h) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
	}
	
	public static void hinhe(int h) {
		for(int i=h; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
	
	public static void hinhf(int h) {
		for(int i=h; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				if(j==1 || j==i || i==h) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
	}
	
	public static void hinhg(int h) {
		for(int i=1; i<=h; i++) {
			for(int j=1; j<=h-i; j++) {
				System.out.print("  ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
	
	public static void hinhh(int h) {
		for(int i=1; i<=h; i++) {
			for(int j=1; j<=h-i; j++) {
				System.out.print("  ");
			}
			for(int k=1; k<=i; k++) {
				if(k==i || i==h || k==1 ) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}				
			}
			System.out.println("");
		}
	}
	
	public static void hinhi(int h) {
		for(int i=1; i<=h; i++) {
			for(int j=1; j<=h-i; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
	
	public static void hinhj(int h) {
		for(int i=1; i<=h; i++) {
			for(int j=1; j<=h-i; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				if(k==i || i==h || k==1 ) {
					System.out.print("* ");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
	}
	
	public static void hinhk(int h){
        int d = h;
        h = 2*h-1;
        for(int i=1;i<=h;i++){
            for(int j=1;j<=d;j++){
                if(i==d){
                    System.out.print("* ");
                }
                else if(i<d&&(j==1||j<=i)){
                    System.out.print("* ");
                }
                else if(i>d&&(j==d||j>i-d)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
    }
	
	public static void hinhl(int h){
        int d = h;
        h = 2*h-1;
        for(int i=1;i<=h;i++){
            for(int j=1;j<=d;j++){
                
            }
        }
    }
	public static void hinhn(int h) {
		for(int i=1; i<=h; i++) {
			for(int j=1; j<=h; j++) {
				if(i+j==h-1 || i==h/2 || (i==h/2 && j==h-1) || (j==0 && i==h/2)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			System.out.println("");
		}
	}
	
	
	public static void main(String[] args) {
		hinhk(4);
		
	}
}
