package com.techbank.account.common.events;

import com.techbank.cqrs.core.events.BaseEvent;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data @NoArgsConstructor @AllArgsConstructor //@SuperBUilder
public class FundsWithdrawEvent extends BaseEvent{
    private double amount;
}
