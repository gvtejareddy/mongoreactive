package com.teja.mongoreactive.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;



@Document
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Address implements Serializable {

        @Id
        private String _id;
        private String city;
        private List<Float> loc= new ArrayList<>();
        private Integer pop;
        private String state;
    
}
