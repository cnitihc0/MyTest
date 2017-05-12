package com.heye.service.impl;

import com.alibaba.fastjson.JSON;
import com.heye.entity.Response;
import com.heye.entity.User;
import com.heye.service.IServiceTest;
import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.UUID;

/**
 * Created by Administrator on 2017/4/25.
 */
@Component
@Transactional
public class ServiceTestImpl implements IServiceTest {

    private SessionFactory sessionFactory;

    @Override
    public String add(User user) throws Exception {
        Response response = new Response();

        try {
            user.setUserId(UUID.randomUUID().toString());
            Session session = sessionFactory.getCurrentSession();
            session.save(user);

        } catch (Exception e) {
            response.setCode("1");
            response.setMessage("添加用户信息出错");
        }

        return JSON.toJSONString(response);
    }

    @Override
    public String delete(String userId) throws Exception {
        Response response = new Response();

        try {
            Session session = sessionFactory.getCurrentSession();

            String sql = "delete from USER where USER_ID=:userID";

            SQLQuery query = session.createSQLQuery(sql);
            query.setString("userID", userId);

            if (query.executeUpdate() == 0) {
                response.setCode("1");
                response.setMessage("删除失败");
            }

        } catch (Exception e) {
            response.setCode("1");
            response.setMessage("删除用户信息出错");
        }

        return JSON.toJSONString(response);
    }

    @Override
    public String query(String userId, String userName, String realName) throws Exception {

        Response response = new Response();

        try {
            Session session = sessionFactory.getCurrentSession();
            Criteria c = session.createCriteria(User.class);

            if (!StringUtils.isEmpty(userId)) {
                c.add(Restrictions.eq("userId", userId));
            }
            if (!StringUtils.isEmpty(userName)) {
                c.add(Restrictions.eq("userName", userName));
            }
            if (!StringUtils.isEmpty(realName)) {
                c.add(Restrictions.like("realName", realName));
            }

            List<User> list = c.list();

            response.setMessage(JSON.toJSONString(list));
        } catch (Exception e) {
            response.setCode("1");
            response.setMessage("添加用户信息出错");
        }
        return JSON.toJSONString(response);
    }

    @Override
    public String update(String userId, String userName, String realName) throws Exception {
        Response response = new Response();

        try {
            if (StringUtils.isEmpty(userName) || StringUtils.isEmpty(realName)) {
                response.setCode("1");
                response.setMessage("参数不能为空");
                return JSON.toJSONString(response);
            }

            Session session = sessionFactory.getCurrentSession();
            User user = (User) session.get(User.class, userId);

            if (user != null) {
                user.setUserName(userName);
                user.setRealName(realName);
                session.saveOrUpdate(user);
            } else {
                response.setCode("1");
                response.setMessage("找不到用户");
            }

        } catch (Exception e) {
            response.setCode("1");
            response.setMessage("添加用户信息出错");
        }
        return JSON.toJSONString(response);
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    public SessionFactory getSessionFactory() {

        return sessionFactory;
    }
}
