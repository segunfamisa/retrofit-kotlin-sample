package com.segunfamisa.kotlin.samples.retrofit.data


object SearchRepositoryProvider {

    fun provideSearchRepository(): SearchRepository {
        return SearchRepository(GithubApiService.create())
    }

}