package com.lee.controller;

import com.lee.service.FileUploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@RestController
public class FileUploadController {

    @Autowired
    private FileUploadService fileUploadService;
    @PostMapping("/upload")
    public String upload(String name, MultipartFile file, HttpServletRequest req) throws IOException {
        System.out.println(name);
        System.out.println("originFileName" + file.getOriginalFilename());
        System.out.println("name" + file.getName());
        System.out.println(System.getProperty("user.dir"));
        String path = req.getServletContext().getRealPath("/upload/");
        System.out.println(path);
        fileUploadService.saveFile(file,path);
        return "上传成功";
    }


}
