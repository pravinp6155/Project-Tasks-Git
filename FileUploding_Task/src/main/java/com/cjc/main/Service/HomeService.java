package com.cjc.main.Service;

import java.util.List;

import com.cjc.main.Model.Document;

public interface HomeService {

	public List<Document> savedoc(Document d);

	public List<Document> getDoc();
}

