package ru.dao;

import ru.entity.CardHolder;
import ru.fabrics.CardHolderFabric;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CardHolderDaoImpl implements CardHolderDao {
    @Override
    public List<CardHolder> findHolderBetweenDateOfBirth(LocalDate from, LocalDate to) {
        List<CardHolder> holderBetweenDateOfBirth = new ArrayList<>();
        try {
            List<CardHolder> cardHolders = findAll();
            holderBetweenDateOfBirth = cardHolders.stream()
                    .filter(e->e.getPersInfo().getDateOfBirth().isAfter(from) && e.getPersInfo().getDateOfBirth().isBefore(to))
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return holderBetweenDateOfBirth;
    }


    private List<CardHolder> findAll() throws IOException {
        CardHolderFabric holderFabric = new CardHolderFabric();
        List<CardHolder> cardHolders = holderFabric.makeRandomHolders(100,100);
        return cardHolders;
    }

}
