package com.jp.a20220124antonmakovnycschools.services

import com.jp.a20220124antonmakovnycschools.modules.remote.grades.GradesResponse
import com.jp.a20220124antonmakovnycschools.modules.remote.schools.SchoolsResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface NYCSchoolService {

    //we can add more parameters to filter the results depending on user's selection
    @GET("/resource/s3k6-pzi2.json")
    fun getSchoolsResponse(): Single<SchoolsResponse>

    @GET("/resource/f9bf-2cp4.json")
    fun getGradesBySchoolName(@Query("school_name") schoolName: String) : Single<GradesResponse>

}