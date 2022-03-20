package ca.gbc.assignment1.services.maps;

import ca.gbc.assignment1.models.Event;
import ca.gbc.assignment1.services.interfaces.Eventinterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*********************************************************************************
 * Project: Receipe Book
 * Assignment: < assignment #2 >
 * Author(s): Rutik Patel
 * Student Number: 101235165
 * Date: 5th nov
 * Description: implement save delete and findbyId method for CRUD operation
 *********************************************************************************/

@Service
public class EventService {
    
    @Autowired
    Eventinterface eventRepo;
    
    public void save(Event event) {
        eventRepo.save(event);
    }
    
    public void delete(Event event) {
        eventRepo.delete(event);
    }
    
    public Event findById(Long id) {
        Event event =eventRepo.findById(id).get();
        return event;
    }
    
}
