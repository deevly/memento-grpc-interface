package memento

import com.google.protobuf.Empty
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
import memento.KeywordServiceGrpc.getServiceDescriptor

/**
 * Holder for Kotlin coroutine-based client and server APIs for memento.KeywordService.
 */
object KeywordServiceGrpcKt {
  const val SERVICE_NAME: String = KeywordServiceGrpc.SERVICE_NAME

  @JvmStatic
  val serviceDescriptor: ServiceDescriptor
    get() = KeywordServiceGrpc.getServiceDescriptor()

  val listKeywordHistoriesMethod: MethodDescriptor<Keyword.ListKeywordHistoriesRequest,
      Keyword.ListKeywordHistoriesResponse>
    @JvmStatic
    get() = KeywordServiceGrpc.getListKeywordHistoriesMethod()

  val updateSolutionURLMethod: MethodDescriptor<Keyword.UpdateSolutionURLRequest, Empty>
    @JvmStatic
    get() = KeywordServiceGrpc.getUpdateSolutionURLMethod()

  val updateResolvedURLMethod: MethodDescriptor<Keyword.UpdateResolvedURLRequest, Empty>
    @JvmStatic
    get() = KeywordServiceGrpc.getUpdateResolvedURLMethod()

  /**
   * A stub for issuing RPCs to a(n) memento.KeywordService service as suspending coroutines.
   */
  @StubFor(KeywordServiceGrpc::class)
  class KeywordServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT
  ) : AbstractCoroutineStub<KeywordServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): KeywordServiceCoroutineStub =
        KeywordServiceCoroutineStub(channel, callOptions)

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
    suspend fun listKeywordHistories(request: Keyword.ListKeywordHistoriesRequest, headers: Metadata
        = Metadata()): Keyword.ListKeywordHistoriesResponse = unaryRpc(
      channel,
      KeywordServiceGrpc.getListKeywordHistoriesMethod(),
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
    suspend fun updateSolutionURL(request: Keyword.UpdateSolutionURLRequest, headers: Metadata =
        Metadata()): Empty = unaryRpc(
      channel,
      KeywordServiceGrpc.getUpdateSolutionURLMethod(),
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
    suspend fun updateResolvedURL(request: Keyword.UpdateResolvedURLRequest, headers: Metadata =
        Metadata()): Empty = unaryRpc(
      channel,
      KeywordServiceGrpc.getUpdateResolvedURLMethod(),
      request,
      callOptions,
      headers
    )}

  /**
   * Skeletal implementation of the memento.KeywordService service based on Kotlin coroutines.
   */
  abstract class KeywordServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for memento.KeywordService.ListKeywordHistories.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun listKeywordHistories(request: Keyword.ListKeywordHistoriesRequest):
        Keyword.ListKeywordHistoriesResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method memento.KeywordService.ListKeywordHistories is unimplemented"))

    /**
     * Returns the response to an RPC for memento.KeywordService.UpdateSolutionURL.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun updateSolutionURL(request: Keyword.UpdateSolutionURLRequest): Empty = throw
        StatusException(UNIMPLEMENTED.withDescription("Method memento.KeywordService.UpdateSolutionURL is unimplemented"))

    /**
     * Returns the response to an RPC for memento.KeywordService.UpdateResolvedURL.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun updateResolvedURL(request: Keyword.UpdateResolvedURLRequest): Empty = throw
        StatusException(UNIMPLEMENTED.withDescription("Method memento.KeywordService.UpdateResolvedURL is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = KeywordServiceGrpc.getListKeywordHistoriesMethod(),
      implementation = ::listKeywordHistories
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = KeywordServiceGrpc.getUpdateSolutionURLMethod(),
      implementation = ::updateSolutionURL
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = KeywordServiceGrpc.getUpdateResolvedURLMethod(),
      implementation = ::updateResolvedURL
    )).build()
  }
}
