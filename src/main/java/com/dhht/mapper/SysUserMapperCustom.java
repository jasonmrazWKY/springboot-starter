package com.dhht.mapper;

import java.util.List;

import com.dhht.pojo.SysUser;


public interface SysUserMapperCustom {
	
	List<SysUser> queryUserSimplyInfoById(String id);
}