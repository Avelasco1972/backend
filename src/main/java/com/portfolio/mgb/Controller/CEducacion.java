
package com.portfolio.mgb.Controller;

import com.portfolio.mgb.Dto.dtoEducacion;
import com.portfolio.mgb.Entity.Educacion;
import com.portfolio.mgb.Security.Controller.Mensaje;
import com.portfolio.mgb.Service.SEducacion;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("educ")
@CrossOrigin(origins = "http://localhost:4200")
public class CEducacion {
    
    @Autowired
    SEducacion sEducacion;
    
    @GetMapping("/lista")
    public ResponseEntity<List<Educacion>> list(){
        List<Educacion> list = sEducacion.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoEducacion dtoedu){
     if(StringUtils.isBlank(dtoedu.getInstitutoC()))
         return new ResponseEntity(new Mensaje("El Instituto es obligatorio"), HttpStatus.BAD_REQUEST);
     if(sEducacion.existsByInstitutoC(dtoedu.getInstitutoC()))
         return new ResponseEntity(new Mensaje("Ese Instituto Existe"), HttpStatus.BAD_REQUEST);
     
     Educacion educacion = new Educacion(dtoedu.getInstitutoC(), dtoedu.getTituloC(), dtoedu.getDescripcionC(), dtoedu.getPeriodoC(), dtoedu.getLogoC());
     sEducacion.save(educacion);
     
     return new ResponseEntity(new Mensaje("Educacion Agregada"), HttpStatus.OK);
    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoEducacion dtoedu){
       //validar si existe el ID
        if(!sEducacion.existsById(id))
           return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
       
        //compara nombre de instituti
        if(sEducacion.existsByInstitutoC(dtoedu.getInstitutoC()) && sEducacion.getByInstitutoC(dtoedu.getInstitutoC()).get().getId() != id)
            return new ResponseEntity(new Mensaje("El Instituto ya Existe"), HttpStatus.BAD_REQUEST);
        
        //no puede ser vacio
        if(StringUtils.isBlank(dtoedu.getInstitutoC()))
            return new ResponseEntity( new Mensaje("Instituto es obligatorio"), HttpStatus.BAD_REQUEST);
        if(StringUtils.isBlank(dtoedu.getTituloC()))
            return new ResponseEntity( new Mensaje("Titulo es obligatorio"), HttpStatus.BAD_REQUEST);
        if(StringUtils.isBlank(dtoedu.getDescripcionC()))
            return new ResponseEntity( new Mensaje("Descripción es obligatorio"), HttpStatus.BAD_REQUEST);
        if(StringUtils.isBlank(dtoedu.getPeriodoC()))
            return new ResponseEntity( new Mensaje("Periodo es obligatorio"), HttpStatus.BAD_REQUEST);
        
        Educacion educacion = sEducacion.getOne(id).get();
        educacion.setInstitutoC(dtoedu.getInstitutoC());
        educacion.setTituloC(dtoedu.getTituloC());
        educacion.setDescripcionC(dtoedu.getDescripcionC());
        educacion.setPeriodoC(dtoedu.getPeriodoC());
        educacion.setLogoC(dtoedu.getLogoC());
        
        sEducacion.save(educacion);
        return new ResponseEntity(new Mensaje("Educacion Actualizada"), HttpStatus.OK);
       
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id){
        //validar si existe el ID
        if(!sEducacion.existsById(id))
           return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
        
        sEducacion.delete(id);
        
        return new ResponseEntity(new Mensaje("Educacion elimina"), HttpStatus.OK);
    }
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<Educacion> getById(@PathVariable("id") int id){
        if(!sEducacion.existsById(id))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        Educacion educacion = sEducacion.getOne(id).get();
        return new ResponseEntity(educacion, HttpStatus.OK);
    }
}
