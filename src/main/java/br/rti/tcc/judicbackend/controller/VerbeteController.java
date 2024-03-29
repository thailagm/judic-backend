package br.rti.tcc.judicbackend.controller;

import br.rti.tcc.judicbackend.model.Verbete;
import br.rti.tcc.judicbackend.repository.VerbeteRepository;
import br.rti.tcc.judicbackend.service.VerbeteService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;

@RestController
@RequestMapping("/glossario")
@RequiredArgsConstructor
public class VerbeteController {

    @Autowired
    private VerbeteService verbeteService;

    @GetMapping
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page", dataType = "integer", paramType = "query",
                    value = "Pagina a ser carregada", defaultValue = "0"),
            @ApiImplicitParam(name = "size", dataType = "integer", paramType = "query",
                    value = "Quantidade de registros", defaultValue = "10"),
            @ApiImplicitParam(name = "sort", allowMultiple = true, dataType = "string", paramType = "query",
                    value = "Ordenacao dos registros")
    })
    @ApiOperation(value = "Retorna verbetes ")
    public ResponseEntity listAll(
            @PageableDefault(sort = "id",
                    direction = Sort.Direction.ASC,
                    page = 0,
                    size = 10) @ApiIgnore Pageable page){
        return ResponseEntity.ok(verbeteService.listAll(page));
    }
}
