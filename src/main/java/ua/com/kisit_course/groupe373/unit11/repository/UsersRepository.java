package ua.com.kisit_course.groupe373.unit11.repository;

import ua.com.kisit_course.groupe373.unit11.entity.Users;

import java.util.List;

public class UsersRepository implements UsersDao{

    @Override
    public List<Users> getAll() {
        return List.of();
    }

    @Override
    public Users getById(long id) {
        return null;
    }

    @Override
    public void save(Users users) {

    }

    @Override
    public void delete(Users users) {

    }

    @Override
    public void update(Users users) {

    }
}
