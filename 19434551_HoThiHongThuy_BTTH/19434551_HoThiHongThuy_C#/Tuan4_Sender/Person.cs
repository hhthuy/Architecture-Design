using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Tuan_4_ActiveMQSender
{
    [Serializable]
    public class Person
    {
        public long Mssv { get; set; }
        public string Hoten { get; set; }
        public DateTime Ngaysinh { get; set; }
        public Person() { }
        public Person(long mssv, string hoten, DateTime ngaysinh)
        {
            this.Mssv = mssv; Hoten = hoten; Ngaysinh = ngaysinh;
        }
    }
}
