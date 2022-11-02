package kodlama.io.rentACar.webApı.controllers;

import kodlama.io.rentACar.bussines.abstracts.BrandService;
import kodlama.io.rentACar.bussines.requests.CreateBrandRequest;
import kodlama.io.rentACar.bussines.responses.GetAllBrandsResponse;
import kodlama.io.rentACar.entities.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //annotation
@RequestMapping("/api/brands")
public class BrandsController {
    private BrandService brandService;

    @Autowired
    public BrandsController(BrandService brandService) {
        this.brandService = brandService;
    }

    @GetMapping("/getall")
    public List<GetAllBrandsResponse> getAll() {
        return brandService.getAll();
    }

    @PostMapping("/add")
    public void add(CreateBrandRequest createBrandRequest) {
        this.brandService.add(createBrandRequest);
    }
}
