package com.shoestore.client.dto.response;

import com.shoestore.client.dto.request.BrandDTO;
import com.shoestore.client.dto.request.ProductDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class BrandResponseDTO {
    private int totalItems;
    private int totalPages;
    private List<BrandDTO> brandDTOs;
}