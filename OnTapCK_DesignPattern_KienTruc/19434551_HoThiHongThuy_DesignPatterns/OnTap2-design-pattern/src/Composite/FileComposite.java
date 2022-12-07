package Composite;

import java.util.ArrayList;
import java.util.List;

public class FileComposite implements FileComponent {
	private String name;
	private int level;
	private int size;
	private List<FileComposite> files;

// constructor
	public FileComposite(String name, int level, int sal) {
		this.name = name;
		this.level = level;
		this.size = sal;
		files = new ArrayList<FileComposite>();
	}

	public void add(FileComposite e) {
		files.add(e);
	}

	public void remove(FileComposite e) {
		files.remove(e);
	}

	public List<FileComposite> getFiles() {
		return files;
	}

	public String toString() {
		return ("File :[ Name : " + name + ", level : " + level + ", size :" + size + " ]");
	}

	int sum = 0;

	@Override
	public long totalSize() {
		// TODO Auto-generated method stub
		sum = 0;
		files.forEach((f) -> {
			sum += f.size;
		});

		return sum;
	}

	@Override
	public void showProperty() {
		// TODO Auto-generated method stub
		System.out.print("File :[ Name : " + name + ", level : " + level + ", size :" + size + " ]");
	}
}