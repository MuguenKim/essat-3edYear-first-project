package tn.essat.chakerproject.miniproject.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.essat.chakerproject.miniproject.models.Type;

@Repository
public interface ITypeDao extends JpaRepository<Type, Integer> {
  public List<Type> findByType(String type);
}