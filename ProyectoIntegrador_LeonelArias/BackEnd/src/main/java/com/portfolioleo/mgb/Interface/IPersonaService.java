
package com.portfolioleo.mgb.Interface;
import com.portfolioleo.mgb.entity.Persona;
import java.util.List;


public interface IPersonaService {
    //traer una lista persona
    public List<Persona> getPersona();
    
    //Guardar un objeto de tipo Persona
    public void savePersona(Persona persona);
    
    //Eliminar un objeto pero lo buscamos por ID
    public void deletePersona(Long id);
    
    //Buscr una persona por ID
    public Persona finPersona(Long id);

    public Persona findPersona(long l);

    public Persona addPersona(Persona persona);
}
