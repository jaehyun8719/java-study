package me.action.chapter7;

import java.util.Arrays;
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
public abstract class Game {

    public static void main(String...args){
        List<Resizable> resizableShapes = Arrays.asList(new Square(), new Triangle(), new Ellipse());
        Utils.paint(resizableShapes);
    }
}

