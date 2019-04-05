package com.zfsh.service;

import org.apache.shiro.authc.UsernamePasswordToken;

import com.zfsh.dto.Token;
import com.zfsh.service.impl.EhCacheTokenManager;
import com.zfsh.service.impl.RedisTokenManager;

/**
 * Token管理器<br>
 * 目前提供两种实现<br>
 * 默认基于ehcache，修改使用@Primary注解
 * 
 * @see EhCacheTokenManager
 * @see RedisTokenManager
 * 
 * @author 曾凡生 2317216735@qq.com
 *
 */
public interface TokenManager {

	/**
	 * 保存Token
	 * 
	 * @param token
	 * @return
	 */
	Token saveToken(UsernamePasswordToken token);

	/**
	 * 根据token获取凭证
	 * 
	 * @param key
	 * @return
	 */
	UsernamePasswordToken getToken(String key);

	/**
	 * 删除token
	 * 
	 * @param key
	 */
	boolean deleteToken(String key);

}
