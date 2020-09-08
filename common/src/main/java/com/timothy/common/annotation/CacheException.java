package com.timothy.common.annotation;
import java.lang.annotation.*;

/**
 * @author ：wangxin
 * @date ：Created in 2020/9/8 11:23
 * 自定义注解，有该注解的缓存方法会抛出异常
 */


@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CacheException {
}
