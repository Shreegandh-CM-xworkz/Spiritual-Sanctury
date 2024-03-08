package serviceImpl;

import Entities.ContactFormEntity;
import Repository.ContactFormRepo;
import RepositoryImpl.ContactFormRepoImpl;
import service.ContactService;

public class ContactServiceImpl implements ContactService {
    ContactFormRepo repo=new ContactFormRepoImpl();
    @Override
    public void validateSave(ContactFormEntity entity) {
        if (entity!=null){
            repo.save(entity);
        }

    }
}
