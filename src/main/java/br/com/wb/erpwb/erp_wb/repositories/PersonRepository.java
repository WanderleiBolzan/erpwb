package br.com.wb.erpwb.erp_wb.repositories;

import br.com.wb.erpwb.erp_wb.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {}