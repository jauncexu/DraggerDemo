package com.derry.use_custom_dagger2;

import com.derry.custom_dagger2.annation.Component;

// 第三个注解
@Component(modules = StudentModule.class)
public interface StudentComponent { // 快递员

    // 写注入目标  MainActivity的this
    void inject(MainActivity mainActivity);
}
