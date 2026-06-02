package com.acadl.fintrack.transaction.dto;

import com.acadl.fintrack.transaction.model.TransactionType;

import java.math.BigDecimal;
import java.time.LocalDate;

public record TransactionCreateDTO(
        String description,
        BigDecimal amount,
        TransactionType type,
        String category,
        LocalDate transactionDate
) {}