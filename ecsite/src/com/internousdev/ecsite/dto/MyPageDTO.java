package com.internousdev.ecsite.dto;
public class MyPageDTO {
	private String itemName;
	private String totalPrice;
	private String totalCount;
	private String payment;
	private String username;
	private String id;
	private String insert_date;

	public String getItemName(){
		return this.itemName;
	}
	public void setItemName(String itemName){
		this.itemName=itemName;
	}
	public String getTotalPrice(){
		return this.totalPrice;
	}
	public void setTotalPrice(String totalPrice){
		this.totalPrice=totalPrice;
	}
	public String getTotalCount(){
		return totalCount;
	}
	public void setTotalCount(String totalCount){
		this.totalCount=totalCount;
	}
	public String getPayment(){
		return payment;
	}
	public void setPayment(String payment){
		this.payment=payment;
	}
	public String getUsername(){
		return username;
	}
	public void setUsername(String username){
		this.username=username;
	}
	public String getId(){
		return id;
	}
	public void setId(String id){
		this.id=id;
	}
	public String getInsert_date(){
		return insert_date;
	}
	public void setInsert_date(String insert_date){
		this.insert_date=insert_date;
	}
}
