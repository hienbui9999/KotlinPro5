package com.casper.sdk.rpc.getstateroothash

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class GetStateRootHashTest {
    private  val getStateRootHash:GetStateRootHash = GetStateRootHash()
    @Test
    fun getStateRootHash() {
        println("Hello world!")
        var response:String = getStateRootHash.getStateRootHash()
        //assertEquals(response.length, 32)
        println("Response is:" + response)
        assert(response.length>0)
    }
}