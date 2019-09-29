package com.virtusa.models;

public class MentorModel {

	private String mentorId;
	private String password;
	public MentorModel() {}
	public String getMentorId() {
		return mentorId;
	}
	public void setMentorId(String mentorId) {
		this.mentorId = mentorId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "MentorModel [mentorId=" + mentorId + ", password=" + password + "]";
	}
	
}
