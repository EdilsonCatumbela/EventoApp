package ao.co.catumbela.eventoapp.repository;

import org.springframework.data.repository.CrudRepository;

import ao.co.catumbela.eventoapp.models.Evento;

public interface EventoRepository extends CrudRepository<Evento, String>{ 
	Evento findByCodigo(long codigo);
}
