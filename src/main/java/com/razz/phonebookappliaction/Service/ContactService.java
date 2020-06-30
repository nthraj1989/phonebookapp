package com.razz.phonebookappliaction.Service;

import java.util.List;

import com.razz.phonebookappliaction.Entity.Contact;

public interface ContactService {

	 boolean saveContact(Contact c);
	 List<Contact> getAllContact();
	 Contact getContactByID(Integer cid);
	 boolean updateContact(Contact c);
	 boolean deleteContact(Integer cid);
}
