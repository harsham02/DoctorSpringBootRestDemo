package com.petzey.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StatusDto {

	private boolean Confirmed;
	private boolean Closed;
	private boolean Cancelled;
}
