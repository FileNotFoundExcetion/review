package com.leetcode.review.listdemo;

import java.util.Arrays;

public class QuickSort {

//快排
    public static void main(String[] args) {
        int arr[]=new int[]{2,5,8,0,1};
        sort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int arr[],int start,int end){
      if (start>=end){
         return;
      }
       int pivo= mid(arr,start,end);
       sort(arr,start,pivo-1);
        sort(arr,pivo+1,end);
    }

    public static int mid(int arr[],int start,int end){
       int pivo=arr[start];
       int left=start;
       int right=end;
       //必须从右边开始比较，从左边开始貌似有点问题
       while (left!=right){
           if(left<right&&arr[right]>pivo){
               right--;
           }
          if(left<right&&arr[left]<=pivo){
              left++;
          }
         //左右交换
          if(left<right){
              int temp=arr[left];
              arr[left]=arr[right];
              arr[right]=temp;
          }
      }
        arr[start]=arr[left];
        arr[left]=pivo;
        return left;
    }
}
