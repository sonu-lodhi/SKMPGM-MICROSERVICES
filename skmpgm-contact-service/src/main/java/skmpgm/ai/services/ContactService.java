package skmpgm.ai.services;

import skmpgm.ai.entities.Contact;

import java.util.List;

public interface ContactService {
    public List<Contact> getContactsOfUser(Long userId);

}
