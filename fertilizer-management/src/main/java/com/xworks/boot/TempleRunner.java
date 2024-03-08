package com.xworks.boot;

import com.xworks.dto.TempleEntity;
import com.xworks.repository.TempleRepositoryImpl;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class TempleRunner {
    public static void main(String[] args) {
        TempleEntity entity=new TempleEntity("Ram Mandir","Ayodhya","Yes", LocalDate.of(2024,1,22),"Ram","2.67 acres",500.0);
        TempleEntity entity1=new TempleEntity("Gokarna","gokarna","no", LocalDate.of(1912,1,1),"Gokarnanatha","6 acres",201.0);
        TempleEntity entity2=new TempleEntity("Murudeshwara","murudeshwara","no", LocalDate.of(1600,1,1),"Shiva","1 acres",101.0);
        TempleEntity entity3=new TempleEntity("Chennakeshava","beluru","no", LocalDate.of(1163,1,22),"Channakeshava","37 m",301.0);
        TempleRepositoryImpl tr=new TempleRepositoryImpl() ;
       // tr.save(entity);
//        List<TempleEntity> list= Arrays.asList(entity1,entity2,entity3);
//        tr.saveAll(list);
//        List<TempleEntity> list  = tr.findAllByLocation("beluru");
//        list.forEach(e-> System.out.println(e));
//        List<TempleEntity> list  = tr.findAllByEntryFeeGreaterThan(100.0);
//        list.forEach(e-> System.out.println(e));
//        List<TempleEntity> list  = tr.findAllByEntryFeeBetween(100.0,300.0);
//        list.forEach(e-> System.out.println(e));
//        List<TempleEntity> list  = tr.findAllByInaguratedDateGreaterThan(LocalDate.of(1900,1,1));
//        list.forEach(e-> System.out.println(e));
//
//        List<TempleEntity> list  = tr.findAllByMainGodAndLocation("Shiva","murudeshwara");
//        list.forEach(e-> System.out.println(e));
//            tr.findAllById(1);
          //  tr.findAllByIdAndMainGod(1,"Gokarnanatha");
            //tr.findTempleWithMaxEntryFee();
//           Long count= tr.findTotal();
//        System.out.println(count);
//        tr.updateLocationByName("Gokarna","DK");
           // tr.updateEntryFeeByName(2001.0,"Gokarna");
            tr.updateLocationAndDimensionById("dakshina kannada","3 acres",1);
            //List<Integer>ids=Arrays.asList(1,2,3);
            //tr.updateAllVipEntry("yes",ids);
       // tr.deleteByName("Gokarna");




    }
}
