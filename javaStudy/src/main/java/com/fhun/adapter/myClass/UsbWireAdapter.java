package com.fhun.adapter.myClass;

import com.fhun.adapter.myInterface.Adapter;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UsbWireAdapter implements Adapter {

    private InternetWire internetWire;

    @Override
    public UsbWire wireToUsb() {
        InternetWire internetWire = this.internetWire;
        return new UsbWire(internetWire.getWireName()+"转换后的usbwire");
    }
}
