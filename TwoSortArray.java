package dSA1;

public class TwoSortArray {

	 void findpair(int a1[], int a2[], int m, int n, int x)
	    {
	        int dif = Integer.MAX_VALUE;
	        int left = 0, right = 0;
	        int l = 0, r = n-1;
	        while (l<m && r>=0)
	        {
	           if (Math.abs(a1[l] + a2[r] - x) < dif)
	           {
	        	   left = l;
	        	   right = r;
	               dif = Math.abs(a1[l] + a2[r] - x);
	           }
	          if (a1[l] + a2[r] > x) {
	               r--;
	          }
	           else  {
	               l++;
	           }
	        }
	        System.out.print("[" + a1[left] +", " + a2[right] + "]");
	    }
	    public static void main(String args[])
	    {
	    	TwoSortArray ob = new TwoSortArray();
	        int arr1[] = {2, 3, 10, 12};
	        int arr2[] = {10, 20, 30, 40, 50};
	        int m = arr1.length;
	        int n = arr2.length;
	        int x = 34;
	        ob.findpair(arr1, arr2, m, n, x);
	    }
	}

