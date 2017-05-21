package com.segunfamisa.kotlin.samples.retrofit.data.kotlin


object SearchRepositoryProvider {

    fun provideSearchRepository(): SearchRepository {
        return SearchRepository(GithubApiService.Factory.create())
    }

}