package com.belk.payon;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsontoQueryParam {
	
	private static final ObjectMapper mapper = new ObjectMapper();
	
	
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		
		
		//JSON file to Java object
		GcpCredentials obj = mapper.readValue(new File("c:\\projects\\spring-data-flow\\corp-belk-db-5d719e33750d.json"), GcpCredentials.class);
    	String jsonString = mapper.writeValueAsString(obj);
	    
    	System.out.println("obj->"+jsonString);
		
		 Map<String, String> mapValue = mapper.readValue(jsonString, new TypeReference<HashMap<String, String>>(){});


		 System.out.println("mapValue :"+ mapValue.get("project_id"));
	}

}
