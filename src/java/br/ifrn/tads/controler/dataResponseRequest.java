/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifrn.tads.controler;

import br.ifrn.tads.dao.Formulario;
import br.ifrn.tads.model.sendMail;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Dextter
 */
@WebServlet(name = "dataResponseRequest", urlPatterns = {"/dataResponseRequest"})
public class dataResponseRequest extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        Formulario form = new Formulario();        
        form.setEnderecoEletronicoR(request.getParameter("enderecoEletronicoR"));
        String remetente = form.getEnderecoEletronicoR();
        form.setSenhaRemetente(request.getParameter("senhaRemetente"));
        String senha = form.getSenhaRemetente();
        form.setEnderecoEletronicoD(request.getParameter("enderecoEletroonicoD"));
        String destinatario = form.getEnderecoEletronicoD();
        form.setAssunto(request.getParameter("assunto"));
        String assunto = form.getAssunto();
        form.setCorpo(request.getParameter("corpo"));
        String corpo = form.getCorpo();
        System.out.println("chegou na parte da chamada do metodo");
        sendMail mail = new sendMail();
        mail.enviar(remetente, senha, destinatario, assunto, corpo);
        

//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet dataResponseRequest</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet dataResponseRequest at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
//        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
