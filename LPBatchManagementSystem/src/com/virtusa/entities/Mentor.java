package com.virtusa.entities;

public class Mentor extends User {

	public Mentor() {
    }
	private String mentorId;
	public String getMentorId() {
		return mentorId;
	}
	public void setMentorId(String mentorId) {
		this.mentorId = mentorId;
	}
	@Override
	public String toString() {
		return "mentor [mentorId:" + mentorId + "]";
	}
}
