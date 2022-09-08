package Controllers;

import com.gid.puertasAluminioCostaApp.entities.Empresa;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpresaController {

    empresaService service;

    public EmpresaController(empresaService service){
        this.service = service
    }

    @GetMapping ("/Empresa")
    public List <Empresa> ListaEmpresa () {return.this.service.getListaEmpresa();}

    @PostMapping ("/Empresa")
    public Empresa crearEmpresa (@RequestBody Empresa empresa) {
        return this.service.crearEmpresa(empresa);
    }


    @RequestMapping (value = "/enterprises/[id]")

    @GetMapping
    public String getNombre() {
        return "nombre obtenido";
    }

    @PatchMapping
    public String updateNombre(){
        return "usuario actualizado";
    }

    @DeleteMapping
    public String deleteNombre (){
        return "nombre eliminado";
    }

    }
