package com.techbank.account.cmd.api.command;

import com.techbank.cqrs.core.commands.BaseCommand;

import lombok.Data;

@Data
public class DepositFundsCommand extends BaseCommand{
    private double amout;
}
