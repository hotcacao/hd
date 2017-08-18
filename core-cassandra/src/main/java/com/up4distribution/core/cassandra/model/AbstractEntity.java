package com.up4distribution.core.cassandra.model;

import java.util.UUID;

public abstract class AbstractEntity extends com.up4distribution.core.model.AbstractEntity<UUID> {
    protected UUID uuid;

    public UUID getId() {
        return uuid;
    }

    public String getIdValue() {
        return uuid == null ? null : uuid.toString();
    }
}
