package com.acat.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.acat.pojo.ComIntro;
import com.acat.service.ComIntroService;
import com.acat.service.impl.ComIntroServiceImpl;
import com.acat.util.getNowTime;

/**
 * Servlet implementation class ComIntroServlet
 */
@WebServlet("/ComIntroServlet")
public class ComIntroServlet extends HttpServlet {
	private ComIntroService cis = new ComIntroServiceImpl();
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String operation = request.getParameter("operation");
		if("addComIntro".equals(operation)){
			addComIntro(request,response);
		}
		
		if("showAll".equals(operation)){
			showAll(request,response);
		}
		
		if("showOne".equals(operation)){
			showOne(request,response);
		}
		
		if("showDetailOne".equals(operation)){
			showDetailOne(request,response);
		}
	}

	private void showDetailOne(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = (Integer.parseInt(request.getParameter("comid")));	
		ComIntro ci = cis.findComIntro(id);
		request.setAttribute("ci", ci);
		request.getRequestDispatcher("/index3.jsp").forward(request, response);
	}

	private void showOne(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<ComIntro> ci = cis.findAll();
		request.setAttribute("ci", ci);
		request.getRequestDispatcher("/index2.jsp").forward(request, response);
	}

	private void showAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<ComIntro> ci = cis.findAll();
		request.setAttribute("ci", ci);
		request.getRequestDispatcher("/manager/ComIntro/ComIntroShow.jsp").forward(request, response);
	}

	private void addComIntro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String resultPath = "";
		String storePath = getServletContext().getRealPath("/files");
		
		String value = null;
		InputStream in = null;
//		OutputStream out = null;
		
//		 FileOutputStream fos = null;//写
//		 FileInputStream fis = null;//读 
		
		System.out.println(storePath);
		
		System.out.println("----------1-----------");
		
		try {
			ComIntro ci = new ComIntro();
			
			DiskFileItemFactory factory = new DiskFileItemFactory();
			ServletFileUpload upload = new ServletFileUpload(factory);
			
			System.out.println("----------2-----------");
			
			//解析请求
			List<FileItem> items = upload.parseRequest(request);
			
			System.out.println("@1");
			
			for(FileItem item:items){
				if(item.isFormField()){
					//封装数据到JavaBean中
					String fieldName = item.getFieldName();//字段名，即javabean的属性名，除了图片
					String fieldValue = item.getString(request.getCharacterEncoding());
					BeanUtils.setProperty(ci, fieldName, fieldValue);//除了图片路径，其他数据都有了
				}else{
					in = item.getInputStream();
					String fileName = getNowTime.getTime().toString();
					
					ci.setControl(fileName);
					OutputStream out = new FileOutputStream(storePath+"\\"+fileName);
					byte[] buf = new byte[1024];
					int len = -1;
					while((len=in.read(buf))!=-1){
						out.write(buf, 0, len);
					}
					out.close();
					in.close();
				}
			}
			cis.addComIntro(ci);
			request.getSession().setAttribute("ci", ci);
			request.setAttribute("uu", "<script type='text/javascript'>alert('上传成功!!!')</script>");
			request.getRequestDispatcher("/manager/ComIntro/ComIntroAdd.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("uu", "<script type='text/javascript'>alert('上传失败!!!')</script>");
			try {
				request.getRequestDispatcher("/manager/ComIntro/ComIntroAdd.jsp").forward(request, response);
			} catch (ServletException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
