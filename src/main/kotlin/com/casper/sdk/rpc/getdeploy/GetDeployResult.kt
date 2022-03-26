package com.casper.sdk.rpc.getdeploy

data class GetDeployResult(
    val api_version: String,
    val deploy: Deploy,
    val execution_results: List<ExecutionResult>
)


data class Deploy(
    val approvals: List<Approval>,
    val hash: String,
    val header: Header,
    val payment: Payment,
    val session: Session
)

data class ExecutionResult(
    val block_hash: String,
    val result: ResultX
)

data class Approval(
    val signature: String,
    val signer: String
)

data class Header(
    val account: String,
    val body_hash: String,
    val chain_name: String,
    val dependencies: List<Any>,
    val gas_price: Int,
    val timestamp: String,
    val ttl: String
)

data class Payment(
    val ModuleBytes: ModuleBytes
)

data class Session(
    val StoredContractByHash: StoredContractByHash
)

data class ModuleBytes(
    val args: List<List<Any>>,
    val module_bytes: String
)

data class StoredContractByHash(
    val args: List<List<Any>>,
    val entry_point: String,
    val hash: String
)

data class ResultX(
    val Failure: Failure
)

data class Failure(
    val cost: String,
    val effect: Effect,
    val error_message: String,
    val transfers: List<Any>
)

data class Effect(
    val operations: List<Any>,
    val transforms: List<Transform>
)

data class Transform(
    val key: String,
    val transform: Any
)