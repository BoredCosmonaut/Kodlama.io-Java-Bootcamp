package kodlama.io.rentACar.dataAccess.abstracts;

import kodlama.io.rentACar.entities.Brand;

import java.util.List;


public interface BrandRepository {
    List<Brand> getAll();
}
