package com.jp.a20220124antonmakovnycschools.modules.remote.schools;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class SchoolsResponse{

	@SerializedName("SchoolsResponse")
	private List<SchoolsResponseItem> schoolsResponse;

	public List<SchoolsResponseItem> getSchoolsResponse(){
		return schoolsResponse;
	}
}