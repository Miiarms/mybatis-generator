package com.tydic.cbss.oracle.dao;

import com.tydic.cbss.oracle.po.TfBUserActiveRecord;
import com.tydic.cbss.oracle.po.TfBUserActiveRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
* Created by Mybatis Generator 
* @author legend 
* @date 2019-07-05 14:38:35
*/
@Repository
public interface TfBUserActiveRecordMapper {
    long countByExample(TfBUserActiveRecordExample example);

    int deleteByExample(TfBUserActiveRecordExample example);

    int deleteByPrimaryKey(Long activeRecordId);

    int insert(TfBUserActiveRecord record);

    int insertSelective(TfBUserActiveRecord record);

    List<TfBUserActiveRecord> selectByExample(TfBUserActiveRecordExample example);

    TfBUserActiveRecord selectByPrimaryKey(Long activeRecordId);

    int updateByExampleSelective(@Param("record") TfBUserActiveRecord record, @Param("example") TfBUserActiveRecordExample example);

    int updateByExample(@Param("record") TfBUserActiveRecord record, @Param("example") TfBUserActiveRecordExample example);

    int updateByPrimaryKeySelective(TfBUserActiveRecord record);

    int updateByPrimaryKey(TfBUserActiveRecord record);

    TfBUserActiveRecord selectByExampleOne(TfBUserActiveRecordExample example);
}