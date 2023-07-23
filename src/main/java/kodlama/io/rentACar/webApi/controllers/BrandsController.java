package kodlama.io.rentACar.webApi.controllers;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.business.request.CreateBrandRequest;
import kodlama.io.rentACar.business.request.UpdateBrandRequest;
import kodlama.io.rentACar.business.responses.GetAllBrandsResponse;
import kodlama.io.rentACar.business.responses.GetByIdBrandResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/api/brands")
@AllArgsConstructor

public class BrandsController {
    private BrandService brandService;

    @GetMapping ()
    public List <GetAllBrandsResponse> getAll() {
        return brandService.getAll();
    }

    @PostMapping ()
    @ResponseStatus (code= HttpStatus.CREATED)
    public void add(@RequestBody CreateBrandRequest createBrandRequest) {
        this.brandService.add(createBrandRequest);
    }

    @GetMapping ("/{id}")
    public GetByIdBrandResponse getById(int id) {
        return  brandService.getById(id);
    }

    @PutMapping()
    public void update(@RequestBody UpdateBrandRequest updateBrandRequest) {
        brandService.update(updateBrandRequest);
    }

    @DeleteMapping("/{id}")
    public void delete(int id) {
        brandService.delete(id);
    }


}
