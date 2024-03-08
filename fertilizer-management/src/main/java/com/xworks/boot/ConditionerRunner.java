package com.xworks.boot;

import com.xworks.dto.ConditionerEntity;
import com.xworks.repository.ConditionerRepo;
import com.xworks.repository.ConditionerRepoImpl;

import java.util.Arrays;
import java.util.List;

public class ConditionerRunner {
    public static void main(String[] args) {
        ConditionerRepo repo=new ConditionerRepoImpl();
        ConditionerEntity entity=new ConditionerEntity("L’Oréal Paris","Liquid","Natural","Dry","Hydrating","Adult","180 millilitre","Fresh");
        //repo.save(entity);
        ConditionerEntity entity1=new ConditionerEntity("TRESemme","Liquid","Natural","Dry,Frizzy","Smoothening","Adult","190.0 millilitre","Argan Oil");
        ConditionerEntity entity2=new ConditionerEntity("Dove","Liquid","Biodegradable","All","Detangling","Adult","175.0 millilitre","Floral");
        ConditionerEntity entity3=new ConditionerEntity("Dr Batra's","Liquid","Natural","All","Conditioning","Adult","395.0 millilitre","Unscented");
        List<ConditionerEntity> list= Arrays.asList(entity,entity1,entity2,entity3);
        //repo.saveAll(list);
        //Boolean result=repo.updateNetQuantityByBrand("TRESemme","70 ml");
       // System.out.println(result);
      // List<ConditionerEntity> list1= repo.findAllByBrand("L’Oréal Paris");
    //   list1.forEach(e-> System.out.println(e));
       // List<ConditionerEntity> list2= repo.findAllByHairType("All");
        //list2.forEach(e-> System.out.println(e));
        //String value= repo.findScentById(1);
        //System.out.println(value);
        List<String> list2=repo.getAllBrand();
        list2.forEach(e-> System.out.println(e));

    }
}
