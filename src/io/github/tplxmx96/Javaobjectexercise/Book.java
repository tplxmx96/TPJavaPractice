package io.github.tplxmx96.datatype;

public class Swap {
    public static void main(String[] args){
        int[] nums = {1,2};
        Swap1(nums);
        System.out.println(nums[0] + "\t" + nums[1]);
    }
    public static void Swap1(int nums[]){
        int temp = nums[0];
        nums[0] = nums[1];
        nums[1] = temp;

    }
}
