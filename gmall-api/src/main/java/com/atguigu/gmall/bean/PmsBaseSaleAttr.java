package com.atguigu.gmall.bean;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @param
 * @return
 */
@Table(name = "pms_base_sale_attr")
public class PmsBaseSaleAttr implements Serializable {

    @Id
    @Column
    String id ;

    @Column
    String name;

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
}