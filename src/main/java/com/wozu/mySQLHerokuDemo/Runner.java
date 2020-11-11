package com.wozu.mySQLHerokuDemo;

import com.wozu.mySQLHerokuDemo.models.Dog;
import com.wozu.mySQLHerokuDemo.services.DogServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {

    @Autowired
    DogServiceImpl dogServiceImpl;

    @Override
    public void run(String... args) throws Exception{
        Dog dog1 = new Dog("Dummy message 1", "dummy status 1");
        Dog dog2 = new Dog("Dummy message 2", "dummy status 2");

        dogServiceImpl.postDogFromApi((dog1));
        dogServiceImpl.postDogFromApi((dog2));
    }
}
