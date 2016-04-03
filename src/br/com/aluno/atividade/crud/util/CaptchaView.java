package br.com.aluno.atividade.crud.util;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import org.primefaces.component.*;
 
@ManagedBean
public class CaptchaView {
     
    public static void submit() {
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Correct", "Correct");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
}