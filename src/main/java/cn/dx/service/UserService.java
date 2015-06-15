package cn.dx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import cn.dx.dao.GradeDao;
import cn.dx.model.User;

public interface UserService {

    List<User> getUserByUserName(String username);

}
