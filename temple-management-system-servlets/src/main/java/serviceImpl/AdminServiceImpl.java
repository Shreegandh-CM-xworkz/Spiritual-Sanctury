package serviceImpl;

import Repository.AdminRepo;
import RepositoryImpl.AdminRepoImpl;
import service.AdminService;

public class AdminServiceImpl implements AdminService {
    AdminRepo admin=new AdminRepoImpl();
    @Override
    public Boolean validateAdmin(String userName, String password) {
        Boolean isFound=false;
        if (userName!=null&&password!=null){
            isFound=admin.login(userName,password);
        }
        return isFound;
    }
}
