package data.repositories;

import data.models.Resident;

import java.util.ArrayList;
import java.util.List;

public class Residents implements ResidentRepo {
    private  List<Resident> residents = new ArrayList<>();



    @Override
    public List<Resident> findAll() {
        return new ArrayList<>(residents);
    }

    @Override
    public Resident findById(int id) {
        for(Resident resident: residents){
            if(resident.getId() == id){
                return resident;
            }
        }
        return null;
    }

    @Override
    public Resident save(Resident resident) {

        return null;
    }

    @Override
    public void delete(Resident resident) {
        residents.remove(resident);
    }

    @Override
    public void deleteById(int id) {
        Resident resident = findById(id);
        if(resident != null){
            residents.remove(resident);
        }
    }

    @Override
    public void deleteByObject(Resident resident) {
        delete(resident);
    }

    @Override
    public void deleteAll() {
        residents.clear();
    }
}
