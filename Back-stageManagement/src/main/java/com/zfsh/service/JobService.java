package com.zfsh.service;

import org.quartz.JobDataMap;
import org.quartz.SchedulerException;

import com.zfsh.model.JobModel;

public interface JobService {

	void saveJob(JobModel jobModel);

	void doJob(JobDataMap jobDataMap);

	void deleteJob(Long id) throws SchedulerException;
}
