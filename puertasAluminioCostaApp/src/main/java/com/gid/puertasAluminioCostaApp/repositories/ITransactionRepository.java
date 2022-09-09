package com.gid.puertasAluminioCostaApp.repositories;

import com.gid.puertasAluminioCostaApp.entities.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITransactionRepository extends JpaRepository<Transaction, Long> {

}
