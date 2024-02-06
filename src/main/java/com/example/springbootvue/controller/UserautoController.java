package com.example.springbootvue.controller;


import com.example.springbootvue.entity.Userauto;
import com.example.springbootvue.service.UserautoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author Anthony
 * @since 2023-03-30
 */
@RestController
@RequestMapping("/userauto")
public class UserautoController {
    @Autowired
    private UserautoService userautoService;

    @GetMapping("/List")
    //
    public List<Userauto> List() {
        return userautoService.list();
    }

    @PostMapping("/save")
    //新增
    public boolean save(@RequestBody Userauto userauto){
        return userautoService.save(userauto);
    }

    @PostMapping("/mod")
    //修改
    public boolean mod(@RequestBody Userauto userauto){
        return userautoService.updateById(userauto);
    }

    //新增或修改
    @PostMapping("/saveOrMod")
    public boolean saveOrMod(@RequestBody Userauto userauto){
        return userautoService.saveOrUpdate(userauto);
    }

    //删除
    @PostMapping("/delete")
    public boolean delete (Integer id){
        return userautoService.removeById(id);
    }


}
