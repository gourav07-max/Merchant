package com.example.Postgresql.service;


import com.example.Postgresql.dto.Merchant;
import com.example.Postgresql.entity.MerchantEntity;
import com.example.Postgresql.entity.MerchantProductEntity;
import com.example.Postgresql.repository.MerchantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MerchantServiceimp implements MerchantService{

    @Autowired
    MerchantRepository merchantRepository;

    public List<Merchant> getAll() {
        Iterable<MerchantEntity> merchantEntities=merchantRepository.findAll();
        List<Merchant> merchantList=new ArrayList<>();
        for(MerchantEntity merchantEntity:merchantEntities){
            Merchant merchant=new Merchant(merchantEntity.getId(),merchantEntity.getName(),merchantEntity.getPassword(),merchantEntity.getRating(),merchantEntity.getEmail());
            merchantList.add(merchant);
        }
        return merchantList;
    }

    public void update(Merchant merchant){

        for(MerchantEntity merchantEntity:merchantRepository.findAll()){
            if(merchant.getId()==merchantEntity.getId()){

                merchantEntity.setName(merchant.getName());
                merchantRepository.save(merchantEntity);
            }
        }
    }
    public void delete(Integer id){
        for(MerchantEntity merchantEntity:merchantRepository.findAll()){
            if(merchantEntity.getId()==id){
                merchantRepository.deleteById(id);
                break;
            }
        }
    }
    public void adds(Merchant merchant){
        MerchantEntity merchantEntity=new MerchantEntity();
        merchantEntity.setId(merchant.getId());
        merchantEntity.setName(merchant.getName());
        merchantRepository.save(merchantEntity);

    }



}
