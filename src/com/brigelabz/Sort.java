package com.brigelabz;

import java.util.Arrays;

public class Sort {

    static void sortArray(){
       System.out.println("sort the elements in an array :");
        int arr[] ={6,5,7,4,3,2,1};
        Arrays.sort(arr);
        int temp;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        sortArray();
    }
}
