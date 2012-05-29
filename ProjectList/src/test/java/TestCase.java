/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;
import java.util.ArrayList;
import com.qacg.lists.*;

/**
 *
 * @author Aide
 */
public class TestCase {

    public TestCase() {
    }

    @Test
    public void test() {
        Lista<String> lista = new Lista<String>();
        assertNull(lista.exist("fred"));
        lista.add("fred");
        assertEquals("fred",lista.exist("fred").getElemento());
        lista.add("wilma");
        assertEquals("fred",lista.exist("fred").getElemento());
        assertEquals("wilma",lista.exist("wilma").getElemento());
        List<String> elem = new ArrayList<String>();
        elem.add("fred");
        elem.add("wilma");
        assertEquals(elem, lista.asList());

    }

}