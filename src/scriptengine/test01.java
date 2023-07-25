package scriptengine;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.io.IOException;

public class test01 {

    public static void main(String[] args) throws IOException {

        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");

        /*Map<String, String> paramMap = new HashMap<>();
        Map<String, String> requestMap = new HashMap<>();

        requestMap.put("query", "안녕하세요");

        paramMap.put("request", "{\"query\":\"안녕하세요\"}");

        String data = Jsoup.connect("https://builder.pingpong.us/api/builder/6269e914e4b019e738540647/integration/v0.2/custom/1111")
                .ignoreContentType(true)
                .header("Authorization", "Basic a2V5OjNkZDRkYzJhMzg0YWE3YzVlN2Y3NDI4OTY5MDBlMjM5")
                .header("Content-Type", "application/json")
                .requestBody("{\"request\": {\"query\": \"안녕하세요\"}}")
                .post()
                .text();

        System.out.println(data);*/

        try {
            //<script src="https://code.jquery.com/jquery-3.6.0.slim.min.js" integrity="sha256-u7e5khyithlIdTpu22PHhENmPcRdFiHRjhAuHcs05RI=" crossorigin="anonymous"></script>
            //String script = "var data = org.jsoup.Jsoup.connect('https://www.naver.com').post()";
            //https://github.com/Marak/asciimo/blob/master/lib/asciimo.js
            String script = "";
            script += "var test = eval(org.jsoup.Jsoup.connect('https://cdn.jsdelivr.net/npm/asciimo@0.3.1/lib/asciimo.js').ignoreContentType(true).get());";
            script += "var data = '';";
            script += "try {";
            script += "data = org.jsoup.Jsoup.connect('https://builder.pingpong.us/api/builder/6269e914e4b019e738540647/integration/v0.2/custom/1111')";
            script += ".ignoreContentType(true)";
            script += ".header('Authorization', 'Basic a2V5OjNkZDRkYzJhMzg0YWE3YzVlN2Y3NDI4OTY5MDBlMjM5')";
            script += ".header('Content-Type', 'application/json')";
            script += ".requestBody('{\"request\": {\"query\": \"안녕하세요\"}}')";
            script += ".post()";
            script += ".text();";
            script += "}";
            script += "catch(err) {";
            script += "data = err;";
            script += "}";

            engine.eval(script);

            System.out.println(engine.get("test"));
            System.out.println(engine.get("data"));
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

}
