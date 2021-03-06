package ide.logic.URM;

import ide.logic.interpreter.*;
import org.junit.Test;
import ide.logic.parsers.SimpleFileParser;
import ide.logic.parsers.SimpleUrmFileParser;

import static org.junit.Assert.*;


public class UrmInterpreterTest {


    @Test
    public void testUrmInterpreter() throws Exception {

        SimpleFileParser parser = new SimpleUrmFileParser();

        parser.setFilename(getClass().getResource("/test/urm/test1.txt").getPath());
        Program program = parser.getProgram();

        Configuration configuration = new UrmConfiguration(6);
        UrmConfiguration urmConfiguration = ((UrmConfiguration)configuration.getInstance());

        urmConfiguration.setRegister(0,2);
        urmConfiguration.setRegister(1,3);

        Interpreter interpreter = new UrmInterpreter();

        interpreter.loadProgram(program);
        interpreter.setInput(configuration);

        interpreter.runProgram();

        System.out.println(urmConfiguration.getRegister(0));

        assertEquals(urmConfiguration.getRegister(0), 4);

        //System.out.println(interpreter.getLogger());
    }

}
