package net.ciklum.study.Attributes;

import org.junit.Test;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNull;

/**
 * Created with IntelliJ IDEA.
 * User: John
 * Date: 6/4/13
 * Time: 7:35 PM
 * To change this template use File | Settings | File Templates.
 */
public class ObjectCreatorTest {
//    public User user = new User ();
    public ObjectCreator objectCreator = new ObjectCreator();

    @Test
    public void testGetFilledClass() throws Exception {
        User user = (User)objectCreator.getFilledClass(User.class);
        assertEquals ("Butch", user.getUsername());
        assertEquals ("Kateryna", user.getFirstname());
        assertEquals ("Cheremiskin", user.getLastname());
        assertEquals ("20.02.1986", user.getBirthday());
        assertEquals ("26", user.getAge());

    }
}
