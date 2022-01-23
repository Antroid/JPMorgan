package com.jp.a20220124antonmakovnycschools.repos

import com.jp.a20220124antonmakovnycschools.modules.local.grades.Grades
import com.jp.a20220124antonmakovnycschools.modules.local.grades.GradesItem
import com.jp.a20220124antonmakovnycschools.modules.local.schools.Schools
import com.jp.a20220124antonmakovnycschools.modules.local.schools.SchoolsItem
import com.jp.a20220124antonmakovnycschools.modules.remote.grades.GradesResponse
import com.jp.a20220124antonmakovnycschools.modules.remote.schools.SchoolsResponse
import io.reactivex.Maybe
import io.reactivex.Observable
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class NYCRepo @Inject constructor(
    private var rNYCRepo: RemoteNYCRepo
)
{
    fun getSchools(): Observable<Schools> {
        val singleSchools = rNYCRepo.getSchools().flatMapMaybe { res ->
            Maybe.just(buildSchools(res))
        }
        return singleSchools.toObservable()
    }

    fun getGradesBySchoolName(schoolName: String): Observable<Grades> {
        val singleGrades = rNYCRepo.getGradesBySchoolName(schoolName).flatMapMaybe { res ->
            Maybe.just(buildGrades(res))
        }
        return singleGrades.toObservable()
    }

    private fun buildSchools(res: SchoolsResponse): Schools {
        val schools = Schools()

        for(item in res.schoolsResponse){
            schools.data.add(SchoolsItem(item.schoolName, item.campusName, item.website, item.zip))
        }

        return schools
    }


    private fun buildGrades(res: GradesResponse): Grades {
        val gradesDetails = Grades()
        for(item in res.gradesResponse){
            //might be useful to use item.schoolname for further queries in the future
            gradesDetails.data.add(GradesItem(item.dbn, item.satWritingAvgScore, item.satCriticalReadingAvgScore, item.satMathAvgScore, item.schoolName, item.numOfSatTestTakers))
        }
        return gradesDetails
    }


}