package com.xxxx.crm.service;

import com.xxxx.crm.po.Menu;
import com.xxxx.crm.vo.MenuVo;
import com.xxxx.crm.vo.RoleVo;

import java.util.List;

public interface MenuService {
    List<Menu> selectList();

    void insert(MenuVo vo);

    void update(MenuVo vo);

    void delete(MenuVo vo);

    List<Menu> select(MenuVo vo);

    List<Menu> selectbyid(MenuVo vo);

    void assignRoles(String userId,String[] roleIds);

    void assignMenu(String roleId, String[] menuIds);
}
