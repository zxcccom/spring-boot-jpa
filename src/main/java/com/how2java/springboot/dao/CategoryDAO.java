package com.how2java.springboot.dao;

import com.how2java.springboot.pojo.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author huwei@huniutech.com
 * @date 2019/02/14 13:53
 */
public interface CategoryDAO extends JpaRepository<Category,Integer> {
}
