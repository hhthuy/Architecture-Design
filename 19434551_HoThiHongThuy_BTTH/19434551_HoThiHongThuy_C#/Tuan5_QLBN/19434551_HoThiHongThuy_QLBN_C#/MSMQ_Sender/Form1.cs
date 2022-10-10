using BussinesObject;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Messaging;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace MSMQ_Sender
{
   

    public partial class Form1 : Form
    {
        MessageQueue queue = null;
        public Form1()
        {
            InitializeComponent();
            init();
        }
        private void init()
        {
            
            queue = new MessageQueue(@"FormatName:Direct=OS:h51m30\private$\phongkehoach", QueueAccessMode.Send);
           // queue = new MessageQueue(@".\private$\phongkehoach", QueueAccessMode.Send);
        }
        private void button1_Click(object sender, EventArgs e)
        {
            string message = richTextBox1.Text;
            MessageQueueTransaction transaction = new MessageQueueTransaction();
            transaction.Begin();
            queue.Send(message, transaction);
            transaction.Commit();
        }

        private void richTextBox1_TextChanged(object sender, EventArgs e)
        {
           
        }

        private void button2_Click(object sender, EventArgs e)
        {
            Student st = new Student(1001L, "Nguyễn văn Tèo", new DateTime(1999, 10, 15));
            MessageQueueTransaction transaction = new MessageQueueTransaction();
            transaction.Begin();
            queue.Send(st, transaction);
            transaction.Commit();
        }
    }
}
