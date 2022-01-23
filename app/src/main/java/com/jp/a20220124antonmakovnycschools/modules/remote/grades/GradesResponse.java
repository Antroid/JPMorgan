package com.jp.a20220124antonmakovnycschools.modules.remote.grades;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class GradesResponse{

	@SerializedName("GradesResponse")
	private List<GradesResponseItem> gradesResponse;

	public List<GradesResponseItem> getGradesResponse(){
		return gradesResponse;
	}
}