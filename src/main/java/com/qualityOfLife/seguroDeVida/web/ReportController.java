package com.qualityOfLife.seguroDeVida.web;

import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.util.JRLoader;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ReportController {

	@RequestMapping(value = "/imprimir", method = RequestMethod.GET)
	public void login(ModelMap model) throws Exception {

		JasperReport reporte = (JasperReport) JRLoader
				.loadObject("Parentesco.jasper");

		JasperPrint jasperPrint = JasperFillManager.fillReport(reporte, null);

		JRExporter exporter = new JRPdfExporter();

		exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
		exporter.setParameter(JRExporterParameter.OUTPUT_FILE,new java.io.File("reportePDF.pdf"));
		exporter.exportReport();
	}

}
