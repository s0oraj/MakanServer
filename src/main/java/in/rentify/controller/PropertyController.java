package in.rentify.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import in.rentify.model.Property;
import in.rentify.service.PropertyService;

@RestController
@RequestMapping("/properties")
@CrossOrigin(origins = "https://makanclient.onrender.com")
public class PropertyController {

    @Autowired
    private PropertyService propertyService;

    @PostMapping
    @CrossOrigin(origins = "https://makanclient.onrender.com")
    public ResponseEntity<String> createProperty(@RequestBody Property property) {
    	String response = propertyService.createProperty(property);
        return ResponseEntity.ok(response);
    }

    @GetMapping
    @CrossOrigin(origins = "https://makanclient.onrender.com")
    public ResponseEntity<List<Property>> getAllProperties() {
        List<Property> properties = propertyService.getAllProperties();
        return ResponseEntity.ok(properties);
    }

    @GetMapping("/owner/{ownerId}")
    @CrossOrigin(origins = "https://makanclient.onrender.com")
    public ResponseEntity<List<Property>> getPropertiesByOwnerId(@PathVariable Long ownerId) {
        List<Property> properties = propertyService.getPropertiesByOwnerId(ownerId);
        return ResponseEntity.ok(properties);
    }
    
    @DeleteMapping("/{id}")
    @CrossOrigin(origins = "https://makanclient.onrender.com")
    public ResponseEntity<String> deleteProperty(@PathVariable Long id) {
        propertyService.deleteProperty(id);
        return ResponseEntity.ok("Property deleted successfully");
    }

    @PutMapping
    @CrossOrigin(origins = "https://makanclient.onrender.com")
    public ResponseEntity<Property> updateProperty(@RequestBody Property property) {
        Property updatedProperty = propertyService.updateProperty(property);
        return ResponseEntity.ok(updatedProperty);
    }
}
