package be.dno.running.web.entities;

import java.io.Serializable;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
public class VMA implements Serializable{
	
	private static final long serialVersionUID = -9194777071823579610L;

	@PrimaryKey
	@Persistent
	private String userId;
	
	@Persistent
	private String vma;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getVma() {
		return vma;
	}
	public void setVma(String vma) {
		this.vma = vma;
	}
	
}
