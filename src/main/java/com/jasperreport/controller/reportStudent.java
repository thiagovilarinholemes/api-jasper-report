package com.jasperreport.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jasperreport.entities.Student;
import com.jasperreport.entities.Subject;

import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

@RestController
public class reportStudent {
	
	@GetMapping("/report")
	public ResponseEntity<byte[]> getReport(){
		
		try {
//			/* Localização do arquivo modelo de relatório nome_arquivo.jxml */
			String filePath = ResourceUtils.getFile("classpath:Student_v2.jrxml").getAbsolutePath();
			
			Subject subject1 = new Subject("Java", 90);
			Subject subject2 = new Subject("MySQL", 75);
			Subject subject3 = new Subject("PHP", 55);
			Subject subject4 = new Subject("Spring Boot", 99);
			Subject subject5 = new Subject("Laravel", 80);
			Subject subject6 = new Subject(".Net", 20);
			Subject subject7 = new Subject("NodeJS", 85);
			Subject subject8 = new Subject("ReactJS", 90);
			Subject subject9 = new Subject("React Native", 15);
			Subject subject10 = new Subject("Postgres", 85);
			
			List<Subject> list = new ArrayList<Subject>();
			list.addAll(Arrays.asList(subject1, subject2, subject3,  subject4,  subject5, subject6, subject7, subject8, subject9, subject10));
			
			JRBeanCollectionDataSource dataSource = 
					new JRBeanCollectionDataSource(list);
			
			JRBeanCollectionDataSource chartDataSource = 
					new JRBeanCollectionDataSource(list);
			
			Map<String, Object> parameters = new HashMap<String, Object>();
			parameters.put("studentName", "John");
			parameters.put("tableData", dataSource);
			parameters.put("subReport", getSubReport());
			parameters.put("subDataSource", getSubDataSource());
			parameters.put("subParameters", getSubParameters());
			
			JasperReport report = JasperCompileManager.compileReport(filePath);
			
			JasperPrint print = 
					JasperFillManager.fillReport(report, parameters, chartDataSource);
			
			/* Retorna em bytes */
			byte[] byteArray = JasperExportManager.exportReportToPdf(print);
			
			HttpHeaders headers = new HttpHeaders();
			
			/* Define o tipo de conteudo que está retornando */
			headers.setContentType(MediaType.APPLICATION_PDF);
			
			/* Fornece o nome do arquivo */
			headers.setContentDispositionFormData("filename", "Student.pdf");
			
			return new ResponseEntity<byte[]>(byteArray, headers, HttpStatus.OK);
			
			
		} catch (Exception e) {
			return new ResponseEntity<byte[]>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	public static JasperReport getSubReport () {
			
			JasperReport report;
			try {
				String filePath = ResourceUtils.getFile("classpath:FirstReport.jrxml").getAbsolutePath();
				report = JasperCompileManager.compileReport(filePath);
				return report;
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
		}
	
	public static JRBeanCollectionDataSource getSubDataSource () {
		Student student1 = new Student(1L, "Raj", "Joshi", "Happy Street",
				"Delhi");
		
		Student student2 = new Student(2L, "Peter", "Smith", "Any Street",
				"Mumbai");
		
		List<Student> list = new ArrayList<Student>();
		list.add(student1);
		list.add(student2);
		
		JRBeanCollectionDataSource dataSource = 
				new JRBeanCollectionDataSource(list);
		
		return dataSource;
	}
	
	public static Map<String, Object> getSubParameters () {
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("studentName", "Raj");
		
		return parameters;
	}

}
