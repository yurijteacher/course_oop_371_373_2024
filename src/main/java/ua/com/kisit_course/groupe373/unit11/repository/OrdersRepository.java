package ua.com.kisit_course.groupe373.unit11.repository;

import ua.com.kisit_course.groupe373.unit11.entity.Orders;

import java.util.List;

public class OrdersRepository implements OrderDao{
    @Override
    public List<Orders> getAll() {
        return List.of();
    }

    @Override
    public Orders getById(long id) {
        return null;
    }

    @Override
    public void save(Orders orders) {

    }

    @Override
    public void delete(Orders orders) {

    }

    @Override
    public void update(Orders orders) {

    }
}
