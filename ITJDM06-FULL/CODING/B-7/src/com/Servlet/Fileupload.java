package com.Servlet;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.extractor.WordExtractor;



import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;

import com.Bean.Uploadbean;
import com.Implementation.Implementation;
import com.Interface.Interface;
import com.oreilly.servlet.multipart.FilePart;
import com.oreilly.servlet.multipart.MultipartParser;
import com.oreilly.servlet.multipart.Part;

/**
 * Servlet implementation class Fileupload
 */
@WebServlet("/Fileupload")
public class Fileupload extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Fileupload() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
	}
	/**}
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		HttpSession session=request.getSession(false);
		response.setContentType("text/html");
		
		String username=request.getSession().getAttribute("username").toString();
		
		MultipartParser mp=new MultipartParser(request,999999999);
	
		Part part;
		FilePart filepart;
		String filename=null;
		long size=0;
		String filetype=null;
		String filecontent = "";
		FileInputStream fis = null;

		String path=getServletContext().getRealPath("");
		System.out.println(path);
		
		String editpath=path.substring(0,path.indexOf("."));
		System.out.println(editpath);
		
		String fullpath=editpath+"ITJDM06\\WebContent\\local\\";
		System.out.println(fullpath);
		
		
		while((part=mp.readNextPart())!=null)
		{
			if(part.isFile())
			{
				filepart=(FilePart)part;
				filename=filepart.getFileName();
				System.out.println(filename);
				
				fullpath=fullpath+filename;
				System.out.println(fullpath);
				
				File file=new File(fullpath);
				size=filepart.writeTo(file);
				System.out.println(size);
				
				filetype=filepart.getContentType();
				System.out.println(filetype);

				
				fis = new FileInputStream(file);
				if (filename.endsWith(".txt")) {
				
					byte[] b = new byte[fis.available()];
					fis.read(b);
					String reading = new String(b);
					filecontent = filecontent + reading;
					System.out.println("txtttttttttttttttttt==="+filecontent);

				}
				
				// reading pdf content
				else if (filename.endsWith(".pdf")) {
					String text = "";
					com.itextpdf.text.pdf.PdfReader pdfReader = new PdfReader(fullpath);

					int pages = pdfReader.getNumberOfPages();
					for (int i1 = 1; i1 < pages; i1++) {
						text = PdfTextExtractor.getTextFromPage(pdfReader, i1);
						System.out.println("page:" + i1 + " " + text);
						filecontent = text;
						System.out.println("pdffffffffffff==="+filecontent);
					}
					// reading doc content
				} else if (filename.endsWith(".doc")) {
					WordExtractor extractor = null;
					FileInputStream fis2 = new FileInputStream(fullpath);
					System.out.println("file is" + fis);
					HWPFDocument document = new HWPFDocument(fis2);
					extractor = new WordExtractor(document);
					
					String mydate = extractor.getTextFromPieces();
					
					System.out.println("THE MYYYYYYYYYYY " + mydate);
							
					System.out.println("doc=============="+filecontent);
					
				}
			
			}
	}
		
Uploadbean up=new Uploadbean();
up.setUsername(username);
up.setFilename(filename);
up.setFiletype(filetype);
up.setFilesize(String.valueOf(size));
up.setFilecontent(filecontent);


Interface i=new Implementation();
int j=i.upload(up,username);
System.out.println("insert>>>>>>============>>>>>>>>>>>>>>>>>>>"+j);

	if(j==1)
		{
			response.sendRedirect("success.jsp");
		}
		else
		{
			response.sendRedirect("unsuccess.jsp");
		}
		
}
}