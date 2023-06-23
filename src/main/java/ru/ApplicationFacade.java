package ru;

import ru.Util;
import ru.controller.PersInfoController;
import ru.dao.CardHolderDao;
import ru.dao.CardHolderDaoImpl;
import ru.dao.PersInfoDaoImpl;
import ru.entity.CardHolder;
import ru.fabrics.CardHolderFabric;
import ru.generatedSources.PersInfoBetweenDateOfBirthRequest;
import ru.services.HolderServiceImpl;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class ApplicationFacade {

    public static void main(String[] args) throws IOException {

      /***Запрос будет присылать сторонний сервис**/
        PersInfoBetweenDateOfBirthRequest request = new PersInfoBetweenDateOfBirthRequest();
        request.setDateOfBirthFrom(LocalDate.now().minusYears(100));
        request.setDateOfBirthTo(LocalDate.now());
        request.setSendDate(LocalDateTime.now());

        /** Контроллер,который будет ловить запрос пока создаём так */
        PersInfoController controller = new PersInfoController();
        controller.getPersInfo(request);

        /**Здесь будет создание сущностей и запуск приложения*/

    }

}
