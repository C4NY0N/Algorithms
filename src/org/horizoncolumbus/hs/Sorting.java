package org.horizoncolumbus.hs;

public class Sorting {

    public static void main(String[] args) {

        int unsortedArray[] = new int[]{1,2,5,7,3,8,12,10,18};

        System.out.print("unsorted Array: ");
        for(int index = 0; index < unsortedArray.length; index++){
            System.out.print(unsortedArray[index] + "\t");
        }

        for(int i = 0; i < unsortedArray.length - 1; i++){
            for(int j = 0; j < unsortedArray.length - i - 1; j++){
                if(unsortedArray[j] > unsortedArray[j+1]){

                    int temp = unsortedArray[j+1];
                    unsortedArray[j+1] = unsortedArray[j];
                    unsortedArray[j] = temp;
                }
            }
        }

        System.out.print("\n sorted Array: ");
        for(int index = 0; index < unsortedArray.length; index++){
            System.out.print(unsortedArray[index] + "\t");
        }


    }

}
