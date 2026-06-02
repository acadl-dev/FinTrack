package com.acadl.fintrack.transaction.repository;

import com.acadl.fintrack.transaction.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository
        extends JpaRepository<Transaction, Long> {
}
