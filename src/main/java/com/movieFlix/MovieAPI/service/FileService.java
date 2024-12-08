package com.movieFlix.MovieAPI.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public interface FileService {

    String uploadFile(String path, MultipartFile file) throws IOException;//In spring, MultipartFile is used when we are dealing with file in RESTFUL manner

    //We also need to convert the file to bits
    InputStream getResourceFile(String path, String FileName) throws FileNotFoundException;



}
