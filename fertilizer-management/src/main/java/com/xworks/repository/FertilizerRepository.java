package com.xworks.repository;

import com.xworks.dto.FertilizerEntity;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ListResourceBundle;

public interface FertilizerRepository {
    Integer save(FertilizerEntity entity);
   default void saveAll(List<FertilizerEntity> list){

   }
   default List<FertilizerEntity> findAllByQuantity(int quantity){
      return Collections.emptyList();
   }

   List<FertilizerEntity> findAllByIdAndMainGod(int id, String god);
}
