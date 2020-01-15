package org.anacr.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;

/**
 * @author liujie
 * @date 2019/12/14 23:35
 */
@Controller
@RequestMapping(value = "/hell",method = RequestMethod.GET)
public class FileUploadController {

	@PostMapping("/upd")
	public String updFile(@RequestPart("an")MultipartFile multipartFile) throws IOException {
		FileOutputStream fileOutputStream = new FileOutputStream(new File("C:\\Users\\Administrator\\Desktop\\hi.jpg"));
		FileCopyUtils.copy(multipartFile.getInputStream(),fileOutputStream);
		fileOutputStream.close();
		return "???";
	}

	@GetMapping("/entry")
	public String hello(){
		return "index";
	}

}
