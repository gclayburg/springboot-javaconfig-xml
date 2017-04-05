package com.example;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

//This class contains read-only properties, loaded from Spring Externalized Configuration
@Component
@ConfigurationProperties(prefix="studio")
public class Studio {

    private String areacode; // loads from application.properties

    //... also add other read-only properties and getters/setters...

    public String getAreacode() {
        return areacode;
    }

    public Studio setAreacode(String areacode) {
        this.areacode = areacode;
        return this;
    }

}

//Just a POJO
class FullStudio {
    private String id;
    private Address address;

    FullStudio(String id, String city, String areaCode) {
        this.id = id;
        this.address = new Address(id, city, areaCode);
    }

    @Override
    public String toString() {
        return "FullStudio{" +
                "id='" + id + '\'' +
                ", address=" + address +
                '}';
    }
}
class Address{
    String id;
    String city;
    String areaCode;

    public Address(String id, String city, String areaCode) {
        this.id = id;
        this.city = city;
        this.areaCode = areaCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id='" + id + '\'' +
                ", city='" + city + '\'' +
                ", areaCode='" + areaCode + '\'' +
                '}';
    }
}


