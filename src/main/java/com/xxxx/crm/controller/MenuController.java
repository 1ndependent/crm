package com.xxxx.crm.controller;

import com.xxxx.crm.base.ResultInfo;
import com.xxxx.crm.po.Menu;
import com.xxxx.crm.service.MenuService;
import com.xxxx.crm.vo.MenuVo;
import com.xxxx.crm.vo.RoleVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("menu")
public class MenuController {

    @Autowired
    private MenuService menuService;

    @RequestMapping("list")
    public ResultInfo selectList(){
        List<Menu> list = menuService.selectList();

        ResultInfo resultInfo = new ResultInfo();
        resultInfo.setCode(200);
        resultInfo.setMsg("菜单");
        resultInfo.setResult(list);
        return resultInfo;
    }

    @RequestMapping("insert")
    public ResultInfo insert(MenuVo vo){
        menuService.insert(vo);
        ResultInfo resultInfo = new ResultInfo();
        return resultInfo;
    }

    @RequestMapping("update")
    public ResultInfo update(MenuVo vo){
        menuService.update(vo);
        ResultInfo resultInfo = new ResultInfo();
        return resultInfo;
    }

    @RequestMapping("delete")
    public ResultInfo delete(MenuVo vo){
        menuService.delete(vo);
        ResultInfo resultInfo = new ResultInfo();
        return resultInfo;
    }

    @RequestMapping("select")
    public ResultInfo select(MenuVo vo){
        List<Menu> list = menuService.select(vo);

        ResultInfo resultInfo = new ResultInfo();
        resultInfo.setCode(200);
        resultInfo.setMsg("菜单");
        resultInfo.setResult(list);
        return resultInfo;
    }

    @RequestMapping("selectbyid")
    public ResultInfo selectbyid(MenuVo vo){
        List<Menu> list = menuService.selectbyid(vo);

        ResultInfo resultInfo = new ResultInfo();
        resultInfo.setCode(200);
        resultInfo.setMsg("菜单");
        resultInfo.setResult(list);
        return resultInfo;
    }

    @RequestMapping("assignroles")
    public ResultInfo assignRoles(String userId,String[] roleIds){
        menuService.assignRoles(userId,roleIds);

        ResultInfo resultInfo = new ResultInfo();
        resultInfo.setCode(200);
        resultInfo.setMsg("成功");
        return resultInfo;
    }

    @RequestMapping("assignmenu")
    public ResultInfo assignMenu(String roleId,String[] menuIds){
        menuService.assignMenu(roleId,menuIds);

        ResultInfo resultInfo = new ResultInfo();
        resultInfo.setCode(200);
        resultInfo.setMsg("成功");
        return resultInfo;
    }

}
