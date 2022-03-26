package com.casper.sdk.rpc.getpeers

data class GetPeersResult(
    val api_version: String,
    val peers: List<Peer>
)

data class Peer(
    val address: String,
    val node_id: String
)