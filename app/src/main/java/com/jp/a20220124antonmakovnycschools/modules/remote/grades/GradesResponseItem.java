package com.jp.a20220124antonmakovnycschools.modules.remote.grades;

import com.google.gson.annotations.SerializedName;

public class GradesResponseItem{

	@SerializedName("dbn")
	private String dbn;

	@SerializedName("sat_writing_avg_score")
	private String satWritingAvgScore;

	@SerializedName("sat_critical_reading_avg_score")
	private String satCriticalReadingAvgScore;

	@SerializedName("sat_math_avg_score")
	private String satMathAvgScore;

	@SerializedName("school_name")
	private String schoolName;

	@SerializedName("num_of_sat_test_takers")
	private String numOfSatTestTakers;

	public String getDbn(){
		return dbn;
	}

	public String getSatWritingAvgScore(){
		return satWritingAvgScore;
	}

	public String getSatCriticalReadingAvgScore(){
		return satCriticalReadingAvgScore;
	}

	public String getSatMathAvgScore(){
		return satMathAvgScore;
	}

	public String getSchoolName(){
		return schoolName;
	}

	public String getNumOfSatTestTakers(){
		return numOfSatTestTakers;
	}
}