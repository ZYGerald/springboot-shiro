package com.sunyard.job.service;

import com.sunyard.common.service.IService;
import com.sunyard.job.domain.JobLog;

import java.util.List;

public interface JobLogService extends IService<JobLog>{

	List<JobLog> findAllJobLogs(JobLog jobLog);

	void saveJobLog(JobLog log);
	
	void deleteBatch(String jobLogIds);
}
