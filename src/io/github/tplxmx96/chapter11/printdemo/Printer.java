package io.github.tplxmx96.chapter11.printdemo;

import io.github.tplxmx96.chapter11.printdemo.iface.IInkBox;
import io.github.tplxmx96.chapter11.printdemo.iface.IPaper;

/**
 * 打印机类 - 使用标准的墨盒和纸张进行打印
 */
public class Printer {
    private IInkBox inkbox = null;  //打印机中的墨盒
    private IPaper paper = null;    //打印机的纸张

    /**
     * 打印机的打印方法 - 使用墨盒和纸张
     * @paper content 传递给打印机打印的字符串内容
     */
    public void print(String content){
        if (null == inkbox || null == paper){
            System.out.println("墨盒和纸张出现错误，请安装正确后重试！");
            return;
        }
        //打印过程
        String color = inkbox.getColor();
        String type = paper.getSize();
        System.out.println("以下文字是" + color + "颜色的！");
        System.out.println("使用纸张：" + type);
        System.out.println("打印内容：" + content);
    }
    public IInkBox getInkbox() {
        return inkbox;
    }

    public void setInkbox(IInkBox inkbox) {
        this.inkbox = inkbox;
    }

    public IPaper getPaper() {
        return paper;
    }

    public void setPaper(IPaper paper) {
        this.paper = paper;
    }
}
