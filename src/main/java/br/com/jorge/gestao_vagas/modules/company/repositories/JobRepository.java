package br.com.jorge.gestao_vagas.modules.company.repositories;

import br.com.jorge.gestao_vagas.modules.company.entities.JobEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;


public interface JobRepository extends JpaRepository<JobEntity, UUID> {
}
