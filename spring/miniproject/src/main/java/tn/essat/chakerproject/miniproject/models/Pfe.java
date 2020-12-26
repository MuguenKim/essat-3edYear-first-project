package tn.essat.chakerproject.miniproject.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Pfe {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String title;
  @ManyToOne
  @JoinColumn(name = "type_id")
  private Type type;

  public Pfe() {
  }

  public Pfe(Integer id, String title, Type type) {
    this.id = id;
    this.title = title;
    this.type = type;
  }

  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Type getType() {
    return this.type;
  }

  public void setType(Type type) {
    this.type = type;
  }

  public Pfe id(Integer id) {
    this.id = id;
    return this;
  }

  public Pfe title(String title) {
    this.title = title;
    return this;
  }

  public Pfe type(Type type) {
    this.type = type;
    return this;
  }

  @Override
  public String toString() {
    return "{" + " id='" + getId() + "'" + ", title='" + getTitle() + "'" + ", type='" + getType() + "'" + "}";
  }

}
