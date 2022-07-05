package com.Account.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.Account.Model.BankModel1;
@Repository
public interface BankRepository extends MongoRepository<BankModel1,String> {

}
