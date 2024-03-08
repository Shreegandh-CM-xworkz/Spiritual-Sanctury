package serviceImpl;

import Repository.AdminRepo;
import Repository.TempleRepo;
import RepositoryImpl.AdminRepoImpl;
import RepositoryImpl.TempleRepoImpl;
import Entities.TempleEntity;
import service.TempleService;

import java.time.LocalDate;
import java.util.List;

public class TempleServiceImpl implements TempleService {

    TempleRepo repo=new TempleRepoImpl();

    @Override
    public void validate(TempleEntity entity) {
        if (entity.getName()!=null && entity.getDimension()!=null&&entity.getLocation()!=null&&entity.getEntryFee()!=null&&entity.getMainGod()!=null&&entity.getVipEntry()!=null&&entity.getInaguratedDate()!=null){
            repo.save(entity);
        }else System.out.println("Improper data");
    }

    @Override
    public List<TempleEntity> validateList() {
        List<TempleEntity> list=null;
        if
            (repo.getListOfTemples() != null){
            list = repo.getListOfTemples();
        }
        return list;
    }

    @Override
    public TempleEntity getTemple(int id) {
        TempleEntity entity=null;
        if (id>0){
            entity=repo.getTemple(id);
        }
        return entity;
    }

    @Override
    public Boolean validateUpdate(int id, String name, String location, String vipEntry, String inaguratedDate, String mainGod, String dimension, Double entryFee) {
        Boolean isUpdated=false;
       if (id>0&&name!=null &&location!=null&&vipEntry!=null&&inaguratedDate!=null&&mainGod!=null&&dimension!=null&&entryFee!=null){
           isUpdated=repo.update(id,name,location,vipEntry, inaguratedDate,mainGod,dimension,entryFee);
       }
        return isUpdated;
    }

    @Override
    public Boolean deleteById(int id) {
        Boolean isDeleted=false;
        if (id!=0){
            isDeleted=repo.delete(id);
        }
        return isDeleted;
    }




}
