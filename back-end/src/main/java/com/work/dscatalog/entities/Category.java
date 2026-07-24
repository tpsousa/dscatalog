package com.work.dscatalog.entities;

import java.io.Serializable;
import java.util.Objects;

public class Category implements Serializable {

    private Long id;
    private String name;

    public Category(){

    }

    public Category(long id , String name){
        this.id = id;
        this.name=  name;
    }

    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

    public String getNome(){
        return name;
    }

    public void setName(){
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return Objects.equals(id, category.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
