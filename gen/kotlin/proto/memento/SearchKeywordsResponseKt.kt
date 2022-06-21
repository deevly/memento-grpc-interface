//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: memento/keyword.proto

package memento;

@kotlin.jvm.JvmName("-initializesearchKeywordsResponse")
public inline fun searchKeywordsResponse(block: memento.SearchKeywordsResponseKt.Dsl.() -> kotlin.Unit): memento.Keyword.SearchKeywordsResponse =
  memento.SearchKeywordsResponseKt.Dsl._create(memento.Keyword.SearchKeywordsResponse.newBuilder()).apply { block() }._build()
public object SearchKeywordsResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: memento.Keyword.SearchKeywordsResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: memento.Keyword.SearchKeywordsResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): memento.Keyword.SearchKeywordsResponse = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class KeywordsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .memento.KeywordResult keywords = 1 [json_name = "keywords"];</code>
     */
     public val keywords: com.google.protobuf.kotlin.DslList<memento.Types.KeywordResult, KeywordsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getKeywordsList()
      )
    /**
     * <code>repeated .memento.KeywordResult keywords = 1 [json_name = "keywords"];</code>
     * @param value The keywords to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addKeywords")
    public fun com.google.protobuf.kotlin.DslList<memento.Types.KeywordResult, KeywordsProxy>.add(value: memento.Types.KeywordResult) {
      _builder.addKeywords(value)
    }
    /**
     * <code>repeated .memento.KeywordResult keywords = 1 [json_name = "keywords"];</code>
     * @param value The keywords to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignKeywords")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<memento.Types.KeywordResult, KeywordsProxy>.plusAssign(value: memento.Types.KeywordResult) {
      add(value)
    }
    /**
     * <code>repeated .memento.KeywordResult keywords = 1 [json_name = "keywords"];</code>
     * @param values The keywords to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllKeywords")
    public fun com.google.protobuf.kotlin.DslList<memento.Types.KeywordResult, KeywordsProxy>.addAll(values: kotlin.collections.Iterable<memento.Types.KeywordResult>) {
      _builder.addAllKeywords(values)
    }
    /**
     * <code>repeated .memento.KeywordResult keywords = 1 [json_name = "keywords"];</code>
     * @param values The keywords to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllKeywords")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<memento.Types.KeywordResult, KeywordsProxy>.plusAssign(values: kotlin.collections.Iterable<memento.Types.KeywordResult>) {
      addAll(values)
    }
    /**
     * <code>repeated .memento.KeywordResult keywords = 1 [json_name = "keywords"];</code>
     * @param index The index to set the value at.
     * @param value The keywords to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setKeywords")
    public operator fun com.google.protobuf.kotlin.DslList<memento.Types.KeywordResult, KeywordsProxy>.set(index: kotlin.Int, value: memento.Types.KeywordResult) {
      _builder.setKeywords(index, value)
    }
    /**
     * <code>repeated .memento.KeywordResult keywords = 1 [json_name = "keywords"];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearKeywords")
    public fun com.google.protobuf.kotlin.DslList<memento.Types.KeywordResult, KeywordsProxy>.clear() {
      _builder.clearKeywords()
    }

  }
}
@kotlin.jvm.JvmSynthetic
public inline fun memento.Keyword.SearchKeywordsResponse.copy(block: memento.SearchKeywordsResponseKt.Dsl.() -> kotlin.Unit): memento.Keyword.SearchKeywordsResponse =
  memento.SearchKeywordsResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()

