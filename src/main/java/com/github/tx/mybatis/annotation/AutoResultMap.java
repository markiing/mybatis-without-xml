package com.github.tx.mybatis.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 被注解的Mapper方法，将根据泛型对象生成对应的resultMap并将泛型对象加入参数
 * 
 * @author tangx
 * @since 2014年10月24日
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface AutoResultMap {

}
