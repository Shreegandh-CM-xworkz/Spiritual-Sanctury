package service;

import Entities.TempleEntity;

import java.time.LocalDate;
import java.util.List;

public interface TempleService {


    void validate(TempleEntity entity);
    List<TempleEntity> validateList();
    TempleEntity getTemple(int id);
    Boolean validateUpdate(int id, String name, String location, String vipEntry, String inaguratedDate, String mainGod, String dimension, Double entryFee);
    Boolean deleteById(int id);

}
