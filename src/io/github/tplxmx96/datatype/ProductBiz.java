package io.github.tplxmx96.datatype;

import javax.swing.*;

public class ProductBiz {
    public static void main(String[] args){
        int[] counts = new int[3];
        double total = 0;   //最终要支付的总金额
        //改进方案：使用对象数组
        Product[] products = new Product[3];
        for (int i = 0; i < counts.length; i++) {
            if (products[i] == null)
            products[i] = new Product();  //对象数组中的元素使用之前，一定要记得分配空间

//            ProductBiz product = new ProductBiz();
            String name = JOptionPane.showInputDialog("请输入商品的名称：");
            products[i].setName(name);
            //接受用户输入的视频单价，要注意，返回值是字符串联系！！
            String strPrice = JOptionPane.showInputDialog("请输入商品的单价");
            //需要将字符串联系转换为double类型，再继续赋值！
            //转换前最好进行正确性验证，以避免异常
            products[i].setPrice(Double.parseDouble(strPrice));
            String strCount = JOptionPane.showInputDialog("请输入购买的数量：");
            counts[i] = Integer.parseInt(strCount);

            //累加总金额
            total += products[i].getPrice() * counts[i];


        }
        System.out.println("购物结算：");
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i].getName() + "\t" + products[i].getPrice());

        }
        System.out.println("商品总金额为:" + total);
    }
}
