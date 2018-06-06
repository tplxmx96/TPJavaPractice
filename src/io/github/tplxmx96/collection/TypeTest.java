package io.github.tplxmx96.datatype;

/**
 * TP Java基础数据类型学习测试
 * 统一在{@link io.github.tplxmx96.Main#main}中测试
 */
public class TypeTest {
    private int a;
    private boolean b;
    private float f;
    private double d;
    private long l;
    private String s = "TypeTest";

    public TypeTest(int a, boolean b, float f, double d, long l, String s) {
        this.a = a;
        this.b = b;
        this.f = f;
        this.d = d;
        this.l = l;
        this.s = s;
    }

    @Override
    public String toString() {
        return "TypeTest{" +
                "a=" + a +
                ", b=" + b +
                ", f=" + f +
                ", d=" + d +
                ", l=" + l +
                ", s='" + s + '\'' +
                '}';
    }
}
