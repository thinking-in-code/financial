package com.jts.manager.repositories;

import com.jts.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author jia ting shuai
 * @date 2019/4/25 10:52
 */
public interface ProductRepository extends JpaRepository<Product,String>{

}
