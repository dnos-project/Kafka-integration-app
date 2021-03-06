/*
 * Copyright 2016-present Open Networking Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.onosproject.kafkaintegration.converter;

import org.onosproject.event.Event;
import org.onosproject.net.packet.PacketContext;


/**
 *
 * APIs for converting between ONOS event objects and protobuf data objects.
 *
 */
public interface EventConverter {

    /**
     * Converts ONOS specific event data to a format that is suitable for export
     * to Kafka.
     *
     * @param event ONOS Event object
     * @return converted data in protobuf format as a byte array.
     */
    default byte[] convertToProtoMessage(Event<?, ?> event) {
        return new byte[0];
    }

    /**
     * Converts ONOS packetContext data to a format that is suitable for export
     * to Kafka.
     * @param context
     * @return converted data in protobuf format as a byte array.
     */
    default byte[] convertToProtoMessage(PacketContext context) {
        return new byte[0];
    }
}
