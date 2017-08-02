package com.entity;

import java.util.Date;
import java.util.Set;

public class Record {

	private int id;
	private String surname;
	private String name;
	private String patronymic;
	private String nickName;
	private String comment;
	private Group group;
	private String homePhoneNumber;
	private String mobilePhone;
	private String anotherPhone;
	private String email;
	private String skype;
	private Address address;
	private Set<Date> datesOfChanges;
	private Date lastChange;

	private Record(String surname, String name, String patronymic, String nickName, String comment, Group group,
			String homePhoneNumber, String mobilePhone, String anotherPhone, String email, String skype,
			Address address, Set<Date> datesOfChanges, Date lastChange) {
		this.surname = surname;
		this.name = name;
		this.patronymic = patronymic;
		this.nickName = nickName;
		this.comment = comment;
		this.group = group;
		this.homePhoneNumber = homePhoneNumber;
		this.mobilePhone = mobilePhone;
		this.anotherPhone = anotherPhone;
		this.email = email;
		this.skype = skype;
		this.address = address;
	}

	public static Builder builder() {
		return new Builder();
	}

	public static class Builder {

		private String surname;
		private String name;
		private String patronymic;
		private String nickName;
		private String comment;
		private Group group;
		private String homePhoneNumber;
		private String mobilePhone;
		private String anotherPhone;
		private String email;
		private String skype;
		private Address address;
		private Set<Date> datesOfChanges;
		private Date lastChange;

		public Builder setName(String name) {
			this.name = name;
			return this;
		}

		public Builder setSurname(String surname) {
			this.surname = surname;
			return this;
		}

		public Builder setPatronymic(String patronymic) {
			this.patronymic = patronymic;
			return this;
		}

		public Builder setNickName(String nickName) {
			this.nickName = nickName;
			return this;
		}

		public Builder setComment(String comment) {
			this.comment = comment;
			return this;
		}

		public Builder setGroup(Group group) {
			this.group = group;
			return this;
		}

		public Builder setHomePhoneNumber(String homePhoneNumber) {
			this.homePhoneNumber = homePhoneNumber;
			return this;
		}

		public Builder setMobilePhone(String mobilePhone) {
			this.mobilePhone = mobilePhone;
			return this;
		}

		public Builder setAnotherPhone(String anotherPhone) {
			this.anotherPhone = anotherPhone;
			return this;
		}

		public Builder setEmail(String email) {
			this.email = email;
			return this;
		}

		public Builder setSkype(String skype) {
			this.skype = skype;
			return this;
		}

		public Builder setAddress(Address address) {
			this.address = address;
			return this;
		}

		public Record build() {
			return new Record(surname, name, patronymic, nickName, comment, group, homePhoneNumber, mobilePhone,
					anotherPhone, email, skype, address, datesOfChanges, lastChange);
		}

	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPatronymic() {
		return patronymic;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	public String getHomePhoneNumber() {
		return homePhoneNumber;
	}

	public void setHomePhoneNumber(String homePhoneNumber) {
		this.homePhoneNumber = homePhoneNumber;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getAnotherPhone() {
		return anotherPhone;
	}

	public void setAnotherPhone(String anotherPhone) {
		this.anotherPhone = anotherPhone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSkype() {
		return skype;
	}

	public void setSkype(String skype) {
		this.skype = skype;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Set<Date> getDatesOfChanges() {
		return datesOfChanges;
	}

	public void setDatesOfChanges(Set<Date> datesOfChanges) {
		this.datesOfChanges = datesOfChanges;
	}

	public Date getLastChange() {
		return lastChange;
	}

	public void setLastChange(Date lastChange) {
		this.lastChange = lastChange;
	}

	@Override
	public String toString() {
		return "Record [id=" + id + ", surname=" + surname + ", name=" + name + ", patronymic=" + patronymic
				+ ", nickName=" + nickName + ", comment=" + comment + ", groups=" + group + ", homePhoneNumber="
				+ homePhoneNumber + ", mobilePhone=" + mobilePhone + ", anotherPhone=" + anotherPhone + ", email="
				+ email + ", skype=" + skype + ", address=" + address + ", datesOfChanges=" + datesOfChanges
				+ ", lastChange=" + lastChange + "]";
	}

}
