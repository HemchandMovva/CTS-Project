package com.response;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SectorsNgoDetailsResponse {

	private String sectorName;
	
	private List<NgoDetailsResponse> ngoDetailsResponseList;
}
