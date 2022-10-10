using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Messaging;using BusinessObjects;
namespace MSSQ_Sender
{
    public partial class F_MessageSender : Form
    {
        MessageQueue queue = null;
        public F_MessageSender()
        {
            InitializeComponent();
            init();
        }

        /*private void init()
        {
            //string path = @".\private$\phongkehoach";
            //string path = @"hbmnl\private$\phongkehoach";
            string path = @"FormatName:Direct=TCP:192.168.233.2\private$\phongkehoach";
            if (MessageQueue.Exists(path))
            {
                queue = new MessageQueue(path, QueueAccessMode.Send);
            }
            else
                queue = MessageQueue.Create(path, true);
            queue.Label = "queue cho phong ke hoach";
        }*/
        private void init()
        {
            string path = @"FormatName:Direct=OS:h51m22\private$\phongkehoach";
            queue = new MessageQueue(path, QueueAccessMode.Send);
        }

        private void sendButton_Click(object sender, EventArgs e)
        {
            string message = richTextBox1.Text;
            MessageQueueTransaction transaction = new MessageQueueTransaction();
            transaction.Begin();
            queue.Send(message, transaction);
            transaction.Commit();
        }
        private void sendObjectButton_Click(object sender, EventArgs e)
        {
            Student st = new Student(1001L, "Nguyễn văn Tèo", new DateTime(1999, 10, 15));
            MessageQueueTransaction transaction = new MessageQueueTransaction();
            transaction.Begin();
            queue.Send(st, transaction);
            System.Console.Write(st);
            transaction.Commit();
        }
    }
}
