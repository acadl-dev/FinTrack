package com.acadl.fintrack.transaction.controller;

import com.acadl.fintrack.transaction.dto.TransactionCreateDTO;
import com.acadl.fintrack.transaction.service.TransactionService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("transaction")
public class TransactionController {
    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @PostMapping
    public String addTransaction(@RequestBody TransactionCreateDTO transactionCreateDTO){
        transactionService.addTransactionToBD(transactionCreateDTO);
        return "Transação adicionada com sucesso!";

    }
}
