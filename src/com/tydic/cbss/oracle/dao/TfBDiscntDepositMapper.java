package com.tydic.cbss.oracle.dao;

import com.tydic.cbss.oracle.po.TfBDiscntDeposit;
import com.tydic.cbss.oracle.po.TfBDiscntDepositExample;
import com.tydic.cbss.oracle.po.TfBDiscntDepositKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
* Created by Mybatis Generator 
* @author legend 
* @date 2019-07-05 14:38:35
*/
@Repository
public interface TfBDiscntDepositMapper {
    long countByExample(TfBDiscntDepositExample example);

    int deleteByExample(TfBDiscntDepositExample example);

    int deleteByPrimaryKey(TfBDiscntDepositKey key);

    int insert(TfBDiscntDeposit record);

    int insertSelective(TfBDiscntDeposit record);

    List<TfBDiscntDeposit> selectByExample(TfBDiscntDepositExample example);

    TfBDiscntDeposit selectByPrimaryKey(TfBDiscntDepositKey key);

    int updateByExampleSelective(@Param("record") TfBDiscntDeposit record, @Param("example") TfBDiscntDepositExample example);

    int updateByExample(@Param("record") TfBDiscntDeposit record, @Param("example") TfBDiscntDepositExample example);

    int updateByPrimaryKeySelective(TfBDiscntDeposit record);

    int updateByPrimaryKey(TfBDiscntDeposit record);

    TfBDiscntDeposit selectByExampleOne(TfBDiscntDepositExample example);
}