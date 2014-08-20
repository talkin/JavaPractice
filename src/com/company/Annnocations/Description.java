package com.company.Annnocations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author magc
 * 定义描述信息 value
 * @Retention定义了该Annotation被保留的时间长短
 * @Target说明了Annotation所修饰的对象范围
 * @Documented用于描述其它类型的annotation应该被作为被标注的程序成员的公共API
 * @Inherited阐述了某个被标注的类型是被继承的
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented

public @interface Description {
    String value();
}
