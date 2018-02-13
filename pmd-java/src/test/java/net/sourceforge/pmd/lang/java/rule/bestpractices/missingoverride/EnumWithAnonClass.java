/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.java.rule.bestpractices.missingoverride;

/**
 * @author Clément Fournier
 * @since 6.1.0
 */
public enum EnumWithAnonClass {
    Foo {
        @Override
        public String getSomething() {
            return null;
        }
    };


    public Object getSomething() {
        return null;
    }

}
