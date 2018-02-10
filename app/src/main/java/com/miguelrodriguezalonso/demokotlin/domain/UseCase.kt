package com.miguelrodriguezalonso.demokotlin.domain

/**
 * Created by Miguel Rodríguez Alonso on 10/2/18.
 */
interface UseCase<T> {
    
    fun execute(): T
}