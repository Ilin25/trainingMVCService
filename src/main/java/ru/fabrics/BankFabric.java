package ru.fabrics;

import ru.Constants;
import ru.entity.Bank;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BankFabric {

    private List<String> readListBank() throws IOException {

        List<String> randomBankNames = new ArrayList<>();
        FileReader fileReader = new FileReader(Constants.FILE_BANK);
        BufferedReader br = new BufferedReader(fileReader);
        String line;
        while ((line = br.readLine()) != null) {
            randomBankNames.add(line);
        }
        return randomBankNames;

    }
    private String makeRandomBankName() throws IOException {

        List<String> banksNames = readListBank();
        String randomBankName;
        int minIndex = 0;
        int maxIndex = banksNames.size()-1;
        int randomIndex = (int) ((Math.random() * (maxIndex-minIndex)) + minIndex);
        randomBankName = banksNames.get(randomIndex);
        return randomBankName;

    }

    private String makeRandomBikNumber(){
        int randomBik = (int) (Math.random() * ((999999999 - 100000000) + 1)) + 100000000;
        return "" + randomBik;
    }

    public Bank makeRandomBank() throws IOException {
        Bank bank = new Bank();
        bank.setBik( makeRandomBikNumber());
        bank.setName(makeRandomBankName());
        return bank;
    }
}
