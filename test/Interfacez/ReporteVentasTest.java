/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfacez;

import com.lowagie.text.pdf.PdfPTable;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Fidel Sánchez
 */
public class ReporteVentasTest {
    
    public ReporteVentasTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of exportarPDF method, of class ReporteVentas.
     */
    @Test
    public void testExportarPDF() throws Exception {
        System.out.println("exportarPDF");
        ReporteVentas instance = new ReporteVentas();
        instance.exportarPDF();
       
    }

    /**
     * Test of writeHeader method, of class ReporteVentas.
     */
    @Test
    public void testWriteHeader() {
        System.out.println("writeHeader");
        PdfPTable pdfTable = null;
        ReporteVentas instance = new ReporteVentas();
        instance.writeHeader(pdfTable);
    
    }

    /**
     * Test of writeBody method, of class ReporteVentas.
     */
    @Test
    public void testWriteBody() {
        System.out.println("writeBody");
        PdfPTable pdfTable = null;
        ReporteVentas instance = new ReporteVentas();
        instance.writeBody(pdfTable);
     
    }

    /**
     * Test of obtenerReporteVentas method, of class ReporteVentas.
     */
    @Test
    public void testObtenerReporteVentas() {
        System.out.println("obtenerReporteVentas");
        ReporteVentas instance = new ReporteVentas();
        instance.obtenerReporteVentas();
      
    }
    
}
