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

        List<String> randomBank = new ArrayList<>();
        FileReader fileReader = new FileReader(Constants.FILE_BANK);
        BufferedReader br = new BufferedReader(fileReader);
        String line;
        while ((line = br.readLine()) != null) {
            randomBank.add(line);
        }

        return randomBank;

    }
    // TODO makeRandomNameBank заменить на makeRandomBankName
    private String makeRandomNameBank() throws IOException {
        //TODO скорректровать множественные имена banksName,readListBank. Так же randomBank + Name

        List<String> banksName = readListBank();
        String randomBank;
        int minIndex = 0;
        int maxIndex = banksName.size()-1;
        int randomIndex = (int) ((Math.random() * (maxIndex-minIndex)) + minIndex);
        randomBank = banksName.get(randomIndex);
        return randomBank;

    }

    private String makeRandomBikNumber(){
        int randomBik = (int) (Math.random() * ((999999999 - 100000000) + 1)) + 100000000;
        return "" + randomBik;
    }

    public Bank makeRandomBank() throws IOException {
        Bank bank = new Bank();
        // TODO убрать префиксы для банка и бика
        bank.setBik(",БИК № "+ makeRandomBikNumber());
        bank.setName("БАНК - "+ makeRandomNameBank());
        return bank;
    }
}
