package app.service;

import app.model.Sport;
import app.repository.SportRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

@Service
@PropertySource("classpath:application.properties")
public class SportServiceImpl implements SportService{
    private SportRepository repository;
    private String defaultCategory;

    public SportServiceImpl(SportRepository repository,@Value("${default.category}") String defaultCategory) {
        this.repository = repository;
        this.defaultCategory = defaultCategory;
    }

    private void setCategory(Sport sport) {
        if(sport.getPopularityIndex() > 7) {
            sport.setCategory("Popular");
        } else {
            sport.setCategory(defaultCategory);
        }

    }

    @Override
    public Sport getSportById(long id) {
        Sport sport = repository.getById(id);
        setCategory(sport);
        return sport;
    }
}
