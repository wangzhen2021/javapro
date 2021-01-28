package com.itheima._多态接口综合案例;

public class MouseDemo implements USB{
    private String name;

    public MouseDemo(String name) {
        this.name = name;
    }

    @Override
    public void connect() {
        System.out.println(name+"成功接入设备");

    }
    public  void  dbclick(){
        System.out.println(name+"双击，999999！！！！");
    }

    @Override
    public void unconnect() {
        System.out.println(name+"成功拔出设备");

    }

}
