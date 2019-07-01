package com.sunyard.job.dao;

import com.sunyard.common.config.MyMapper;
import com.sunyard.job.domain.Job;

import java.util.List;

public interface JobMapper extends MyMapper<Job> {
	
	List<Job> queryList();
}