package co.edu.uco.publiuco.business.domain.assembler;

import java.util.List;


public interface Assembler <D, T, E>{
		
		T toDTOFromDomain(D domain);
		D toDomainFromDto(T dto);
		E toEntitiesFromDomain(D domain);
		D toDomainFromEntities(E entities);
	
		List<D>toDomainListFromEntities(List<E> entityList);
}
