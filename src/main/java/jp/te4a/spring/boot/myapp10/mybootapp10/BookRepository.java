package jp.te4a.spring.boot.myapp10.mybootapp10;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<BookBean, Integer>{

    void deleteById(Integer id);

    void save(BookBean bookBean);

    Optional<BookBean> findById(Integer id);
}