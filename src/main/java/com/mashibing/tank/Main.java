package com.mashibing.tank;

public class Main {
    public static void main(String[] args) throws Exception{
        TankFrame tf = new TankFrame();
        while (true){
            Thread.sleep(40);
            tf.repaint();
        }
    }
}
