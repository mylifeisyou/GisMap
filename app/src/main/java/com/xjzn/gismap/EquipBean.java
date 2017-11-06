package com.xjzn.gismap;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/11/6 0006.
 */

public class EquipBean extends DataSupport{

    /**
     * type : 发电设备
     * name : 逆变器
     * id : 1001
     * East : 113.868
     * North : 34.098
     */

    private String type;
    private String name;
    private String id;
    private String East;
    private String North;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEast() {
        return East;
    }

    public void setEast(String East) {
        this.East = East;
    }

    public String getNorth() {
        return North;
    }

    public void setNorth(String North) {
        this.North = North;
    }
}
