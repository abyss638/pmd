/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */
package net.sourceforge.pmd.lang.vm;

import java.io.StringReader;

import net.sourceforge.pmd.lang.LanguageVersion;
import net.sourceforge.pmd.lang.LanguageVersionHandler;
import net.sourceforge.pmd.lang.Parser;
import net.sourceforge.pmd.lang.ast.Node;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for VM parsing.
 *
 */
public class VmParserTest {

//	private static final String VM_SRC = "<HTML><BODY>Hello $customer.Name <table> "
//			+ "#foreach( $mud in $mudsOnSpecial )"
//			+ "  #if ( $customer.hasPurchased($mud) )"
//			+ "     <tr>"
//			+ "      <td>"
//			+ "       $flogger.getPromo( $mud )"
//			+ "    </td>"
//			+ "  </tr>" + " #end" + "\n #end " + "</table>";
	
	private static final String VM_SRC = "#if( $mud == 1 ) blah #if ($dirt == 2) stuff #end #end";
	
    @Test
    public void testParser() {
        Node node = parse(VM_SRC);
        Assert.assertNotNull(node);
    }

    private Node parse(String code) {
        LanguageVersionHandler vmLang = LanguageVersion.VM.getLanguageVersionHandler();
        Parser parser = vmLang.getParser(vmLang.getDefaultParserOptions());
        Node node = parser.parse(null, new StringReader(code));
        return node;
    }
}
