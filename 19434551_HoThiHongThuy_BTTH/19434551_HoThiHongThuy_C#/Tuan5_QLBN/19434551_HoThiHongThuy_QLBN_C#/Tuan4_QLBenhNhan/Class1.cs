using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Xml.Serialization;

namespace Tuan4_QLBenhNhan
{
    class Class1
    {
    }

    [Serializable]
    public class BenhNhan
    {
        public string mabn { get; set; }
        public string ten { get; set; }
        public string diachi { get; set; }
        public string socmnd { get; set; }
        public BenhNhan() { }
       

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
