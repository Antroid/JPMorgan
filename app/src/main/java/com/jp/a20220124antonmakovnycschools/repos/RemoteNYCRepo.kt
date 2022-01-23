package com.jp.a20220124antonmakovnycschools.repos

import com.jp.a20220124antonmakovnycschools.modules.remote.grades.GradesResponse
import com.jp.a20220124antonmakovnycschools.modules.remote.schools.SchoolsResponse
import com.jp.a20220124antonmakovnycschools.services.NYCSchoolService
import io.reactivex.Single
import javax.inject.Inject

class RemoteNYCRepo@Inject constructor(private var nycSchoolsService: NYCSchoolService)
{
    fun getSchools(): Single<SchoolsResponse> {
        return nycSchoolsService.getSchoolsResponse()
    }

    fun getGradesBySchoolName(schoolName: String): Single<GradesResponse> {
        return nycSchoolsService.getGradesBySchoolName(schoolName)
    }

}