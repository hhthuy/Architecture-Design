using FormInfoSinhVien.thanhnho;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace FormInfoSinhVien
{
    public partial class Form1 : Form
    {
        public static thanhnho.WebService1SoapClient b = new thanhnho.WebService1SoapClient();
        public Form1()
        {
            InitializeComponent();
            LoadAllStudentListBox();
            CreateColums();
            LoadAllStudentListView();
            ClearText();
        }
        private void LoadAllStudentListBox()
        {
          //  FormInfoSinhVien.thanhnho.WebService1SoapClient b = new thanhnho.WebService1SoapClient();
            if (b.listDS() != null)
            {
                foreach (var item in b.listDS())
                {
                    listSV.Items.Add(item.maSV);

                }
            }
        }
        private void LoadAllStudentListView()
        {
            if (b.listDS() != null)
            {
                foreach (var item in b.listDS())
                {
                    ListViewItem stdItem = new ListViewItem();
                    stdItem.Text = item.maSV;
                    stdItem.SubItems.Add(item.fullName);
                    stdItem.SubItems.Add(item.lop);
                    stdItem.SubItems.Add(item.khoa);
                    stdItem.SubItems.Add(item.tuoi+"");
                    lvDS.Items.Add(stdItem);

                }
            }
        }


        private void btnThem_Click(object sender, EventArgs e)
        {
           // FormInfoSinhVien.thanhnho.WebService1SoapClient b = new thanhnho.WebService1SoapClient();
            string maSV = txtMaSV.Text;
            string fullName = txtHoTen.Text;
            string lop =txtLop.Text;
            string khoa = txtTuoi.Text;
            int tuoi =int.Parse( txtTuoi.Text);

            string result = b.add(maSV, fullName, lop, khoa, tuoi);

           MessageBox.Show(""+result);
            listSV.Items.Clear();
            lvDS.Items.Clear();
            LoadAllStudentListBox();
            LoadAllStudentListView();
            ClearText();


        }

        private void btnXoa_Click(object sender, EventArgs e)
        {
            FormInfoSinhVien.thanhnho.WebService1SoapClient b = new thanhnho.WebService1SoapClient();
            string id = null;
            if(listSV.SelectedItems.Count >0)
            {
                id= listSV.SelectedItem.ToString();
            }
            else if (lvDS.SelectedItems.Count > 0)
            {
                id = lvDS.SelectedItems[0].Text;
            }
            if (id!=null)
            {
                if(b.xoaThanhVien(id))
                {
                    listSV.Items.Clear();
                    lvDS.Items.Clear();
                    LoadAllStudentListBox();
                    LoadAllStudentListView();
                    MessageBox.Show("Xóa thành công");
                }
            }
            else
            {
                MessageBox.Show("vui lòng chọn mã","Thông báo");
            }
        }

        private void btnThoat_Click(object sender, EventArgs e)
        {
            Application.Exit();
        }
        private void CreateColums()
        {

            lvDS.View = View.Details;
            lvDS.Columns.Add("Mã sinh viên", 100);
            lvDS.Columns.Add("Tên sinh viên", 100);
            lvDS.Columns.Add("Lớp", 100);
            lvDS.Columns.Add("khoa", 100);
            lvDS.Columns.Add("Tuổi", 100);

        }
        private void ClearText()
        {
            txtMaSV.Text = "";
            txtHoTen.Text = "";
            txtLop.Text = "";
            txtTuoi.Text = "";
            txtkhoa.Text = "";
        }

        private void btnTim_Click(object sender, EventArgs e)
        {
            sinhVien sv  = b.ds_id(txtTimKiem.Text);
            if (sv != null)
            {
                lvDS.Items.Clear();
                ListViewItem stdItem = new ListViewItem();
                stdItem.Text = sv.maSV;
                stdItem.SubItems.Add(sv.fullName);
                stdItem.SubItems.Add(sv.lop);
                stdItem.SubItems.Add(sv.khoa);
                stdItem.SubItems.Add(sv.tuoi + "");
                lvDS.Items.Add(stdItem);
                txtTimKiem.Text = "";
            }
            else
            {
                MessageBox.Show("Không tìm thấy sinh viên", "Thông báo");
            }

        }

        private void button1_Click(object sender, EventArgs e)
        {
            lvDS.Items.Clear();
            LoadAllStudentListView();
        }
    }
}
