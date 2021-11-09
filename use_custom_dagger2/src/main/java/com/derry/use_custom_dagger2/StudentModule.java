package com.derry.use_custom_dagger2;

import com.derry.custom_dagger2.annation.Module;
import com.derry.custom_dagger2.annation.Provides;
import com.derry.use_custom_dagger2.Student;

// 第二个注解
@Module
public class StudentModule {

    @Provides
    public Student providerStudent() {
        return new Student();
    }
}
