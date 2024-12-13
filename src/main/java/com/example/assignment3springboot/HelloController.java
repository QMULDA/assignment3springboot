package com.example.assignment3springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String index() {
        Plant plant = new Plant("science","plant", 3, true, true);

        return plant.getScientificName();
    }

    @GetMapping("/add")
    public String add() {
        return "";
    }


    public class Plant{
        String scientificName;
        String commonName;
        int age; //days
        boolean flowering;
        boolean trailing;

        public Plant(String scientificName, String commonName, int age, boolean flowering, boolean trailing) {
            this.scientificName = scientificName;
            this.commonName = commonName;
            this.age = age;
            this.flowering = flowering;
            this.trailing = trailing;
        }

        enum wateringFrequency {
            INFREQUENT(1), MODERATE(2), FREQUENT(3);
            public int frequencyValue;
            wateringFrequency(int valueArg){frequencyValue = valueArg;}
        }

        enum preferredHumidity {
            DRY(1), MODERATE(2), HUMID(3);
            public int humidityValue;
            preferredHumidity(int valueArg){humidityValue = valueArg;}
        }

        public String getScientificName(){
            return scientificName;
        }

        public String getCommonName(){
            return commonName;
        }

        public int getAge(){
            return age;
        }

        public boolean getFlowering(){
            return flowering;
        }

        public boolean getTrailing(){
            return trailing;
        }

        public boolean isFlowering(){
            return flowering;
        }

    }


}