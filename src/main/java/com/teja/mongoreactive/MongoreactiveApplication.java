package com.teja.mongoreactive;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;

import com.mongodb.reactivestreams.client.MongoClient;

@SpringBootApplication
public class MongoreactiveApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoreactiveApplication.class, args);
	}

	   @Autowired
    MongoClient mongoClient;

    @SuppressWarnings("null")
	@Bean
    public ReactiveMongoTemplate reactiveMongoTemplate() {
        return new ReactiveMongoTemplate(mongoClient, "local");
    }

}
