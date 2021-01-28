package com.itheima_泛型通配符;

import java.util.ArrayList;

/**
 *   泛型的上下限：
 *   ? extends Car : 那？必须是car或者其子类。(上限)
 *   ? super Car :那？必须是car或者其父类(下限，不是很常见)
 *
 */
public class GenericDemo {
    public static void main(String[] args) {
        ArrayList<BWMCar> bwmCars = new ArrayList<>();
        bwmCars.add(new BWMCar());
        run(bwmCars);
        ArrayList<BENCar> benCars = new ArrayList<>();
        benCars.add(new BENCar());
        run(benCars);


    }
    public  static  void  run(ArrayList<?extends Car> cars){
    }
}
class Car{

}
class  BWMCar extends Car{

}
class BENCar extends  Car{

}
