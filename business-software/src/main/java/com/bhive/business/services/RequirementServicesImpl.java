package com.bhive.business.services;

import com.bhive.business.dto.RequirementDto;
import com.bhive.business.entity.RequirementEntity;
import com.bhive.business.repository.RequirementDaoImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;


@Slf4j
@Service
public class RequirementServicesImpl implements RequirementServices {

    @Autowired
    RequirementDaoImpl requirementDao;



    @Override
    public boolean validateAndContactPage(RequirementDto requirementDto) {
        RequirementEntity userEntity = new RequirementEntity();
        if (requirementDto != null) {
            BeanUtils.copyProperties(requirementDto, userEntity);
            userEntity.setName(requirementDto.getName());

            System.out.println("Saving user details: " + userEntity.toString());
            requirementDao.Save(userEntity);
        }
        return true;
    }
}
