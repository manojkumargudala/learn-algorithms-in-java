package com.manoj.arraysgeneral;

public class RemoveElementInArray {
	public int removeElement(int[] nums, int val) {
		int numberOfEntries = 0;
		for (int i = 0; i < nums.length; i++) {
		//	System.out.println("index is " + i + " value is " + nums[i]);
			if (nums[i] == val) {
				numberOfEntries++;
				for (int j = i; j < nums.length - numberOfEntries; j++) {
					nums[j] = nums[j + 1];
				}
				i = 0;
			}
		}
		return nums.length - numberOfEntries;
	}
	
	public int removeElement1(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++)
            if (nums[i] == val) count++;
            else nums[i - count] = nums[i];
        return nums.length - count;
    }

	public static void main(String[] args) {
		RemoveElementInArray elementInArray = new RemoveElementInArray();
		int[] nums = { 9, 9, 9, 9, 9, 9, 9, 1 };
		int test = elementInArray.removeElement(nums, 9);
		System.out.println(test);
		for (int i = 0; i < test; i++) {
			System.out.println(nums[i]);
		}
		
		int[] nums1 = { 9, 9, 9, 9, 3,9, 9, 9, 1 };
		int test1 = elementInArray.removeElement1(nums1, 9);
		System.out.println(test1);
		for (int i = 0; i < test1; i++) {
			System.out.println(nums1[i]);
		}
	}
}
