// @generated by protobuf-ts 2.7.0 with parameter long_type_number,generate_dependencies
// @generated from protobuf file "memento/types.proto" (package "memento", syntax proto3)
// tslint:disable
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
import { Timestamp } from "../google/protobuf/timestamp";
/**
 * @generated from protobuf message memento.URL
 */
export interface URL {
    /**
     * @generated from protobuf field: memento.SiteDomain domain = 1;
     */
    domain: SiteDomain;
    /**
     * @generated from protobuf field: string address = 2;
     */
    address: string;
    /**
     * @generated from protobuf field: string keyword = 3;
     */
    keyword: string;
    /**
     * @generated from protobuf field: google.protobuf.Timestamp visit_time = 4;
     */
    visitTime?: Timestamp;
}
/**
 * @generated from protobuf message memento.KeywordResult
 */
export interface KeywordResult {
    /**
     * @generated from protobuf field: string keyword = 1;
     */
    keyword: string;
    /**
     * @generated from protobuf field: int32 count = 2;
     */
    count: number;
}
/**
 * @generated from protobuf message memento.URLCursor
 */
export interface URLCursor {
    /**
     * @generated from protobuf field: memento.URLCursor.SortType type = 1;
     */
    type: URLCursor_SortType;
    /**
     * @generated from protobuf field: string value = 2;
     */
    value: string;
}
/**
 * @generated from protobuf enum memento.URLCursor.SortType
 */
export enum URLCursor_SortType {
    /**
     * @generated from protobuf enum value: RECENT_TIME_ASC = 0;
     */
    RECENT_TIME_ASC = 0,
    /**
     * @generated from protobuf enum value: RECENT_TIME_DESC = 1;
     */
    RECENT_TIME_DESC = 1
}
/**
 * @generated from protobuf message memento.KeywordCursor
 */
export interface KeywordCursor {
    /**
     * @generated from protobuf field: memento.KeywordCursor.SortType type = 1;
     */
    type: KeywordCursor_SortType;
    /**
     * @generated from protobuf field: string date = 2;
     */
    date: string;
}
/**
 * @generated from protobuf enum memento.KeywordCursor.SortType
 */
export enum KeywordCursor_SortType {
    /**
     * @generated from protobuf enum value: URL_COUNT_DESC = 0;
     */
    URL_COUNT_DESC = 0,
    /**
     * @generated from protobuf enum value: ALPHABETICAL_ORDER = 1;
     */
    ALPHABETICAL_ORDER = 1,
    /**
     * @generated from protobuf enum value: VISITED_TIME = 2;
     */
    VISITED_TIME = 2
}
/**
 * @generated from protobuf enum memento.SiteDomain
 */
