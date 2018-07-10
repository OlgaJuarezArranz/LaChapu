package com.stratio.dto;

import java.io.Serializable;
import java.util.Date;

public class MafiaMembersDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer memberId;
	private String memberStatus;
	private Date memberJoinDate;
	private Boolean memberBigBoss;
	
	public MafiaMembersDTO(){
	}

	public MafiaMembersDTO(Integer memberId, String memberStatus, Date memberJoinDate, Boolean memberBigBoss) {
		super();
		this.memberId = memberId;
		this.memberStatus = memberStatus;
		this.memberJoinDate = memberJoinDate;
		this.memberBigBoss = memberBigBoss;
	}

	public Integer getMemberId() {
		return memberId;
	}

	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}

	public String getMemberStatus() {
		return memberStatus;
	}

	public void setMemberStatus(String memberStatus) {
		this.memberStatus = memberStatus;
	}

	public Date getMemberJoinDate() {
		return memberJoinDate;
	}

	public void setMemberJoinDate(Date memberJoinDate) {
		this.memberJoinDate = memberJoinDate;
	}

	public Boolean getMemberBigBoss() {
		return memberBigBoss;
	}

	public void setMemberBigBoss(Boolean memberBigBoss) {
		this.memberBigBoss = memberBigBoss;
	}
	
}
