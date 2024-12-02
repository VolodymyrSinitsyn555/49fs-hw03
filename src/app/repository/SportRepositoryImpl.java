package app.repository;

import app.model.Sport;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class SportRepositoryImpl implements SportRepository {

    private Map<Long, Sport> sports = new HashMap<>();

    public SportRepositoryImpl() {
        initData();
    }

    private void initData() {
        sports.put(1L, new Sport(1L, "Football", 10));
        sports.put(2L, new Sport(2L, "Tennis", 8));
        sports.put(3L, new Sport(3L, "Swimming", 6));
    }

    @Override
    public Sport getById(long id) {
        return sports.get(id);
    }
}
