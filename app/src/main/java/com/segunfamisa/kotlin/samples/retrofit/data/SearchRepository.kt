package com.segunfamisa.kotlin.samples.retrofit.data

import io.reactivex.Observable

/**
 * Repository method to access search functionality of the api service
 */
class SearchRepository(val apiService: GithubApiService) {

    fun searchUsers(location: String, language: String): Observable<Result> {
        return apiService.search(query = "location:$location+language:$language")
    }

}