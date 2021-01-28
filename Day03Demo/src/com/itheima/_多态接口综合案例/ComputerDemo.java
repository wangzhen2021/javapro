package com.itheima._多态接口综合案例;

public class ComputerDemo {
    public static void main(String[] args) {
        Computer computer = new Computer();
        USB xiaomi= new MouseDemo("小米");
        computer.installUSB(xiaomi);

        USB cheerkey=new KeyboardDemo("樱桃键盘");
        computer.installUSB(cheerkey);



    }

}

class  Computer{
    public  void  installUSB(USB usb){
  usb.connect();
        if ( usb instanceof  MouseDemo){
            MouseDemo  m= (MouseDemo) usb;
            m.dbclick();
        }else if( usb instanceof KeyboardDemo){
            KeyboardDemo k= (KeyboardDemo) usb;
            k.writer();
        }
        usb.unconnect();
    }
}
