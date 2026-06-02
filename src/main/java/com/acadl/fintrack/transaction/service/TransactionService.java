package com.acadl.fintrack.transaction.service;

import com.acadl.fintrack.transaction.dto.TransactionCreateDTO;
import com.acadl.fintrack.transaction.model.Transaction;
import com.acadl.fintrack.transaction.repository.TransactionRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;


@Service
public class TransactionService {
    private final TransactionRepository repository;

    public TransactionService(TransactionRepository repository) {
        this.repository = repository;
    }

    public void addTransactionToBD(TransactionCreateDTO transactionCreateDTO){
        Transaction transaction = new Transaction();

        transaction.setDescription(transactionCreateDTO.description());
        transaction.setAmount(transactionCreateDTO.amount());
        transaction.setType(transactionCreateDTO.type());
        transaction.setCategory(transactionCreateDTO.category());
        transaction.setTransactionDate(transactionCreateDTO.transactionDate());

        transaction.setDeleted(false);
        transaction.setCreatedAt(LocalDateTime.now());
        transaction.setUpdatedAt(LocalDateTime.now());

        repository.save(transaction);
        System.out.println("Deu rock!");

    }

}














