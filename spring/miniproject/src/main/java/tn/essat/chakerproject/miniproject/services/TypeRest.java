package tn.essat.chakerproject.miniproject.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.essat.chakerproject.miniproject.dao.ITypeDao;
import tn.essat.chakerproject.miniproject.models.Type;

@CrossOrigin("*")
@RestController
@RequestMapping(path = "/rest/type")
public class TypeRest {

  @Autowired
  ITypeDao tDao;

  @PostMapping("")
  public Type postType(@RequestBody Type t) {
    return tDao.save(t);
  }

  @GetMapping("")
  public List<Type> getAllTypes() {
    return tDao.findAll();
  }

  @GetMapping("/name/{type}")
  public List<Type> getTypeByTypes(@PathVariable("type") String type) {
    return tDao.findByType(type);
  }

  @GetMapping("/{id}")
  public Optional<Type> getType(@PathVariable("id") int id) {
    return tDao.findById(id);
  }

  @DeleteMapping("/{id}")
  public void deleteType(@PathVariable("id") int id) {
    tDao.deleteById(id);
  }
}