export enum SiteDomain {
    /**
     * @generated from protobuf enum value: ALL = 0;
     */
    ALL = 0,
    /**
     * @generated from protobuf enum value: STACKOF = 1;
     */
    STACKOF = 1,
    /**
     * @generated from protobuf enum value: GITHUB = 2;
     */
    GITHUB = 2,
    /**
     * @generated from protobuf enum value: OTHERS = 3;
     */
    OTHERS = 3
}
// @generated message type with reflection information, may provide speed optimized methods
class URL$Type extends MessageType<URL> {
    constructor() {
        super("memento.URL", [
            { no: 1, name: "domain", kind: "enum", T: () => ["memento.SiteDomain", SiteDomain] },
            { no: 2, name: "address", kind: "scalar", T: 9 /*ScalarType.STRING*/ },
            { no: 3, name: "keyword", kind: "scalar", T: 9 /*ScalarType.STRING*/ },
            { no: 4, name: "visit_time", kind: "message", T: () => Timestamp }
        ]);
    }
    create(value?: PartialMessage<URL>): URL {
        const message = { domain: 0, address: "", keyword: "" };
        globalThis.Object.defineProperty(message, MESSAGE_TYPE, { enumerable: false, value: this });
        if (value !== undefined)
            reflectionMergePartial<URL>(this, message, value);
        return message;
    }
    internalBinaryRead(reader: IBinaryReader, length: number, options: BinaryReadOptions, target?: URL): URL {
        let message = target ?? this.create(), end = reader.pos + length;
        while (reader.pos < end) {
            let [fieldNo, wireType] = reader.tag();
            switch (fieldNo) {
                case /* memento.SiteDomain domain */ 1:
                    message.domain = reader.int32();
                    break;
                case /* string address */ 2:
                    message.address = reader.string();
                    break;
                case /* string keyword */ 3:
                    message.keyword = reader.string();
                    break;
                case /* google.protobuf.Timestamp visit_time */ 4:
                    message.visitTime = Timestamp.internalBinaryRead(reader, reader.uint32(), options, message.visitTime);
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
    internalBinaryWrite(message: URL, writer: IBinaryWriter, options: BinaryWriteOptions): IBinaryWriter {
        /* memento.SiteDomain domain = 1; */
        if (message.domain !== 0)
            writer.tag(1, WireType.Varint).int32(message.domain);
        /* string address = 2; */
        if (message.address !== "")
            writer.tag(2, WireType.LengthDelimited).string(message.address);
        /* string keyword = 3; */
        if (message.keyword !== "")
            writer.tag(3, WireType.LengthDelimited).string(message.keyword);
        /* google.protobuf.Timestamp visit_time = 4; */
        if (message.visitTime)
            Timestamp.internalBinaryWrite(message.visitTime, writer.tag(4, WireType.LengthDelimited).fork(), options).join();
        let u = options.writeUnknownFields;
        if (u !== false)
            (u == true ? UnknownFieldHandler.onWrite : u)(this.typeName, message, writer);
        return writer;
    }
}
/**
 * @generated MessageType for protobuf message memento.URL
 */
export const URL = new URL$Type();
// @generated message type with reflection information, may provide speed optimized methods
class KeywordResult$Type extends MessageType<KeywordResult> {
    constructor() {
        super("memento.KeywordResult", [
            { no: 1, name: "keyword", kind: "scalar", T: 9 /*ScalarType.STRING*/ },
            { no: 2, name: "count", kind: "scalar", T: 5 /*ScalarType.INT32*/ }
        ]);
    }
    create(value?: PartialMessage<KeywordResult>): KeywordResult {
        const message = { keyword: "", count: 0 };
        globalThis.Object.defineProperty(message, MESSAGE_TYPE, { enumerable: false, value: this });
        if (value !== undefined)
            reflectionMergePartial<KeywordResult>(this, message, value);
        return message;
    }
    internalBinaryRead(reader: IBinaryReader, length: number, options: BinaryReadOptions, target?: KeywordResult): KeywordResult {
        let message = target ?? this.create(), end = reader.pos + length;
        while (reader.pos < end) {
            let [fieldNo, wireType] = reader.tag();
            switch (fieldNo) {
                case /* string keyword */ 1:
                    message.keyword = reader.string();
                    break;
                case /* int32 count */ 2:
                    message.count = reader.int32();
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
    internalBinaryWrite(message: KeywordResult, writer: IBinaryWriter, options: BinaryWriteOptions): IBinaryWriter {
        /* string keyword = 1; */
        if (message.keyword !== "")
            writer.tag(1, WireType.LengthDelimited).string(message.keyword);
        /* int32 count = 2; */
        if (message.count !== 0)
            writer.tag(2, WireType.Varint).int32(message.count);
        let u = options.writeUnknownFields;
        if (u !== false)
            (u == true ? UnknownFieldHandler.onWrite : u)(this.typeName, message, writer);
        return writer;
    }
}
/**
 * @generated MessageType for protobuf message memento.KeywordResult
 */
export const KeywordResult = new KeywordResult$Type();
// @generated message type with reflection information, may provide speed optimized methods
class URLCursor$Type extends MessageType<URLCursor> {
    constructor() {
        super("memento.URLCursor", [
            { no: 1, name: "type", kind: "enum", T: () => ["memento.URLCursor.SortType", URLCursor_SortType] },
            { no: 2, name: "value", kind: "scalar", T: 9 /*ScalarType.STRING*/ }
        ]);
    }
    create(value?: PartialMessage<URLCursor>): URLCursor {
        const message = { type: 0, value: "" };
        globalThis.Object.defineProperty(message, MESSAGE_TYPE, { enumerable: false, value: this });
        if (value !== undefined)
            reflectionMergePartial<URLCursor>(this, message, value);
        return message;
    }
    internalBinaryRead(reader: IBinaryReader, length: number, options: BinaryReadOptions, target?: URLCursor): URLCursor {
        let message = target ?? this.create(), end = reader.pos + length;
        while (reader.pos < end) {
            let [fieldNo, wireType] = reader.tag();
            switch (fieldNo) {
                case /* memento.URLCursor.SortType type */ 1:
                    message.type = reader.int32();
                    break;
                case /* string value */ 2:
                    message.value = reader.string();
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
    internalBinaryWrite(message: URLCursor, writer: IBinaryWriter, options: BinaryWriteOptions): IBinaryWriter {
        /* memento.URLCursor.SortType type = 1; */
        if (message.type !== 0)
            writer.tag(1, WireType.Varint).int32(message.type);
        /* string value = 2; */
        if (message.value !== "")
            writer.tag(2, WireType.LengthDelimited).string(message.value);
        let u = options.writeUnknownFields;
        if (u !== false)
            (u == true ? UnknownFieldHandler.onWrite : u)(this.typeName, message, writer);
        return writer;
    }
}
/**
 * @generated MessageType for protobuf message memento.URLCursor
 */
export const URLCursor = new URLCursor$Type();
// @generated message type with reflection information, may provide speed optimized methods
class KeywordCursor$Type extends MessageType<KeywordCursor> {
    constructor() {
        super("memento.KeywordCursor", [
            { no: 1, name: "type", kind: "enum", T: () => ["memento.KeywordCursor.SortType", KeywordCursor_SortType] },
            { no: 2, name: "date", kind: "scalar", T: 9 /*ScalarType.STRING*/ }
        ]);
    }
    create(value?: PartialMessage<KeywordCursor>): KeywordCursor {
        const message = { type: 0, date: "" };
        globalThis.Object.defineProperty(message, MESSAGE_TYPE, { enumerable: false, value: this });
        if (value !== undefined)
            reflectionMergePartial<KeywordCursor>(this, message, value);
        return message;
    }
    internalBinaryRead(reader: IBinaryReader, length: number, options: BinaryReadOptions, target?: KeywordCursor): KeywordCursor {
        let message = target ?? this.create(), end = reader.pos + length;
        while (reader.pos < end) {
            let [fieldNo, wireType] = reader.tag();
            switch (fieldNo) {
                case /* memento.KeywordCursor.SortType type */ 1:
                    message.type = reader.int32();
                    break;
                case /* string date */ 2:
                    message.date = reader.string();
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
    internalBinaryWrite(message: KeywordCursor, writer: IBinaryWriter, options: BinaryWriteOptions): IBinaryWriter {
        /* memento.KeywordCursor.SortType type = 1; */
        if (message.type !== 0)
            writer.tag(1, WireType.Varint).int32(message.type);
        /* string date = 2; */
        if (message.date !== "")
            writer.tag(2, WireType.LengthDelimited).string(message.date);
        let u = options.writeUnknownFields;
        if (u !== false)
            (u == true ? UnknownFieldHandler.onWrite : u)(this.typeName, message, writer);
        return writer;
    }
}
/**
 * @generated MessageType for protobuf message memento.KeywordCursor
 */
export const KeywordCursor = new KeywordCursor$Type();
