package kodlama.io.rentACar.business.abstracts;

import kodlama.io.rentACar.business.request.CreateBrandRequest;
import kodlama.io.rentACar.business.request.UpdateBrandRequest;
import kodlama.io.rentACar.business.responses.GetAllBrandsResponse;
import kodlama.io.rentACar.business.responses.GetByIdBrandResponse;

import java.util.List;

public interface BrandService {
    List <GetAllBrandsResponse> getAll ();
    GetByIdBrandResponse getById (int id);
    void add(CreateBrandRequest createBrandRequest);
    void delete (int id);

    void update(UpdateBrandRequest deleteBrandRequest);
}
