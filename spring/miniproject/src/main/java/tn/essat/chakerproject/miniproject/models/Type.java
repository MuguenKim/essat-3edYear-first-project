package tn.essat.chakerproject.miniproject.models;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Type {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String type;

  @OneToMany(mappedBy = "type")
  private Set<Pfe> pfes;

  public Type() {
  }

  public Type(Integer id, String type, Set<Pfe> pfes) {
    this.id = id;
    this.type = type;
    this.pfes = pfes;
  }

  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Set<Pfe> getPfes() {
    return this.pfes;
  }

  public void setPfes(Set<Pfe> pfes) {
    this.pfes = pfes;
  }

  public Type id(Integer id) {
    this.id = id;
    return this;
  }

  public Type type(String type) {
    this.type = type;
    return this;
  }

  public Type pfes(Set<Pfe> pfes) {
    this.pfes = pfes;
    return this;
  }

  @Override
  public String toString() {
    return "{" + " id='" + getId() + "'" + ", type='" + getType() + "'" + ", pfes='" + getPfes() + "'" + "}";
  }

}
