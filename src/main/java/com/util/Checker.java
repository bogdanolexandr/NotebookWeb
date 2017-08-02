package com.util;


import javax.servlet.http.HttpServletRequest;

import com.entity.Record;

public class Checker {

	public static final String NAME_PATTERN = "^[a-zA-Z]+(([\\'\\,\\.\\- ][a-zA-Z ])?[a-zA-Z]*)*$";
	public static final String PHONE_PATTERN = "^(\\(?\\+?[0-9]*\\)?)?[0-9_\\- \\(\\)]*$";
	public static final String DATE_PATTERN = "((0?[13578]|10|12)(-|\\/)((0[0-9])|([12])([0-9]?)|(3[01]?))(-|\\/)((\\d{4})|(\\d{2}))|(0?[2469]|11)(-|\\/)((0[0-9])|([12])([0-9]?)|(3[0]?))(-|\\/)((\\d{4}|\\d{2})))";
	public static final String EMAIL_PATTERN = "^\\w+@[a-zA-Z_]+?\\.[a-zA-Z]{2,3}$";
	public static final String ENUM_PATTERN = "friends|relatives|colleagues";
	public static final String NICK_PATTERN = "^[a-zA-Z][a-zA-z0-9\\.,\\-_]{5,31}$";
	public static final String CITY_STREET_PATTERN = "[a-zA-Z]*";
	public static final String HOUSE_NUMBER_PATTERN = "[0-9]{1,3}$";
	public static final String POST_CODE_PATTERN = "[0-9]{5}$";

	private String[] titles = { "name", "surname", "patronymic", "nickname", "skype", "mobilephone", "homephone",
			"anotherPhone", "group", "email", "comment", "postcode", "city", "street", "houseNumber", "flatNumber" };

	private int countOfErrors = 0;
	private int index = 0;
	private final String ERROR = "not correct";

	private Record record;
	private HttpServletRequest request;

	public boolean check(HttpServletRequest request, Record record) {
		this.record = record;
		this.request = request;
		for (String s : titles) {
			request.setAttribute(s,"");
		}
		
		checkName();
		
		if(countOfErrors > 0) {
			return false;
		}
		return true;
	}

	private void checkName() {
		if (!check(record.getName(), Checker.NAME_PATTERN)) {
			addErrorMessage();
		}
		index++;
		checkSurname();
	}

	private void addErrorMessage() {
		countOfErrors++;
		request.setAttribute(titles[index], ERROR);
	}

	private void checkSurname() {
		if (!check(record.getSurname(), Checker.NAME_PATTERN)) {
			addErrorMessage();
		}
		index++;
		checkPatronymic();
	}

	private void checkPatronymic() {
		if (!check(record.getPatronymic(), Checker.NAME_PATTERN)) {
			addErrorMessage();
		}
		index++;
		checkNickName();
	}

	private void checkNickName() {
		if (!check(record.getNickName(), Checker.NICK_PATTERN)) {
			addErrorMessage();
		}
		index++;
		checkSkype();
	}

	private void checkSkype() {
		if (!check(record.getSkype(), Checker.NICK_PATTERN)) {
			addErrorMessage();
		}
		index++;
		checkMobilePhone();
	}

	private void checkMobilePhone() {
		if (!check(record.getMobilePhone(), Checker.PHONE_PATTERN)) {
			addErrorMessage();
		}
		index++;
		checkHomePhone();
	}

	private void checkHomePhone() {
		if (!check(record.getHomePhoneNumber(), Checker.PHONE_PATTERN)) {
			addErrorMessage();
		}
		index++;
		checkAnotherPhone();
	}

	private void checkAnotherPhone() {
		if (!check(record.getAnotherPhone(), Checker.PHONE_PATTERN)) {
			addErrorMessage();
		}
		index++;
		checkEmail();
	}

	private void checkEmail() {
		if (!check(record.getEmail(), Checker.EMAIL_PATTERN)) {
			addErrorMessage();
		}
		index++;
		checkPostcode();
	}

	private void checkPostcode() {
		if (!check(record.getAddress().getPostcode(), Checker.POST_CODE_PATTERN)) {
			addErrorMessage();
		}
		index++;
		checkCity();
	}

	private void checkCity() {
		if (!check(record.getAddress().getCity(), Checker.CITY_STREET_PATTERN)) {
			addErrorMessage();
		}
		index++;
		checkStreet();
	}

	private void checkStreet() {
		if (!check(record.getAddress().getStreet(), Checker.CITY_STREET_PATTERN)) {
			addErrorMessage();
		}
		index++;
		checkHouseNumber();
	}

	private void checkHouseNumber() {
		if (!check(String.valueOf(record.getAddress().getHouseNumber()), Checker.HOUSE_NUMBER_PATTERN)) {
			addErrorMessage();
		}
		index++;
		checkFlateNumber();
	}

	private void checkFlateNumber() {
		if (!check(String.valueOf(record.getAddress().getFlatNumber()), Checker.HOUSE_NUMBER_PATTERN)) {
			addErrorMessage();
		}
	}

	public boolean check(String expression, String pattern) {
		return expression.matches(pattern);
	}

}
