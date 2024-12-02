package app.repository;

import app.model.Sport;
import org.springframework.stereotype.Repository;

public interface SportRepository {
    Sport getById(long id);
}
