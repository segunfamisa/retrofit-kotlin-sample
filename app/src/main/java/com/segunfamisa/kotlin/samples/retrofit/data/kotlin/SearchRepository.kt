package com.segunfamisa.kotlin.samples.retrofit.data.kotlin

/**
 * Repository method to access search functionality of the api service
 */
class SearchRepository(val apiService: GithubApiService) {

    fun searchUsers(location: String, language: String): io.reactivex.Observable<Result> {
        return apiService.search(query = "location:$location language:$language")
    }

}