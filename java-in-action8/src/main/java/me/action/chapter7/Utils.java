package me.action.chapter7;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : 진실
 * github: https://github.com/jaehyun8719
 * email: jaehyun8719@gmail.com
 * <p>
 * Date: 2019-07-14
 * Copyright(©) 2019 by jaehyun.
 **/
public abstract class Utils implements Resizable {

    public static void paint(List<Resizable> l){
        l.forEach(r -> {
            r.setAbsoluteSize(42, 42);
            r.draw();
        });
    }

}
