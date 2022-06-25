// @generated by protobuf-ts 2.7.0 with parameter long_type_number,generate_dependencies
// @generated from protobuf file "memento/url.proto" (package "memento", syntax proto3)
// tslint:disable
import { ServiceType } from "@protobuf-ts/runtime-rpc";
import type { BinaryWriteOptions } from "@protobuf-ts/runtime";
import type { IBinaryWriter } from "@protobuf-ts/runtime";
import { WireType } from "@protobuf-ts/runtime";
import type { BinaryReadOptions } from "@protobuf-ts/runtime";
import type { IBinaryReader } from "@protobuf-ts/runtime";
import { UnknownFieldHandler } from "@protobuf-ts/runtime";
import type { PartialMessage } from "@protobuf-ts/runtime";
import { reflectionMergePartial } from "@protobuf-ts/runtime";
import { MESSAGE_TYPE } from "@protobuf-ts/runtime";
import { MessageType } from "@protobuf-ts/runtime";
import { URLResult } from "./types";
import { URLCursor } from "./types";
import { SiteDomain } from "./types";
/**
 * @generated from protobuf message memento.ListUrlsRequest
 */
export interface ListUrlsRequest {
    /**
     * @generated from protobuf field: string username = 1;
     */
    username: string;
    /**
     * @generated from protobuf field: memento.SiteDomain domain = 2;
     */
    domain: SiteDomain;
    /**
     * @generated from protobuf field: memento.URLCursor cursor = 3;
     */
    cursor?: URLCursor;
}
/**
 * @generated from protobuf message memento.ListUrlsResponse
 */
export interface ListUrlsResponse {
    /**
     * @generated from protobuf field: repeated memento.URLResult urls = 1;
     */
    urls: URLResult[];
    /**
     * @generated from protobuf field: memento.URLCursor cursor = 2;
     */
    cursor?: URLCursor;
}
/**
 * @generated from protobuf message memento.ListUrlsByKeywordRequest
 */
export interface ListUrlsByKeywordRequest {
    /**
     * @generated from protobuf field: string username = 1;
     */
    username: string;
    /**
     * @generated from protobuf field: string keyword = 2;
     */
    keyword: string;
    /**
     * @generated from protobuf field: memento.SiteDomain domain = 3;
     */
    domain: SiteDomain;
    /**
     * @generated from protobuf field: memento.URLCursor cursor = 4;
     */
    cursor?: URLCursor;
}
/**
 * @generated from protobuf message memento.ListUrlsByKeywordResponse
 */
export interface ListUrlsByKeywordResponse {
    /**
     * @generated from protobuf field: repeated memento.URLResult urls = 1;
     */
    urls: URLResult[];
    /**
     * @generated from protobuf field: memento.URLCursor cursor = 2;
     */
    cursor?: URLCursor;
}
// @generated message type with reflection information, may provide speed optimized methods
class ListUrlsRequest$Type extends MessageType<ListUrlsRequest> {
    constructor() {
        super("memento.ListUrlsRequest", [
            { no: 1, name: "username", kind: "scalar", T: 9 /*ScalarType.STRING*/ },
            { no: 2, name: "domain", kind: "enum", T: () => ["memento.SiteDomain", SiteDomain] },
            { no: 3, name: "cursor", kind: "message", T: () => URLCursor }
        ]);
    }
    create(value?: PartialMessage<ListUrlsRequest>): ListUrlsRequest {
        const message = { username: "", domain: 0 };
        globalThis.Object.defineProperty(message, MESSAGE_TYPE, { enumerable: false, value: this });
        if (value !== undefined)
            reflectionMergePartial<ListUrlsRequest>(this, message, value);
        return message;
    }
    internalBinaryRead(reader: IBinaryReader, length: number, options: BinaryReadOptions, target?: ListUrlsRequest): ListUrlsRequest {
        let message = target ?? this.create(), end = reader.pos + length;
        while (reader.pos < end) {
            let [fieldNo, wireType] = reader.tag();
            switch (fieldNo) {
                case /* string username */ 1:
                    message.username = reader.string();
                    break;
                case /* memento.SiteDomain domain */ 2:
                    message.domain = reader.int32();
                    break;
                case /* memento.URLCursor cursor */ 3:
                    message.cursor = URLCursor.internalBinaryRead(reader, reader.uint32(), options, message.cursor);
                    break;
                default:
                    let u = options.readUnknownField;
                    if (u === "throw")
                        throw new globalThis.Error(`Unknown field ${fieldNo} (wire type ${wireType}) for ${this.typeName}`);
                    let d = reader.skip(wireType);
                    if (u !== false)
                        (u === true ? UnknownFieldHandler.onRead : u)(this.typeName, message, fieldNo, wireType, d);
            }
        }
        return message;
    }
    internalBinaryWrite(message: ListUrlsRequest, writer: IBinaryWriter, options: BinaryWriteOptions): IBinaryWriter {
        /* string username = 1; */
        if (message.username !== "")
            writer.tag(1, WireType.LengthDelimited).string(message.username);
        /* memento.SiteDomain domain = 2; */
        if (message.domain !== 0)
            writer.tag(2, WireType.Varint).int32(message.domain);
        /* memento.URLCursor cursor = 3; */
        if (message.cursor)
            URLCursor.internalBinaryWrite(message.cursor, writer.tag(3, WireType.LengthDelimited).fork(), options).join();
        let u = options.writeUnknownFields;
        if (u !== false)
            (u == true ? UnknownFieldHandler.onWrite : u)(this.typeName, message, writer);
        return writer;
    }
}
/**
 * @generated MessageType for protobuf message memento.ListUrlsRequest
 */
