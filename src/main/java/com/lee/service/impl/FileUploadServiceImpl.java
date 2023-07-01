package com.lee.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.lee.service.FileUploadService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Service
public class FileUploadServiceImpl extends ServiceImpl implements FileUploadService {
    @Override
    public void saveFile(MultipartFile file, String path) throws IOException {
        File dir = new File(path);
        if (!dir.exists()) {
            dir.mkdir();
        }
        File f = new File(path + file.getOriginalFilename());

        file.transferTo(f);
    }


}
