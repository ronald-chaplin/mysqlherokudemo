package com.wozu.mySQLHerokuDemo.services;

import com.wozu.mySQLHerokuDemo.models.Dog;

public interface DogService {
    public Dog getDogFromApi();
    public void postDogFromApi(Dog dog);
    public Iterable<Dog> getAllDogs();
}
