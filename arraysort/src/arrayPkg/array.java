package arrayPkg;


public class array {

	
	
	public static void v(int ...a) {
		
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		int []b=new int[a.length];
		for(int i=0;i<=a.length-1;i++) {
			
			
			if(a[i]==a[i+1]) {
			//	b[i]=a[i];
				b[i]=a[i];
			}
			else if(a[i]!=a[i+1])
				continue;
			
			System.out.println("\n");
			System.out.print(b[i]+" ");
		}
//		for(int j=0;j<b.length;j++) {
//			System.out.println(b[j]);
//		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	v(10,10,20,20,30);	

	}

}
