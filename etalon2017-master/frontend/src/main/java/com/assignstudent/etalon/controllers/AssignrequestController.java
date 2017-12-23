package com.assignstudent.etalon.controllers;

import com.assignstudent.etalon.beans.AssignrequestViewModel;
import com.assignstudent.etalon.entities.AssignrequestEntity;
import com.assignstudent.etalon.entities.RequestEntity;
import com.assignstudent.etalon.entities.StudentEntity;
import com.assignstudent.etalon.services.AssignrequestService;
import com.assignstudent.etalon.services.RequestService;
import com.assignstudent.etalon.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/assignrequest")
public class AssignrequestController {
    @Autowired
    RequestService requestService;
    @Autowired
    StudentService studentService;
    @Autowired
    AssignrequestService assignrequestService;

    @RequestMapping(value = "/create",produces = "application/json", method = RequestMethod.POST)
    public @ResponseBody AssignrequestEntity createAssignRequest(@RequestBody AssignrequestViewModel assignrequestViewModel) {
        AssignrequestEntity assignrequestEntity=new AssignrequestEntity();

        assignrequestEntity.setRequestId(assignrequestViewModel.getRequestByRequestId());
        RequestEntity requestEntity=requestService.findById (assignrequestViewModel.getRequestByRequestId());
        assignrequestEntity.setRequestByRequestId(requestEntity);

        assignrequestEntity.setStudentId(assignrequestViewModel.getStudentByStudentId());
        StudentEntity studentEntity=studentService.getOneStudent(assignrequestViewModel.getStudentByStudentId());
        assignrequestEntity.setStudentByStudentId(studentEntity);

        assignrequestService.createAssignRequest(assignrequestEntity);
        return assignrequestEntity;
    }

    @RequestMapping(value = "/release",produces = "application/json", method = RequestMethod.POST)
    public @ResponseBody  AssignrequestEntity deleteAssignrequest(@RequestBody Integer[] chkArray) {
        AssignrequestEntity assignrequestEntity=new AssignrequestEntity();
        for (Integer temp:chkArray
                ) {
            assignrequestService.deleteBystudenId(temp);
        }
        return assignrequestEntity;
    }
}
