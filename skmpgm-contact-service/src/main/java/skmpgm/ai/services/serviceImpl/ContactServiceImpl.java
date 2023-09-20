package skmpgm.ai.services.serviceImpl;

import org.springframework.stereotype.Service;
import skmpgm.ai.entities.Contact;
import skmpgm.ai.services.ContactService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService {

    List<Contact> contactList = List.of(
            new Contact(101L, "rahul@gmail.com", "Rahul", 1211L),
            new Contact(102L, "sonu@gmail.com", "Rahul2", 1211L),
            new Contact(103L, "krishan@gmail.com", "Krishan", 1211L),
            new Contact(104L, "hariom@gmail.com", "Hariom", 1211L)
    );


    @Override
    public List<Contact> getContactsOfUser(Long userId) {
        return contactList.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
