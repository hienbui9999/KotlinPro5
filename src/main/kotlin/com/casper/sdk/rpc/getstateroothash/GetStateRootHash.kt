package com.casper.sdk.rpc.getstateroothash
import java.net.URI
import java.net.URLEncoder
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse

class GetStateRootHash {
    var methodName:String = "chain_get_state_root_hash"
    var casperURLTestNet:String = "https://node-clarity-testnet.make.services/rpc";
    fun getStateRootHash() :String {
        val values = mapOf("id" to "1", "method" to "chain_get_state_root_hash", "jsonrpc" to "2.0","params" to "[]")

        val client = HttpClient.newBuilder().build();
        val request = HttpRequest.newBuilder()
            .uri(URI.create(this.casperURLTestNet))
            .POST(formData(values))
            .header("Content-Type", "application/json")
            .build()
        val response = client.send(request, HttpResponse.BodyHandlers.ofString());
        println(response.body())
        //About to parse the body back
        return response.body()
    }
    fun String.utf8(): String = URLEncoder.encode(this, "UTF-8")
    fun formData(data: Map<String, String>): HttpRequest.BodyPublisher? {

        var res = data.map {(k, v) -> "\"${k}\":\"${v}\""}
            .joinToString(",")
        res = "{" + res + "}"
        println(res)
        return HttpRequest.BodyPublishers.ofString(res)
    }
}