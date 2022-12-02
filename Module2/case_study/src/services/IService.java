package services;

import java.util.List;

public interface IService<O> {
     List<O> getList();

     void addElement(O o);

     void returnToMenu();

}