export const ListUrlsRequest = new ListUrlsRequest$Type();
// @generated message type with reflection information, may provide speed optimized methods
class ListUrlsResponse$Type extends MessageType<ListUrlsResponse> {
    constructor() {
        super("memento.ListUrlsResponse", [
            { no: 1, name: "urls", kind: "message", repeat: 1 /*RepeatType.PACKED*/, T: () => URLResult },
            { no: 2, name: "cursor", kind: "message", T: () => URLCursor }
        ]);
    }
    create(value?: PartialMessage<ListUrlsResponse>): ListUrlsResponse {
        const message = { urls: [] };
        globalThis.Object.defineProperty(message, MESSAGE_TYPE, { enumerable: false, value: this });
        if (value !== undefined)
            reflectionMergePartial<ListUrlsResponse>(this, message, value);
        return message;
    }
    internalBinaryRead(reader: IBinaryReader, length: number, options: BinaryReadOptions, target?: ListUrlsResponse): ListUrlsResponse {
        let message = target ?? this.create(), end = reader.pos + length;
        while (reader.pos < end) {
            let [fieldNo, wireType] = reader.tag();
            switch (fieldNo) {
                case /* repeated memento.URLResult urls */ 1:
                    message.urls.push(URLResult.internalBinaryRead(reader, reader.uint32(), options));
                    break;
                case /* memento.URLCursor cursor */ 2:
                    message.cursor = URLCursor.internalBinaryRead(reader, reader.uint32(), options, message.cursor);
                    break;
                default:
                    let u = options.readUnknownField;
                    if (u === "throw")
                        throw new globalThis.Error(`Unknown field ${fieldNo} (wire type ${wireType}) for ${this.typeName}`);
                    let d = reader.skip(wireType);
                    if (u !== false)
                        (u === true ? UnknownFieldHandler.onRead : u)(this.typeName, message, fieldNo, wireType, d);
            }
        }
        return message;
    }
    internalBinaryWrite(message: ListUrlsResponse, writer: IBinaryWriter, options: BinaryWriteOptions): IBinaryWriter {
        /* repeated memento.URLResult urls = 1; */
        for (let i = 0; i < message.urls.length; i++)
            URLResult.internalBinaryWrite(message.urls[i], writer.tag(1, WireType.LengthDelimited).fork(), options).join();
        /* memento.URLCursor cursor = 2; */
        if (message.cursor)
            URLCursor.internalBinaryWrite(message.cursor, writer.tag(2, WireType.LengthDelimited).fork(), options).join();
        let u = options.writeUnknownFields;
        if (u !== false)
            (u == true ? UnknownFieldHandler.onWrite : u)(this.typeName, message, writer);
        return writer;
    }
}
/**
 * @generated MessageType for protobuf message memento.ListUrlsResponse
 */
export const ListUrlsResponse = new ListUrlsResponse$Type();
// @generated message type with reflection information, may provide speed optimized methods
class ListUrlsByKeywordRequest$Type extends MessageType<ListUrlsByKeywordRequest> {
    constructor() {
        super("memento.ListUrlsByKeywordRequest", [
            { no: 1, name: "username", kind: "scalar", T: 9 /*ScalarType.STRING*/ },
            { no: 2, name: "keyword", kind: "scalar", T: 9 /*ScalarType.STRING*/ },
            { no: 3, name: "domain", kind: "enum", T: () => ["memento.SiteDomain", SiteDomain] },
            { no: 4, name: "cursor", kind: "message", T: () => URLCursor }
        ]);
    }
    create(value?: PartialMessage<ListUrlsByKeywordRequest>): ListUrlsByKeywordRequest {
        const message = { username: "", keyword: "", domain: 0 };
        globalThis.Object.defineProperty(message, MESSAGE_TYPE, { enumerable: false, value: this });
        if (value !== undefined)
            reflectionMergePartial<ListUrlsByKeywordRequest>(this, message, value);
        return message;
    }
    internalBinaryRead(reader: IBinaryReader, length: number, options: BinaryReadOptions, target?: ListUrlsByKeywordRequest): ListUrlsByKeywordRequest {
        let message = target ?? this.create(), end = reader.pos + length;
        while (reader.pos < end) {
            let [fieldNo, wireType] = reader.tag();
            switch (fieldNo) {
                case /* string username */ 1:
                    message.username = reader.string();
                    break;
                case /* string keyword */ 2:
                    message.keyword = reader.string();
                    break;
                case /* memento.SiteDomain domain */ 3:
                    message.domain = reader.int32();
                    break;
                case /* memento.URLCursor cursor */ 4:
                    message.cursor = URLCursor.internalBinaryRead(reader, reader.uint32(), options, message.cursor);
                    break;
                default:
                    let u = options.readUnknownField;
                    if (u === "throw")
                        throw new globalThis.Error(`Unknown field ${fieldNo} (wire type ${wireType}) for ${this.typeName}`);
                    let d = reader.skip(wireType);
                    if (u !== false)
                        (u === true ? UnknownFieldHandler.onRead : u)(this.typeName, message, fieldNo, wireType, d);
            }
        }
        return message;
    }
    internalBinaryWrite(message: ListUrlsByKeywordRequest, writer: IBinaryWriter, options: BinaryWriteOptions): IBinaryWriter {
        /* string username = 1; */
        if (message.username !== "")
            writer.tag(1, WireType.LengthDelimited).string(message.username);
        /* string keyword = 2; */
        if (message.keyword !== "")
            writer.tag(2, WireType.LengthDelimited).string(message.keyword);
        /* memento.SiteDomain domain = 3; */
        if (message.domain !== 0)
            writer.tag(3, WireType.Varint).int32(message.domain);
        /* memento.URLCursor cursor = 4; */
        if (message.cursor)
            URLCursor.internalBinaryWrite(message.cursor, writer.tag(4, WireType.LengthDelimited).fork(), options).join();
        let u = options.writeUnknownFields;
        if (u !== false)
            (u == true ? UnknownFieldHandler.onWrite : u)(this.typeName, message, writer);
        return writer;
    }
}
/**
 * @generated MessageType for protobuf message memento.ListUrlsByKeywordRequest
 */
