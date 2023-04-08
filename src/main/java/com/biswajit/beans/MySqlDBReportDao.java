package com.biswajit.beans;

import org.springframework.stereotype.Repository;

@Repository("mysqlDao")
public class MySqlDBReportDao implements ReportDao {

	@Override
	public void getData() {
		System.out.println("Getting data from MySql db....");

		
		
		
		
	}

}
