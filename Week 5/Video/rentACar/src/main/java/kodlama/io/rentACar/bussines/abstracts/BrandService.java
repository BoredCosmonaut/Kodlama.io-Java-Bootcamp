package kodlama.io.rentACar.bussines.abstracts;

import kodlama.io.rentACar.bussines.requests.CreateBrandRequest;
import kodlama.io.rentACar.bussines.responses.GetAllBrandsResponse;
import kodlama.io.rentACar.entities.Brand;

import java.util.List;

public interface BrandService {
    List<GetAllBrandsResponse> getAll();

    void add(CreateBrandRequest createBrandRequest);
}
