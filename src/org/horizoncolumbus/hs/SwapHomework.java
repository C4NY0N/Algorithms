package org.horizoncolumbus.hs;

import java.util.Arrays;

public class SwapHomework {

    public static void main(String[] args) {

        int[] arr = {3,2};

        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;

        System.out.println(Arrays.toString(arr));

    }

}
