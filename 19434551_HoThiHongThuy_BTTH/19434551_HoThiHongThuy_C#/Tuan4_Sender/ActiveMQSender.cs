using Apache.NMS.ActiveMQ;
using System;
using System.IO;
using Apache.NMS;
using Apache.NMS.ActiveMQ;
using Apache.NMS.ActiveMQ.Commands;using Tuan_4_ActiveMQSender;

//add thu vien build>nret.4.0 va lib net 4.0
namespace Tuan4_ActiveMQSender1
{
    static class Program
    {
        /// <summary>
        /// The main entry point for the application.
        /// </summary>
        static void Main(string[] args)
        {
            Console.WriteLine("sending message. Enter to exit.");
            //tạo connection factory
            IConnectionFactory factory = new ConnectionFactory("tcp://localhost:61616");
            //tạo connection
            IConnection con = factory.CreateConnection("admin", "admin");
            con.Start();//nối tới MOM
                        //tạo session
            ISession session = con.CreateSession(AcknowledgementMode.AutoAcknowledge);
            //tạo producer
            ActiveMQQueue destination = new ActiveMQQueue("thanthidet");
            IMessageProducer producer = session.CreateProducer(destination);
            //send message
            //biến đối tượng thành XML document String
            Person p = new Person(1001, "Truong Van COi", new DateTime());
            //string xml = genXML(p).ToLower();
            string xml = new XMLObjectConverter<Person>().object2XML(p);
            Console.WriteLine(xml.ToLower());
            IMessage msg = new ActiveMQTextMessage("Hola mondo");
            producer.Send(msg);
            //shutdown
            session.Close();
            con.Close();
            Console.ReadKey();
        }
    }

}

