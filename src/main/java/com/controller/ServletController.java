package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.Address;
import com.entity.Group;
import com.entity.Record;
import com.service.Service;


/**
 * Servlet implementation class ServletController
 */
public class ServletController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private Service service = new Service();
	
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletController() {
	
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Address address = Address.builder()
				.setCity(request.getParameter("city"))
				.setStreet(request.getParameter("street"))
				.setPostcode(request.getParameter("postcode"))
				.setHouseNumber(Integer.valueOf(request.getParameter("housenumber")))
				.setFlatNumber(Integer.valueOf(request.getParameter("flatnumber")))
				.build();

		Record record = Record.builder()
				.setName(request.getParameter("name"))
				.setSurname(request.getParameter("surname"))
				.setPatronymic(request.getParameter("patronymic"))
				.setNickName(request.getParameter("nickname"))
				.setEmail(request.getParameter("email"))
				.setSkype(request.getParameter("skype"))
				.setComment(request.getParameter("comment"))
				.setHomePhoneNumber(request.getParameter("homephone"))
				.setMobilePhone(request.getParameter("mobilephone"))
				.setAnotherPhone(request.getParameter("anotherphone"))
				.setGroup(Group.valueOf(request.getParameter("group")))
				.setAddress(address)
				.build();

		service.setRecord(record);
		request.setAttribute("record", service.getRecord());
		request.getRequestDispatcher("details.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
