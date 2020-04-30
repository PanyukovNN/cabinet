package com.zylex.cabinet.repository;

import com.zylex.cabinet.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepo extends CrudRepository<User, Long> {

    User findByUsername(String tag);
}
