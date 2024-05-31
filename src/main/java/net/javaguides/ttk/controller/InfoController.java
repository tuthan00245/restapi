package net.javaguides.ttk.controller;

import net.javaguides.ttk.dto.InfoDto;
import net.javaguides.ttk.service.InfoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;
import java.nio.file.Paths;

@RequestMapping("/api/info")
@RestController
public class InfoController {
    private InfoService infoService;


    @GetMapping()
    public ResponseEntity<InfoDto> createInfo(@RequestBody InfoDto infoDto){
        InfoDto savedInfo = infoService.createInfo(infoDto);
        return new ResponseEntity<>(savedInfo, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<InfoDto> getInfo(@PathVariable("id") Long infoId){
        InfoDto infoDto = infoService.getInfo(infoId);
        return ResponseEntity.ok(infoDto);
    }
    @PutMapping("{id}")
    public ResponseEntity<InfoDto> updateInfo(@PathVariable("id") Long infoId,
                                              @RequestBody InfoDto updatedInfo){
        InfoDto infoDto = infoService.updateInfo(infoId,updatedInfo);
        return ResponseEntity.ok(infoDto);
    }

}
