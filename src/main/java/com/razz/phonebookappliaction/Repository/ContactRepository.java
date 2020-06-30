package com.razz.phonebookappliaction.Repository;

import org.springframework.data.repository.CrudRepository;

import com.razz.phonebookappliaction.Entity.Contact;

public interface ContactRepository extends CrudRepository<Contact, Integer> {

}
