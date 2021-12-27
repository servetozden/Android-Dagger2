package com.example.dagger2.Module;


import com.example.dagger2.Model.SignupModel;

import dagger.Module;
import dagger.Provides;

@Module
public class SignUpModule {

    @Provides
    public SignupModel signupModel(){
        return new SignupModel();
    }

}
