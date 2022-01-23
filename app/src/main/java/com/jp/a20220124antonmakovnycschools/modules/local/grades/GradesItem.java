package com.jp.a20220124antonmakovnycschools.modules.local.grades;

public class GradesItem{
	private String dbn;
	private String satWritingAvgScore;
	private String satCriticalReadingAvgScore;
	private String satMathAvgScore;
	private String schoolName;
	private String numOfSatTestTakers;

	public GradesItem(String dbn, String satWritingAvgScore, String satCriticalReadingAvgScore, String satMathAvgScore, String schoolName, String numOfSatTestTakers) {
		this.dbn = dbn;
		this.satWritingAvgScore = satWritingAvgScore;
		this.satCriticalReadingAvgScore = satCriticalReadingAvgScore;
		this.satMathAvgScore = satMathAvgScore;
		this.schoolName = schoolName;
		this.numOfSatTestTakers = numOfSatTestTakers;
	}

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
