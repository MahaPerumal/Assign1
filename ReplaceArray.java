package dSA1;

public class ReplaceArray {
	
	static void replace(int a[], int n) {
		int prev, curr;
		prev=a[0];
		a[0]=a[0]*a[1];
		for (int i=1; i<n-1;i++) {
			curr= a[i];
			a[i]=prev * a[i+1];
			prev=curr;
		}
		a[n-1] =prev*a[n-1];
	}
	
	public static void main(String[] args) {
		int a[]= {3,4,7,6,5};
		int n=a.length;
		replace(a,n);
		for (int i=0; i<n;i++) {
			System.out.println(a[i]);
		}
		
		
	}

	
}
