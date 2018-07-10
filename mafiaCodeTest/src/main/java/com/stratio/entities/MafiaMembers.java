package com.stratio.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mafiaMembers")
public class MafiaMembers implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 716717597564625714L;
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "member_id", unique = true, nullable = false)
	private Integer memberId;
	
	@Column(name = "member_name")
	private String memberName;
	
	@Column(name = "member_status", nullable = false)
	private String memberStatus;
	
	@Column(name="member_join_date",  nullable = false)
	private Date memberJoinDate;
	
	@Column(name="member_big_boss",  nullable = false)
	private Boolean memberBigBoss;

	public MafiaMembers(){
	}
	
	public MafiaMembers(Integer memberId, String memberName, String memberStatus, Date memberJoinDate,
			Boolean memberBigBoss) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
		this.memberStatus = memberStatus;
		this.memberJoinDate = memberJoinDate;
		this.memberBigBoss = memberBigBoss;
	}
	
	public MafiaMembers(String memberName, String memberStatus, Date memberJoinDate,
			Boolean memberBigBoss) {
		super();
		this.memberName = memberName;
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

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
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
