package ru.fabrics;

import ru.Constants;
import ru.entity.CardHolder;
import ru.entity.Gender;
import ru.entity.PersInfo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class PersInfoFabric {

    public PersInfo makeRandomPersInfo(Gender gender) throws IOException {
        PersInfo persInfo = new PersInfo();
        List<String> anyFios = readAnyFiosFromFileByGender(gender);
        fillFio(persInfo, anyFios);
        persInfo.setDateOfBirth(makeRandomDateOfBirth());
        persInfo.setGender(gender);
        return persInfo;

    }
    private List<String> readListFio(String fileName) throws IOException {
        List<String> fios = new ArrayList<>();
        FileReader fileReader = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fileReader);
        String line;
        while ((line = br.readLine()) != null) {
            fios.add(line);
        }
        return fios;
    }
    private List<String> readAnyFiosFromFileByGender (Gender gender) throws IOException {
        List<String> anyFios ;
        if (gender.equals(Gender.M)) {
            anyFios = readListFio(Constants.MAN_FILE_NAME);
        } else {
            anyFios = readListFio(Constants.GIRL_FILE_NAME);
        }
        return anyFios;

    }
    private LocalDate makeRandomDateOfBirth(){
        Random random = new Random();
        int minDay = (int) LocalDate.of(1930, 1, 1).toEpochDay();
        int maxDay = (int)(LocalDate.now().minusYears(18)).toEpochDay();
        long randomDay = minDay + random.nextInt(maxDay - minDay);
        LocalDate randomDateOfBirth = LocalDate.ofEpochDay(randomDay);
        return randomDateOfBirth;
    }
    private void fillFio(PersInfo persInfo, List<String> anyFios) {
        int min = 0;
        int max = anyFios.size();
        int randomFios = (int) ((Math.random() * (max-min)) + min);
        String[] splitFio = anyFios.get(randomFios).split("\\s+");
        persInfo.setLastName(splitFio[0]);
        persInfo.setFirstName(splitFio[1]);
        persInfo.setMiddleName(splitFio[2]);
    }
}
