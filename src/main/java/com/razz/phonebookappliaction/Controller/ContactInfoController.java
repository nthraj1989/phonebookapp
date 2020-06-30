package com.razz.phonebookappliaction.Controller;

import org.springframework.ui.Model;

import com.razz.phonebookappliaction.Entity.Contact;

public class ContactInfoController {

	public String loadForm() {
		return "contactInfo";
	}

	public String handleSubmitBtn(Contact c, Model model) {
		return "";
	}
	
	public String handleViewContactsLink(Model model) {
		return "";
	}

}
