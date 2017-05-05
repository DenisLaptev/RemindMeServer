package ua.a5.remindme.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.a5.remindme.server.entity.Remind;
import ua.a5.remindme.server.service.ReminderService;

import java.util.Date;
import java.util.List;

@RestController
public class ReminderController {

    @Autowired
    private ReminderService service;

    /*
    @Autowired
    private RemindRepository remindRepository;
    */

    /*
    private Remind createMockRemind() {
        Remind remind = new Remind();
        remind.setId(1);
        remind.setRemindDate(new Date());
        remind.setTitle("My first remind");
        return remind;
    }
    */

    @RequestMapping(value = "/reminders", method = RequestMethod.GET)
    @ResponseBody
    public List<Remind> getAllReminders() {
        List<Remind> list = service.getAll();
        //return createMockRemind();
        return list;
    }

    @RequestMapping(value = "/reminders/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Remind getReminder(@PathVariable("id") long remindID) {
        //return createMockRemind();
        return service.getByID(remindID);
    }


    @RequestMapping(value = "/reminders", method = RequestMethod.POST)
    @ResponseBody
    public Remind saveReminder(@RequestBody Remind remind) {
        return service.save(remind);
    }

    @RequestMapping(value = "/reminders/{id}", method = RequestMethod.POST)
    @ResponseBody
    public void deleteReminder(@PathVariable("id") long remindID) {
        //return createMockRemind();
        service.remove(remindID);
    }
}