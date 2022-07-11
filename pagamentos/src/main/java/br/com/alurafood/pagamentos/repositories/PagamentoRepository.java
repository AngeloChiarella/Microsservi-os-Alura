package br.com.alurafood.pagamentos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alurafood.pagamentos.model.Pagamento;

public interface PagamentoRepository extends JpaRepository<Pagamento, Long>{

}
