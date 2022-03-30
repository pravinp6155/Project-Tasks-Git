package com.cjc.main.Controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.cjc.main.Model.Document;
import com.cjc.main.Service.HomeService;
import com.fasterxml.jackson.databind.ObjectMapper;
@CrossOrigin("*")
@RestController

@RequestMapping("/document")
public class HomeController {


	// json data & file type
	@Autowired
	HomeService si;
//	post api  // http://localhost:9090/adddoc
	
	@RequestMapping(value = "/adddoc",method = RequestMethod.POST,consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public List<Document> fileUplods(@RequestPart(required =true,  value = "address_proof") MultipartFile files1,
			@RequestPart(required = true, value = "photo") MultipartFile files2,
			@RequestPart(required = true, value = "signature") MultipartFile files3,
			@RequestPart(required = true, value = "thumb") MultipartFile files4,
			@RequestPart("doc") String doc) throws IOException{
		
		System.out.println(doc);
		  Document d=new Document();
		  d.setAddress_proof(files1.getBytes());
		  d.setPhoto(files2.getBytes()); 
		  d.setSignature(files3.getBytes());
		  d.setThumb(files4.getBytes());
		  
		  
		  ObjectMapper om=new ObjectMapper();
		     Document d1   = om.readValue(doc, Document.class);
		  
		//  Gson gson=new Gson();
		  // to convert string json  data to java object
		 // Document d1=gson.fromJson(doc, Document.class);
		  
		  
		  d.setCustomer_id(d1.getCustomer_id());
		  System.out.println(d.getCustomer_id());
		
		  
		  List<Document> list=si.savedoc(d);
		 
		return list;
	}
	@GetMapping("/files")
	public List<Document> getFiles()
	{
		return si.getDoc();
	}
}
