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
import memento.UrlServiceGrpc.getServiceDescriptor

/**
 * Holder for Kotlin coroutine-based client and server APIs for memento.UrlService.
 */
object UrlServiceGrpcKt {
  const val SERVICE_NAME: String = UrlServiceGrpc.SERVICE_NAME

  @JvmStatic
  val serviceDescriptor: ServiceDescriptor
    get() = UrlServiceGrpc.getServiceDescriptor()

  val listUrlsMethod: MethodDescriptor<Url.ListUrlsRequest, Url.ListUrlsResponse>
    @JvmStatic
    get() = UrlServiceGrpc.getListUrlsMethod()

  val listUrlsByKeywordMethod: MethodDescriptor<Url.ListUrlsByKeywordRequest,
      Url.ListUrlsByKeywordResponse>
    @JvmStatic
    get() = UrlServiceGrpc.getListUrlsByKeywordMethod()

  /**
   * A stub for issuing RPCs to a(n) memento.UrlService service as suspending coroutines.
   */
  @StubFor(UrlServiceGrpc::class)
  class UrlServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT
  ) : AbstractCoroutineStub<UrlServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): UrlServiceCoroutineStub =
        UrlServiceCoroutineStub(channel, callOptions)

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
    suspend fun listUrls(request: Url.ListUrlsRequest, headers: Metadata = Metadata()):
        Url.ListUrlsResponse = unaryRpc(
      channel,
      UrlServiceGrpc.getListUrlsMethod(),
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
    suspend fun listUrlsByKeyword(request: Url.ListUrlsByKeywordRequest, headers: Metadata =
        Metadata()): Url.ListUrlsByKeywordResponse = unaryRpc(
      channel,
      UrlServiceGrpc.getListUrlsByKeywordMethod(),
      request,
      callOptions,
      headers
    )}

  /**
   * Skeletal implementation of the memento.UrlService service based on Kotlin coroutines.
   */
  abstract class UrlServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for memento.UrlService.ListUrls.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun listUrls(request: Url.ListUrlsRequest): Url.ListUrlsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method memento.UrlService.ListUrls is unimplemented"))

    /**
     * Returns the response to an RPC for memento.UrlService.ListUrlsByKeyword.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun listUrlsByKeyword(request: Url.ListUrlsByKeywordRequest):
        Url.ListUrlsByKeywordResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method memento.UrlService.ListUrlsByKeyword is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = UrlServiceGrpc.getListUrlsMethod(),
      implementation = ::listUrls
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = UrlServiceGrpc.getListUrlsByKeywordMethod(),
      implementation = ::listUrlsByKeyword
    )).build()
  }
}
