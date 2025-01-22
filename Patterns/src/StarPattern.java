
public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x;
		int y;
		int i,j;
		for(i=1;i<=5;i++) {
			x=i;
			y=5-i+1;
			for(j=1;j<=5;j++) {
				if(j%2==1) {
					System.out.printf("%4d",x);
				}else {
					System.out.printf("%4d",y);
					
				}
				x=x+5;
				y=y+5;
				
			}
			System.out.println();
		}

	}

}
