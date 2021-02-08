package org.horizoncolumbus.hs;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] a = new int[]{3, 7, 4, 1, 8, 4, 2, 5};

        //int i = 0;

        int largest = a[0];

        for(int i = 0; i < a.length; i++){
            if( a[i] > largest){
                largest = a[i];
            }
        }

        System.out.println(largest);
        
    }
}
