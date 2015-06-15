package cn.dx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import cn.dx.dao.UserDao;
import cn.dx.model.User;
import cn.dx.service.UserService;

@Service("UserService")
public class UserServiceImpl implements UserService {

    @Autowired
    @Qualifier("UserDao")
    private UserDao userDao;

    // @Override
    // public List<User> getUserByUserName(String username) {
    // return this.userDao.findByUserName(username);
    // }

    /*
     * (non-Javadoc)
     * @see cn.dx.service.UserService#getUserByUserName(java.lang.String)
     */
    @Override
    public List<User> getUserByUserName(String username) {
        // TODO Auto-generated method stub
        return null;
    }
}
