// @generated by protobuf-ts 2.7.0 with parameter long_type_number,generate_dependencies
// @generated from protobuf file "memento/keyword.proto" (package "memento", syntax proto3)
// tslint:disable
import type { RpcTransport } from "@protobuf-ts/runtime-rpc";
import type { ServiceInfo } from "@protobuf-ts/runtime-rpc";
import { KeywordService } from "./keyword";
import type { SearchKeywordsResponse } from "./keyword";
import type { SearchKeywordsRequest } from "./keyword";
import { stackIntercept } from "@protobuf-ts/runtime-rpc";
import type { ListKeywordsResponse } from "./keyword";
import type { ListKeywordsRequest } from "./keyword";
import type { UnaryCall } from "@protobuf-ts/runtime-rpc";
import type { RpcOptions } from "@protobuf-ts/runtime-rpc";
/**
 * @generated from protobuf service memento.KeywordService
 */
export interface IKeywordServiceClient {
    /**
     * @generated from protobuf rpc: ListKeywords(memento.ListKeywordsRequest) returns (memento.ListKeywordsResponse);
     */
    listKeywords(input: ListKeywordsRequest, options?: RpcOptions): UnaryCall<ListKeywordsRequest, ListKeywordsResponse>;
    /**
     * @generated from protobuf rpc: SearchKeywords(memento.SearchKeywordsRequest) returns (memento.SearchKeywordsResponse);
     */
    searchKeywords(input: SearchKeywordsRequest, options?: RpcOptions): UnaryCall<SearchKeywordsRequest, SearchKeywordsResponse>;
}
/**
 * @generated from protobuf service memento.KeywordService
 */
export class KeywordServiceClient implements IKeywordServiceClient, ServiceInfo {
    typeName = KeywordService.typeName;
    methods = KeywordService.methods;
    options = KeywordService.options;
    constructor(private readonly _transport: RpcTransport) {
    }
    /**
     * @generated from protobuf rpc: ListKeywords(memento.ListKeywordsRequest) returns (memento.ListKeywordsResponse);
     */
    listKeywords(input: ListKeywordsRequest, options?: RpcOptions): UnaryCall<ListKeywordsRequest, ListKeywordsResponse> {
        const method = this.methods[0], opt = this._transport.mergeOptions(options);
        return stackIntercept<ListKeywordsRequest, ListKeywordsResponse>("unary", this._transport, method, opt, input);
    }
    /**
     * @generated from protobuf rpc: SearchKeywords(memento.SearchKeywordsRequest) returns (memento.SearchKeywordsResponse);
     */
    searchKeywords(input: SearchKeywordsRequest, options?: RpcOptions): UnaryCall<SearchKeywordsRequest, SearchKeywordsResponse> {
        const method = this.methods[1], opt = this._transport.mergeOptions(options);
        return stackIntercept<SearchKeywordsRequest, SearchKeywordsResponse>("unary", this._transport, method, opt, input);
    }
}
