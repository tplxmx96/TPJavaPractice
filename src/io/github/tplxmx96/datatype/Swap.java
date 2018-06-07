package io.github.tplxmx96.datatype;

public class Swap {
    public static void main(String[] args){
//        int[] nums = {1,2};
//        Swap(nums);
//        System.out.println(nums[0] + "\t" + nums[1]);

        //引用传递
        Demo demo = new Demo();
        Swap1(demo);
        System.out.println(demo.attr1 + "\t" + demo.attr2);

    }
    static class Demo{
        int attr1 = 10;
        int attr2 = 50;
    }
    public static void Swap1(Demo demo){
//        demo = new Demo();
        int temp = demo.attr1;
        demo.attr1 = demo.attr2;
        demo.attr2 = temp;
    }
//    public static void Swap1(int nums[]){
//        int temp = nums[0];
//        nums[0] = nums[1];
//        nums[1] = temp;
//
//    }
}
