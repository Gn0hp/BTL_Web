package com.ptit.web.N13.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ptit.web.N13.Models.Client;

@Repository
public interface ClientRepo extends CrudRepository <Client,Integer> {
 
}