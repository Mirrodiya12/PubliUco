package co.edu.uco.publiuco.business.assembler;

public interface Assembler <D, T, E>{
		
		T toDTOFromDomain(D domain);
		D toDomainFromDto(T dto);
		E toEntitiesFromDomain(D domain);
		D toDomainFromEntities(E entities);
	
		
}
