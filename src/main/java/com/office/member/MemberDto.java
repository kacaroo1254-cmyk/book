package com.office.member;

public class MemberDto {
	
    private int mem_no;
    private String mem_id;
    private String mem_pw;
    private String mem_mail;
    private String mem_phone;
    private int mem_is;
    private String mem_reg_date;
    private String mem_mod_date;
    
    
    public MemberDto() {
		// TODO Auto-generated constructor stub
	}


	public MemberDto(int mem_no, String mem_id, String mem_pw, String mem_mail, String mem_phone, int mem_is,
			String mem_reg_date, String mem_mod_date) {
		this.mem_no = mem_no;
		this.mem_id = mem_id;
		this.mem_pw = mem_pw;
		this.mem_mail = mem_mail;
		this.mem_phone = mem_phone;
		this.mem_is = mem_is;
		this.mem_reg_date = mem_reg_date;
		this.mem_mod_date = mem_mod_date;
	}
	
	
	public MemberDto(String mem_id, String mem_pw, String mem_mail, String mem_phone) {
		this.mem_id = mem_id;
		this.mem_pw = mem_pw;
		this.mem_mail = mem_mail;
		this.mem_phone = mem_phone;
	}


	public int getMem_no() {
		return mem_no;
	}


	public void setMem_no(int mem_no) {
		this.mem_no = mem_no;
	}


	public String getMem_id() {
		return mem_id;
	}


	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}


	public String getMem_pw() {
		return mem_pw;
	}


	public void setMem_pw(String mem_pw) {
		this.mem_pw = mem_pw;
	}


	public String getMem_mail() {
		return mem_mail;
	}


	public void setMem_mail(String mem_mail) {
		this.mem_mail = mem_mail;
	}


	public String getMem_phone() {
		return mem_phone;
	}


	public void setMem_phone(String mem_phone) {
		this.mem_phone = mem_phone;
	}


	public int getMem_is() {
		return mem_is;
	}


	public void setMem_is(int mem_is) {
		this.mem_is = mem_is;
	}


	public String getMem_reg_date() {
		return mem_reg_date;
	}


	public void setMem_reg_date(String mem_reg_date) {
		this.mem_reg_date = mem_reg_date;
	}


	public String getMem_mod_date() {
		return mem_mod_date;
	}


	public void setMem_mod_date(String mem_mod_date) {
		this.mem_mod_date = mem_mod_date;
	}
    
    
    
    
    

}
