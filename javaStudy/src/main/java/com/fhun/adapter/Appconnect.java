package com.fhun.adapter;

import com.fhun.adapter.myClass.*;

public class Appconnect {

    /**
     * 适配器模式的理解
     * a想要调用b
     * 但是b不符合a的接口规范，无法直接调用
     * 创建一个适配器 c
     * c可以通过组合b（在c中顶一个一个b对象），或继承b，并且实现一个调用b的方法
     * 这样a就可以通过调用c来实现调用b的目的
     */
    public static void main(String[] args) {
        InternetWire internetWire = new InternetWire("网线1");
        Computer computer = new Computer();
        computer.setUsbWire(new UsbWireAdapter(internetWire).wireToUsb());
        computer.appConnect();
    }
}
