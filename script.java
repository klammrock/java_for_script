import java.io.*;
import java.util.*;

// https://github.com/FasterXML/jackson-databind/
import com.fasterxml.jackson.databind.*;

private static final String IN_FILE_NAME = "data.json";

private static final ObjectMapper mapper = new ObjectMapper();

static <T> void println(T arg) {
	System.out.println(arg);
}

void main() throws IOException{
	println("INFO: json map");
	var json = loadJson();
	// {name=user, pass=secret, d=[1, false, 2, 3.3, {a=b}]}
	println(json);
	println(json.get("name"));

	println("INFO: json tree");
	var jsonTree = loadJsonNode();
	println(jsonTree);
	println(jsonTree.get("pass").asText());

	println("INFO: done");
}

Map loadJson() throws IOException{
	Map json = mapper.readValue(new File(IN_FILE_NAME), Map.class);
	
	return json;
}

JsonNode loadJsonNode() throws IOException {
	return mapper.readTree(new File(IN_FILE_NAME));
}

