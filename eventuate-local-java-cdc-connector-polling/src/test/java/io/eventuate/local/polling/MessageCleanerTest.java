package io.eventuate.local.polling;

import io.eventuate.local.test.util.AbstractMessageCleanerTest;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = AbstractMessageCleanerTest.Config.class)
public class MessageCleanerTest extends AbstractMessageCleanerTest {

}
