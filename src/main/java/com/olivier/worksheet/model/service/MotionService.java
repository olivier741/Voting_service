/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.olivier.worksheet.model.service;

import com.olivier.worksheet.model.Motion;
import com.olivier.worksheet.model.dao.MotionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author olivier.tatsinkou
 */
@Service
public class MotionService {
    
    @Autowired
    private MotionDao motionDao;
    
    public Motion saveMotion(Motion motion) {
        return motionDao.save(motion);
    }
}
