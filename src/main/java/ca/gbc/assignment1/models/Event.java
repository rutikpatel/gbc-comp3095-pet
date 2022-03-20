package ca.gbc.assignment1.models;

import javax.persistence.*;

@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String eventName, eventDescription;

    @ManyToOne
    private User user;

    public Long getId() {
        return id;
    }

    public String getEventDescription() {
        return eventDescription;
    }
    public String getEventName() {
        return eventName;
    }

    public User getUser() {
        return user;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
