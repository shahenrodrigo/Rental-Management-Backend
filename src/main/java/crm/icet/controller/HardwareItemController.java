package crm.icet.controller;

import crm.icet.dto.HardwareItem;
import crm.icet.entity.HardwareItemEntity;
import crm.icet.service.HardwareItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@CrossOrigin
@RequestMapping("/item")

public class HardwareItemController {

    final HardwareItemService hardwareItemService;

    @PostMapping("/add-item")

    public HardwareItemEntity addItem(@RequestBody HardwareItem hardwareItem){
        return hardwareItemService.addItem(hardwareItem);
    }

    @GetMapping("/get-all")

    public List<HardwareItem> getAllItem(){
        return hardwareItemService.getAll();
    }

    @GetMapping("/search-by-id/{id}")

    public HardwareItem getItemById(@PathVariable Integer id){
        return hardwareItemService.searchItemById(id);
    }

    @PutMapping("/update-item")
    public HardwareItemEntity updateItemById(@RequestBody HardwareItem hardwareItem){

        return hardwareItemService.updateItemById(hardwareItem);
    }



    @DeleteMapping("/delete-by-id/{id}")
    public void deleteItemById(@PathVariable Integer id){

        hardwareItemService.deleteItemById(id);
    }



}
