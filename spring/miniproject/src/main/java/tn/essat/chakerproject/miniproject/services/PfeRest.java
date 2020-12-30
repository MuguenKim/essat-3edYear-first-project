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

import tn.essat.chakerproject.miniproject.dao.IPfeDao;
import tn.essat.chakerproject.miniproject.models.Pfe;

@CrossOrigin("*")
@RestController
@RequestMapping(path = "/rest/pfe")
public class PfeRest {

  @Autowired
  IPfeDao pDao;

  @PostMapping("")
  public Pfe postPfe(@RequestBody Pfe p) {
    return pDao.save(p);
  }

  @GetMapping("")
  public List<Pfe> getAllPfes() {
    return pDao.findAll();
  }

  @GetMapping("/type/{id}")
  public List<Pfe> getPfeByType(@PathVariable("id") int id) {
    return pDao.getByType(id);
  }

  @GetMapping("/title/{t}")
  public List<Pfe> getPfeByTitle(@PathVariable("t") String t) {
    return pDao.getByTitleContains(t);
  }

  @GetMapping("/{id}")
  public Optional<Pfe> getPfe(@PathVariable("id") int id) {
    return pDao.findById(id);
  }

  @DeleteMapping("/{id}")
  public void deletePfe(@PathVariable("id") int id) {
    pDao.deleteById(id);
  }
}
