package com.heye.service;

import com.heye.entity.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Administrator on 2017/4/25.
 */

public interface IServiceTest {
    public String add(User user) throws Exception;
    public String delete(String userId) throws Exception;
    public String query(String userId, String userName, String readName) throws Exception;
    public String update(String userId, String userName, String readName) throws Exception;
}
