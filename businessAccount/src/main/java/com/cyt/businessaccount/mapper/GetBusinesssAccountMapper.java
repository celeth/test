package com.cyt.businessaccount.mapper;

import com.cyt.businessaccount.entity.BusinessAccount;
import org.apache.ibatis.annotations.Param;

public interface GetBusinesssAccountMapper {
  BusinessAccount getProduct(@Param("id") String id);

  void insert();
}
