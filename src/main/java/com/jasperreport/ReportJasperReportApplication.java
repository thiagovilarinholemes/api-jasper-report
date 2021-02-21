package com.jasperreport;

import java.awt.Color;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jasperreport.entities.Student;
import com.jasperreport.entities.Subject;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.base.JRBaseTextField;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.export.ooxml.JRXlsxExporter;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;

@SpringBootApplication
public class ReportJasperReportApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReportJasperReportApplication.class, args);
		/* Relatório FirstReport*/
//		try {
//			
//			Student student1 = new Student(1L, "Raja", "Josi", "Happy Street", "Delhi");
//			Student student2 = new Student(2L, "Raja", "Josi", "Happy Street", "Delhi");
//			
//			List<Student> list = new ArrayList<Student>();
//			list.add(student1);
//			list.add(student2);
//			
//			/* Localização do arquivo modelo de relatório nome_arquivo.jxml */
//			String filePath = "/home/thiago/Desenvolvimento/java/ws-relatorio/"
//					+ "report-jasper-report/src/main/resources/FirstReport.jrxml";
//			
//			Map<String, Object> parameters = new HashMap<String, Object>();
//			parameters.put("studentName", "Thiago Vilarinho Lemes");
//				
//			/* Cria a lista de dados do relatório */
//			JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(list);
//			
//			JasperReport report = JasperCompileManager.compileReport(filePath);
//			
//			/* Acessando um elemento no relatório
//			 * Alterando a cor do texto do TextField cuja key é "name" 
//			*/			
//			JRBaseTextField textField = (JRBaseTextField)
//					report.getTitle().getElementByKey("name");
//			textField.setForecolor(Color.red);
//					
//			JasperPrint print = 
//					JasperFillManager.fillReport(report, parameters, dataSource);
//			/* Salva o relatório na raiz do projeto */
//			JasperExportManager.exportReportToPdfFile(print, "Data\\FirstReport.pdf");
//
//
//		} catch (Exception e) {
//			System.out.println("Exception while creating report: " + e);
//		}
		
		/* Relatório - Student  */
//		try {
//			Subject subject1 = new Subject("Java", 90);
//			Subject subject2 = new Subject("MySQL", 75);
//			Subject subject3 = new Subject("PHP", 55);
//			Subject subject4 = new Subject("Spring Boot", 99);
//			Subject subject5 = new Subject("Laravel", 80);
//			Subject subject6 = new Subject(".Net", 20);
//			Subject subject7 = new Subject("NodeJS", 85);
//			Subject subject8 = new Subject("ReactJS", 90);
//			Subject subject9 = new Subject("React Native", 15);
//			Subject subject10 = new Subject("Postgres", 85);
//			
//			List<Subject> list = new ArrayList<Subject>();
//			list.addAll(Arrays.asList(subject1, subject2, subject3,  subject4,  subject5, subject6, subject7, subject8, subject9, subject10));
//			
//			/* Localização do arquivo modelo de relatório nome_arquivo.jxml */
//			String filePath = "/home/thiago/Desenvolvimento/java/ws-relatorio/"
//					+ "report-jasper-report/src/main/resources/Student.jrxml";
//			
//			JasperReport report = JasperCompileManager.compileReport(filePath);
//			
//			/* Passa a fonte de dados para criar a lista  */
//			JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(list);
//			
//			Map<String, Object> parameters = new HashMap<String, Object>();
//			parameters.put("studentName", "Thiago Vilarinho Lemes");
//			parameters.put("tableData", dataSource);
//									
////			JasperReport report = JasperCompileManager.compileReport(filePath);
//
//			JasperPrint print = JasperFillManager.fillReport(report, parameters, new JREmptyDataSource());
//			
//			JasperExportManager.exportReportToPdfFile(print, "Student");
//				
//			System.out.println("Report created with success!!!");
//			
//		} catch (Exception e) {
//			System.out.println("Exception while creating report: " + e);
//		}
		
		/* Relatório de  tabela */
