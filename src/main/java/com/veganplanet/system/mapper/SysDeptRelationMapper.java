package com.veganplanet.system.mapper;

import com.veganplanet.system.entity.SysDeptRelation;
import com.veganplanet.system.entity.SysDeptRelationExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface SysDeptRelationMapper {
    int countByExample(SysDeptRelationExample example);

    int deleteByExample(SysDeptRelationExample example);

    int deleteByPrimaryKey(@Param("ancestor") Integer ancestor, @Param("descendant") Integer descendant);

    int insert(SysDeptRelation record);

    int insertSelective(SysDeptRelation record);

    List<SysDeptRelation> selectByExample(SysDeptRelationExample example);

    int updateByExampleSelective(@Param("record") SysDeptRelation record, @Param("example") SysDeptRelationExample example);

    int updateByExample(@Param("record") SysDeptRelation record, @Param("example") SysDeptRelationExample example);
}