/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.jsc.Repository;

import com.portfolio.jsc.Entity.Experiencia;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Jorgelina
 */
@Repository
public interface RExperiencia extends JpaRepository<Experiencia, Integer>{
   public Optional<Experiencia> finByNombreE(String nombreE);
   public boolean existsByNombreE(String nombreE);
    
}
