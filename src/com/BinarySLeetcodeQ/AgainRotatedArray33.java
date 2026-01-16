package com.BinarySLeetcodeQ;

public class AgainRotatedArray33 {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int pivot = findPivot(arr);
        System.out.println(selectSearch(arr,pivot,4 ));
    }

    static int selectSearch(int[] nums, int pivot, int target) {
        if(target == nums[pivot]) return pivot;
        if(target>= nums[0]) {
            return search(nums,target,0,pivot-1);
        } else{
            return search(nums,target,pivot+1, nums.length-1);
        }
    }

    //This will not work for dublicate values -- {4,5,5,6,7,7,0,1,1}
    static int findPivot(int[] arr) {
        int s = 0;
        int e = arr.length-1;

        while(s<=e) {
            int mid = s + (e-s)/2;
            // 4 cases for pivot i.e, largest number
            if(mid < e && arr[mid] > arr[mid+1]) {
                return mid;
            }

            if(mid > s && arr[mid] < arr[mid-1]) {
                return mid-1;
            }

            if(arr[mid] <= arr[s]) {
                e = mid-1;
            } else {
                s = mid+1;
            }
        }
        return -1;
    }

    static int search(int[] nums, int target, int s, int e) {

        while(s<=e) {
            int mid = s + (e-s)/2;

            if(nums[mid] == target) return mid;

            if (target < nums[mid]) {
                e = mid-1;
            } else{
                s = mid+1;
            }
        }
        return -1;
    }
}
