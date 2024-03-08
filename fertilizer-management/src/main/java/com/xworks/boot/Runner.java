package com.xworks.boot;

import com.xworks.dto.EmailEntity;
import com.xworks.dto.FertilizerEntity;
import com.xworks.dto.TravelEntity;
import com.xworks.repository.EmailRepositoryImpl;
import com.xworks.repository.FertilizerRepositoryImpl;
import com.xworks.repository.TravelRepository;
import com.xworks.repository.TravelRepositoryImpl;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Runner {
    public static void main(String[] args) {

//        EmailEntity email=new EmailEntity("shreegandh@gmail.com","Shreegandh","lalu","interview","x-workz","success");
//        EmailRepositoryImpl repo=new EmailRepositoryImpl();
//       Integer id1= repo.save(email);
//        System.out.println(id1);
//        TravelEntity travel=new TravelEntity("karnataka","ayodhya","5K","1200km","5days","Bus",LocalDate.of(2024,1,22),LocalDate.of(2024,1,25));
//        TravelRepositoryImpl repository=new TravelRepositoryImpl();
//        Integer id2=repository.save(travel);
//        System.out.println(id2);
//
       FertilizerEntity entity=new FertilizerEntity("potassium",2,2000, LocalDate.of(2022,2,1),LocalDate.of(2025,5,10));
       FertilizerEntity entity2=new FertilizerEntity("sodium",2,3000, LocalDate.of(2023,2,1),LocalDate.of(2026,5,10));
       FertilizerEntity entity3=new FertilizerEntity("lindon",5,5000, LocalDate.of(2024,2,1),LocalDate.of(2027,5,10));
       FertilizerEntity entity4=new FertilizerEntity("Dap",10,8000, LocalDate.of(2025,2,1),LocalDate.of(2028,5,10));
        FertilizerRepositoryImpl fertilizerRepository=new FertilizerRepositoryImpl();
        List<FertilizerEntity>entities= Arrays.asList(entity2,entity4,entity,entity3);
      //fertilizerRepository.saveAll(entities);
//        List<FertilizerEntity> list=fertilizerRepository. findAllByQuantity(2);
//        list.forEach(f-> System.out.println(f));


       FertilizerEntity fe= fertilizerRepository.getByName("sodium");
        System.out.println(fe);



    }
}
