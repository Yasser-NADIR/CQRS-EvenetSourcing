package com.techbank.cqrs.core.handlers;

import com.techbank.cqrs.core.domain.AggregateRoot;

public interface EventSoucingHandler<T> {
    void save(AggregateRoot aggregate);
    T getById(String id);
}
