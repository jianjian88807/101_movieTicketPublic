package com.wfuhui.common.annotation;

import java.lang.annotation.*;

/**
 * api接口，忽略Token验证
 * @author lzl
 * @email 1556708905@qq.com
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AuthIgnore {

}
