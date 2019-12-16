import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;
import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;
import sun.awt.dnd.SunDragSourceContextPeer;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Arrays;

public class Test_final {
    public static void main(String[] args) {
        Teacher t=new CgbTeacher();
        t.ready();
        t.rest();
        t.teach();
    }
}
abstract class Teacher{
    abstract public void ready();
    abstract public void teach();
    public void rest(){
        System.out.println("周末");
    }
}
class CgbTeacher extends Teacher{
    @Override
    public void ready() {
        System.out.println("准备");
    }
    @Override
    public void teach() {
        System.out.println("主讲");
    }
}
class ActTeacher extends Teacher{

    @Override
    public void ready() {
        System.out.println("将强");
    }

    @Override
    public void teach() {
        System.out.println("主讲加强");
    }
}


