package com.emrah.inventoryservice.business.concretes;


import com.emrah.inventoryservice.business.abstracts.ModelService;
import com.emrah.inventoryservice.business.dto.requests.create.CreateModelRequest;
import com.emrah.inventoryservice.business.dto.requests.update.UpdateModelRequest;
import com.emrah.inventoryservice.business.dto.responses.create.CreateModelResponse;
import com.emrah.inventoryservice.business.dto.responses.get.GetAllModelsResponse;
import com.emrah.inventoryservice.business.dto.responses.get.GetModelResponse;
import com.emrah.inventoryservice.business.dto.responses.update.UpdateModelResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;


@Service
@AllArgsConstructor
public class ModelManager implements ModelService {
    // TODO: update methods
    @Override
    public List<GetAllModelsResponse> getAll() {
        return null;
    }

    @Override
    public GetModelResponse getById(UUID id) {
        return null;
    }

    @Override
    public CreateModelResponse add(CreateModelRequest request) {
        return null;
    }

    @Override
    public UpdateModelResponse update(UUID id, UpdateModelRequest request) {
        return null;
    }

    @Override
    public void delete(UUID id) {

    }
}
