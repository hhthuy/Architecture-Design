package tuan3_ActiveMQDemo;

import java.util.Date;
import java.util.Properties;
import java.util.Scanner;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.Message;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.naming.Context;
import javax.naming.InitialContext;
import org.apache.log4j.BasicConfigurator;


public class QueueSender {
	public static void main(String[] args) throws Exception {
//config environment for JMS
		BasicConfigurator.configure();
//config environment for JNDI
		Properties settings = new Properties();
		settings.setProperty(Context.INITIAL_CONTEXT_FACTORY, "org.apache.activemq.jndi.ActiveMQInitialContextFactory");
		settings.setProperty(Context.PROVIDER_URL, "tcp://localhost:61616");
//create context
		Context ctx = new InitialContext(settings);
//lookup JMS connection factory
		ConnectionFactory factory = (ConnectionFactory) ctx.lookup("ConnectionFactory");
//lookup destination. (If not exist-->ActiveMQ create once)
		Destination destination = (Destination) ctx.lookup("dynamicQueues/thanthidet");
//get connection using credential
		Connection con = factory.createConnection("admin", "admin");
//connect to MOM
		con.start();
//create session
		Session session = con.createSession(/* transaction */false, /* ACK */Session.AUTO_ACKNOWLEDGE);
//create producer
		MessageProducer producer = session.createProducer(destination);
//create text message
		
		Scanner sc  =new Scanner(System.in);
		String tam = sc.nextLine();
		
		Message msg = session.createTextMessage(tam);
		producer.send(msg);
		
		
		Person p = new Person(1001, "Thân Thị Đẹt", new Date());
		System.out.println("tao per thanh cong");
		
		String xml = new XMLConvert<Person>(p).object2XML(p);
//		System.out.println("convert thanh cong");
		
		msg = session.createTextMessage(xml);
		producer.send(msg);
//shutdown connection
		session.close();
		con.close();
		System.out.println("Finished...");
	}
}
