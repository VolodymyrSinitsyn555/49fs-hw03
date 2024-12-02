package app.model;

import java.util.Objects;

public class Sport {
    private long id;
    private String name;
    private int popularityIndex;
    private String category;

    public Sport(long id, String name, int popularityIndex) {
        this.id = id;
        this.name = name;
        this.popularityIndex = popularityIndex;
    }

    @Override
    public String toString() {
        return "Sport{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", popularityIndex=" + popularityIndex +
                ", category='" + category + '\'' +
                '}';
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Sport sport)) return false;

        return id == sport.id && popularityIndex == sport.popularityIndex && Objects.equals(name, sport.name) && Objects.equals(category, sport.category);
    }

    @Override
    public int hashCode() {
        int result = Long.hashCode(id);
        result = 31 * result + Objects.hashCode(name);
        result = 31 * result + popularityIndex;
        result = 31 * result + Objects.hashCode(category);
        return result;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopularityIndex() {
        return popularityIndex;
    }

    public void setPopularityIndex(int popularityIndex) {
        this.popularityIndex = popularityIndex;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
