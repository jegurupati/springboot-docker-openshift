package com.microservice;

import org.quartz.JobDetail;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.Trigger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.quartz.QuartzJobBean;



public class SonarQubeJob extends QuartzJobBean {

    private static final Logger log = LoggerFactory.getLogger(SonarQubeJob.class);

    private String jobName;

    

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

   

    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {

        log.info("Executing the method: " + getClass() + ".executeInternal()");

        JobDetail jobDetail = context.getJobDetail();

        Trigger trigger = context.getTrigger();

        log.info("Current Job Details  : {}", jobDetail);

        log.info("Current Job Trigger : {} ", trigger);

        log.info("Batch job started");


        log.info("Completed process of analysis feed raw data job.");

        log.info("Batch job end");

    }

}
