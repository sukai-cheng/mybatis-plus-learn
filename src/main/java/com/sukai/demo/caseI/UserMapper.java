package com.sukai.demo.caseI;

import com.sukai.entity.SysRole;

import java.util.List;

/**
 * @author chengsukai
 * @since 2022-08-12 17:18
 */
public interface UserMapper {
    List<SysRole> selectAll();
}
