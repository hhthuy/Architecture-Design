using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Xml.Serialization;

namespace Tuan4
{
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


    public class XMLObjectConverter<T>
    {
        public string object2XML(T p)
        {
            string xml = "";
            XmlSerializer ser = new XmlSerializer(typeof(T));
            using (MemoryStream ms = new MemoryStream())
            {
                ser.Serialize(ms, p);
                ms.Position = 0;
                xml = new StreamReader(ms).ReadToEnd();
            }
            return xml;
        }
    }





}
