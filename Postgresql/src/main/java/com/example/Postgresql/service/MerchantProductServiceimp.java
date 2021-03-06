package com.example.Postgresql.service;


import com.example.Postgresql.dto.Merchant;
import com.example.Postgresql.dto.MerchantProduct;
import com.example.Postgresql.entity.MerchantEntity;
import com.example.Postgresql.entity.MerchantProductEntity;
import com.example.Postgresql.fiegn.ProductInterface;
import com.example.Postgresql.repository.MerchantProductRepository;
import com.example.Postgresql.repository.MerchantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MerchantProductServiceimp implements MerchantProductService{

    @Autowired
    MerchantProductRepository merchantProductRepository;

    @Autowired
    ProductInterface productInterface;

    @Autowired
    MerchantRepository merchantRepository;



    public void add(MerchantProduct merchantProduct){

         MerchantProductEntity merchantProductEntity=new MerchantProductEntity();

        Optional<MerchantEntity> byId=merchantRepository.findById(merchantProduct.getMerchantid());
        if(byId.isPresent()){
            merchantProductEntity.setMerchantEntity(byId.get());
            merchantProductEntity.setStock(merchantProduct.getStock());
            merchantProductEntity.setPrice(merchantProduct.getPrice());
            merchantProductEntity.setSoldProducts(merchantProduct.getSoldProducts());
            merchantProductEntity.setProductid(merchantProduct.getProductId());
            merchantProductEntity.setPrice(merchantProduct.getPrice());
            merchantProductEntity.setDescription(merchantProduct.getDescription());
            merchantProductEntity.setImageurl(merchantProduct.getImageurl());
            merchantProductEntity.setCategory(merchantProduct.getCategory());
            merchantProductEntity.setRating(merchantProduct.getRating());
            merchantProductEntity.setAlgoValue(merchantProduct.getAlgovalue());
            merchantProductRepository.save(merchantProductEntity);


        }

//        merchantProductRepository.save(merchantProductEntity);

        //productId from product table(other database)
    }
    @Override
    public void update(Integer stock, Integer mId) {

        for(MerchantProductEntity merchantProductEntity:merchantProductRepository.findAll()){

            //feign implementation

        }

    }

    public void delete(Integer id){
        for(MerchantProductEntity merchantProductEntity:merchantProductRepository.findAll()){
            //feign
            //if stock =0

        }
    }

    public List<Integer> deleteproduct(){
        Iterable<MerchantProductEntity> merchantProductEntities=merchantProductRepository.findAll();
        List<Integer> merchantProducts=new ArrayList<>();

        for(MerchantProductEntity merchantProductEntity:merchantProductEntities){
            Integer stock= merchantProductEntity.getStock();
            if(stock==0){
                MerchantProduct merchantProduct=new MerchantProduct(merchantProductEntity.getId(),merchantProductEntity.getProductid(),merchantProductEntity.getPrice(),merchantProductEntity.getStock(),merchantProductEntity.getSoldProducts(),merchantProductEntity.getProductName(),merchantProductEntity.getMerchantName(),merchantProductEntity.getDescription(),merchantProductEntity.getImageurl(),merchantProductEntity.getCategory(),merchantProductEntity.getRating(),merchantProductEntity.getAlgoValue());
                Integer productId=merchantProduct.getProductId();
                merchantProducts.add(productId);
            }
        }

         return merchantProducts;
     }
     // for cart stock update while buying
     public void stockUpdate(Integer mid,Integer pid,Integer quantity){
         Iterable<MerchantProductEntity> merchantProductEntities=merchantProductRepository.findAll();

         for(MerchantProductEntity merchantProductEntity:merchantProductEntities){
             if(merchantProductEntity!=null&&merchantProductEntity.getStock()!=null&&merchantProductEntity.getProductid()==pid&&merchantProductEntity.getMerchantEntity().getId()==mid){
                 System.out.println(merchantProductEntity.getStock());
                 if(merchantProductEntity.getStock()-quantity<=0){
                  // throw some exception
                 }
                 else {
                     merchantProductEntity.setStock(merchantProductEntity.getStock() - quantity);
                     merchantProductRepository.save(merchantProductEntity);
                 }
             }
         }
     }

     // check stock
     public boolean checkStock(Integer mid , Integer pid){
         Iterable<MerchantProductEntity> merchantProductEntities=merchantProductRepository.findAll();

         for(MerchantProductEntity merchantProductEntity:merchantProductEntities){
             if(merchantProductEntity.getProductid()==pid&&merchantProductEntity.getMerchantEntity().getId()==mid){
                 if(merchantProductEntity!=null&&merchantProductEntity.getStock()>0){
                     return true;
                 }
                 else {
                     return false;
                 }
             }
         }
         return false;
     }


}
