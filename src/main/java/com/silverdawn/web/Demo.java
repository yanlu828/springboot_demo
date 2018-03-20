package com.silverdawn.web;

import com.silverdawn.domain.User;
import com.silverdawn.service.UserService;
import com.silverdawn.vo.ResultVo;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("demo")
public class Demo {

    @Autowired
    UserService userService;

    @ApiOperation(value="test1", notes="测试1")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Integer", paramType = "path")
    @RequestMapping(value = "test/{id}",method = RequestMethod.GET)
    public ResultVo test1(@PathVariable(value = "id") Integer id){
        User user = userService.getUserByName(id);
        return new ResultVo("","",user);
    }

    @ApiOperation(value="test2", notes="测试2")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "String")
    @RequestMapping(value = "test",method = RequestMethod.POST)
    public ResultVo test2(@RequestBody String id){
        return new ResultVo();
    }

    @ApiOperation(value="test3", notes="测试3")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long", paramType = "path")
    @RequestMapping(value = "test/{id}",method = RequestMethod.DELETE)
    public ResultVo test3(@PathVariable(value = "id") String id){
        return new ResultVo();
    }

    @ApiOperation(value="test4", notes="测试4")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Integer", paramType = "path")
    @RequestMapping(value = "test/{id}",method = RequestMethod.PUT)
    public ResultVo test4(@PathVariable(value = "id") String id){
        return new ResultVo();
    }
}
