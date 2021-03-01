package org.horizoncolumbus.hs;

public class Sum {

    public static void main(String[] args) {

        int[] arr = {3,66,3,6,8,2,7};

        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }

        System.out.println("Sum: " + sum);

    }
}
