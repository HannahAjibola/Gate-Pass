package data.repositories;

import data.models.Visitor;

import java.util.List;

public class Visitors implements VisitorRepo{

    @Override
    public List<Visitor> findAll() {
        return List.of();
    }

    @Override
    public Visitor findById(int id) {
        return null;
    }

    @Override
    public Visitor save(Visitor visitor) {
        return null;
    }

    @Override
    public void delete(Visitor visitor) {

    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public void deleteByObject(Visitor visitor) {

    }

    @Override
    public void deleteAll() {

    }
}
