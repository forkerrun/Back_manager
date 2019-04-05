package com.zfsh.config;

import org.apache.shiro.cache.ehcache.EhCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Ehcache配置
 * 
 * @author 曾凡生 2317216735@qq.com
 *
 */
@Configuration
public class EhCacheConfig {

	@Bean("ehCacheManager")
	public EhCacheManager cacheManager() {
		EhCacheManager cacheManager = new EhCacheManager();
		cacheManager.setCacheManagerConfigFile("classpath:ehcache.xml");

		return cacheManager;
	}
}
