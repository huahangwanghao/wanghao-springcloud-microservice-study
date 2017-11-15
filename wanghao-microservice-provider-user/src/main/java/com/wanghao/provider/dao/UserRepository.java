package com.wanghao.provider.dao;

import com.wanghao.provider.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2017/11/13.
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
