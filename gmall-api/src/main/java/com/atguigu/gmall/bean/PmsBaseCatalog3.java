package com.atguigu.gmall.bean;


import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "pms_base_catalog3")
public class PmsBaseCatalog3 implements Serializable {

    private String id;
    private String name;
    private String catalog2Id;

    @Override
    public String toString() {
        return "PmsBaseCatalog3{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", catalog2Id='" + catalog2Id + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCatalog2Id() {
        return catalog2Id;
    }

    public void setCatalog2Id(String catalog2Id) {
        this.catalog2Id = catalog2Id;
    }
}
