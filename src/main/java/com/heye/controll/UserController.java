package com.heye.controll;

import com.heye.entity.User;
import com.heye.service.IServiceTest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/4/25.
 */
@RestController
public class UserController {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Resource
    IServiceTest serviceTest;

    @RequestMapping(method = RequestMethod.POST, value="/saveUser")
    public String saveUser(
            @RequestParam(value="userName")String userName,
            @RequestParam(value="realName", required=false)String realName
    ) throws Exception {

        User user = new User(null, userName, realName);

        return serviceTest.add(user);
    }

    @RequestMapping(method = RequestMethod.GET, value="/listUser")
    public String listUser(
            @RequestParam(value="userId", required=false)String userId,
            @RequestParam(value="userName", required=false)String userName,
            @RequestParam(value="realName", required=false)String realName
    ) throws Exception {
        return serviceTest.query(userId, userName, realName);
    }

    @RequestMapping(method = RequestMethod.GET, value="/deleteUser")
    public String deleteUser(@RequestParam(value="userId")String userId) throws Exception {
        return serviceTest.delete(userId);
    }

    @RequestMapping(method = RequestMethod.GET, value="/updateUser")
    public String updateUser(@RequestParam(value="userId")String userId,
                             @RequestParam(value="userName", required=false)String userName,
                             @RequestParam(value="realName", required=false)String realName) throws Exception {
        return serviceTest.update(userId, userName, realName);
    }

    public void setServiceTest(IServiceTest serviceTest) {
        this.serviceTest = serviceTest;
    }
}
