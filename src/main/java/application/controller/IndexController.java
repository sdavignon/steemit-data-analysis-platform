package application.controller;

import application.model.neo4j.Vote;
import eu.bittrade.libs.steemj.SteemJ;
import eu.bittrade.libs.steemj.exceptions.SteemCommunicationException;
import eu.bittrade.libs.steemj.exceptions.SteemResponseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class IndexController {

    @Autowired
    SteemJ steemJ;

    @RequestMapping("/")
    ModelAndView index(Vote vote, ModelAndView modelAndView) throws SteemResponseException, SteemCommunicationException {
        modelAndView.addObject("hardforkVersion", steemJ.getHardforkVersion());
        modelAndView.setViewName("index");
        return modelAndView;
    }

}