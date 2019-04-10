package com.squareup.backfila.client

import com.squareup.protos.backfila.clientservice.GetNextBatchRangeRequest
import com.squareup.protos.backfila.clientservice.GetNextBatchRangeResponse
import com.squareup.protos.backfila.clientservice.PrepareBackfillRequest
import com.squareup.protos.backfila.clientservice.PrepareBackfillResponse
import com.squareup.protos.backfila.clientservice.RunBatchRequest
import com.squareup.protos.backfila.clientservice.RunBatchResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

// Methods implemented by the client service library that backfila calls out to.
interface BackfilaClientServiceSquareDcApi {
  @POST("/prepare_backfill")
  @Headers(value = [
    "Accept: application/x-protobuf",
    "Content-Type: application/x-protobuf"
  ])
  fun prepareBackfill(
    @Body request: PrepareBackfillRequest
  ): Call<PrepareBackfillResponse>

  @POST("/get_next_batch_range")
  @Headers(value = [
    "Accept: application/x-protobuf",
    "Content-Type: application/x-protobuf"
  ])
  fun getNextBatchRange(
    @Body request: GetNextBatchRangeRequest
  ): Call<GetNextBatchRangeResponse>

  @POST("/run_batch")
  @Headers(value = [
    "Accept: application/x-protobuf",
    "Content-Type: application/x-protobuf"
  ])
  fun runBatch(
    @Body request: RunBatchRequest
  ): Call<RunBatchResponse>


  // TODO figure out if we're using service container routing or plain http or grpc
  companion object {
    private const val BASE_PATH = "/services/squareup.backfila.clientservice.BackfilaClientService"
  }
}