//		try {
//			/* Cria a lista com os dados: nomde_curso e nota*/
//			Subject subject1 = new Subject("Java", 90);
//			Subject subject2 = new Subject("MySQL", 75);
//			Subject subject3 = new Subject("PHP", 55);
//			Subject subject4 = new Subject("Spring Boot", 99);
//			Subject subject5 = new Subject("Laravel", 80);
//			Subject subject6 = new Subject(".Net", 20);
//			Subject subject7 = new Subject("NodeJS", 85);
//			Subject subject8 = new Subject("ReactJS", 90);
//			Subject subject9 = new Subject("React Native", 15);
//			Subject subject10 = new Subject("Postgres", 85);
//			Subject subject11 = new Subject("PHP", 55);
//			Subject subject12 = new Subject("MySQL", 75);
//			Subject subject13 = new Subject("PHP", 55);
//			Subject subject14 = new Subject("Spring Boot", 99);
//			Subject subject15 = new Subject("Laravel", 80);
//			Subject subject16 = new Subject(".Net", 20);
//			/* Adicionando os dados a lista */
//			List<Subject> list = new ArrayList<Subject>();
//			list.addAll(Arrays.asList(subject1, subject2, subject3,  
//					subject4,  subject5, subject6, subject7, subject8, subject9, subject10,
//					subject11, subject12, subject13, subject14,  subject15, subject16));
//			
//			/* Fonte de dados */
//			/* Instancia a coleção de dados, inserindo a lista de dados criada com o nome_curso e nota */
//			JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(list);
//				
//			/* Cria um map contatendo o studentName do Header e a lista criada com o nome dos cursos e notas do formulário */
//			Map<String, Object> parameters = new HashMap<String, Object>();
//			parameters.put("studentName", "Thiago Vilarinho Lemes");
//			parameters.put("tableData", dataSource);
//						
////			/* Localização do arquivo modelo de relatório nome_arquivo.jxml */
//			String filePath = "/home/thiago/Desenvolvimento/java/ws-relatorio/"
//					+ "report-jasper-report/src/main/resources/Student_v2.jrxml";
//			
//			JasperReport report = JasperCompileManager.compileReport(filePath);
//			
//			/* Passa o arquivo do relatório, os parametros - lista de dados, e uma classe se estiver vazio os dados para gerar o relaorio */
//			JasperPrint print = JasperFillManager.fillReport(report, parameters, new JREmptyDataSource());
//			
//			/* Cria o relatório em PDF  com o nome Student */
//			JasperExportManager.exportReportToPdfFile(print, "Student");
//			
//			System.out.println("Report created with success!!!");
//			
//		} catch (Exception e) {
//			System.out.print("Ocorreu uma falha ao criar o relatório: " + e);
//		}
		
		/* Relatório de Gráficos */
//		try {
//			/* Cria a lista com os dados: nomde_curso e nota*/
//			Subject subject1 = new Subject("Java", 90);
//			Subject subject2 = new Subject("MySQL", 75);
//			Subject subject3 = new Subject("PHP", 55);
//			Subject subject4 = new Subject("Spring Boot", 99);
//			Subject subject5 = new Subject("Laravel", 80);
//			Subject subject6 = new Subject(".Net", 20);
//			
//			/* Adicionando os dados a lista */
//			List<Subject> list = new ArrayList<Subject>();
//			list.addAll(Arrays.asList(subject1, subject2, subject3,  
//					subject4,  subject5, subject6));
//			
//			/* Fonte de dados */
//			/* Instancia a coleção de dados, inserindo a lista de dados criada com o nome_curso e nota */
//			JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(list); // Para criar a tabela no relatório
//			JRBeanCollectionDataSource chartDataSource = new JRBeanCollectionDataSource(list); // Para criar os gráficos
//				
//			/* Cria um map contatendo o studentName do Header e a lista criada com o nome dos cursos e notas do formulário */
//			Map<String, Object> parameters = new HashMap<String, Object>();
//			parameters.put("studentName", "Thiago Vilarinho Lemes");
//			parameters.put("tableData", dataSource);
//						
////			/* Localização do arquivo modelo de relatório nome_arquivo.jxml */
//			String filePath = "/home/thiago/Desenvolvimento/java/ws-relatorio/"
//					+ "report-jasper-report/src/main/resources/Student_v2.jrxml";
//			
//			JasperReport report = JasperCompileManager.compileReport(filePath);
//			
//			/* Passa o arquivo do relatório, os parametros - lista de dados, e os dados para o gráfico */
//			JasperPrint print = JasperFillManager.fillReport(report, parameters, chartDataSource);
//			
//			/* Exporta/cria o relatório em PDF  com o nome Student.pdf */
//			JasperExportManager.exportReportToPdfFile(print, "Student.pdf");
//			/* Exporta/cria o relatório em PDF  com o nome Student.pdf */
//			JasperExportManager.exportReportToHtmlFile(print, "Student.html");
//			/* Exporta/cria o relatório em Excel */
//			JRXlsxExporter export = new JRXlsxExporter();
//			export.setExporterInput(new SimpleExporterInput(print));
//			export.setExporterOutput(new SimpleOutputStreamExporterOutput(new FileOutputStream("Student.xlsx")));
//			export.exportReport();
//			
//			System.out.println("Report created with success!!!");
//			
//		} catch (Exception e) {
//			System.out.print("Ocorreu uma falha ao criar o relatório: " + e);
//		}
//	}
		