export const ListUrlsByKeywordRequest = new ListUrlsByKeywordRequest$Type();
// @generated message type with reflection information, may provide speed optimized methods
class ListUrlsByKeywordResponse$Type extends MessageType<ListUrlsByKeywordResponse> {
    constructor() {
        super("memento.ListUrlsByKeywordResponse", [
            { no: 1, name: "urls", kind: "message", repeat: 1 /*RepeatType.PACKED*/, T: () => URLResult },
            { no: 2, name: "cursor", kind: "message", T: () => URLCursor }
        ]);
    }
    create(value?: PartialMessage<ListUrlsByKeywordResponse>): ListUrlsByKeywordResponse {
        const message = { urls: [] };
        globalThis.Object.defineProperty(message, MESSAGE_TYPE, { enumerable: false, value: this });
        if (value !== undefined)
            reflectionMergePartial<ListUrlsByKeywordResponse>(this, message, value);
        return message;
    }
    internalBinaryRead(reader: IBinaryReader, length: number, options: BinaryReadOptions, target?: ListUrlsByKeywordResponse): ListUrlsByKeywordResponse {
        let message = target ?? this.create(), end = reader.pos + length;
        while (reader.pos < end) {
            let [fieldNo, wireType] = reader.tag();
            switch (fieldNo) {
                case /* repeated memento.URLResult urls */ 1:
                    message.urls.push(URLResult.internalBinaryRead(reader, reader.uint32(), options));
                    break;
                case /* memento.URLCursor cursor */ 2:
                    message.cursor = URLCursor.internalBinaryRead(reader, reader.uint32(), options, message.cursor);
                    break;
                default:
                    let u = options.readUnknownField;
                    if (u === "throw")
                        throw new globalThis.Error(`Unknown field ${fieldNo} (wire type ${wireType}) for ${this.typeName}`);
                    let d = reader.skip(wireType);
                    if (u !== false)
                        (u === true ? UnknownFieldHandler.onRead : u)(this.typeName, message, fieldNo, wireType, d);
            }
        }
        return message;
    }
    internalBinaryWrite(message: ListUrlsByKeywordResponse, writer: IBinaryWriter, options: BinaryWriteOptions): IBinaryWriter {
        /* repeated memento.URLResult urls = 1; */
        for (let i = 0; i < message.urls.length; i++)
            URLResult.internalBinaryWrite(message.urls[i], writer.tag(1, WireType.LengthDelimited).fork(), options).join();
        /* memento.URLCursor cursor = 2; */
        if (message.cursor)
            URLCursor.internalBinaryWrite(message.cursor, writer.tag(2, WireType.LengthDelimited).fork(), options).join();
        let u = options.writeUnknownFields;
        if (u !== false)
            (u == true ? UnknownFieldHandler.onWrite : u)(this.typeName, message, writer);
        return writer;
    }
}
/**
 * @generated MessageType for protobuf message memento.ListUrlsByKeywordResponse
 */
export const ListUrlsByKeywordResponse = new ListUrlsByKeywordResponse$Type();
/**
 * @generated ServiceType for protobuf service memento.UrlService
 */
export const UrlService = new ServiceType("memento.UrlService", [
    { name: "ListUrls", options: {}, I: ListUrlsRequest, O: ListUrlsResponse },
    { name: "ListUrlsByKeyword", options: {}, I: ListUrlsByKeywordRequest, O: ListUrlsByKeywordResponse }
]);
