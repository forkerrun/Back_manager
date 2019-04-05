package com.zfsh.service;

import com.zfsh.model.SysLogs;

/**
 * 日志service
 * 
 * @author 曾凡生 2317216735@qq.com
 *
 */
public interface SysLogService {

	void save(SysLogs sysLogs);

	void save(Long userId, String module, Boolean flag, String remark);

	void deleteLogs();
}
