package ut.ua.finedefinition;

import org.junit.Test;
import ua.finedefinition.api.MyPluginComponent;
import ua.finedefinition.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}