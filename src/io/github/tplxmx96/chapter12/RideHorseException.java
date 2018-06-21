package io.github.tplxmx96.chapter12;

public class RideHorseException extends Exception {
    public RideHorseException(int health){
        super("当前健康值为" + health + "骑马失败！");
    }
}
