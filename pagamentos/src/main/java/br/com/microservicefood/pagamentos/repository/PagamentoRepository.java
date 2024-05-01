package br.com.microservicefood.pagamentos.repository;

import br.com.microservicefood.pagamentos.model.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {
}
