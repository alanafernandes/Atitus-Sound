package br.edu.atitus.poo.atitusoundalana.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_playlist")
	public class PlaylistEntity extends GenericEntity{
	
	private boolean public_share;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinColumn(nullable = false, name = "music_uuid")
	private List<MusicEntity> music;

	public boolean isPublic_share() {
		return public_share;
	}

	public void setPublic_share(boolean public_share) {
		this.public_share = public_share;
	}

	public List<MusicEntity> getMusic() {
		return music;
	}

	public void setMusic(List<MusicEntity> music) {
		this.music = music;
	}

}
