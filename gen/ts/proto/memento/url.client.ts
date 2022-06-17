// @generated by protobuf-ts 2.7.0 with parameter long_type_number,generate_dependencies
// @generated from protobuf file "memento/url.proto" (package "memento", syntax proto3)
// tslint:disable
import type { RpcTransport } from "@protobuf-ts/runtime-rpc";
import type { ServiceInfo } from "@protobuf-ts/runtime-rpc";
import { UrlService } from "./url";
import type { ListUrlsByKeywordResponse } from "./url";
import type { ListUrlsByKeywordRequest } from "./url";
import { stackIntercept } from "@protobuf-ts/runtime-rpc";
import type { ListUrlsResponse } from "./url";
import type { ListUrlsRequest } from "./url";
import type { UnaryCall } from "@protobuf-ts/runtime-rpc";
import type { RpcOptions } from "@protobuf-ts/runtime-rpc";
/**
 * @generated from protobuf service memento.UrlService
 */
export interface IUrlServiceClient {
    /**
     * @generated from protobuf rpc: ListUrls(memento.ListUrlsRequest) returns (memento.ListUrlsResponse);
     */
    listUrls(input: ListUrlsRequest, options?: RpcOptions): UnaryCall<ListUrlsRequest, ListUrlsResponse>;
    /**
     * @generated from protobuf rpc: ListUrlsByKeyword(memento.ListUrlsByKeywordRequest) returns (memento.ListUrlsByKeywordResponse);
     */
    listUrlsByKeyword(input: ListUrlsByKeywordRequest, options?: RpcOptions): UnaryCall<ListUrlsByKeywordRequest, ListUrlsByKeywordResponse>;
}
/**
 * @generated from protobuf service memento.UrlService
 */
export class UrlServiceClient implements IUrlServiceClient, ServiceInfo {
    typeName = UrlService.typeName;
    methods = UrlService.methods;
    options = UrlService.options;
    constructor(private readonly _transport: RpcTransport) {
    }
    /**
     * @generated from protobuf rpc: ListUrls(memento.ListUrlsRequest) returns (memento.ListUrlsResponse);
     */
    listUrls(input: ListUrlsRequest, options?: RpcOptions): UnaryCall<ListUrlsRequest, ListUrlsResponse> {
        const method = this.methods[0], opt = this._transport.mergeOptions(options);
        return stackIntercept<ListUrlsRequest, ListUrlsResponse>("unary", this._transport, method, opt, input);
    }
    /**
     * @generated from protobuf rpc: ListUrlsByKeyword(memento.ListUrlsByKeywordRequest) returns (memento.ListUrlsByKeywordResponse);
     */
    listUrlsByKeyword(input: ListUrlsByKeywordRequest, options?: RpcOptions): UnaryCall<ListUrlsByKeywordRequest, ListUrlsByKeywordResponse> {
        const method = this.methods[1], opt = this._transport.mergeOptions(options);
        return stackIntercept<ListUrlsByKeywordRequest, ListUrlsByKeywordResponse>("unary", this._transport, method, opt, input);
    }
}