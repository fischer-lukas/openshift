package ch.nunca.nonie.backend;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@RestController
public class NuncaController {
    static Logger log = Logger.getLogger(NuncaController.class.getName());
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public List<Artefacts> greeting() {
        log.info("Greeting Accessed");
        List<Artefacts> artefacts = new ArrayList<>();
        artefacts.add(new Artefacts(1, "bla", "128 KB"));
        artefacts.add(new Artefacts(2, "bla", "128 MB"));
        return artefacts;
    }

    @RequestMapping("/save")
    public void dropboxAccess(@RequestParam(name="user_name", required=true) String userName,
                              Model model, @RequestParam(name="token", required=true) String token) {
        log.info("User Name: " + userName);
        log.info("Token: " + token);
    }
}
