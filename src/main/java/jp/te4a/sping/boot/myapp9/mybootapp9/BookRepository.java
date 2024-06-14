package jp.te4a.sping.boot.myapp9.mybootapp9;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<BookBean, Integer>{
}