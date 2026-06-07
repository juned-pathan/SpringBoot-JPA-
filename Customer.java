package com.nt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="JPA_CUSTOMER_TAB")
@Data
public class Customer {
    @Id
    @Column(name="CUST_ID")
    @GeneratedValue(strategy =GenerationType.AUTO )
	private Integer cno;
    @Column(name="Cust_NAME",length = 30)
	private String cname;
    @Column(name="Cust_ADDRS",length=30)
	private  String caddrs;
    @Column(name = "CUSt_BILL_AMOUNTt" )
	private Double billAmt;
	
	
}
