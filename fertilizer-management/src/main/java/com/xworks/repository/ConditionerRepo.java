package com.xworks.repository;

import com.xworks.dto.ConditionerEntity;

import java.util.Collections;
import java.util.List;

public interface ConditionerRepo {
    void save(ConditionerEntity entity);
    void saveAll(List<ConditionerEntity> entity);
    default Boolean updateNetQuantityByBrand(String brand,String quantity){
        return false;
    }
    default List<ConditionerEntity> findAllByBrand(String brand){
        return Collections.emptyList();
    }
    default List<ConditionerEntity> findAllByHairType(String hairType){
        return Collections.emptyList();
    }
    default String findScentById(int id){
        return null;

    }
    default List<String> getAllBrand(){
        return Collections.emptyList();
    }

}
