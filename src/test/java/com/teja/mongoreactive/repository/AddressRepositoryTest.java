package com.teja.mongoreactive.repository;

import com.teja.mongoreactive.entity.Address;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

import java.util.List;

import static org.assertj.core.api.FactoryBasedNavigableListAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;


@ExtendWith(SpringExtension.class)
@DataMongoTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class AddressRepositoryTest {

    @Autowired
    private AddressRepository addressRepository;

    Address address;

    @Test
    public void testGetAllAddress() {
        // Call the getAllAddress method
        Flux<Address> addressFlux = addressRepository.getAllAddress();

        // Assert that the Flux is not null
        assertNotNull(addressFlux, "The Flux of addresses should not be null");
    }

    @BeforeEach
    void setup(){
        List<Float> loc = List.of(90f,100f);
    address = new Address("99951","HYD",loc,4535,"AP");
    addressRepository.save(address);
    }

    @AfterAll
    void tearDown(){
        address=null;
        addressRepository.deleteById("99951");
    }

    @Test
    public void testGetAddressByCityName() {
        // Call the getAllAddress method
        Flux<Address> addressFlux = addressRepository.findByCity("HYD");

        // Assert that the Flux is not null
        StepVerifier.create(addressFlux.count())
                .expectNextCount(1)
                .verifyComplete();
    }
}
