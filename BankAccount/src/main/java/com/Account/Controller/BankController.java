package com.Account.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Account.Model.BankModel1;
import com.Account.Service.BankService;

@RestController
@RequestMapping("/account")
public class BankController {
	
	
	@Autowired
	BankService bankService;
	
	
	@PostMapping("/post")
	public ResponseEntity<BankModel1>savebank(@RequestBody BankModel1 bankModel1){
		BankModel1 bankModel2=bankService.savebank(bankModel1);
		return new ResponseEntity<BankModel1>(bankModel1,HttpStatus.OK);
	}
	
	 @PutMapping("/put/{id}")
	 public ResponseEntity<BankModel1>updatebank(@PathVariable String id,@RequestBody BankModel1 bankModel1){
		 BankModel1 bankModel2=bankService.updatebank(id,bankModel1);
		 return new ResponseEntity<BankModel1>(bankModel2,HttpStatus.OK);
	 }
	 
	@GetMapping("/get")
	public ResponseEntity<List<BankModel1>>allbank(){
		List<BankModel1>bankModel1=bankService.allbank();
        return new ResponseEntity<List<BankModel1>>(bankModel1,HttpStatus.OK);
		
	}
	
	@DeleteMapping("/del/{id}")
	public ResponseEntity<String>deleteById(@PathVariable String id){
		String message=bankService.deleteById(id);
		return new ResponseEntity<String>(message,HttpStatus.OK);
	}
	
	
	
	

}
