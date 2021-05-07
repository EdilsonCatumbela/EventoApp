package ao.co.catumbela.eventoapp.repository;

import org.springframework.data.repository.CrudRepository;

import ao.co.catumbela.eventoapp.models.Convidado;
import ao.co.catumbela.eventoapp.models.Evento;

public interface ConvidadoRepository extends CrudRepository<Convidado, String> {
	Iterable<Convidado> findByEvento(Evento evento);
	Convidado findByRg(String rg);
}
