package com.example.Postgresql.service;

import com.example.Postgresql.dto.Merchant;

import java.util.List;

public interface MerchantService {


    void adds(Merchant merchant);
    void update(Merchant merchant);
    void delete(Integer id);
    List<Merchant> getAll();


}
