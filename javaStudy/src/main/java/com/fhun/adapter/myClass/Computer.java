package com.fhun.adapter.myClass;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Computer {

    private String app = "测试app";
    private UsbWire usbWire;

    public void appConnect(){
        UsbWire usbWire = this.getUsbWire();
        System.out.println("以获得"+usbWire.getUsbWireName());
        System.out.println(this.app+"已连接");
    }
}
