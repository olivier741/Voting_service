/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.olivier.worksheet.controller;

import com.olivier.worksheet.beans.VotingResp;
import com.olivier.worksheet.model.Motion;
import com.olivier.worksheet.model.dao.VoterDao;
import com.olivier.worksheet.model.dao.VotingRecordDao;
import com.olivier.worksheet.model.service.MotionService;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author olivier.tatsinkou
 */
@RestController
public class VotingController {

    private static Logger logger = LoggerFactory.getLogger(VotingController.class);

    @Autowired
    private VoterDao voterDao;

    @Autowired
    private MotionService motionSrv;

    @Autowired
    private VotingRecordDao votingRecordDao;

    @PostMapping(path = "/createMotion", consumes = "application/json", produces = "application/json")
    public VotingResp createMotion(@RequestBody Motion motion) {
        logger.info(motion.toString());
        Motion mot = null;
        VotingResp votRsp = new VotingResp(null, null, new Date());
        try {
            mot = motionSrv.saveMotion(motion);
            votRsp.setError_code("0");
            votRsp.setDescription("success add Motion -- ID = "+mot.getId());
        } catch (Exception e) {
           votRsp.setError_code("-1");
           votRsp.setDescription("error: cannot insert");
           logger.error("error: cannot insert",e);
        }

        return votRsp;
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

}
