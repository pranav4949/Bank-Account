package com.Account.Model;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class BankModel1 {
	
	
	@MongoId
	private String account_no;
	private String balance;
	private Date last_updated_date=new Date(System.currentTimeMillis());

}
