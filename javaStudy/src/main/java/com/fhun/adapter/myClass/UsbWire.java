package com.fhun.adapter.myClass;

import com.fhun.adapter.myInterface.Wire;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UsbWire implements Wire {

    private String usbWireName;

    @Override
    public void connect(Object a, Object b) {
        System.out.println("连接了"+a+"和"+b);
    }
}
