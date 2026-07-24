package com.work.dscatalog.entities;

import java.io.Serializable;
import java.util.Objects;

public class Category implements Serializable {

    private Long id;
    private  String name;


    public Category() {

    }

    public Category (long id , String name){

        this.id = id;
        this.name = name;

    }

    public long getCategory(){

        return id;
    }

    public void setCategory(long id){
        this.id = id;
    }


    public long getName(){

        return id;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return Objects.equals(id, category.id) && Objects.equals(name, category.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
