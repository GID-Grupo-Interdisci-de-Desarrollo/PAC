package com.gid.puertasAluminioCostaApp.repositories;

import com.gid.puertasAluminioCostaApp.entities.Enterprise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEnterpriseRepository extends JpaRepository<Enterprise, Long> {
}
