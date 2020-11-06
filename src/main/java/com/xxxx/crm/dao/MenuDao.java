package com.xxxx.crm.dao;

import com.xxxx.crm.po.Menu;
import com.xxxx.crm.vo.MenuVo;
import com.xxxx.crm.vo.RoleVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MenuDao {
    List<Menu> selectList();

    void insert(MenuVo vo);

    void update(MenuVo vo);

    void delete(MenuVo vo);

    List<Menu> select(MenuVo vo);

    List<Menu> selectbyid(MenuVo vo);

    void assignRolesDel(String userId);

    void assignRolesIns(@Param("userId") String userId, @Param("array") String[] roleIds);

    void assignMenuDel(String roleId);

    void assignMenusIns(@Param("roleId")String roleId,@Param("array") String[] menuIds);
}
