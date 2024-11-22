package ua.com.kisit_course.groupe373.unit11.repository;

import ua.com.kisit_course.groupe373.unit11.entity.Clients;

import java.util.List;

public class ClientsRepository implements ClientDao{

    @Override
    public List<Clients> getAll() {
        return List.of();
    }

    @Override
    public Clients getById(long id) {
        return null;
    }

    @Override
    public void save(Clients clients) {

    }

    @Override
    public void delete(Clients clients) {

    }

    @Override
    public void update(Clients clients) {

    }
}
