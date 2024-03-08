package com.xworks.repository;

import com.xworks.dto.FertilizerEntity;
import com.xworks.dto.TempleEntity;
import sun.reflect.misc.MethodUtil;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public interface TempleRepository {
    void save(TempleEntity entity);
    default void saveAll(List<TempleEntity> list){

    }
    default List<TempleEntity> findAllByLocation(String location){
        return Collections.emptyList();
    }
    default TempleEntity findAllById(int id){
        return null;
    }
    default List<TempleEntity> findAllByEntryFeeGreaterThan(Double fee){
        return Collections.emptyList();
    }
    default List<TempleEntity> findAllByEntryFeeBetween(Double fee1,Double fee2){
        return Collections.emptyList();
    }
    default List<TempleEntity> findAllByInaguratedDateGreaterThan(LocalDate date){
        return Collections.emptyList();
    }
    default List<TempleEntity> findAllByMainGodAndLocation(String god,String location){
        return Collections.emptyList();
    }default TempleEntity findAllByIdAndMainGod(int id,String god){
        return null;
    }
    default TempleEntity findTempleWithMaxEntryFee(){
        return null;
    }

    default Long findTotal(){
        return null;
    }
    default void updateLocationByName(String name,String location){

    };
    default void updateEntryFeeByName(Double fee,String name){

    };
    default void updateLocationAndDimensionById(String location,String dimension,int id){

    };
    default void updateAllVipEntry(String entry,List<Integer> ids){

    }
    default void deleteByName(String name){

    }
    default FertilizerEntity getByName(String name)
    {
        return null;
    }
}
