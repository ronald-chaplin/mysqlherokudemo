package com.wozu.mySQLHerokuDemo.services;

import com.wozu.mySQLHerokuDemo.models.Dog;
import com.wozu.mySQLHerokuDemo.repositories.DogRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DogServiceImpl implements DogService {

    @Autowired
    DogRepo dogRepo;

    @Override
    public Dog getDogFromApi() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("https://dog.ceo/api/breeds/image/random", Dog.class);
    }

    @Override
    public void postDogFromApi(Dog dog) {
        dogRepo.save(dog);
    }

    @Override
    public Iterable<Dog> getAllDogs() {
        return dogRepo.findAll();
    }
}
