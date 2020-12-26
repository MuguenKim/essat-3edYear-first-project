package tn.essat.chakerproject.miniproject.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import tn.essat.chakerproject.miniproject.models.Pfe;

@Repository
public interface IPfeDao extends JpaRepository<Pfe, Integer> {
  @Query("select p from Pfe p where p.type.id=?1")
  public List<Pfe> getByType(int id);

  public List<Pfe> getByTitleContains(String title);

}
