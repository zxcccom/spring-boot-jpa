package com.how2java.springboot.dao;

import com.how2java.springboot.pojo.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author huwei@huniutech.com
 * @date 2019/02/14 13:53
 */
public interface CategoryDAO extends JpaRepository<Category,Integer> {
    public List<Category> findByName(String name);

    public List<Category> findByNameLikeAndIdGreaterThanOrderByNameAsc(String name, int id);
}

