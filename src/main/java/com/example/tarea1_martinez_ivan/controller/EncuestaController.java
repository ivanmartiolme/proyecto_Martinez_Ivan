package com.example.tarea1_martinez_ivan.controller;

import com.example.tarea1_martinez_ivan.entity.Encuesta;
import com.example.tarea1_martinez_ivan.repository.EncuestaRepository;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EncuestaController {
    private EncuestaRepository encuestaRepository;

    public EncuestaController(EncuestaRepository repository){
        this.encuestaRepository = repository;
    }
    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("encuesta", new Encuesta());
        return "formulario-encuesta";
    }

    @PostMapping ("/")
    public String insertarEncuesta(EncuestaRepository repository, Encuesta encuesta){
        encuestaRepository.save(encuesta);
        return "redirect:/admin";
    }

    @GetMapping("/admin")
    public String findAll(Model model){
        List<Encuesta> encuestas = this.encuestaRepository.findAll();
        model.addAttribute("encuestas", encuestas);
        return "index-encuesta";
    }

    @GetMapping("/encuestas/del/{id}")
    public String eliminarEncuesta(@PathVariable Long id){
        encuestaRepository.deleteById(id);
        return "redirect:/admin";
    }

}