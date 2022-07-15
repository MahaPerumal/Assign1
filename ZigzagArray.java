package dSA1;

import java.util.Arrays;

public class ZigzagArray {
	  static int arr[] ={4, 3, 7, 8, 6, 2, 1};
		 
	    static void getarrayZigZag()
	    {
	       boolean flag = true;
	       int swap =0;
	         for (int i=0; i<=arr.length-2; i++)
	        {
	            if (flag) {
	            	if (arr[i] > arr[i+1])
	                {
	                    swap = arr[i];
	                    arr[i] = arr[i+1];
	                    arr[i+1] = swap;
	                }
	                 
	            }
	            else 
	            {
	            	if (arr[i] < arr[i+1])
	                {
	                    swap = arr[i];
	                    arr[i] = arr[i+1];
	                    arr[i+1] = swap;
	                }
	            }
	            flag = !flag;
	        }
	    }
	    public static void main(String[] args)
	    {
	    	getarrayZigZag();
	        System.out.println(Arrays.toString(arr));
	    }
	    	}

