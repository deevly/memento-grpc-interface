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
import memento.KeywordServiceGrpc.getServiceDescriptor

/**
 * Holder for Kotlin coroutine-based client and server APIs for memento.KeywordService.
 */
object KeywordServiceGrpcKt {
  const val SERVICE_NAME: String = KeywordServiceGrpc.SERVICE_NAME

  @JvmStatic
  val serviceDescriptor: ServiceDescriptor
    get() = KeywordServiceGrpc.getServiceDescriptor()

  val listKeywordsMethod: MethodDescriptor<Keyword.ListKeywordsRequest,
      Keyword.ListKeywordsResponse>
    @JvmStatic
    get() = KeywordServiceGrpc.getListKeywordsMethod()

  val searchKeywordsMethod: MethodDescriptor<Keyword.SearchKeywordsRequest,
      Keyword.SearchKeywordsResponse>
    @JvmStatic
    get() = KeywordServiceGrpc.getSearchKeywordsMethod()

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
    suspend fun listKeywords(request: Keyword.ListKeywordsRequest, headers: Metadata = Metadata()):
        Keyword.ListKeywordsResponse = unaryRpc(
      channel,
      KeywordServiceGrpc.getListKeywordsMethod(),
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
    suspend fun searchKeywords(request: Keyword.SearchKeywordsRequest, headers: Metadata =
        Metadata()): Keyword.SearchKeywordsResponse = unaryRpc(
      channel,
      KeywordServiceGrpc.getSearchKeywordsMethod(),
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
     * Returns the response to an RPC for memento.KeywordService.ListKeywords.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun listKeywords(request: Keyword.ListKeywordsRequest):
        Keyword.ListKeywordsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method memento.KeywordService.ListKeywords is unimplemented"))

    /**
     * Returns the response to an RPC for memento.KeywordService.SearchKeywords.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun searchKeywords(request: Keyword.SearchKeywordsRequest):
        Keyword.SearchKeywordsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method memento.KeywordService.SearchKeywords is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = KeywordServiceGrpc.getListKeywordsMethod(),
      implementation = ::listKeywords
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = KeywordServiceGrpc.getSearchKeywordsMethod(),
      implementation = ::searchKeywords
    )).build()
  }
}
