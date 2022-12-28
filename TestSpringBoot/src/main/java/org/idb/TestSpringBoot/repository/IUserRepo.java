package org.idb.TestSpringBoot.repository;

import org.idb.TestSpringBoot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepo extends JpaRepository<User, Integer> {

    @Query("select u from User u where u.email = ?1")
    public  User findByEmail(String email);

}
