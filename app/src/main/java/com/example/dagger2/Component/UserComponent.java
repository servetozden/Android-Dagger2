package com.example.dagger2.Component;


import com.example.dagger2.Model.SignupModel;
import com.example.dagger2.Module.SignUpModule;

import dagger.Component;
import dagger.Module;

@Component(modules = {SignUpModule.class})
public interface UserComponent {


    SignupModel signupModel();
}
