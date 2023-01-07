package service.impl;

import model.Clazz;
import service.IClazzService;

import java.util.List;

public class ClazzService implements IClazzService {
    private IClazzService clazzService = new ClazzService();
    @Override
    public List<Clazz> findByAll() {
        return this.clazzService.findByAll();
    }
}
