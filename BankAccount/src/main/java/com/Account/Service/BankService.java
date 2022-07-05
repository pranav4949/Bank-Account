package com.Account.Service;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.Account.Model.BankModel1;
import com.Account.Repository.BankRepository;

@Service
public class BankService {
	
	
	@Autowired
	BankRepository bankRepository;
	

	public BankModel1 savebank(BankModel1 bankModel1) {
		bankRepository.save(bankModel1);
		return bankModel1;
	}


	public BankModel1 updatebank(String id, BankModel1 bankModel1) {
		Optional<BankModel1> bankModel2=bankRepository.findById(id);
		BankModel1 bankModel3=bankModel2.get();
		bankModel3.setAccount_no(bankModel1.getAccount_no());
		bankModel3.setBalance(bankModel1.getBalance());
		bankModel3.setLast_updated_date(new Date());
		bankRepository.save(bankModel3);
		return bankModel3;
	}


	public java.util.List<BankModel1> allbank() {
		java.util.List<BankModel1>bankModel1=bankRepository.findAll();
		return bankModel1;
	}


	public String deleteById(String id) {
		bankRepository.deleteById(id);
		return "bank account deleted successfully";
	}


	

}
