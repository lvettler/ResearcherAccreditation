package br.ufes.inf.nemo.researcherAccreditation.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Named;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.primefaces.model.UploadedFile;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import br.ufes.inf.nemo.researcherAccreditation.application.RegisterResearcherService;
import br.ufes.inf.nemo.researcherAccreditation.domain.Researcher;
import br.ufes.inf.nemo.util.ejb3.application.CrudService;
import br.ufes.inf.nemo.util.ejb3.controller.CrudController;

@Named
@SessionScoped
@ManagedBean
public class RegisterResearcherController extends CrudController<Researcher> {
	
	@EJB
	private RegisterResearcherService registerResearcherService;
	
	public RegisterResearcherController(){
		viewPath = "/manageResearcher/";
		bundleName = "msgs";
	}
	
	@Override
	protected CrudService<Researcher> getCrudService() {
		// TODO Auto-generated method stub
		return registerResearcherService;
	}

	@Override
	protected Researcher createNewEntity() {
		// TODO Auto-generated method stub
		return new Researcher();
	}

	@Override
	protected void initFilters() {
		// TODO Auto-generated method stub
	}

	private UploadedFile arquivoXML;
	
	private Researcher researcher;
	
	private List<Researcher> l_researcher = new ArrayList<Researcher>();
	
	public List<Researcher> getl_researcher(){
		return l_researcher;
	}
	
	public void setl_researcher(List<Researcher>l_researcher){
		this.l_researcher = l_researcher;
	}
	
	public Researcher getResearcher(){
		return researcher;
	}
	
	public void setResearcher(Researcher researcher){
		this.researcher = researcher;
	}
	
	public UploadedFile getArquivoXML(){
		return arquivoXML;
	}
	
	public void setArquivoXML(UploadedFile arquivoXML) {
        this.arquivoXML = arquivoXML;
    }
	
	public void CarregarArquivoXML(){
        
        try {
           
            if(!this.arquivoXML.getFileName().equals(""))
                this.MontaDadosDataTable();        
           
       } catch (ParserConfigurationException e) {
           e.printStackTrace();
       } catch (SAXException e) {
           e.printStackTrace();
       } catch (IOException e) {
           e.printStackTrace();
       }
       
       
   }
   
   private void MontaDadosDataTable() throws ParserConfigurationException, SAXException, IOException{
       
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
       
        DocumentBuilder builder = factory.newDocumentBuilder();
           
        Document doc = builder.parse(this.arquivoXML.getInputstream());
                    
        Element element = (Element) doc.getDocumentElement();
       
        NodeList nodes = ((Node) element).getChildNodes();
                
        for (int i = 0; i < nodes.getLength(); i++) {
        	
        	System.out.println(nodes.item(0).getAttributes().getNamedItem("NOME-COMPLETO"));

           
            NodeList nodesItem = nodes.item(i).getChildNodes();

            this.researcher = null;
            
            if(nodesItem.getLength()>0)
                this.researcher =  new Researcher();
            this.researcher.setResearcherName(nodes.item(0).getAttributes().getNamedItem("NOME-COMPLETO").getTextContent());    

            
            for (int j = 0; j < nodesItem.getLength(); j++) {   
            	
            	
//                     if(nodesItem.item(j).getNodeName().equals("DADOS-GERAIS"))
//                    this.researcher.setResearcherName(nodesItem.item(j).getTextContent());    
                
           }   
           
            if(this.researcher!= null)
                this.l_researcher.add(this.researcher);
        }
   }


}
