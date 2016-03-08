/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bpmlab.template.bean;

import bpmlab.template.entity.Template;
import bpmlab.template.entity.Template_;
import bpmlab.template.repository.TemplateRepository;
import bpmlab.template.service.ServiceTest;
import java.io.Serializable;
import java.util.logging.Logger;
import javax.enterprise.context.ConversationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.apache.deltaspike.data.api.criteria.Criteria;

/**
 *
 * @author bpmlab
 */
@Named
@ConversationScoped
public class BeanTest implements Serializable {
    private static final Logger LOG = Logger.getLogger(BeanTest.class.getName());
    
    @Inject
    private TemplateRepository templateRepository;
    private String nome = "Hello";
    @Inject
    private ServiceTest serviceTest;

    public String getNome() {
        String nome = null;
        String sobrenome = null;
        String idade = null;
        Criteria<Template, Template> criteria = templateRepository.criteria();
        if (nome != null) {
            criteria.eq(Template_.nome, "asdasd");
        }
        if (sobrenome != null) {
            criteria.eq(Template_.nome, "asdasd");
        }
        if (idade != null) {
            criteria.eq(Template_.nome, "asdasd");
        }
        criteria.getResultList();
        LOG.info(templateRepository.findAll().toString());
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
