package com.derry.use_custom_dagger2.apt_create_dagger2;

import com.derry.custom_dagger2.Factory;
import com.derry.custom_dagger2.Preconditions;
import com.derry.use_custom_dagger2.Student;
import com.derry.use_custom_dagger2.StudentModule;

// TODO 模拟 这个是编译期 APT 自动生成的  // 第二个注解
public class StudentModule_ProviderStudentFactory implements Factory<Student> {

    private StudentModule studentModule; // 包裹

    public StudentModule_ProviderStudentFactory(StudentModule studentModule) {
        this.studentModule = studentModule;
    }

    @Override
    public Student get() {
        return Preconditions.checkNotNull(
                studentModule.providerStudent(), "你个货乱搞 无法studentModule.providerStudent()");
    }

    // 暴露给外界用的
    public static Factory<Student> create(StudentModule module) {
        return new StudentModule_ProviderStudentFactory(module);
    }
}
