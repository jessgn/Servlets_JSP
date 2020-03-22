/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jessi
 */
@WebServlet(urlPatterns = {"/NewServlet"})
public class NewServlet extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head><meta charset=\"UTF-8\"/>\n" + " <title>Trabalho Web</title>\n" +" <link rel=\"stylesheet\" type=\"text/css\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\n" + "<link rel=\"stylesheet\" type=\"text/css\" href=\"style1.css\">");
            out.println("<title>Servlet NewServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<nav class=\"top-section navbar\">\n");
            out.println("<svg version=\"1.1\" xmlns=\"http://www.w3.org/2000/svg\" x=\"0px\" y=\"0px\" width=\"100px\" viewBox=\"0 0 2148.4 675.3\" xml:space=\"preserve\">\n");
            out.println("<path class=\"main-logo\" fill=\"#fff\" d=\"M981.2,0l398.2,675h-183.8L889.3,155.8L582.9,675H480v0.2H296.2V183.8H0L108.2,0.2L778.3,0L670.1,183.8H480\n" +
"                              v354.1L797.4,0l0,0h0L981.2,0L981.2,0L981.2,0z M709.2,491.7L601.1,675.3H1177l-108.4-183.8L709.2,491.7z M1925.1,186.4\n" +
"                              c0.3,0.9,0.5,1.8,0.7,2.7c44.7,6.6,85.2,15.5,109.7,26.8l92-140.5c-80.5-43-192.5-75.2-320.1-75.2c-29.8,0-57.2,1.2-82.4,3.8\n" +
"                              C1833.2,26.3,1897,84.7,1925.1,186.4z M1940.9,284.8l-209.3-36.1c-50-7.5-70.6-13.2-70.6-41.2c0-5.1,0.8-9.6,2.5-13.5\n" +
"                              c-17.1-4.3-37.6-6.4-62.6-6.4h-105.8c-0.9,9.9-1.4,20.3-1.4,31.1c0,91.1,91.4,148.2,244.4,185.1c0-0.1,0-0.1,0.1-0.2l196.8,36.5\n" +
"                              c17.5,5.4,26.1,13.4,26.1,29.9c0,24.2-12.9,34-42.6,37.6c-0.3,1-0.7,2-1,2.9c-16.2,45.1-40.4,79.8-73.7,106.3\n" +
"                              c-29.6,23.5-65.8,40-110.4,50.1c33.7,3.7,68.1,5.6,102.5,5.6c223.8,0,312.7-70.7,312.7-225.6C2148.4,363.7,2069,316.2,1940.9,284.8z\n" +
"                               M1600.9,177.3c27,0,49.2,2.4,67.8,7.3c36.5,9.6,60,23.2,73.9,55.3c2.1,0.3,4.2,0.6,6.4,0.9l7,1c67.9,10,123.6,21.4,169.9,28.4\n" +
"                              c-2.6-32.5-6.3-54.6-13.4-80.3h0C1884.2,87.2,1817.3,31,1701.9,13.1c-27.7-4.3-58.9-6.5-92.7-6.5l-598,0.1l100.7,170.7H1600.9z\n" +
"                               M1905.1,508.8c6.8-18.7,12.2-39.8,16.1-62.7c-10.5-2.2-23.4-4-39-6.3c-10.8-1.5-23-3.3-36.3-5.4c-34.9-5.6-67.6-11.9-97.1-18.6\n" +
"                              c-12.5,39.5-37.4,63.3-77.6,74.5c-19.1,5.3-42.1,7.9-70.3,7.9h-299.8l100.7,170.8l207.4,0.1c37.8,0,72.3-2.7,102.5-8.2\n" +
"                              C1812.8,642.6,1874.3,594.3,1905.1,508.8z\"/>\n" +
"            </svg>\n");
            out.println("<div class=\"logo\">\n");
            out.println("<div class= \"name\">\n" +
"                      SEPT - Setor de Educação Profissional e Tecnológica\n" +
"                    </div>\n");
            out.println(" </div>\n");
            out.println("</nav>\n" );
            out.println("<div class=\"container\"> \n");
            out.println("<table class=\"table\">\n");
            out.println("<tr>\n" +
"              <th>Cursos</th>\n" +
"              <th>Página</th>\n");
            out.println("</tr>\n");
            out.println("<tr>\n"+
"              <td>Agente Comunitário de Saúde</td>\n" +
"              <td><a href= http://www.sept.ufpr.br/portal/agentesaude/> Link</a></td>\n" +
           "</tr\n");
           out.println("<tr>\n" +
"              <td>Petróleo e Gás</td>\n" +
"              <td><a href= http://www.sept.ufpr.br/portal/petroleogas/>Link</a></td>\n" +
"            </tr>\n");
            out.println("<tr>\n" +
"              <td>Análise e Desenvolvimento de Sistemas</td>\n" +
"              <td><a href= http://www.sept.ufpr.br/portal/analisesistemas/sobre-o-curso/>Link</a></td>\n" +
"            </tr>\n");
            out.println("<tr>\n" +
"              <td>Comunicação Institucional</td>\n" +
"              <td><a href= http://www.sept.ufpr.br/portal/comunicacaoinstitucional/>Link</a></td>\n" +
"            </tr>\n");
            out.println("<tr>\n" +
"              <td>Gestão da Qualidade</td>\n" +
"              <td><a href = http://www.sept.ufpr.br/portal/gestaoqualidade/>Link</a></td>\n" +
"            </tr>\n");
            out.println("<tr>\n" +
"              <td>Gestão Pública</td>\n" +
"              <td><a href= http://www.sept.ufpr.br/portal/gestaopublica/>Link</a></td>\n" +
"            </tr>\n");
            out.println("<tr>\n" +
"              <td>Luteria</td>\n" +
"              <td><a href = http://www.sept.ufpr.br/portal/luteria/>Link</a></td> \n" +
"            </tr>\n");
            out.println("<tr>\n" +
"              <td>Negócios Imobiliários</td>\n" +
"              <td><a href = http://www.sept.ufpr.br/portal/negociosimobiliarios/>Link</a></td>\n" +
"            </tr>\n");
            out.println("<tr> \n" +
"              <td>Produção Cênica</td>\n" +
"              <td><a href = http://www.sept.ufpr.br/portal/producaocenica/>Link</a></td>\n" +
"            </tr>\n");
            out.println("<tr>\n" +
"              <td>Secretáriado</td>\n" +
"              <td><a href= http://www.sept.ufpr.br/portal/secretariado/>Link</a></td>\n" +
"            </tr>\n");
            out.println("<tr>\n"+
"              <td>Pós Graduação em Bioinformática</td>\n" +
"              <td><a href= http://www.bioinfo.ufpr.br/>Link</a></td>\n" +
"            </tr>\n");
            out.println("<tr>\n" +
"              <td>Especialização em Inteligência Artificial</td>\n" +
"              <td><a href = http://www.iaa.ufpr.br/>Link</a></td>\n" +
"            </tr>\n");
            out.println("<tr>\n" +
"              <td>Especialização em Engenharia de Software</td>\n" +
"              <td><a href = http://www.engenhariadesoftware.ufpr.br:28080/engenhariadesoftware/>Link</a></td>\n" +
"            </tr>\n");
            out.println("<tr>\n" +
"              <td>MBA Negócios Imobiliários</td>\n" +
"              <td><a href = http://www.sept.ufpr.br/portal/blog/arquivos/principal/mba-negocios-imobiliarios-2020/>Link</a></td>\n" +
"            </tr>\n");
            out.println("</table><a href=\"newJsp.jsp\">Clica aqui</a> \n" +
"                    </div> \n" +
"               </div> \n" +
"                  <div class=\"footer\">\n" +
"                Rua Dr. Alcides Vieira Arcoverde, 1225\n" +
"                CEP: 81520-260 - Jardim das Américas - Curitiba (PR) - Brasil\n" +
"            </div>");
            out.println("</body>");
            out.println("</html>");
        }
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

