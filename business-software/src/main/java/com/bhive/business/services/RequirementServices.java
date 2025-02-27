package com.bhive.business.services;

import com.bhive.business.dto.RequirementDto;

import javax.validation.Valid;

public interface RequirementServices {

       boolean validateAndContactPage(RequirementDto requirementDto);


}
