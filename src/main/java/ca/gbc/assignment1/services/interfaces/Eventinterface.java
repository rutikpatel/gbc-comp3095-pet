package ca.gbc.assignment1.services.interfaces;

import ca.gbc.assignment1.models.Event;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/*********************************************************************************
 * Project: Receipe Book
 * Assignment: < assignment #2 >
 * Author(s): Chintan Ghevariya,Rutik Patel
 * Student Number: 101235165,101236361
 * Date: 28th Nov
 * Description: implement Event interface
 *********************************************************************************/


@Repository
public interface Eventinterface extends CrudRepository<Event, Long> {

//    @Query("SELECT event FROM Event event WHERE event.id = :id")
//    Event getEventDataById(@Param("id") Long id);

}
