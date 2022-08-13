package com.sukai.mapper;

import com.sukai.entity.SysRole;
import com.sukai.rest.request.QueryWrapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SysRoleMapper {
    int deleteByPrimaryKey(Long roleId);

    int insert(SysRole record);

    int insertSelective(SysRole record);

    SysRole selectByPrimaryKey(Long roleId);

    int updateByPrimaryKeySelective(SysRole record);

    int updateByPrimaryKey(SysRole record);

    List<SysRole> selectBySysRole(QueryWrapper queryWrapper);

    @Select({"select * " +
            "from sys_role " +
            "where role_id = #{id};"})
    SysRole selectById(Long id);
}