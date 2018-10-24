package com.ezetina.makereport;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Report {
	
	private String nameFile;
	private String content;
	private String tittle;
	private String extension;
	
	public String getNameFile() {
		return nameFile;
	}
	public void setNameFile(String nameFile) {
		this.nameFile = nameFile;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTittle() {
		return tittle;
	}
	public void setTittle(String tittle) {
		this.tittle = tittle;
	}
	
	public String getExtension() {
		return extension;
	}
	public void setExtension(String extension) {
		this.extension = extension;
	}
	
	public void makeReport() {
		if ((getNameFile() != null) && 
			 (getExtension() !=null) &&
		    (getTittle() !=null) && 
		    (getContent() !=null)) {
			//Crear el archivo
			try {
				
				 File myFile = new File(getNameFile() + "." + getExtension());
				 FileOutputStream fos;
				fos = new FileOutputStream(myFile);
				OutputStreamWriter osw = new OutputStreamWriter(fos);
				BufferedWriter brw = new BufferedWriter(osw);
				brw.write(getContent());
				brw.close();
				
			}
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		 
		}else {
			System.out.println("File information invalid!\n");
		}
	}

}
