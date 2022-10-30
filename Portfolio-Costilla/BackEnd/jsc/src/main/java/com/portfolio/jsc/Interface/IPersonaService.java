package com.portfolio.jsc.Interface;

import com.portfolio.jsc.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    //Traer una lista de personas
    public List<Persona> getPersona();
        
    //Guardar un objeto de tipo Persona
    public void savepersona(Persona persona);
    
    //Eliminar un objeto pero buscamos por ID
    public void deletePersona(Long id);
    
    //Buscar una persona por ID
    public  Persona finPersona(Long id);
    
   
            
}
