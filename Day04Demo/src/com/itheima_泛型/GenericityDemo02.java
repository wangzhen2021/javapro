package com.itheima_泛型;

/**
 * 泛型方法和泛型类是通用技术架构
 */
public class GenericityDemo02 {
    public static void main(String[] args) {
        Integer[] nums = {10, 59, 26, 262};
        String s = arrToString(nums);
        System.out.println(s);
        String[] nums1 = {"hah", "dff", "fffg"};
        String s1 = arrToString(nums1);
        System.out.println(s1);
    }



    public static <T> String arrToString(T[] nums) {
        StringBuffer sb = new StringBuffer();
        sb.append("[");
        if (nums != null && nums.length > 0) {
//            for (int i = 0; i < nums.length; i++) {
//                T e = nums[i];
//                sb.append((i == nums.length - 1) ? e : e + ",");
//            }
            int i = 0;
            for (T num : nums) {
                T e = nums[i];
                sb.append((i == nums.length - 1) ? e : e + ",");
                i+=1;
            }
        }
        sb.append("]");
    return sb.toString();
    }
}



