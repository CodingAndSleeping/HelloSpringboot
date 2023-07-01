package com.lee.service;

import com.baomidou.mybatisplus.service.IService;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface FileUploadService extends IService {

    public void saveFile(MultipartFile file, String path) throws IOException;
}
