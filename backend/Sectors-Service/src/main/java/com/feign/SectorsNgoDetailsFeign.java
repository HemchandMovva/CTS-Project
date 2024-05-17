package com.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.exceptions.InvalidIdException;
import com.response.NgoDetailsStatesResponse;

@FeignClient(name = "NGODETAILS-SERVICE", url = "http://localhost:400", path = "NgoDetailsControllerImpl")
public interface SectorsNgoDetailsFeign {

	@GetMapping("/selectById/{id}")
	public NgoDetailsStatesResponse selectById(@PathVariable String id) throws InvalidIdException ;
}
