package scriptengine;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class test02 {

    public static void main(String[] args) {

        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");

        try {
            String script = "";
            script += "var oShell = new ActiveXObject('WScript.Shell');  ";
            script += "var data = oShell.Run('ls');";

            engine.eval(script);

            System.out.println(engine.get("data"));
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
