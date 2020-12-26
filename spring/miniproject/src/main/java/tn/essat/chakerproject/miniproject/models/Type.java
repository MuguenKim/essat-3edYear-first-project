package tn.essat.chakerproject.miniproject.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Type {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String type;

  public Type() {
  }

  public Type(Integer id, String type) {
    this.id = id;
    this.type = type;
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

  public Type id(Integer id) {
    this.id = id;
    return this;
  }

  public Type type(String type) {
    this.type = type;
    return this;
  }

  @Override
  public String toString() {
    return "{" + " id='" + getId() + "'" + ", type='" + getType() + "'" + "}";
  }

}
