package com.mufaba.spring_boot_library.controller;

import com.mufaba.spring_boot_library.requestmodels.AddBookRequest;
import com.mufaba.spring_boot_library.service.AdminService;
import com.mufaba.spring_boot_library.utils.ExtractJWT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("http://localhost:5173")
@RestController
@RequestMapping("/api/admin")
public class AdminController {

    private AdminService adminService;

    @Autowired
    public AdminController(AdminService adminService){
        this.adminService=adminService;
    }

    @PostMapping("/secure/add/book")
    public void postBook(@RequestHeader(value = "Authorization") String token,
                         @RequestBody AddBookRequest addBookRequest) throws  Exception{
        String userEmail = ExtractJWT.payloadJWTExtraction(token,"\"sub\"");
//        String admin = ExtractJWT.payloadJWTExtraction(token,"\"userType\"");
//
//        if(admin == null || !admin.equals("admin")){
//            throw new Exception("Administration page only.");
//        }
        adminService.postBook(addBookRequest);
    }
}
