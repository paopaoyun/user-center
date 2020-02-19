package com.color.usercenter.dao.bonus;

import com.color.usercenter.domain.entity.BonusEventLog;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface BonusEventLogMapper extends Mapper<BonusEventLog> {
}