//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: memento/keyword.proto

package memento;

@kotlin.jvm.JvmName("-initializelistKeywordsRequest")
public inline fun listKeywordsRequest(block: memento.ListKeywordsRequestKt.Dsl.() -> kotlin.Unit): memento.Keyword.ListKeywordsRequest =
  memento.ListKeywordsRequestKt.Dsl._create(memento.Keyword.ListKeywordsRequest.newBuilder()).apply { block() }._build()
public object ListKeywordsRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: memento.Keyword.ListKeywordsRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: memento.Keyword.ListKeywordsRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): memento.Keyword.ListKeywordsRequest = _builder.build()

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
     * <code>.memento.KeywordCursor cursor = 2 [json_name = "cursor"];</code>
     */
    public var cursor: memento.Types.KeywordCursor
      @JvmName("getCursor")
      get() = _builder.getCursor()
      @JvmName("setCursor")
      set(value) {
        _builder.setCursor(value)
      }
    /**
     * <code>.memento.KeywordCursor cursor = 2 [json_name = "cursor"];</code>
     */
    public fun clearCursor() {
      _builder.clearCursor()
    }
    /**
     * <code>.memento.KeywordCursor cursor = 2 [json_name = "cursor"];</code>
     * @return Whether the cursor field is set.
     */
    public fun hasCursor(): kotlin.Boolean {
      return _builder.hasCursor()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun memento.Keyword.ListKeywordsRequest.copy(block: memento.ListKeywordsRequestKt.Dsl.() -> kotlin.Unit): memento.Keyword.ListKeywordsRequest =
  memento.ListKeywordsRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

val memento.Keyword.ListKeywordsRequestOrBuilder.cursorOrNull: memento.Types.KeywordCursor?
  get() = if (hasCursor()) getCursor() else null

