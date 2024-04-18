package com.petzey.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.petzey.dto.StatusDto;

@Mapper
public interface StatusMapper {

	@Mappings({
			// @Mapping(target="id", source = "product.id"),
			@Mapping(target = "Confirmed", source = "status.confirmed"),
			@Mapping(target = "Closed", source = "status.closed"),
			@Mapping(target = "Cancelled", source = "status.cancelled")
			// @Mapping(target = "description", source = "product.description")
	})

	com.petzey.dto.StatusDto convertToDto(StatusDto status);

	com.petzey.entities.Status convertToEntity(StatusDto statusDto);

}
