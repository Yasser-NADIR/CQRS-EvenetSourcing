package com.techbank.account.cmd.api.command;

import com.techbank.cqrs.core.command.BaseCommand;

import lombok.Data;

@Data
public class WithdrawCommand extends BaseCommand{
    private double amount;
}
