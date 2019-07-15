package me.action.chapter8;

import java.util.Optional;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : kjh
 * github: https://github.com/jaehyun8719
 * email: jaehyun8719@gmail.com
 * <p>
 * Date: 2019-07-15
 * Copyright(©) 2019 by jaehyun.
 */
public class OptionalMain {

    public static void main(String[] args) {
        // 빈 Optional
        Optional<Car> optionalCar = Optional.empty();

        // null이 아닌 값으로 Optional 만들기
        Car car = null;
        //Optional<Car> optionalCar1 = Optional.of(car);
        //System.out.println(optionalCar1);

        // null값으로 Optional 만들기
        Optional<Car> optionalCar2 = Optional.ofNullable(car);
        System.out.println(optionalCar2);

        Insurance insurance = new Insurance();
        Optional<Insurance> optionalInsurance = Optional.ofNullable(insurance);
        Optional<String> name = optionalInsurance.map(ins -> ins.getName());


    }

}
