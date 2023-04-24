package ru.fabrics;

import ru.Constants;
import ru.entity.Card;
import ru.entity.CardHolder;
import ru.entity.Gender;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CardHolderFabric {

    private final CardFabric cardFabric = new CardFabric();
    private final AddressFabric addressFabric = new AddressFabric();


    public CardHolder makeRandomHolder(Gender gender) throws IOException {
        CardHolder holder = new CardHolder();
        List<String> anyFios = readAnyFiosFromFileByGender(gender);
        fillFio(holder, anyFios);
        holder.setDateOfBirth(makeRandomDateOfBirth());
        holder.setGender(gender);
        holder.setCards(generateRandomAmountActiveAndNotActiveCards());
        Period period = Period.between(holder.getDateOfBirth(), LocalDate.now());
        holder.setAge(period.getYears());
        holder.setAddresses(addressFabric.makeRandomAddress());
        return holder;
    }

    public List<CardHolder> makeRandomHolders(int manCounter, int girlCounter) throws IOException {
        int counter = manCounter + girlCounter;
        List<CardHolder> randomHolders = new ArrayList<>(counter);
        randomHolders.addAll(makeRandomManHolders(manCounter));
        randomHolders.addAll(makeRandomGirlHolders(girlCounter));
        return randomHolders;
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

    private List<CardHolder> makeRandomManHolders(int manCounter) throws IOException {
        List<CardHolder> manRandomHolders = new ArrayList<>(manCounter);
        for (int i = 0; i < manCounter; i++) {
            manRandomHolders.add(makeRandomHolder(Gender.M));

        }
        return manRandomHolders;
    }

    private LocalDate makeRandomDateOfBirth(){
        Random random = new Random();
        int minDay = (int) LocalDate.of(1930, 1, 1).toEpochDay();
        int maxDay = (int) LocalDate.of(2005, 1, 1).toEpochDay();
        long randomDay = minDay + random.nextInt(maxDay - minDay);
        LocalDate randomDateOfBirth = LocalDate.ofEpochDay(randomDay);
        return randomDateOfBirth;
    }

    private List<CardHolder> makeRandomGirlHolders(int girlCounter) throws IOException {
        List<CardHolder> girlRandomHolders = new ArrayList<>(girlCounter);
        for (int i = 0; i < girlCounter; i++) {
            girlRandomHolders.add(makeRandomHolder(Gender.F));
        }
        return girlRandomHolders;
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

    private void fillFio(CardHolder holder, List<String> anyFios) {
        int min = 0;
        int max = anyFios.size();
        int randomFios = (int) ((Math.random() * (max-min)) + min);
        String[] splitFio = anyFios.get(randomFios).split("\\s+");
        holder.setLastName(splitFio[0]);
        holder.setFirstName(splitFio[1]);
        holder.setMiddleName(splitFio[2]);
    }

    private List<Card> generateRandomAmountActiveAndNotActiveCards() throws IOException {
        int maxCard = 5;
        int minActiveCard = 1;
        int minNotActiveCard = 0;
        int activeCardCounter = (int) ((Math.random() * (maxCard-minActiveCard)) + minActiveCard);
        int notActiveCardCounter = (int) ((Math.random() * (maxCard-minNotActiveCard)) + minNotActiveCard);
        return cardFabric.makeRandomCards(activeCardCounter,notActiveCardCounter);
    }

}