//		/* Sub Relatório */
//		try {
//			
//			/* Localização do arquivo modelo de relatório nome_arquivo.jxml */
//			String filePath = "/home/thiago/Desenvolvimento/java/ws-relatorio/"
//					+ "report-jasper-report/src/main/resources/Student_v2.jrxml";
//			
//			/* Cria a lista com os dados: nomde_curso e nota*/
//			Subject subject1 = new Subject("Java", 90);
//			Subject subject2 = new Subject("MySQL", 75);
//			Subject subject3 = new Subject("PHP", 55);
//			Subject subject4 = new Subject("Spring Boot", 99);
//			Subject subject5 = new Subject("Laravel", 80);
//			Subject subject6 = new Subject(".Net", 20);
//			
//			/* Adicionando os dados a lista */
//			List<Subject> list = new ArrayList<Subject>();
//			list.addAll(Arrays.asList(subject1, subject2, subject3,  
//					subject4,  subject5, subject6));
//			
//			/* Fonte de dados */
//			/* Instancia a coleção de dados, inserindo a lista de dados criada com o nome_curso e nota */
//			JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(list); // Para criar a tabela no relatório
//			JRBeanCollectionDataSource chartDataSource = new JRBeanCollectionDataSource(list); // Para criar os gráficos
//			
//			/* Cria um map contendo o studentName do Header e a lista criada com o nome dos cursos e notas do formulário */
//			Map<String, Object> parameters = new HashMap<String, Object>();
//			parameters.put("studentName", "Thiago Vilarinho Lemes");
//			parameters.put("tableData", dataSource);
//			/* Envia o subrelatório, função criada abaixo para passar o subrelatório */
//			parameters.put("subReport", getSubReport());
//			/* Passa os dados do subrelatório */
//			parameters.put("subDataSource", getSubDataSource());
//			/* Passa o subparemetro para o subrelatório*/
//			parameters.put("subParameters", getSubParameters());
//									
//			JasperReport report = JasperCompileManager.compileReport(filePath);
//			
//			/* Passa o arquivo do relatório, os parametros - lista de dados, e os dados para o gráfico */
//			JasperPrint print = JasperFillManager.fillReport(report, parameters, chartDataSource);
//			
//			/* Exporta/cria o relatório em PDF  com o nome Student.pdf */
//			JasperExportManager.exportReportToPdfFile(print, "Student.pdf");
//			/* Exporta/cria o relatório em PDF  com o nome Student.pdf */
//			JasperExportManager.exportReportToHtmlFile(print, "Student.html");
//			/* Exporta/cria o relatório em Excel */
//			JRXlsxExporter export = new JRXlsxExporter();
//			export.setExporterInput(new SimpleExporterInput(print));
//			export.setExporterOutput(new SimpleOutputStreamExporterOutput(new FileOutputStream("Student.xlsx")));
//			export.exportReport();
//			
//			System.out.println("Report created with success!!!");
//			
//		} catch (Exception e) {
//			System.out.print("Ocorreu uma falha ao criar o relatório: " + e);
//		}
//	}
//	
//	/* Retorna o relatório para ser inserido como subrelatório */
//	public static JasperReport getSubReport() throws JRException {
//		
//		/* Localização do arquivo modelo de relatório nome_arquivo.jxml */
//		String filePath = "/home/thiago/Desenvolvimento/java/ws-relatorio/"
//				+ "report-jasper-report/src/main/resources/FirstReport.jrxml";
//		JasperReport report;
//		
//		try {
//			report = JasperCompileManager.compileReport(filePath);
//			return report;
//		} catch (Exception e) {
//			System.out.print("Erro ao gerar o subrelatorio: " + e);
//			return null;
//		}
//		
//		
//	}
//	
//	/* Retorna os dados do subrelatório */
//	public static JRBeanCollectionDataSource getSubDataSource() {
//		
//		Student student1 = new Student(1L, "Raja", "Josi", "Happy Street", "Delhi");
//		Student student2 = new Student(2L, "Peter", "Jhosef", "Smitt", "PhilaDefl");
//		Student student3 = new Student(2L, "Thiago", "Lemes", "Smitt", "PhilaDefl");
//		
//		List<Student> list = new ArrayList<Student>();
//		list.add(student1);
//		list.add(student2);
//		list.add(student3);
//		
//		JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(list);
//		
//		return dataSource;
//		
//	}
//	
//	/* Retorna o parametro do subrelatório */
//	public static Map<String, Object> getSubParameters(){
//		Map<String, Object> parameters = new HashMap<String, Object>();
//		parameters.put("studentName", "Carina L. Vilarinho Lemes");
//		return parameters;
	}
}
















