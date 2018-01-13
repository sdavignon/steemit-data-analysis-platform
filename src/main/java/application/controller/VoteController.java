package application.controller;

import application.model.json.Vote;
import application.service.MongoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

@RestController
public class VoteController {

    @Autowired
    MongoService mongoService;

    private static final String template = "Hello, %s!";

    @RequestMapping("/api/vote/all")
    public List<application.model.mongodb.AccountOperations.Vote> greeting(@RequestParam(value="name", defaultValue="World") String name) {
        Calendar calendar = GregorianCalendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH, -1);

        return mongoService.getVotes(calendar);
    }
}
