package Repository;

import Entities.TempleEntity;
import com.sun.org.apache.xpath.internal.operations.Bool;

import java.time.LocalDate;
import java.util.List;

public interface TempleRepo {
    void save(TempleEntity entity);
    List<TempleEntity>getListOfTemples();
    TempleEntity getTemple(int id);
    Boolean update(int id,String name, String location, String vipEntry, String inaguratedDate,String mainGod,String dimension,Double entryFee);
    Boolean delete(int id);

}
