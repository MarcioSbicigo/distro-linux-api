package br.com.testeapispring.distrolinuxapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DistroLinuxController {

    @Autowired
    private DistroLinuxRepository repositorio;

    @GetMapping("/most-popular-distros")
    public List<DistroLinux> obterDistrosLinux() {
        List<DistroLinux> distroLinux = repositorio.findAll();
        return distroLinux;
    }

    @PostMapping("/most-popular-distros")
    public DistroLinux cadastrarDistro(@RequestBody DistroLinux distroLinux){

        DistroLinux distroSalva = repositorio.save(distroLinux);
        return distroSalva;
    }
}