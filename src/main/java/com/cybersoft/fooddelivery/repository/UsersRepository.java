package com.cybersoft.fooddelivery.repository;

import com.cybersoft.fooddelivery.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface UsersRepository extends JpaRepository<User, Integer> {
    List<User> findByEmail(String email);

    List<User> findByEmailAndPassword(String email, String password);

    //Câu query sẽ tương tác entity và biến của entity
//    @Query("select e from users e where e.email = ?1 and e.password = ?2")
//    List<Users> getUsersByEmailPassword(String email, String password) ;

    @Query("select e from users e where e.email = :email and e.password = :password")
    List<User> getUsersByEmailPassword(@Param("email") String email,@Param("password") String password) ;


    @Query("from users u join roles r on u.roles.id = r.id")
    List<User> getRoleUser() ;

    @Query(value = "select * from users u join roles r on u.role_id = r.id", nativeQuery = true) // tương tác với bảng sql
    List<Map<?, Object>> getRoleUserJoin() ;
}
