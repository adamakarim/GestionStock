package sn.gestionstock.dao;

import java.util.List;

public interface IDao <T> {
    public int add ( T t);
    public  int update(T t);
    public int delete (int id , T t);
    public List<T> getAll(T t);
    public T get(int id , T t);
}
