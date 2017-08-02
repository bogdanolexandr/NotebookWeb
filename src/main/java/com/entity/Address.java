package com.entity;

public class Address {

	private String postcode;
	private String city;
	private String street;
	private int houseNumber;
	private int flatNumber;

	public Address(String postcode, String city, String street, int houseNumber, int flatNumber) {
		this.postcode = postcode;
		this.city = city;
		this.street = street;
		this.houseNumber = houseNumber;
		this.flatNumber = flatNumber;
	}

	public static Builder builder() {
		return new Builder();
	}

	public static class Builder {

		private String postcode;
		private String city;
		private String street;
		private int houseNumber;
		private int flatNumber;

		public Builder setPostcode(String postcode) {
			this.postcode = postcode;
			return this;
		}

		public Builder setCity(String city) {
			this.city = city;
			return this;
		}

		public Builder setStreet(String street) {
			this.street = street;
			return this;
		}

		public Builder setHouseNumber(int houseNumber) {
			this.houseNumber = houseNumber;
			return this;
		}

		public Builder setFlatNumber(int flatNumber) {
			this.flatNumber = flatNumber;
			return this;
		}

		public Address build() {
			return new Address(postcode, city, street, houseNumber, flatNumber);
		}

	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}

	public int getFlatNumber() {
		return flatNumber;
	}

	public void setFlatNumber(int flatNumber) {
		this.flatNumber = flatNumber;
	}

	@Override
	public String toString() {
		return "Address [" + " postcode=" + postcode + ", city=" + city + ", street=" + street + ", houseNumber="
				+ houseNumber + ", flatNumber=" + flatNumber + "]";
	}

}
