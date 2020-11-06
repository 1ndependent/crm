package com.xxxx.crm.po;

import lombok.Data;

import java.util.List;

@Data
public class Menu {

    private int id;
    private String menuName;
    private int pid;

    private List<Menu> list;
}
