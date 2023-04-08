package com.biswajit.beans;

import org.springframework.stereotype.Repository;

@Repository
public class OracleDBReportDao implements ReportDao {

	@Override
	public void getData() {
		System.out.println("Getting data from Oracle db....");		
		
		
	}

}
