package com.cyt.product.mapper;

import com.cyt.product.entity.Product;
import org.apache.ibatis.annotations.Param;

public interface ProductMapper {
  Product getProduct(@Param("id") String id);

  void insert();
}
