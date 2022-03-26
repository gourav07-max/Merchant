package com.example.Postgresql.repository;

import com.example.Postgresql.entity.MerchantEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MerchantRepository extends CrudRepository<MerchantEntity,Integer> {




}
