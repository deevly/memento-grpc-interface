//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: memento/url.proto

package memento;

@kotlin.jvm.JvmName("-initializelistUrlsByKeywordRequest")
public inline fun listUrlsByKeywordRequest(block: memento.ListUrlsByKeywordRequestKt.Dsl.() -> kotlin.Unit): memento.Url.ListUrlsByKeywordRequest =
  memento.ListUrlsByKeywordRequestKt.Dsl._create(memento.Url.ListUrlsByKeywordRequest.newBuilder()).apply { block() }._build()
public object ListUrlsByKeywordRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: memento.Url.ListUrlsByKeywordRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: memento.Url.ListUrlsByKeywordRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): memento.Url.ListUrlsByKeywordRequest = _builder.build()

    /**
     * <code>string username = 1 [json_name = "username"];</code>
     */
    public var username: kotlin.String
      @JvmName("getUsername")
      get() = _builder.getUsername()
      @JvmName("setUsername")
      set(value) {
        _builder.setUsername(value)
      }
    /**
     * <code>string username = 1 [json_name = "username"];</code>
     */
    public fun clearUsername() {
      _builder.clearUsername()
    }

    /**
     * <code>string keyword = 2 [json_name = "keyword"];</code>
     */
    public var keyword: kotlin.String
      @JvmName("getKeyword")
      get() = _builder.getKeyword()
      @JvmName("setKeyword")
      set(value) {
        _builder.setKeyword(value)
      }
    /**
     * <code>string keyword = 2 [json_name = "keyword"];</code>
     */
    public fun clearKeyword() {
      _builder.clearKeyword()
    }

    /**
     * <code>.memento.SiteDomain domain = 3 [json_name = "domain"];</code>
     */
    public var domain: memento.Types.SiteDomain
      @JvmName("getDomain")
      get() = _builder.getDomain()
      @JvmName("setDomain")
      set(value) {
        _builder.setDomain(value)
      }
    /**
     * <code>.memento.SiteDomain domain = 3 [json_name = "domain"];</code>
     */
    public fun clearDomain() {
      _builder.clearDomain()
    }

    /**
     * <code>.memento.URLCursor cursor = 4 [json_name = "cursor"];</code>
     */
    public var cursor: memento.Types.URLCursor
      @JvmName("getCursor")
      get() = _builder.getCursor()
      @JvmName("setCursor")
      set(value) {
        _builder.setCursor(value)
      }
    /**
     * <code>.memento.URLCursor cursor = 4 [json_name = "cursor"];</code>
     */
    public fun clearCursor() {
      _builder.clearCursor()
    }
    /**
     * <code>.memento.URLCursor cursor = 4 [json_name = "cursor"];</code>
     * @return Whether the cursor field is set.
     */
    public fun hasCursor(): kotlin.Boolean {
      return _builder.hasCursor()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun memento.Url.ListUrlsByKeywordRequest.copy(block: memento.ListUrlsByKeywordRequestKt.Dsl.() -> kotlin.Unit): memento.Url.ListUrlsByKeywordRequest =
  memento.ListUrlsByKeywordRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

val memento.Url.ListUrlsByKeywordRequestOrBuilder.cursorOrNull: memento.Types.URLCursor?
  get() = if (hasCursor()) getCursor() else null

