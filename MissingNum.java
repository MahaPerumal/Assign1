package dSA1;

public class MissingNum {
	
	static int getmissingNumber(int[] a, int b)
    {
		int i;
		for (i=1; i<b; i++) {
			if(a[i]-a[i-1] !=1) {
				return a[i]-1;
			}
		}
        return a[b-1];
    }
    public static void main(String[] args)
    {
        int[] a = { 1, 2,3,4,5,7,8,9};
        System.out.println(getmissingNumber(a, a.length));
    }

}