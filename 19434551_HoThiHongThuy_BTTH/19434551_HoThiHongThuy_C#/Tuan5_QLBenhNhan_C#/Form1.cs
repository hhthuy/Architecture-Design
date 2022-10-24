using Apache.NMS;
using Apache.NMS.ActiveMQ;
using Apache.NMS.ActiveMQ.Commands;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Xml.Serialization;

namespace Tuan4_QLBenhNhan
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void label4_Click(object sender, EventArgs e)
        {

        }

        private void label5_Click(object sender, EventArgs e)
        {

        }

       

            private void button1_Click(object sender, EventArgs e)
        {

            String ma = textBox1.Text;
            String cmnd = textBox2.Text;
            String ten = textBox3.Text;
            String diachi = textBox4.Text;

            BenhNhan a = new BenhNhan();
            a.mabn = ma;
            a.socmnd = cmnd;
            a.ten = ten;
            a.diachi = diachi;

            

            Console.WriteLine("sending message. Enter to exit.");
            //tạo connection factory
            IConnectionFactory factory = new
            ConnectionFactory("tcp://localhost:61616");
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
           
            //string xml = genXML(p).ToLower();
            //string xml = new XMLObjectConverter<BenhNhan>().object2XML(a);
            //Console.WriteLine(xml.ToLower());
            IMessage msg = new ActiveMQTextMessage(a.mabn+"-"+a.ten+"-"+a.socmnd+"-"+a.diachi);
            producer.Send(msg);
            //shutdown
            session.Close();
            con.Close();
            

        }
    }
}
