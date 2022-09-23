package com.gid.puertasAluminioCostaApp.repositories;

import com.gid.puertasAluminioCostaApp.entities.Enterprise;
import com.gid.puertasAluminioCostaApp.entities.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ITransactionRepository extends JpaRepository<Transaction, Long> {
    public List<Transaction> findAllByEnterprise(Enterprise enterprise);

}
