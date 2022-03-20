package ca.gbc.assignment1.controllers;
import ca.gbc.assignment1.models.Event;
import ca.gbc.assignment1.models.User;
import ca.gbc.assignment1.services.maps.EventService;
import ca.gbc.assignment1.services.maps.UserMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
/*********************************************************************************
 * Project: Receipe Book
 * Assignment: < assignment #2 >
 * Author(s): Chintan Ghevariya,Rutik Patel
 * Student Number: 101235165, 101236361
 * Date: 3rd Oct-5th nov
 * Description: implement Event controller
 *********************************************************************************/
@Controller
public class EventController {

    @Autowired
    UserMap userService;

    @Autowired
    EventService eventService;

    @GetMapping({"/events"})
    public String getEvents(HttpServletRequest request, Model model) {
        Long userId = (Long) request.getSession().getAttribute("userId");
        User user = userService.getById(userId).get();
        List<Event> events = user.getEvents();
        model.addAttribute("events", events);
        return "event/list";
    }

    @GetMapping({"/events/new"})
    public String getForm(Model model) {
        Event event = new Event();
        model.addAttribute("event", event);
        return "event/form";
    }

    @PostMapping({"/events/new"})
    public String postForm(Model model, @ModelAttribute Event event, HttpServletRequest request) {
        Long userId = (Long) request.getSession().getAttribute("userId");
        User user = userService.getById(userId).get();
        event.setUser(user);
        eventService.save(event);
        model.addAttribute("event", event);
        return "event/form";
    }

    @GetMapping("/events/{eventId}/edit")
    public String getEditEvent(@PathVariable Long id, @PathVariable Long eventId, HttpServletRequest request, Model model) {
        Long userId = (Long) request.getSession().getAttribute("userId");
        boolean isLoggedIn = userId != null;
        if (!isLoggedIn) {
            return "redirect:/login";
        }
        Event event = eventService.findById(eventId);
         model.addAttribute("event", event);
        model.addAttribute("eventId", eventId);
//        model.addAttribute("actionUrl", "/events/" + eventId + "/edit");
        return "event/form";

    }
    @PostMapping("/events/{eventId}/edit")
    public String postEditEvent(
            @PathVariable Long id, @PathVariable Long eventId,
            HttpServletRequest request,
            @ModelAttribute Event event, Model model) {
        Long userId = (Long) request.getSession().getAttribute("userId");
        boolean isLoggedIn = userId != null;
        if (!isLoggedIn) {
            return "redirect:/login";
        }
        eventService.save(event);
        return "redirect:/events/" + eventId;
    }
    @GetMapping("events/{eventId}")
    public String getEventDetails(@PathVariable Long id, @PathVariable Long eventId, HttpServletRequest request, Model model) {
        Long userId = (Long) request.getSession().getAttribute("userId");
        boolean isLoggedIn = userId != null;
        if (!isLoggedIn) {
            return "redirect:/login";
        }
        Event event = eventService.findById(eventId);
        model.addAttribute("event", event);
        model.addAttribute("userId", userId);
        return "events/list";
    }

    @PostMapping("/events/{eventId}/delete")
    public String postEventDelete(@PathVariable Long id, @PathVariable Long eventId, HttpServletRequest request) {
        Long userId = (Long) request.getSession().getAttribute("userId");
        boolean isLoggedIn = userId != null;
        if (!isLoggedIn) {
            return "redirect:/login";
        }
        Event event = eventService.findById(eventId);
        eventService.delete(event);
        return "event/list";
    }
}
