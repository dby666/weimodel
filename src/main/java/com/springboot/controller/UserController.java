package com.springboot.controller;


import com.springboot.model.TdUserEntity;
import com.springboot.dao.TduserDao;
import com.springboot.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
//@RequestMapping("/user")
public class UserController {

    @Autowired
    private TduserDao userDao;

    @Autowired
    private RedisService redisService;

    @GetMapping("/{id}")
    public TdUserEntity findbById(@PathVariable String id){
        TdUserEntity findOne = this.userDao.findOne(id);
        return findOne;
    }


    @RequestMapping(value="/hello/{id}/{name}",method= RequestMethod.GET)
    public String sayHello(@PathVariable("id") Integer id,@PathVariable("name") String name){
        return "id:"+id+" name:"+name;
    }

    @GetMapping("/demo/{value}")
    public String setRedis(@PathVariable String value){
        boolean bool = this.redisService.set("number",value);
        String values = "null";
        if(bool){
          values =  this.redisService.get("number").toString();
        }
        return values;
    }
}
