import java.io.*;
import java.util.*;

// https://github.com/FasterXML/jackson-databind/
import com.fasterxml.jackson.databind.*;

private static final String IN_FILE_NAME = "data.json";

private static final ObjectMapper mapper = new ObjectMapper();

void main() throws IOException{
	var json = loadJson();
	// {name=user, pass=secret, d=[1, false, 2, 3.3, {a=b}]}
	System.out.println(json);
	System.out.println(json.get("name"));

	var jsonTree = loadJsonNode();
	System.out.println(jsonTree.get("name").asText());
	
	System.out.println("done");
}

Map loadJson() throws IOException{
	Map json = mapper.readValue(new File(IN_FILE_NAME), Map.class);
	
	return json;
}

JsonNode loadJsonNode() throws IOException {
	return mapper.readTree(new File(IN_FILE_NAME));
}

