
import java.util.*;
// Link->https://www.codingninjas.com/codestudio/problem-details/ninja-s-training_3621003
// Ninja is planing this ‘N’ days-long training schedule. Each day, he can perform any one of these three activities. (Running, Fighting Practice or Learning New Moves). Each activity has some merit points on each day. As Ninja has to improve all his skills, he can’t do the same activity in two consecutive days. Can you help Ninja find out the maximum merit points Ninja can earn?
// You are given a 2D array of size N*3 ‘POINTS’ with the points corresponding to each day and activity. Your task is to calculate the maximum number of merit points that Ninja can earn.
// If the given ‘POINTS’ array is [[1,2,5], [3 ,1 ,1] ,[3,3,3] ],the answer will be 11 as 5 + 3 + 3.


// RECURSION

// public class NinjaTraining {
//     public static void main(String[] args) {
//         int[][] arr={{1,2,5}, {3 ,1 ,1} ,{3,3,3}};
//         System.out.println(recurse(arr.length-1, 3, arr));
        
//     }
//     static int recurse(int day,int lastTask,int[][] arr){
//         if (day==0){
//             int curMax=0;
//             for (int i=0;i<arr[day].length;i++){
//                 if (i!=lastTask){
//                     curMax=Math.max(arr[day][i],curMax);

//                 }
//             }
//             return curMax;
//         }
//         int curSum=0;
//         int globalSum=0;
//         for (int i=0;i<arr[day].length;i++){
//             if (i!=lastTask){
//                 curSum=arr[day][i]+recurse(day-1, i, arr);
//                 globalSum=Math.max(curSum, globalSum);

//             }
//         }
//         return globalSum;

//     }
    
    
// }

// RECURSION + MEMOIZATION

public class NinjaTraining {
    public static void main(String[] args) {
        int[][] arr={{1,2,5}, {3 ,1 ,1} ,{3,3,3}};
        HashMap<int[],Integer> map=new HashMap<>();
		
        System.out.println(recurse(arr.length-1, 3, arr,map));
        
    }
    static int recurse(int day,int lastTask,int[][] arr,HashMap<int[],Integer> map){
        if (day==0){
            int curMax=0;
            for (int i=0;i<arr[day].length;i++){
                if (i!=lastTask){
                    curMax=Math.max(arr[day][i],curMax);

                }
            }
            return curMax;
        }
        int[] curArr=new int[2];
        curArr[0]=day;
        curArr[1]=lastTask;
        if (map.containsKey(curArr)) return map.get(curArr);
        
        int curSum=0;
        int globalSum=0;
        for (int i=0;i<arr[day].length;i++){
            if (i!=lastTask){
                curSum=arr[day][i]+recurse(day-1, i, arr,map);
                globalSum=Math.max(curSum, globalSum);

            }
        }
        map.put(curArr,globalSum);
        return globalSum;

    }
    
    
}

// TABULATION
