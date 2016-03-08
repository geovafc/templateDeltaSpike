/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bpmlab.template.repository;

import bpmlab.template.entity.Template;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import org.apache.deltaspike.data.api.FullEntityRepository;
import org.apache.deltaspike.data.api.Repository;

/**
 *
 * @author bpmlab
 */
@Repository(forEntity = Template.class)
@ApplicationScoped
public interface TemplateRepository extends FullEntityRepository<Template, Long> {   
}
