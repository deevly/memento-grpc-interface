package memento

import io.grpc.CallOptions
import io.grpc.CallOptions.DEFAULT
import io.grpc.Channel
import io.grpc.Metadata
import io.grpc.MethodDescriptor
import io.grpc.ServerServiceDefinition
import io.grpc.ServerServiceDefinition.builder
import io.grpc.ServiceDescriptor
import io.grpc.Status
import io.grpc.Status.UNIMPLEMENTED
import io.grpc.StatusException
import io.grpc.kotlin.AbstractCoroutineServerImpl
import io.grpc.kotlin.AbstractCoroutineStub
import io.grpc.kotlin.ClientCalls
import io.grpc.kotlin.ClientCalls.unaryRpc
import io.grpc.kotlin.ServerCalls
import io.grpc.kotlin.ServerCalls.unaryServerMethodDefinition
import io.grpc.kotlin.StubFor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic
import memento.HistoryServiceGrpc.getServiceDescriptor

/**
 * Holder for Kotlin coroutine-based client and server APIs for memento.HistoryService.
 */
object HistoryServiceGrpcKt {
  const val SERVICE_NAME: String = HistoryServiceGrpc.SERVICE_NAME

  @JvmStatic
  val serviceDescriptor: ServiceDescriptor
    get() = HistoryServiceGrpc.getServiceDescriptor()

  val listHistoriesMethod: MethodDescriptor<History.ListHitoriesRequest,
      History.ListHistoriesResponse>
    @JvmStatic
    get() = HistoryServiceGrpc.getListHistoriesMethod()

  val listKeywordsMethod: MethodDescriptor<History.ListKeywordsRequest,
      History.ListKeywordsResponse>
    @JvmStatic
    get() = HistoryServiceGrpc.getListKeywordsMethod()

  /**
   * A stub for issuing RPCs to a(n) memento.HistoryService service as suspending coroutines.
   */
  @StubFor(HistoryServiceGrpc::class)
  class HistoryServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT
  ) : AbstractCoroutineStub<HistoryServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): HistoryServiceCoroutineStub =
        HistoryServiceCoroutineStub(channel, callOptions)

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    suspend fun listHistories(request: History.ListHitoriesRequest, headers: Metadata = Metadata()):
        History.ListHistoriesResponse = unaryRpc(
      channel,
      HistoryServiceGrpc.getListHistoriesMethod(),
      request,
      callOptions,
      headers
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    suspend fun listKeywords(request: History.ListKeywordsRequest, headers: Metadata = Metadata()):
        History.ListKeywordsResponse = unaryRpc(
      channel,
      HistoryServiceGrpc.getListKeywordsMethod(),
      request,
      callOptions,
      headers
    )}

  /**
   * Skeletal implementation of the memento.HistoryService service based on Kotlin coroutines.
   */
  abstract class HistoryServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for memento.HistoryService.ListHistories.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun listHistories(request: History.ListHitoriesRequest):
        History.ListHistoriesResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method memento.HistoryService.ListHistories is unimplemented"))

    /**
     * Returns the response to an RPC for memento.HistoryService.ListKeywords.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun listKeywords(request: History.ListKeywordsRequest):
        History.ListKeywordsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method memento.HistoryService.ListKeywords is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = HistoryServiceGrpc.getListHistoriesMethod(),
      implementation = ::listHistories
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = HistoryServiceGrpc.getListKeywordsMethod(),
      implementation = ::listKeywords
    )).build()
  }
}
