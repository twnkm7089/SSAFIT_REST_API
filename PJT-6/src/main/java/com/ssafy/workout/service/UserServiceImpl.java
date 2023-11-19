package com.ssafy.workout.service;

import java.util.List;

import com.ssafy.workout.dao.UserDao;
import com.ssafy.workout.dto.Review;
import com.ssafy.workout.dto.Video;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.workout.dao.UserDao;
import com.ssafy.workout.dto.User;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    public List<User> selectAllUsers() {
        return userDao.selectAllUsers();
    }

    @Transactional
    @Override
    public int signup(User user) {
        return userDao.insertUser(user);
    }

    @Override
    public User login(User user) {
        return userDao.login(user);
    }

    @Override
    public User getUserInfo(int userId) {
        return userDao.selectOne(userId);
    }
}
