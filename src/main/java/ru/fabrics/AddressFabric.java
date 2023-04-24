package ru.fabrics;


import ru.Constants;
import ru.entity.Address;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AddressFabric {

    private List<String> readListCity() throws IOException {
        List<String> randomCity= new ArrayList<>();
        FileReader fileReader = new FileReader(Constants.FILE_CITY);
        BufferedReader br = new BufferedReader(fileReader);
        String line;
        while ((line = br.readLine()) != null) {
            randomCity.add(line);
        }

        return randomCity;

    }

     private List<String> readListStreet() throws IOException {
        List<String> randomStreet= new ArrayList<>();
        FileReader fileReader = new FileReader(Constants.FILE_STREET);
        BufferedReader br = new BufferedReader(fileReader);
        String line;
        while ((line = br.readLine()) != null) {
            randomStreet.add(line);
        }

        return randomStreet;

    }

    private String makeRandomCity() throws IOException {
        List<String> city = readListCity();
        String randomCity;
        int minIndex = 0;
        int maxIndex = city.size()-1;
        int randomIndex = (int) ((Math.random() * (maxIndex-minIndex)) + minIndex);
        randomCity = city.get(randomIndex);
        return randomCity;

    }
    private String makeRandomStreet() throws IOException {
        List<String> streets = readListStreet();
        String randomStreet;
        int minIndex = 0;
        int maxIndex = streets.size()-1;
        int randomIndex = (int) ((Math.random() * (maxIndex-minIndex)) + minIndex);
        randomStreet = streets.get(randomIndex);
        return randomStreet;

    }
    public Address makeRandomAddress() throws IOException {
        String generateRandomNumberHouse = Integer.toString((int) ((Math.random() * (150-1)) + 1));
        Address address = new Address();
        address.setCity("г."+makeRandomCity());
        address.setStreet(", "+makeRandomStreet());
        address.setHouse(", Дом № "+generateRandomNumberHouse);
        return address;
    }
}
