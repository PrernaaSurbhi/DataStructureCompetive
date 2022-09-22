package com.example.datastructurecompetive.Array;

//Given an array of integers arr,
// return true if the number of occurrences of each
// value in the array is unique, or false otherwise.

//concept used here is 1^1 = 0
// XOR 1^0 = 1

//first is Key-Val pairs: [1=3, 2=2, 3=1]
//Val pairs: [3, 2, 1]

//second is Key-Val pairs: [1=1, 2=1]
//Val pairs: [1, 1]

//third is Key-Val pairs: [0=2, 1=4, -3=3, 10=1]
//Val pairs: [2, 4, 3, 1]

//this question can be done by hashMap with hashSet also .

//output
//Key-Val pairs: [0=2, 1=4, -3=3, 10=1]
//Val pairs: [2, 4, 3, 1]
// occurance of element list is : [2, 4, 3, 1]
//Key-Val pairs: [0=2, 1=4, -3=3, 10=1]
//Val pairs: [2, 4, 3, 1]
// occurance of element list is : [2, 4, 3, 1]
//Key-Val pairs: [0=2, 1=4, -3=3, 10=1]
//Val pairs: [2, 4, 3, 1]
// occurance of element list is : [2, 4, 3, 1]
//result is : true
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class UniqueNumberofOccurrences {
    public static void main(String[] args) {
        //create 2d array
        int[] arr = {-3,0,1,-3,1,1,1,-3,10,0};
        countNumOcc(arr);
        uniNumOccurance(countNumOcc(arr));
        System.out.println("result is : "+uniNumOccurance(countNumOcc(arr)));
    }

    public static ArrayList<Integer> countNumOcc(int[] arr){
        int n = arr.length;
        ArrayList<Integer> result = new ArrayList<>();

        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < n ; i ++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }else{
                int x = map.get(arr[i]);
                map.put(arr[i],x+1);
            }
        }

        System.out.println("Key-Val pairs: "+map.entrySet());
        System.out.println("Val pairs: "+map.values());
        result.addAll(map.values());
        System.out.println(" occurance of element list is : "+result);
        return result;
    }

    public static boolean uniNumOccurance(ArrayList<Integer> list){
        int ans = 0;
        int n = list.size();
        for(int i = 0 ; i< n ; i++){
            ans = ans^ list.get(i);
        }

        if(ans == 0){
            return false;
        }else{
            return true;
        }
    }
}
