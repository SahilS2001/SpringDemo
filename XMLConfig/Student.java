package com.XMLConfig;

public class Student {
	
	private int sid;
	private String sname;
	private String saddress;
	
	public Student() {
		
	}

	public Student(int sid, String sname, String saddress) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.saddress = saddress;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", saddress=" + saddress + "]";
	}
	
	
	

}
