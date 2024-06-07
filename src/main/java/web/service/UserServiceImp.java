package web.service;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.UserDao;
import web.models.Users;

import java.util.List;

@Service
public class UserServiceImp implements UserService {
    private final UserDao userDao;

    @Autowired
    public UserServiceImp(UserDao userDao) {
        this.userDao = userDao;
    }

    @Transactional
    @Override
    public void creatUser(Users users) {
        userDao.creatUser(users);
    }

    @Transactional
    @Override
    public void updatUser(Users users) {
        userDao.updatUser(users);
    }

    @Override
    public List<Users> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public Users getUserId(Long id) {
        return userDao.getUserId(id);
    }

    @Transactional
    @Override
    public void delUser(Long id) {
        userDao.delUser(id);
    }
}
