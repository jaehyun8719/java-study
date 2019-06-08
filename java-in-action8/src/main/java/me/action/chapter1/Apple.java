package me.action.chapter1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.apache.commons.lang3.StringUtils;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : 진실
 * github: https://github.com/jaehyun8719
 * email: jaehyun8719@gmail.com
 * <p>
 * Date: 2019-05-19
 * Description:
 * Copyright(©) 2019 by jaehyun.
 **/
@Getter @Setter @ToString @AllArgsConstructor
public class Apple {

    private int weight = 0;

    private String color = StringUtils.EMPTY;

}
