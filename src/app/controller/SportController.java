package app.controller;

import app.model.Sport;
import app.service.SportService;
import org.springframework.stereotype.Component;

@Component
public class SportController {
    private SportService service;

    public SportController(SportService service) {
        this.service = service;
    }

    public Sport getById(int id) {
        return service.getSportById(id);
    }
}
