package br.edu.atitus.poo.atitusoundalana.servicesimpl;

import org.springframework.stereotype.Service;

import br.edu.atitus.poo.atitusoundalana.entities.PlaylistEntity;
import br.edu.atitus.poo.atitusoundalana.repositories.GenericRepository;
import br.edu.atitus.poo.atitusoundalana.repositories.PlaylistRepository;
import br.edu.atitus.poo.atitusoundalana.services.PlaylistService;

@Service

public class PlaylistServiceImpl implements PlaylistService{
	
	private final PlaylistRepository repository;
	
	public PlaylistServiceImpl(PlaylistRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public GenericRepository<PlaylistEntity> getRepository() {
		return repository;
	}

}
